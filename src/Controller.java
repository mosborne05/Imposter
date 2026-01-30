import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    Game game;

    public Controller(Game game) {
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.game.playRound();
    }
}
