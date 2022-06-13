package com.jwc.domain.model;

import java.util.Objects;

//static main메소드와 product 와 아무 관련없다. 
//다른공간에 있다

//1. 무지성 private 멤버 변수
//2. 필요하면 생성자 추가
//3. 무지성 getter / setter 만들기(읽기 전용, 쓰기 전용. 필요하면 지우기) 
//4. 무지성 toString()
//5. 필요하면 equals / hashcode 재정의 (오버라이드)

//objec는 타입을 가리지않고 아무거나 다받겠다.
//extends object 가 생략되어있는 것임./
public class Product {
	public static void main(String[] args) {
		Product product = new Product("33", "33", 11);
		System.out.println(product.hashCode());
		
		Product product2 = new Product("33", "33", 11);
		System.out.println(product2.hashCode());
		
		Object object = new Product("33", "33", 11);
		
		System.out.println(product == product2);

	}

//왜메인메소드를 쓰ㄴ는가?
//		 메인메소드는 무조건 클래스안에있어야한다. 
// 다른 세계에 있다. 그치만 static 끼리는 된다.
	// static은 아주 다른 영역에 있다;
//	public static void main(String[] args) {
//		Product product = new Product();
//		Product product2 = new Product();
//		
//		product.Id = "100";
//		
//	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(Id, other.Id);
	}

	//이내용을 뿌려줄게.
	//디버깅용도로쓴다.
	//source - generate toString
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", name=" + name + ", Price=" + Price + ", description=" + description
				+ ", manufacturer=" + manufacturer + ", category=" + category + ", unitInStock=" + unitInStock
				+ ", condition=" + condition + "]";
	}

	private String Id;
	private String name;
	private int Price;
	private String description;
	private String manufacturer;
	private String category;
	private long unitInStock;
	private String condition;

	
	
	public Product(String id, String name, int price) {
		super();
		Id = id;
		this.name = name;
		Price = price;
	}


//getter setter 
	//캡슐화를 하는 이유는?
	//자유롭게 적용해서 쓰기 위해서 
	public String getId() {
		return Id;
	}



	public void setId(String id) {
		Id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return Price;
	}



	public void setPrice(int price) {
		Price = price;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getManufacturer() {
		return manufacturer;
	}



	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public long getUnitInStock() {
		return unitInStock;
	}



	public void setUnitInStock(long unitInStock) {
		this.unitInStock = unitInStock;
	}



	public String getCondition() {
		return condition;
	}



	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	

}
