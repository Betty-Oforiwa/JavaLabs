class Trade{
	private String id;
	private String symbol;
	private int quantity;
	private double price;

public Trade (String id, String symbol, int quantity){
	this.id = id; 
	this.symbol = symbol;
	this.quantity = quantity;
	this.price = price;
}

	public void setPrice(double price){
	if (price >= 0){

		this.price = price;
	}
	else{
	this.price = 0;
	System.out.println("no negative value");
}
	}

@Override
public String toString(){
	String details = "ID ::" +id+ "\nSYMBOL ::"+symbol+ "\nQUANTITY ::" +quantity+ "\nPRICE  ::" +price;
       return details;	
}
	public static void main(String[] args){

	Trade trade = new Trade("T1", "APPL",100);
	trade.setPrice(15.25);

	System.out.println(trade);

	}

}
	public class Account extends Trade {
		private
		
		}
	}





