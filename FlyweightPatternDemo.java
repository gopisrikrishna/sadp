import java.util.HashMap;
interface Shape {
 void draw();
}
class Circle implements Shape {
 private String color;
 private int x;
 private int y;
 private int radius;
 public Circle(String color){
 this.color = color;
 }
 public void setX(int x) {
 this.x = x;
 }
 public void setY(int y) {
 this.y = y;
 }
 public void setRadius(int radius) {
 this.radius = radius;
 }
 @Override
 public void draw() {
 System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
 }
}
class ShapeFactory {
 private static final HashMap circleMap = new HashMap();
 public static Shape getCircle(String color) {
 Circle circle = (Circle)circleMap.get(color);
 if(circle == null) {
 circle = new Circle(color);
 circleMap.put(color, circle);
 System.out.println("Creating circle of color : " + color);
 }
 return circle;
 }
}
public class FlyweightPatternDemo{
 private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
 public static void main(String[] args) {
 for(int i=0; i < 20; ++i) {
 Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
 circle.setX(getRandomX());
 circle.setY(getRandomY());
 circle.setRadius(100);
 circle.draw();
 }
 }
 private static String getRandomColor() {
 return colors[(int)(Math.random()*colors.length)];
 }
 private static int getRandomX() {
 return (int)(Math.random()*100 );
 }
 private static int getRandomY() {
 return (int)(Math.random()*100);
 }
}

/*
OUTPUT:-


D:\41lab\sadp\10_prog_flyweightDesignPattern>javac FlyweightPatternDemo.java

D:\41lab\sadp\10_prog_flyweightDesignPattern>java FlyweightPatternDemo
Creating circle of color : Green
Circle: Draw() [Color : Green, x : 2, y :91, radius :100
Circle: Draw() [Color : Green, x : 54, y :28, radius :100
Creating circle of color : Black
Circle: Draw() [Color : Black, x : 76, y :2, radius :100
Circle: Draw() [Color : Black, x : 97, y :61, radius :100
Circle: Draw() [Color : Green, x : 25, y :95, radius :100
Creating circle of color : Blue
Circle: Draw() [Color : Blue, x : 81, y :4, radius :100
Creating circle of color : White
Circle: Draw() [Color : White, x : 80, y :85, radius :100
Circle: Draw() [Color : Black, x : 89, y :41, radius :100
Creating circle of color : Red
Circle: Draw() [Color : Red, x : 67, y :22, radius :100
Circle: Draw() [Color : Green, x : 44, y :25, radius :100
Circle: Draw() [Color : Green, x : 55, y :63, radius :100
Circle: Draw() [Color : White, x : 4, y :65, radius :100
Circle: Draw() [Color : Blue, x : 13, y :35, radius :100
Circle: Draw() [Color : White, x : 75, y :12, radius :100
Circle: Draw() [Color : Blue, x : 46, y :72, radius :100
Circle: Draw() [Color : Blue, x : 47, y :60, radius :100
Circle: Draw() [Color : Red, x : 42, y :90, radius :100
Circle: Draw() [Color : Black, x : 16, y :48, radius :100
Circle: Draw() [Color : White, x : 98, y :36, radius :100
Circle: Draw() [Color : Black, x : 19, y :27, radius :100

D:\41lab\sadp\10_prog_flyweightDesignPattern>

*/