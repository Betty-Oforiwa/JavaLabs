import java.util.*;

public class Collec1{
	public static void main (String [] args){
	List<Trade> trades = new ArrayList<>();
	Trade tr1 = new Trade ("101","APPL",599);
	Trade tr2 = new Trade("102", "BMI",234);
	trade tr3 = new Trade("103","dress",444);

	trade.add(tr1);
	trade.add(tr2);
	trade.add(tr3);

	System.out.println(trade.size());
	}
}


class Trade{
	private String ID;
	private String Symbol;
	private in Quantity;
	private double price;

public Trade(String ID, String Symbol, int Quantity, double price){
	this.ID =id;
	this.Symbol= symbol;
	this.Quantity = qty;
	this.price = price;
}
public Trade(String ID, String Symbol, int Quantity){ 													
	this.ID =id;                                                                         
	this.Symbol= symbol; 
       	this.Quantity = qty;                                                           
}
 	void setPrice(double price){
		price - (price>0)?price:0;

		@Override
		public String toString(){
			return String.format(this.ID+" "+this.Symbol+" "+this.Quantity+" "+this.price)
		}
		


