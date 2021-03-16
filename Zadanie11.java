public class Zadanie11 {
 
   private static final double promien = 7.5;

    public static void main(String[] args) {
		//Oblicznie obwodu  powierzchni i promienia
        double obwod = 2 * Math.PI * promien;
        double powierzchnia = Math.PI * promien * promien;

        System.out.println("obwod is = " + obwod);
        System.out.println("powierzchnia is = " + powierzchnia);
    }
}