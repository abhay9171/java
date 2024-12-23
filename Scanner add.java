import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num2 : ");
        int b = sc.nextInt();
        int result;
        result = a+b;
        System.out.println("Result : " + result);
        sc.close();
    } 
}
