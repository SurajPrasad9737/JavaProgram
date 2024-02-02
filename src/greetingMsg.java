import java.util.Scanner;

public class greetingMsg {
    public static void main(String[] args) {
        System.out.print("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("Hello "+name+" in the java programming...");
    }
}
