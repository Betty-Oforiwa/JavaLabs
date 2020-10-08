import java.util.Random;

public class Random{

	public static void main(String args[]) {
		int min = 20;
		int max = 100;

			System.out.println("Random value in double from "+min+" to " +max+ ":");
		double random_double =
			Math.random() * (max - min + 1);
		
		System.out.println("Random value in int from "+min+" to "+min+ ":");
		int random_int = int Math.random() * (max - min + 1);

				System.out.println(random_int);
		
		
		}
	
	


}
