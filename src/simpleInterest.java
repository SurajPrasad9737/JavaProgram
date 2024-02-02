import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        int principal = sc.nextInt();
        System.out.print("Enter time for Interset : ");
        int time = sc.nextInt();
        System.out.print("Enter rate : ");
        float rate = sc.nextFloat();

        float SI = (float)((principal * time * rate)/100);

        System.out.println("Simple Interest is : "+SI);
    }

}
