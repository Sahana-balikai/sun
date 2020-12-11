package com.sahana.data.dto;
enum Shape{
	SQUARE,ROUND,DIAMOND,TRIANGLE
}

public class SweetDTO {
	private String name;
    private int price;
    private String[] color;
    private String popularState;
    private Shape shape;
    private String quantity;
    
    public SweetDTO(String name,int price) {
   	 this.name=name;
   	 this.price=price;
    }
    Shape s1=Shape.TRIANGLE;
    public SweetDTO(String popularState,String quantity,String[] color) {
   	 this.color=color;
   	 this.popularState=popularState;
   	 this.quantity=quantity;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public String getPopularState() {
		return popularState;
	}
	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
