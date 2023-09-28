package model;

public class CustomerBill {
	
	public double calculateScoops(Customer customer) {
		double scoops = 0;
		if(customer.getScoop() == 1) {
			scoops = customer.getScoop() * 3.99;
			return scoops;
		} else if(customer.getScoop() == 2) {
			scoops = customer.getScoop() * 4.89;
			return scoops;
		}else if(customer.getScoop() == 3) {
			scoops = customer.getScoop() * 5.79;
			return scoops;
		}else{
			return scoops;
		}
	}
	
	public boolean tooMany(Customer customer) {
		if(customer.getScoop() > 3) {
			return true;
		}else {
			return false;
		}
	}

}
