import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Frame extends JFrame implements View {

    JPanel panel;
    JMenuBar menuBar;
    JLabel category;
    JPanel buttonPanel;
    JTextArea playerDisplay;
    String word;
    String hint;
    JButton playButton;
    JButton addPlayer;
    Game game;
    String playerScores;
    ArrayList<Player> players;
    String[] guessOptions;
    int numGuesses;
    boolean imposterFound;
    int imposterGuess;
    String[] options = {"NFL Skill Postions", "Modern NFL", "Modern NHL", "All Time NHL"};

    public Frame() {
        super("Imposter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(1500, 850);
        playerScores = "Leaderboard:\n";

        game = new Game();
        game.addView(this);

        String selected = (String) JOptionPane.showInputDialog(
                null, "Select a category", "Categories", JOptionPane.QUESTION_MESSAGE, null, options, options[0]
        );
        game.setCategory(selected);

        menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener(e -> {
            this.setVisible(false);
            Frame frame = new Frame();
        });
        gameMenu.add(newGame);
        menuBar.add(gameMenu);
        this.setJMenuBar(menuBar);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setSize(1200, 800);
        panel.setBackground(Color.WHITE);

        buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));

        playerDisplay = new JTextArea(playerScores);
        playerDisplay.setPreferredSize(new Dimension(200, 300));
        playerDisplay.setEditable(false);
        playerDisplay.setBackground(Color.LIGHT_GRAY);
        playerDisplay.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        JPanel displayPanel = new JPanel(new FlowLayout());
        displayPanel.add(playerDisplay);
        panel.add(displayPanel, BorderLayout.WEST);

        addPlayer = new JButton("Add Player");
        addPlayer.setBackground(Color.WHITE);
        addPlayer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addPlayer.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(null, "Enter Player Name", "Player", JOptionPane.QUESTION_MESSAGE);
            game.addPlayer(name);
            updatePlayers();
        });
        addPlayer.setPreferredSize(new Dimension(500, 100));
        buttonPanel.add(addPlayer);

        Controller controller = new Controller(game);
        playButton = new JButton("Start Game");
        playButton.setBackground(Color.WHITE);
        playButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        playButton.addActionListener(controller);
        playButton.setPreferredSize(new Dimension(500, 100));
        buttonPanel.add(playButton);

        category = new JLabel("Category: " + selected, SwingConstants.CENTER);
        category.setFont(new Font("Arial", Font.BOLD, 20));
        category.setBackground(Color.LIGHT_GRAY);
        category.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        category.setPreferredSize(new Dimension(500, 50));
        buttonPanel.add(category);

        panel.add(buttonPanel, BorderLayout.CENTER);
        this.add(panel);
        this.setVisible(true);

    }

    @Override
    public void handleStatusUpdate(Game game) {
        playButton.setEnabled(false);
        numGuesses = 0;
        imposterFound = false;
        if (game.getRoundsPlayed() == 1) {
            playButton.setText("Next Round");
            addPlayer.setText("");
            addPlayer.setEnabled(false);
        }
        word = game.getCurrWord();
        hint = game.getCurrHint();

        guessOptions = new String[players.size()];
        for (int i = 0; i < players.size(); i++) {
            guessOptions[i] = players.get(i).getName();
        }

        for (Player player : game.getPlayers()) {
            JOptionPane.showMessageDialog(this, player.getName(), "Player", JOptionPane.INFORMATION_MESSAGE);
            if (player.isImposter()) {
                JOptionPane.showMessageDialog(this, hint, "YOU ARE IMPOSTER", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, word, "",  JOptionPane.INFORMATION_MESSAGE);
            }
        }

        Random rand = new Random();
        JOptionPane.showMessageDialog(null, players.get(rand.nextInt(players.size())).getName() + " starts!", "Game Started", JOptionPane.INFORMATION_MESSAGE);


        while (!imposterFound) {
            String selected = (String) JOptionPane.showInputDialog(
                    null, "Guess Imposter", "Who is Imposter?", JOptionPane.QUESTION_MESSAGE, null, guessOptions, guessOptions[0]
            );

            for (int j = 0; j < players.size(); j++) {
                if (players.get(j).getName().equals(selected)) {
                    if (players.get(j).isImposter()) {
                        JOptionPane.showMessageDialog(this, "Imposter Found");
                        imposterFound = true;
                    } else {
                        JOptionPane.showMessageDialog(this, "Imposter Not Found");
                        numGuesses++;
                        guessOptions[j] = "";
                    }
                }
            }
        }

        imposterGuess = JOptionPane.showConfirmDialog(null, "Did the imposter guess the Player?", "", JOptionPane.YES_NO_OPTION);

        updateScores();
        updatePlayers();
        playButton.setEnabled(true);
    }

    private void updateScores() {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).isImposter()) {
                players.get(i).updateScore(numGuesses * 2);
                if (imposterGuess == JOptionPane.YES_OPTION) {
                    players.get(i).updateScore(2);
                }
            } else {
                if (numGuesses == 0) {
                    players.get(i).updateScore(1);
                }
            }
        }
    }

    private void updatePlayers() {
        players = game.getPlayers();
        playerScores = "Leaderboard:\n";
        for (Player player : players) {
            playerScores += player.getName() + ": " + player.getScore() + "\n";
        }
        playerDisplay.setText(playerScores);
    }

    public static void main(String[] args) { Frame f = new Frame();}
}
