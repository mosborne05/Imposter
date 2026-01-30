import java.util.*;

public class Game {
    private ArrayList<Player> players;
    private List<String> category;
    private Map<String, String> hints;
    private List<String> usedWords;
    private String currWord;
    private String currHint;
    private Player imposter;
    private int roundsPlayed;
    private List<View> views;

    public Game() {
        players = new ArrayList<>();
        category = new ArrayList<>();
        hints = new HashMap<>();
        views = new ArrayList<>();
        usedWords = new ArrayList<>();
        roundsPlayed = 0;
    }

    public void setCategory(String category) {
        this.category = Categories.selectCategory(category);
        this.hints = Hint.selectMap(category);
    }

    public void addPlayer(String playerName) {
        players.add(new Player(playerName));
    }

    public void selectWord(){
        Random rand = new Random();
        currWord = category.get(rand.nextInt(category.size()));
        if (usedWords.contains(currWord)) {
            selectWord();
        } else {
            usedWords.add(currWord);
            currHint = hints.get(currWord);
        }
    }

    public void selectImposter() {
        Random rand = new Random();
        imposter = players.get(rand.nextInt(players.size()));
        imposter.setIsImposter(true);
    }

    public void resetImposter() {
        for (Player player: players) {
            player.setIsImposter(false);
        }
    }

    public Player getImposter() {
        return imposter;
    }

    public String getCurrWord() {
        return currWord;
    }

    public String getCurrHint() {
        return currHint;
    }

    public void addView(View view) {
        views.add(view);
    }

    public void removeView(View view) {
        views.remove(view);
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void playRound() {
        resetImposter();
        selectImposter();
        selectWord();
        roundsPlayed++;
        for (View view: views) {
            view.handleStatusUpdate(this);
        }
    }
}
