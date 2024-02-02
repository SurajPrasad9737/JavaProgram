import java.util.Scanner;

public class currenyConvert {
    public static void main(String[] args) {
        //Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Indian Currency : ");
        float indianCurrency = sc.nextFloat();
        System.out.println("Convert in USD Currency : "+(indianCurrency/82));
    }
}
