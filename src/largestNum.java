import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A :"+a);
        }
        if(a<b){
            System.out.println("B :"+b);
        }
        else{
            System.out.println("Equal values");
        }
    }
}
