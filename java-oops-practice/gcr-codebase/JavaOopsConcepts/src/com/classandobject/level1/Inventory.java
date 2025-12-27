package com.classandobject.level1;

public class Inventory {
	
	String[] itemCode;
	String[] itemName;
	double[] price;
	
	//constructor
	Inventory (String[]itemName ,String[] itemCode,double[] price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	public void displayItems(int i) {
		System.out.println("itemCode : "+itemCode[i]);
		System.out.println("itemPrice : "+price[i]);
		System.out.println("itemName : "+itemName[i]);
		System.out.println("----------------------------");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemName= {"Water bottle","Rice","blackboard"};
		String[] itemCode= {"01AA","01BB","02AA"};
		double[] price= {500,700,400};
		Inventory  item1 = new Inventory (itemName, itemCode,price );
		
		for (int i = 0; i < price.length; i++) {
			item1.displayItems(i);
		}
		


	}

}
