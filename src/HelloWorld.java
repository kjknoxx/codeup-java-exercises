public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavNumber = 24;
        String myString = "3.14159";
        double myNumber= 3.14;
        // Cannot assign a anything more than a single letter to a ''.
        // Only numbers in "" quotations can be passed through a "String" variable.
        // When no number is assigned to a "long" nothing appears in the console.
        // When using a small number in a long variable it will pass an error to just use either int or double.
        // When there is a random character in a long it will still be read by java.
        // When there is a number without a decimal point it will still render by java.
        System.out.println(myString);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // The difference between these blocks of code is that one will ranger 5 before ++ therefore you will not see the actual addition being rendered in the print out till the next line.
        // In the other code we see the ++ before the x is rendered, therefore you will see the 5 plus'd already.

        //String class = "love";
        // A variable cannot contain the word class in it as class is what's used to define methods/functions.

        // These will not run and just say the top 2 variables are redundant.
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;

        // you're trying to call an int a string and an int can ONLY be a number.
        // int three = (int) "three";

        int x;
        int y;
        x = 4;
        x += 5;

        x =10;
        y = 2;
        x /=y;

        y -=x;

        System.out.println(x);
        System.out.println(y);


        // We cannot assign an numeric variable to a lower sized value, as you will lose data. You can force java to do it, but you need to be aware of the data loss you will receive if you do.
    }
}
