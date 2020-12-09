package com.sahana.methods.theatre;

import java.util.Arrays;

/**
 * 
 * @author Om
 *
 */

public class Moviehub {
	private String theaterName;
	private int totalTickets;
	private String[] movieNames;
	private double ticketPrice = 100;
	private String[] snacksList = { "Pop Corn", "Chips", "Cool Drinks", "Samosa", "Nachos", "Fryms" };
	private double snackPrice=50;
	private int totalSnacks=1500;
	
	public Moviehub(String theaterName, int totalTickets, String[] movieNames) 
	{
		System.out.println("Created and init MovieHub*************************");
		System.out.println("arg 1" + theaterName);
		System.out.println("arg 2" + totalTickets);
		System.out.println("arg 3" + Arrays.toString(movieNames));
		this.movieNames = movieNames;
		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
		System.out.println("Created and init MovieHub completed **************");

	}

	/**
	 * This method will check movie exists in theater and return total price
	 * 
	 * @param movieName
	 * @param noOfTickets
	 * @param bookedBy
	 * @return totalPrice
	 */
	public double bookTicketsAndGetTotalPrice(String movieName, int noOfTickets, String bookedBy) {
		double totalPrice = 0;
		System.out.println("invoked bookTickets ");
		System.out.println("arg 1" + movieName);
		System.out.println("arg 2" + noOfTickets);
		System.out.println("arg 3" + bookedBy);
		for (int t = 0; t < this.movieNames.length; t++)// loop array
		{
			String movie = movieNames[t];// access elemnet by index
			System.out.println("comparing " + movie + " with " + movieName);
			if (movieName.equals(movie))// this will compare the values
			{
				System.out.println("movie is found, can do booking");
				System.out.println("total tickets");
				if (noOfTickets <= totalTickets) {
					System.out.println("tickets are available" + this.totalTickets);
					this.totalTickets = this.totalTickets - noOfTickets;
					System.out.println("after booking, tickets available " + this.totalTickets);
					totalPrice = this.ticketPrice * noOfTickets;
					System.out.println("total price of tickets is " + totalPrice);
				} else {
					System.out.println("ist tickets illa...bere kade hogi");
				}

			} else {
				System.out.println("movie is not found ");
			}

		}

		return totalPrice;
	}

	public double buySnacks(String nameOfSnack, int quantity, boolean selfService, String seatNo) {
		double totalPrice = 0;

		System.out.println("invoked buySnacks");
		System.out.println("arg 1 " + nameOfSnack);
		System.out.println("arg 2 " + quantity);
		System.out.println("arg 3 " + selfService);
		System.out.println("arg 4 " + seatNo);
		
		for(int s=0;s<this.snacksList.length;s++)
		{
			System.out.println("snack"+this.snacksList[s]);
			String snack=this.snacksList[s];
			if(snack.equals(nameOfSnack))
			{
				System.out.println("snack is available ");
				if(quantity<=this.totalSnacks)
				{
					System.out.println("snacks quantity available");
					this.totalSnacks=this.totalSnacks-quantity;
					System.out.println("total snacks remaining "+this.totalSnacks);
					totalPrice=quantity*this.snackPrice;
					System.out.println("total price of snack"+totalPrice);
				}
				else {
					System.out.println("snacks quantity not available");
				}
				break;
			}
			else {
				System.out.println("snack is not available");
			}
			
		}

		return totalPrice;
	}

	// ctrl+shift+f
	public String[] getMovieNames() {
		return movieNames;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}
	
	
	public String[] getSnacksList() {
		return snacksList;
	}

}
