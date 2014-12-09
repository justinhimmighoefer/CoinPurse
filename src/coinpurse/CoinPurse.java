//Justin Himmighoefer

public class CoinPurse
{
	private int pennies, nickels, dimes, quarters;
	
	CoinPurse()
	{
		pennies=0;
		nickels=0;
		dimes=0;
		quarters=0;
	}
	
	//add currency
	public void addPennies (int p)
	{
		pennies = pennies + p;
	}
	public void addNickels (int n)
	{
		nickels = nickels + n;
	}
	public void addDimes (int d)
	{
		dimes = dimes + d;
	}
	public void addQuarters (int q)
	{
		quarters = quarters + q;
	}
	
	/**assumes that w, x, y, z are greater than the number of available**/
	//remove currency
	public void removePennies (int w)
	{
		pennies = pennies - w;
	}
	public void removeNickels (int x)
	{
		nickels = nickels - x;
	}
	public void removeDimes (int y)
	{
		dimes = dimes - y;
	}
	public void removeQuarters (int z)
	{
		quarters = quarters - z;
	}
	
	//number of units
	public int numberOfPennies ()
	{
		return pennies;
	}
	public int numberOfNickels ()
	{
		return nickels;
	}
	public int numberOfDimes ()
	{
		return dimes;
	}
	public int numberOfQuarters ()
	{
		return quarters;
	}
	
	/**output displays the currency in cent format**/
	//total amount values
	public int totalValue ()
	{
		return (25*quarters+10*dimes+5*nickels+pennies);
	}
}