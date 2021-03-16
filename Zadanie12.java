import java.util.Scanner;
 
public class Zadanie12 {
	
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   //Dodawanie liczb 
  System.out.print("Input first number: ");
  int n1 = in.nextInt();
   
  System.out.print("Input second number: ");
  int n2 = in.nextInt();
   
  System.out.print("Input third number: ");
  int n3 = in.nextInt();
   
  System.out.print("Input fourth number: ");
  int n4 = in.nextInt();
  
  System.out.print("Enter fifth number: ");
  int n5 = in.nextInt();
   
   
  System.out.println("Average of five numbers is: " + 
   (n1 + n2 + n3 + n4 + n5) / 5);
 }
}