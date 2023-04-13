import java.util.UUID;

public class Player {
    private String id;
    private int currentPosition;

    Player(String id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getId() {
        return this.id;
    }
}
