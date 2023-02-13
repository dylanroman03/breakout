import javax.swing.ImageIcon;

public class Brick extends Sprite {

    private boolean destroyed;
    private int color;
    private int points;

    public int getPoints() {
        return points;
    }

    public Brick(int x, int y, int color) {
        this.color = color;
        initBrick(x, y);
    }

    private void initBrick(int x, int y) {

        this.x = x;
        this.y = y;

        destroyed = false;

        loadImage();
        getImageDimensions();
    }

    private void loadImage() {

        if (color == 1) {
            ImageIcon ii = new ImageIcon("src/resources/bloque1.jpg");
            image = ii.getImage();
            points = 300;
        } else if (color == 2) {
            ImageIcon ii = new ImageIcon("src/resources/bloque2.jpg");
            image = ii.getImage();
            points = 200;
        } else {
            ImageIcon ii = new ImageIcon("src/resources/bloque3.jpg");
            image = ii.getImage();
            points = 100;
        }
    }

    boolean isDestroyed() {

        return destroyed;
    }

    void setDestroyed(boolean val) {

        destroyed = val;
    }
}
