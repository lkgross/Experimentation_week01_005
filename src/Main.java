/**
 * This is the Main class in the Java program.
 */
public class Main {
    // The class header: public class Main
    /*
     Think of the Main class as a container for the Java program.
     Note the syntax for a multi-line comment.
     */
    /**
     * This is the main method in the Java program.
     * @param args
     */
    public static void main(String[] args) {
        // The method header: public static void main(String[] args)
        /*
         A static method in Java is like a function in Python.
         */
        // Note print does not move down to the next line after printing.
        System.out.print("Hello world!");
        System.out.println("Hello world!"); // The println command moves to the next line.
        /*
         The println command prints the string and then goes to the next line.
         Now further information can be printed on the next line.
         */
        System.out.print("Hello 'Tatooine'\n");
        System.out.print("\n");
        System.out.println("\tHello \"Alderan\"");
    }
}