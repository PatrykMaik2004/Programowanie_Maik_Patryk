 import java.util.Scanner;
public class Zadanie17 {
 public static void main(String[] args)
 {
  long binary1, binary2;
  int i = 0, reszta = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Wprowadź pierwszą liczbę binarną: ");
  binary1 = in.nextLong();
  System.out.print("Wprowadź drugą liczbę binarną: ");
  binary2 = in.nextLong();

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + reszta) % 2);
   reszta = (int)((binary1 % 10 + binary2 % 10 + reszta) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (reszta != 0) {
   sum[i++] = reszta;
  }
  --i;
  System.out.print("Suma dwóch liczb binarnych: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}
  