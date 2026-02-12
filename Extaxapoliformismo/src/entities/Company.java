package entities;

public class Company extends TaxPayer{
	private Integer numberOfEmployeers;
	
	public Company() {
		super();
	}
	
	
	


	public Company(String name, Double anualIncome, Integer numberOfEmployeers) {
		super(name, anualIncome);
		this.numberOfEmployeers = numberOfEmployeers;
	}





	public Integer getNumberOfEmployeers() {
		return numberOfEmployeers;
	}


	public void setNumberOfEmployeers(Integer numberOfEmployeers) {
		this.numberOfEmployeers = numberOfEmployeers;
	}


	@Override
	public Double tax() {
		double total = 0;
			if(numberOfEmployeers > 10) {
				total = getAnualIncome() * 0.14;
			}else {
				total = getAnualIncome()* 0.16;
			}
			
		return total;
	}
	
}
