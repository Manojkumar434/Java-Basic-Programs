package manojkumar.m.hotel;

public class pavithrahotel2 {
	private String productname;
	private String typeofitem;
	private int itemrate;
	private String quantity;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getTypeofitem() {
		return typeofitem;
	}
	public void setTypeofitem(String typeofitem) {
		this.typeofitem = typeofitem;
	}
	public int getItemrate() {
		return itemrate;
	}
	public void setItemrate(int itemrate) {
		this.itemrate = itemrate;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "pavithrahotel [productname=" + productname + ", typeofitem=" + typeofitem + ", itemrate=" + itemrate
				+ ", quantity=" + quantity + "]";
	}
	public pavithrahotel2(String productname, String typeofitem, int itemrate, String quantity) {
		super();
		this.productname = productname;
		this.typeofitem = typeofitem;
		this.itemrate = itemrate;
		this.quantity = quantity;
	}
	public pavithrahotel2() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
