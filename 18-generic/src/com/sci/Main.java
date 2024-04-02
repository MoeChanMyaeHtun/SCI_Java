package com.sci;

public class Main {

	public static void main(String[] args) {
		Cup<Tea> teaCup = new Cup<>(new Tea());
		teaCup.makeDrink();
		
		Cup<Coffee> coffeeCup = new Cup<>(new Coffee());
		coffeeCup.makeDrink();
		
		Cup<OrangeJuice> orangeJuiceCup = new Cup<>(new OrangeJuice());
		orangeJuiceCup.makeDrink();

	}

}
