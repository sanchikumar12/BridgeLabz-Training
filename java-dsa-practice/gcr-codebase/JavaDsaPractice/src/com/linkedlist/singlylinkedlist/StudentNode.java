package com.linkedlist.singlylinkedlist;

public class StudentNode{
	public int id;
	public String name;
	public String Department;
	public int Salary;
	public StudentNode next;
	
	public StudentNode(int id ,String name,String Department,int Salary) {
		this.id =id;
		this.name=name;
		this.Department=Department;
		this.Salary=Salary;
		this.next=null;
	}
	
}