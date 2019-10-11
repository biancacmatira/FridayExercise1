package Week1.Classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "Blue";
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        this.color = "Blue";
    }

    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j ++) {
                System.out.print(this.color.substring(0,1));
            }
            System.out.println();
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Got help from my friend, Mika