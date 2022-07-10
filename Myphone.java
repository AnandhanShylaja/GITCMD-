package org.hotel;

public class Myphone implements Zomato, Swiggy {

	@Override
	public void app() {
System.out.println("playstore");		
	}

	@Override
	public void phno() {
System.out.println("7989898");		
	}

	@Override
	public void website() {
System.out.println("url");		
	}
	public static void main(String[] args) {
		Myphone m=new Myphone();
		m.app();
		m.phno();
		m.website();
	}

	@Override
	public void url() {
System.out.println("hhhhttps");		
	}

}
