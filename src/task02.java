class seriesPrinter{
	
	
	static void printSeries(int startIndex, int endIndex){
		
		printSeries(startIndex, endIndex, 1);
	}
	
	
	static void printSeries(int startIndex, int endIndex, int interval)
	{
		
		for(int i=startIndex; i<=endIndex; i+=interval)
		{
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	static void printSeries(int n)
	{
		printSeries(0, n);
	}
	
	
} 

public class task02 {

	public static void main(String[] args) {
		
		seriesPrinter.printSeries(5); seriesPrinter.printSeries(5,10); seriesPrinter.printSeries(5,15,3);
	
	}

}