class WrapperClasses{
 public static void main(String args[])
 {
    int i = 5; //primitive data type
    Integer ii = new Integer(i);//Boxing- Wrapping
    int j = ii.intValue(); //Unboxing- unwrapping
    Integer value = i; // AutoBoxing
    int k = value; // AutoUnboxing
 }
}
