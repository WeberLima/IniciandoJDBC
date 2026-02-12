package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	private LocalDate manufactureDate;
	
	public UsedProduct() {}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	@Override
	public String priceTag() {
		return super.getName() +" (used) $ "+ super.getPrice()+"(Manufactured date: "+ manufactureDate.format(fmt)+") \n";
	}
}
