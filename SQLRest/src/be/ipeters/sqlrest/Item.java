package be.ipeters.sqlrest;

public class Item {
	private Invoice invoice;
	private Product product;
	private int quantity;
	private double cost;
	public Item(Invoice invoice, Product product) {
		super();
		this.invoice = invoice;
		this.product = product;
	}
	public Item(Invoice invoice, Product product, int quantity, double cost) {
		super();
		this.invoice = invoice;
		this.product = product;
		this.quantity = quantity;
		this.cost = cost;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [invoice=" + invoice + ", product=" + product + ", quantity=" + quantity + ", cost=" + cost + "]";
	}
	
	

}
