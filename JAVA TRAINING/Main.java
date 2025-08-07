abstract class Shape 
{ 
    abstract void draw();

}
class Rectangle extends Shape
{
void draw()
{
    System.out.println("Drawing a circle");
}
}
public class Main
  {
    public static  void main(String[] args)
    
     {
        Shape shape =new Rectangle();
        shape.draw();

     }

  }

   

