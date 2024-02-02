import java.util.Scanner;

public class areaTriangle {
    //Formula 1/2 * base * height
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle : ");
        int base = sc.nextInt();
        System.out.print("Enter height of triangle : ");
        int height = sc.nextInt();

        float area = (float)(0.5 * base * height);
        System.out.println("area = " + area);
    }
}
