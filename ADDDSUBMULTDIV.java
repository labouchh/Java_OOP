package ClassWork;
import java.util.Scanner;
public class ADDDSUBMULTDIV {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1 = 5;
      int num2 = 2;
      scnr.close();
      int val = Addition(num1,num2);
      System.out.println("The addition of " + num1 + " and " + num2 + " is: "+ val);
      do {
      //while(input != true) {
    public static int Addition(int num1, int num2) {
        int Add = num1 + num2;
        System.out.println("The addition of " + num1 + " and " + num2 + " is: "+ Add);
        return Add;
        }
    public static int Substraction(int num1, int num2) {
        int Subs = num1 - num2;
        System.out.println("The subtraction of " + num1 + " " + num2 + "is: "+ Subs);
        return Subs;
        }
    public static int Multiplication(int num1, int num2) {
        int multi = num1 * num2;
        System.out.println("The multiplication of " + num1 + " " + num2 + "is: "+ multi);
        return multi;
        }
    public static double Division(int num1, int num2) {
        double div = num1 / num2;
        System.out.println("The division of " + num1 + " " + num2 + "is: "+ div);
        return div;
        }
     // }
      } while(input != true);
   }



//System.out.println("Goodbye");
//break; }