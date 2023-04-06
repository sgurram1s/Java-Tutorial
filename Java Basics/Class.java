import java.util.Scanner;
public class Class{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of lines: ");
        int value = input.nextInt();
        Patterns type = new Patterns();
        System.out.print(type(left_triangle()));
    }
}