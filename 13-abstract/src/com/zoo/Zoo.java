package com.zoo;

public class Zoo {

	public static void main(String[] args) {
		Elephant a1 = new Elephant();
		Cat a2 = new Cat();
		Dog a3 = new Dog();
		Tiger a4 = new Tiger();
		Wolf a5 = new Wolf();

		Feline f1 = new Cat();
		Feline f2 = new Tiger();
		
		Canine c1 = new Dog();
		Canine c2 = new Wolf();
		
		Feline f3 = new Feline() {
			@Override
			public void scratch() {
				System.out.println("anno is scratch");
				
			}

			@Override
			public void sleep() {
				System.out.println("anno is sleeping");
				
			}

			@Override
			public void eat() {
				System.out.println("anno is eating");
				
			}
		};
		
		showFeline(a2);
		showFeline(a4);
		showCanine(a3);
		showCanine(a5);
		
		showPet(a2);
		showPet(a3);
		
	}

	private static void showPet(Pet pet) {
		pet.cuddle();
		System.out.println(pet.getClass().getName());
		
	}

	private static void showCanine(Canine ca) {
		ca.bite();
		ca.sleep();
		ca.eat();
		System.out.println(ca.getClass().getName());
		
	}
	private static void showFeline(Feline f1) {
		f1.scratch();
		f1.sleep();
		f1	.eat();
		System.out.println(f1.getClass().getName());
		
	}

}
