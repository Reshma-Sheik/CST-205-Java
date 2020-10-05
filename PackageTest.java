import firstPackage.*; // has ClassA and ClassC

class PackageTest
{
    public static void main(String args[])
    {
	ClassA obj = new ClassA();
	ClassC obj1 = new ClassC();
	obj.displayA();
	obj1.displayC();
    }
}

