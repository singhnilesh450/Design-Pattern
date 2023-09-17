package Flyweight.Example1;


import java.util.AbstractMap;
import java.util.Map;

public class Client {

    private static final String colors[]={"Green", "Yellow","Pink"};
    private static final Map<String, String> urlMap = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("Green", "url1"),
            new AbstractMap.SimpleEntry<>("Yellow", "url2"),
            new AbstractMap.SimpleEntry<>("Pink", "url3")
    );
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            String color=getColor();
            String url =urlMap.get(color);
            Ball ball=(Ball)BallFactory.getBall(color,url);
            ball.setCoordX(getX());
            ball.setCoordY(getY());
            ball.setReadius(getRad());
            ball.draw();
            System.out.println(ball.hashCode());
        }
    }

    private static int getRad() {
        return (int)Math.random()*50;
    }

    private static int getY() {
        return (int)Math.random()*50;
    }

    private static int getX() {
        return (int)Math.random()*10;
    }

    private static String getColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

}
