 class Rectangle
{
  int length;
  int breadth;
  
  Rectangle()  // Default constructor
  {
    this(0);
  }  
  
   Rectangle(int x)
  {
    this(x,x);
  }

  Rectangle(int length, int breadth)
  {
    this.length = length;
    this.breadth = breadth;
  }

  void getData(int x, int y)
  {
	length =x;
	breadth =y;
  }
 
  int rectArea()
  {
    	int area= length*breadth;
	return area;
  }
  void display()
  {			//Nesting of methods
     System.out.println("Area = " + rectArea());
   }
 public static void main(String args[])
  {
     Rectangle myrect1 = new Rectangle();// Creation
     Rectangle myrect2 = new Rectangle();
     Rectangle myrect3 = new Rectangle();
     Rectangle myrect4 = new Rectangle(4,10);
     Rectangle myrect5 = new Rectangle(4);
     myrect1.length= 5;
     myrect1.breadth =10;
	int area1= myrect1.length * myrect1.breadth;
       myrect2.getData(15,10);
	int area2= myrect2.rectArea();
     System.out.println("Area 1 = " + area1);
     System.out.println("Area 2 = " + area2);
     System.out.println("Area 3 = " + myrect3.rectArea());
     System.out.println("Area 4 = " + myrect4.rectArea());
   }	
}















   
