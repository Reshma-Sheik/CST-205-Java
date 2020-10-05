class StaticDemo
{
  
  public static void main(String args[])
  {
   
    Test.show()
    Test.a=5;
  }
}


class Test
{ 
 int abc; //instance variable
 static int a;  //static data member
 static void show() // static method
 {
  abc =0; // ERROR
  System.out.println(“HELLOO “);
 }

}

