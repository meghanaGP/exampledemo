package question3;


import java.util.*;
public abstract class ShapeFactory
{
     abstract double area();
}
class Circle extends ShapeFactory
{
       private double radius;
       Circle(double radius)
       {
           this.radius=radius;
       }
       //provide parameterized constructor.
      //override  area() ;
      @Override double area()
      {
          return 3.14*radius*radius;
      }
}
class Rectangle extends ShapeFactory
{
     private double length,breadth;
      //provide parameterized constructor
      Rectangle(double length,double breadth)
      {
          this.length=length;
          this.breadth=breadth;
      }
     // override area() ;
     @Override double area()
     {
         return length*breadth;
     }
}
class  ShapesFactory
{
          ArrayList<ShapeFactory> slist = new ArrayList<>();  //to store Circle and Rectangle objects.
         public ShapesFactory()  {  }
        
      public void addShape(ShapeFactory s)
       {
                //Should add Circle Objects / Rectangle Objects to the slist property.
                slist.add(s);
        }
        public ArrayList<ShapeFactory> getCircles()
        {
              //Should return list of Circle Objects from slist property.
              ArrayList<ShapeFactory> clist=new ArrayList<>();
              Iterator<ShapeFactory> iter= slist.iterator();
              while (iter.hasNext()) 
              {
                  ShapeFactory temp=iter.next();
                  if(temp.getClass().getName()=="Circle")
                  {
                      clist.add(temp);
                  }
                  
              }
              return clist;  
        }
       public ArrayList<ShapeFactory> getRectangles()
        {
              //Should return list of  Rectangle Objects from slist property.
              ArrayList<ShapeFactory> rlist=new ArrayList<>();
              Iterator<ShapeFactory> iter= slist.iterator();
              while (iter.hasNext()) 
              {
                  ShapeFactory temp=iter.next();
                  if(temp.getClass().getName()=="Rectangle")
                  {
                      rlist.add(temp);
                  } 
              }
              return rlist;
        }
        public boolean  deleteShape(ShapeFactory s)
        {
                  //If given Shape I,e. Circle/Rectangle object if should delete and return true
                  //If not found should return false
                  if(slist.contains(s))
                  {
                     slist.remove(slist.indexOf(s)); 
                  }
                  return slist.contains(s);
        }
        
