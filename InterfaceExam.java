interface First
{
  void display();
}
 
interface Second
{
   void display();
}


class Third implements First,Second
{

  public void display()
  {
    System.out.println("HELLO Interface Defined");
  }

}
class InterfaceExam
{
 	public static void main(String args[])
	{
		Third ob1 = new Third();
		ob1.display();
	}
}
