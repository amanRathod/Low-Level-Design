public class ElevatorDisplay {
    private int floor;
    Direction direction;

    public void showDisplay(){
        System.out.println(floor);
        System.out.println(direction);
    }

    public void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }
}
