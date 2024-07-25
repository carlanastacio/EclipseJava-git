package A_Intro;

import java.util.Scanner;

public class C25_DynamicPolymorphism {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Animal1 animal;
		boolean flag = true;

		while (flag) {
			System.out.println("What animal do you want?");
			System.out.println("1 equals Dog/2 equals Cat");

			int choice = scan.nextInt();

			if (choice == 1) {
				animal = new Dog1();
				animal.speak();
				flag = true;
			} else if (choice == 2) {
				animal = new Cat1();
				animal.speak();
				flag = true;
			} else {
				System.out.println("Wrong! only 1 or 2");
				flag = !true;
			}

		}
		scan.close();
	}
}

class Animal1 {

	public void speak() {
		System.out.println("Animal speak!");
	}

}

class Dog1 extends Animal1 {

	@Override
	public void speak() {
		System.out.println("Dog goes arf!");
	}

}

class Cat1 extends Animal1 {

	@Override
	public void speak() {
		System.out.println("Cat goes meow!");
	}

}