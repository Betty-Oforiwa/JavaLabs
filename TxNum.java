import java.lang.Math;

public class TxNum{
	public static void main(String args[]){
		String[] text = { "one","two","three","four","five","six","seven","eight","nine"};
			int rand = (int)(Math.random()*10);
			for (int index = 0; index < text.length; index++){
				System.out.println(text[rand]);
				break;
			}
		}
	}
