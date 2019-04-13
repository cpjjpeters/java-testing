package be.ipeters.sqlrest;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	private int id;
	private Customer customer;
	private double totalSum;
	private final List<Item> items;
	public Invoice(int id) {
		super();
		this.id = id;
		this.items = new ArrayList<Item>();
	}
	public Invoice(int id, Customer customer, double totalSum, List<Item> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.totalSum = totalSum;
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(double totalSum) {
		this.totalSum = totalSum;
	}
	public List<Item> getItems() {
		return new ArrayList<Item>(items);
	}
	public void setItems(List<Item>items) {
		this.items.clear();
		this.items.addAll(items);
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + customer + ", totalSum=" + totalSum + "]";
	}
	
	
	

}
