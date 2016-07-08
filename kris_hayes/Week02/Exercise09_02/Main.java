/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stock oracle = new Stock("ORCL", "Oracle Corporation");
		
		oracle.setClosingPrice(34.5);
		oracle.setCurrentPrice(34.35);
		
		System.out.printf("The previous closing price was $%4.2f.\n", oracle.previousClosingPrice);
		System.out.printf("The current price is $%4.2f.\n", oracle.currentPrice);
		System.out.printf("The price change is %4.2f%%.", oracle.getChangePercent());
	}
	
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice = 0;
	double currentPrice = 0;
		
	Stock(){
	}
	
	Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;
	}
	double setClosingPrice(double newPrice){
		previousClosingPrice = newPrice;
		return previousClosingPrice;
	}
	
	double setCurrentPrice(double newPrice){
		currentPrice = newPrice;
		return currentPrice;
	}
	
	double getChangePercent(){
		double changePercent = ((currentPrice - previousClosingPrice) / currentPrice) * 100;
		return changePercent;
	}
}