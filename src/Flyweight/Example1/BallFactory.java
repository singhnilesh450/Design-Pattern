package Flyweight.Example1;

import java.util.HashMap;

public class BallFactory {
    private static  final HashMap ballMap=new HashMap();
    public static Ball getBall(String color,String imageURL){
        StringBuilder sb=new StringBuilder();
        sb.append(color);
        sb.append(imageURL);
        String ballCacheKey=sb.toString();
        Ball ball=(Ball)ballMap.get(ballCacheKey);
        if(ball==null){
            ball=new Ball(color,imageURL);
            ballMap.put(ballCacheKey,ball);
            System.out.println("Creating Circle Of Color: "+color);
        }
        return  ball;
    }
}
