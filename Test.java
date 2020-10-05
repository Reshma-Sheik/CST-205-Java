/* Base class vehicle */
class Vehicle
{
    int maxSpeed = 120;
   void display()
   {
   System.out.println("Maximum Speed: " + maxSpeed);
   }
}

 
/* sub class Car extending Vehicle */
class Car extends Vehicle
{
    int maxSpeed = 180;
  
    void display()   //Method overriding
    {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}
  





/* Driver program to test */
class Test
{
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();

       System.out.println(small.maxSpeed);
    }
}

