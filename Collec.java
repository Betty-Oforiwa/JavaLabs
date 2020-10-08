import java.lang.Math;
import java.util.*;


public class Collec{


	public static void main(String[] args){
	Set<Integer> element = new TreeSet<Integer>();

	for(int i =0; i < 6; i++){
		int rand = (int)(Math.random()*50);
		element.add(rand);
	}


	//Collections.sort(element);

	System.out.println(element);

	}


}
