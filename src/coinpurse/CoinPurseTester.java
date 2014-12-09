//Justin Himmighoefer
//The user enter how many of each coin they have and the total is
//calculated and then returned to the user.

import java.util.Scanner;

public class CoinPurseTester
{
	public static void main (String [] args)
	{
		CoinPurse c = new CoinPurse();
		int p, n, d, q, w, x, y, z, s, r;
		Scanner input = new Scanner(System.in);
		
		//user input to add amounts of currency
		//Add pennies to purse, amount must be 0 or greater
		System.out.println("How many pennies would you like to put into the purse?");
		p=input.nextInt ();
			while (p<0)
				{System.out.println("Amount entered must be equal to 0 or greater!");
				System.out.println("How many pennies would you like to put into the purse?");
				p=input.nextInt();
				}
		c.addPennies(p);
		
		//Add nickels to purse, amount must be 0 or greater
		System.out.println("How many nickels would you like to put into the purse?");
		n=input.nextInt ();
			while (n<0)
				{System.out.println("Amount entered must be equal to 0 or greater!");
				System.out.println("How many nickels would you like to put into the purse?");
				n=input.nextInt();
				}
		c.addNickels(n);
		
		//Add dimes to purse, amount must be 0 or greater
		System.out.println("How many dimes would you like to put into the purse?");
		d=input.nextInt ();
			while (d<0)
				{System.out.println("Amount entered must be equal to 0 or greater!");
				System.out.println("How many dimes would you like to put into the purse?");
				d=input.nextInt();
				}
		c.addDimes(d);		
		
		//Add quarters to purse, amount must be 0 or greater
		System.out.println("How many quarters would you like to put into the purse?");
		q=input.nextInt ();
			while (q<0)
				{System.out.println("Amount entered must be equal to 0 or greater!");
				System.out.println("How many quarters would you like to put into the purse?");
				q=input.nextInt();
				}
		c.addQuarters(q);		
		
		//user is prompted to see if any currency is to be removed
		System.out.println("Would you like to remove currency from the purse? 1 - Yes  2 - No");
			r=input.nextInt();
			while (r==1)
	{
		
		//type of currency to be removed from purse
		System.out.println("Please choose what you would like to remove from the purse: 1 - Quarters, 2 - Dimes, 3 - Nickels, 4 - Pennies");
		s=input.nextInt();
			if (s==1)
				{System.out.println("How many quarters would you like to remove from the purse?");
				z=input.nextInt ();
					while (z<0)
						{System.out.println("Value entered must be 0 or greater and equal to " + q + " or less!");
						System.out.println("How many quarters would you like to remove from the purse?");
						z=input.nextInt();
						}
					while (z>q)
						{System.out.println("Value entered must be 0 or greater and equal to " + q + " or less!");
						System.out.println("How many quarters would you like to remove from the purse?");
						z=input.nextInt();
						}
					c.removeQuarters(z);
				}
				
			if (s==2)
				{System.out.println("How many dimes would you like to remove from the purse?");
				y=input.nextInt ();
					while (y<0)
						{System.out.println("Value entered must be 0 or greater and equal to " + d + " or less!");
						System.out.println("How many dimes would you like to remove from the purse?");
						y=input.nextInt();
						}
					while (y>d)
						{System.out.println("Value entered must be 0 or greater and equal to " + d + " or less!");
						System.out.println("How many dimes would you like to remove from the purse?");
						y=input.nextInt();
						}
					c.removeDimes(y);
				}
									
			if (s==3)
				{System.out.println("How many nickels would you like to remove from the purse?");
				x=input.nextInt ();
					while (x<0)
						{System.out.println("Value entered must be 0 or greater and equal to " + n + " or less!");
						System.out.println("How many nickels would you like to remove from the purse?");
						x=input.nextInt();
						}
					while (x>n)
						{System.out.println("Value entered must be 0 or greater and equal to " + n + " or less!");
						System.out.println("How many nickels would you like to remove from the purse?");
						x=input.nextInt();
						}
					 c.removeNickels(x);
				}
						
			if (s==4)
				{System.out.println("How many pennies would you like to remove from the purse?");
				w=input.nextInt ();
					while (w<0)
						{System.out.println("Value entered must be 0 or greater and equal to " + p + " or less!");
						System.out.println("How many pennies would you like to remove from the purse?");
						w=input.nextInt();
						}
					while (w>p)
						{System.out.println("Value entered must be 0 or greater and equal to " + p + " or less!");
						System.out.println("How many pennies would you like to remove from the purse?");
						p=input.nextInt();
						}
					c.removePennies(w);
				}
							
			System.out.println("Would you like to remove currency from the purse? 1 - Yes  2 - No");
			r=input.nextInt();
		}
		//Displays the total amount in purse
		float t;
                t = c.totalValue();
                if(t>=100)
                {
                    t = t/100;
                }
		System.out.println("There is $" + t + " in the purse.");
	}
}