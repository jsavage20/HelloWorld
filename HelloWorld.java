// Hello World Java
import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = kb.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}