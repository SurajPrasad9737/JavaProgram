import java.util.Scanner;

public class leetcode1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum=0,mul = 1,result;
        while(num>0){
            int rem = num%10;
            sum +=rem;
            mul *=rem;
            num = num/10;
        }
        result = mul - sum;
        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
        System.out.println("result = " + result);
    }
}
