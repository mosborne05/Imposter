public class Player {
    private int score;
    private String name;
    private boolean isImposter;

    public Player(String name) {
        this.score = 0;
        this.name = name;
        this.isImposter = false;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void updateScore(int score) {
        this.score += score;
    }
    public String getName() {
        return name;
    }

    public void setIsImposter(boolean isImpostor) {
        this.isImposter = isImpostor;
    }

    public boolean isImposter() {
        return isImposter;
    }
}
