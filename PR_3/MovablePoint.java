public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y,
                        int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        x += xSpeed;
    }

    @Override
    public void moveDown() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        y -= ySpeed;
    }

    public String toString() {
        return String.format("(%d; %d)", x, y);
    }
}
