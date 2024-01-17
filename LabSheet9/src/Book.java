import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	} 
	
	
	public void setPrice(float price) {
		this.price=price;
	}
	public float getprice() {
		return price;
	} 	
	
	
	public void setpublishyear(int publishyear) {
		this.publishyear=publishyear;
	}
	public int getpublishyear() {
		return publishyear;
	}  
	
	public int getTotalYear() {
		return Year.now().getValue()-getpublishyear();
	}
	public String toString() {
		return "Title: "+title+" published for "+getTotalYear()+" year ("+price+" baht).";
	}
}
