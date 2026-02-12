package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Clients client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {}

	public Order(LocalDateTime moment, OrderStatus status, Clients client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(Clients client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		 items.add(item);
		
	}
	public void removeItem(OrderItem item) {
		 items.remove(item);
	}
	public double total(){
		double sum=0.0;
		for(OrderItem i: items) {
			sum += i.subTotal();
		}
		return sum;
	}
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(moment.format(fmt) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrderItem item: items) {
			sb.append(item+"\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();	}

}
