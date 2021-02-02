import java.util.Scanner;
class ProstyKalkulator {
	public static void main (String[] arg){
		
		int n1 = 4;
		int n2 = 1; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Kalkulator");
		System.out.print("Podaj liczbe: ");
		
		n1 = sc.nextInt();
		System.out.print("Podaj liczbe: ");
		n2 = sc.nextInt();
		
		System.out.println("" +n1+"+"+n2+"="+(n1+n2));
		System.out.println("" +n1+"-"+n2+"="+(n1-n2));
		System.out.println("" +n1+"/"+n2+"="+(n1/n2));
		System.out.println("" +n1+"*"+n2+"="+(n1*n2));
		
	}
	

}