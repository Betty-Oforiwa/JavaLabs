import java.util.*;


public class Trade1{

public static void main(String[] args){
	Trade t1 =new Trade("T1", "APPL",100,15.25);
	Trade t2 =new Trade("T1", "APPL",100,15.25);
	Trade t3 =new Trade("T1", "APPL",100,15.25);
	 

	Account Betty = new Account();
	Betty.setTrade(t1);
	Betty.setTrade(t2);
	Betty.setTrade(t3);

	System.out.println(Betty.getTotal_trade());
	}

}

class Trade{
	private String ID;
	private String symbol;
	private int quantity;
	private double price;


	public Trade(String id, String symbol, int quantity, double price){
		this. ID =id;
		this.symbol = symbol;
		this.quantity = quantity;
		this.price = price;
	}

	public void setPrice(double price) {
		price = (price > 0) ? price : 0;
		this.price = price;
	}



	@Override
	public String toString(){
		return String.format("ID ::" + this.ID +"symbol ::" + this.symbol + "Quantity ::" +this.quantity+ "Price ::" +this.price);
	}

}

	class Account {
		private List <Trade>trades = new ArrayList<Trade>();

		private int total_trade = 0;

		public void setTrade(Trade trade){
			trades.add(trade);
		}
		
		public int getTotal_trade(){
			return this.total_trade = trades.size();
		}
	}


