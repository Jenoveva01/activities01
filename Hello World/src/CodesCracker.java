import java.util.Scanner;
import java.util.concurrent.Callable;

public class CodesCracker {
    int add;
    CodesCracker(int x,int y){
        add =x + y;
        System.out.println("\nResult =" +add);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a = s.nextInt();
        System.out.print("Enter the second number:");
        int b = s.nextInt();

        CodesCracker obj = new CodesCracker(a, b);
    }
}