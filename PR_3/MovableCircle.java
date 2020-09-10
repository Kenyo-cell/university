public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed,
                  int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    public String toString() {
        return "Circle with center in " + center;
    }
}
