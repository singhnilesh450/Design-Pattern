package Flyweight.Example1;

public class Ball {
    private String color;
    private String imageURL;
    private int coordX;
    private int coordY;
    private int readius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getReadius() {
        return readius;
    }

    public void setReadius(int readius) {
        this.readius = readius;
    }
    public void draw(){
        System.out.println("Drwing on Canvas........");
    }
    public Ball(String color, String imageURL) {
        this.color = color;
        this.imageURL = imageURL;
    }
}
