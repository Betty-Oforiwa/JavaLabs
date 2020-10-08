 public class Lab4
{
       	public static void main(String [] args){
	int rand;
	int min= -4;
	int max = 3;

	do{
       		rand = (int)(Math.random() * (max - min +1) + min);
		System.out.println(rand);
}
	while (rand !=0);
	}	

}
