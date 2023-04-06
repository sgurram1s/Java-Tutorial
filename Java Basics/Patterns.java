import java.util.Scanner;
public class Patterns{

    static void left_triangle(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void down_left_triangle(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = value; j >= i; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void right_triangle(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = value; j > i; j--) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void down_right_triangle(int value) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j= value;j>i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    /*static void pyramid(int value){
        for(int i=0;i<value;i+=2){
            for(int j=i;j<value/2-i;j++){
                System.out.print(j);
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }*/
    public static void main(String [] args){
        int value = 5;
        System.out.println("left triangle");
        left_triangle(value);
        System.out.println("Down left triangle");
        down_left_triangle(value);
        System.out.println("right triangle");
        right_triangle(value);
        System.out.println("Down right triangle");
        down_right_triangle(value);
        //pyramid(value);
    }
}