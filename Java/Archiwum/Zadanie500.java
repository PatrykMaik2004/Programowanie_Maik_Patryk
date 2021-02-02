import java.util.Random;
class Zadanie500{
	public static void main(String [] arg){
		int pm_i;
		pm_i = 2;
		Random r = new Random();
		int licznik = 0;
		while(pm_i!=20){
			pm_i = r.nextInt(100);
			licznik++;
		}
		System.out.print("11 wylosowana jako: "+licznik);
	}
}
	 

	


