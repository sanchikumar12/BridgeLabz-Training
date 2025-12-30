package com.obejectmodeling.level1;
import java.util.*;
public class HospitalDoctors {
    public static class Doctor{
    	public String name;
    	public int phonenumber;
    	public int fee;
    	ArrayList<Patient> patients =new ArrayList<>(); 
    	public Doctor(String name,int phonenumber,int fee){
    		this.name=name;
    		this.phonenumber=phonenumber;
    		this.fee=fee;
    	}
    	
    	public void addPatient(Patient patient) {
    		patients.add(patient);
    	}
    	
    	public void consult(Patient patient) {
    		System.out.println("Patient name "+patient.name +"getting consulted from"+this.name);
    	}
    }
    
    public static class Patient{
    	public String name;
    	public int phonenumber;
    	ArrayList<Doctor> doctors =new ArrayList<>(); //Aggregation==>
    	
    	public Patient(String name,int phonenumber) {
    		this.name=name;
    		this.phonenumber=phonenumber;
    	}
    	
    	public void addDoctors(Doctor doctor) {
    		doctors.add(doctor);
    	}
    	
    	
    	
    	
    }
	public static void main(String[] args) {
		Doctor doctor1=new Doctor("Kr Mangalam" ,89877676,500);
		Doctor doctor2=new Doctor("Kr Mangalam" ,89877676,500);
		
		Patient patient1 =new Patient("Sanchit kumar",877655666);
		Patient patient2 =new Patient("Sanchittt kumar",877655666);
		
		doctor1.addPatient(patient1);
		doctor1.consult(patient1);
		
		patient1.addDoctors(doctor1);
	}

}
