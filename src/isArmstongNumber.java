import java.util.Scanner;

public class isArmstongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number : ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(num>0){
            int rem = num% 10;
            sum  = sum + (rem * rem *rem);
            num = num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number...");
        }else{
            System.out.println("Not Armstrong Number...");
        }
    }
}
