package com.facebok.Pojo;

public class Human {

	public static void main(String[] args) {
		person mili= new person(2, 2, 2);
		mili.talk("english");
		person safa = new person();
		safa.talk("Bangla");

	}

}

class person{
	int eye;
	int hand;
	int leg;
	
	public person(int eye, int hand, int leg) {
		super();
		this.eye = eye;
		this.hand = hand;
		this.leg = leg;
	}
	
	person(){}
	
	public String talk(String language) {
		System.out.println("we speak in "+language);
		return language;
		
	}
}



