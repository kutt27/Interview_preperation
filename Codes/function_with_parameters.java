import java.util.Scanner;

public class function_with_parameters {

    public static int CalculateSum(int num1, int num2){
        return (num1+num2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
        System.out.println("Sum is "+ sum);
    }
}
