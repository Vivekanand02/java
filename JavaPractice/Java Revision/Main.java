class Zoo
{
	private double ticketPrice=50.0;
	public double getPrice()
	{
		return ticketPrice;
	}
	public void setTicketPrice(double price)
	{
		if(price>0)
			this.ticketPrice=price;
		else
			System.out.println("invalid price!");
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Zoo myZoo=new Zoo();
		System.out.println("Updated Ticket Price :$"+myZoo.getPrice());
		myZoo.setTicketPrice(60.0);
		System.out.println("Updated Ticket Price :$"+myZoo.getPrice());
	}
}