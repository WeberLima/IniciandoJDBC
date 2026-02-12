package entities;

public class account {
	private int number;
	private String name;
	private double balance;
	
	
	public account() {}
	public account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		depositValue(initialDeposit);
	}
	public account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValor() {
		return balance;
	}
	
	public void depositValue(double amount) {
		this.balance += amount;
	}
	public void withdrawValue(double amount) {
		this.balance -= amount +5;
	}
	
	@Override
	public String toString() {
		return "Account "+number+", Holder: "+name+", Balance: $"+ String.format("%.2f", balance);
	}
	
	
}
