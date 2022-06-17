package Builder;

public class Lesson {
	
	private Boolean isNewStudent;
	private int id;// ogrenciId
	private String name; // isim
	private String name2;
	private double price; // ücret
	private double discountedPrice; // indirimli fiyat
	private Boolean discountApplied; // uygulanan indirim
	public Boolean isNewStudent() {
		return isNewStudent;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getName2() {
		return name2;
	}
	public double getPrice() {
		return price;
	}
	public double getDiscountedPrice() {
		return discountedPrice;
	}
	public Boolean getDiscountApplied() {
		return discountApplied;
	}
    public Lesson(Builder builder){
    	this.id = builder.id;
    	this.name = builder.name;
    	this.name2 = builder.name2;
    	this.price = builder.price;
    	this.discountedPrice = builder.discountedPrice;
    	this.discountApplied = builder.discountApplied;
    	this.isNewStudent = builder.isNewStudent;
    }
    public static class Builder {
    	Builder(){	
    	}
    	private int id;// ogrenciId
    	private String name,name2; // isim
    	private double price,discountedPrice; // ücret
    	private Boolean discountApplied; // uygulanan indirim
    	private Boolean isNewStudent;
    	
    	public Builder name(String name) {
    		this.name = name;
    		return this;
    	}
    	public Builder name2(String name2) {
    		this.name2 = name2;
    		return this;
    	}
    	public Builder id(int id) {
    		this.id = id;
    		return this;
    	}
    	public Builder price(double price) {
    		this.price = price;
    		this.discountedPrice = price;
    		if(isNewStudent) {
    			this.discountedPrice = price * 0.25 ;
    			this.discountApplied = true ;
    		}	
    		return this;
    	}
    	public Builder isNewStudent(boolean isNewStudent) {
    		this.isNewStudent = isNewStudent;
    		return this;
    	}
    	public Lesson build() {
    		return new Lesson(this);
    	}
    }

}