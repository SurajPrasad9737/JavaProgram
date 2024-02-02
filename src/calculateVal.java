import java.util.Scanner;

public class calculateVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        char op = sc.next().trim().charAt(0);
        System.out.print("Enter Second Number : ");
        int num2 = sc.nextInt();


        if(op=='+'){
            System.out.println("Sum of two numbers : "+(num1+num2));
        }
        if(op=='-'){
            System.out.println("Substract of two numbers : "+(num1-num2));
        }
        if(op=='*'){
            System.out.println("Multiply of two numbers : "+(num1*num2));
        }
        if(op=='/'){
            System.out.println("Division of two numbers : "+(num1/num2));
        }
    }
}
