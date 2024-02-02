import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        //formula => length * breath
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        float length = sc.nextFloat();
        System.out.print("Enter breath : ");
        float breath = sc.nextFloat();

        float area =(length * breath);
        System.out.println("area = " + area);
    }
}
