import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius in circle");
        float radius = sc.nextFloat();
        float area =(float)(3.14 * radius * radius);

        System.out.println("Area of Circle is : "+area);
    }
}
