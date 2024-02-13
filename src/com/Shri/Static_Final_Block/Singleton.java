package com.Shri.Static_Final_Block;

public class Singleton {
	private static Singleton single_instance = null;

    public String s;

    // One of the simplest ways is to make the constructor of the class private so that no other class can access it. 
    //The instance of the class can then be created inside the class itself using the private constructor.
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }

    
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

class PrepBytes {
    public static void main(String args[])
    {
        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();

        Singleton z = Singleton.getInstance();

    
        System.out.println("Hashcode of x is "
                        + x.hashCode());
        System.out.println("Hashcode of y is "
                        + y.hashCode());
        System.out.println("Hashcode of z is "
                        + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }

}
