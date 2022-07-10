package org.hotel;

public class plate extends Parotta{
	public void veg() {
System.out.println("kurma or chenna");
	}
	@Override
	public void kurma() {
System.out.println("kurma");		
	}
	@Override
	public void chenna() {
System.out.println("chenna");		
	}
	@Override
	public void karikolambu() {
		System.out.println("chicken");
	}
	public static void main(String[] args) {
		plate p=new plate();
		p.chenna();
		p.karikolambu();
		p.kurma();
		
	}
	
		
	}
	
