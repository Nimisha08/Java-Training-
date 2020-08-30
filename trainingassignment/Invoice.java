package com.trainingassignment;

public class Invoice {
	String partnumber;
	String partdescription;
	int quantity;
	double Price=0;
	
	public Invoice( String partnumber,String partdescription,int quantity, double Price )
	{
		this.partnumber= partnumber;
		this.partdescription= partdescription;
		this.quantity= quantity;
		this.Price=Price;
		
		}

	public String getPartnumber() {
		return partnumber;
	}

	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartdescription() {
		return partdescription;
	}

	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		
		if(quantity>0)
		{
			
		this.quantity = quantity;
		}
			else
			this.quantity=0;
	}

	public double getPrice() {
		
		
		return Price;
	}

	public void setPrice(double price, double Price) {
		if(Price>0)
		{
			this.Price = Price;
		}
			else
			this.Price = 0.0;
			}
	
	public double getInvoiceAmount()
	{
	return getQuantity() * getPrice();
	}
	}
	


