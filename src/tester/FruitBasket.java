package tester;

import java.util.Scanner;
import com.app.fruits.Apple;
import com.app.fruits.Fruits;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of basket.");
		int size = sc.nextInt();
		int c = 0;
		int counter = 0;

		Fruits[] fruits = new Fruits[size];

		do {
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
//				String color, double weight, String name
				System.out.println("Enter details color, weight, name of mango.");
				if (counter < size) {
					fruits[counter] = new Mango(sc.next(), sc.nextDouble(), sc.next());
					counter++;
				} else {
					System.out.println("Basket is full..");
				}
				break;

			case 2:
				if (counter < size) {
					System.out.println("Enter detals color, weight, name of Orange.");
					fruits[counter] = new Orange(sc.next(), sc.nextDouble(), sc.next());
					counter++;
				} else {
					System.out.println("Basket is full..");
				}
				break;

			case 3:
				if (counter < size) {
					System.out.println("Enter detals color, weight, name of Apple.");
					fruits[counter] = new Apple(sc.next(), sc.nextDouble(), sc.next());
					counter++;
				} else {
					System.out.println("Basket is full..");
				}
				break;

			case 4:
				System.out.println("Names of all fruits in the basket.");
				for (Fruits fruit : fruits) {
					if (fruit != null) {
						System.out.println(fruit.getName());
					}
				}
				break;

			case 5:
				System.out.println("Detail of all fruits in the basket.");
				for (Fruits fruit : fruits) {
					if (fruit != null) {
						System.out.println(fruit + " test : " + fruit.taste());

					}
				}
				break;

			case 6:
				System.out.println("Enter the index to mark as stale.");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					fruits[index].setFresh(false);
					System.out.println(fruits[index].isFresh()+": Mark it as stale.");
				} else {
					System.out.println("Invalid index.");
				}
				break;

			case 7:
				for (int i = 0; i < counter; i++) {
					String test = fruits[i].taste();
					if (test.equalsIgnoreCase("sour")) {
						fruits[i].setFresh(false);
//						System.out.println("Fruit true if fresh and false if stale : "+fruits[i].isFresh());
						if(fruits[i].isFresh() == true) 
							System.out.println(fruits[i].getName() +" Fresh fruit.");
						else
							System.out.println(fruits[i].getName() +" Marked as Stale");
					
					}
				}
				break;

			case 8:
				System.out.println("Enter the index to call specific functionality");
				int index2 = sc.nextInt() - 1;

				if (fruits[index2] instanceof Mango) {
					((Mango) fruits[index2]).pulp();
				} else if (fruits[index2] instanceof Orange) {
					((Orange) fruits[index2]).juice();
				} else if (fruits[index2] instanceof Apple) {
					((Apple) fruits[index2]).jam();
				}

				break;

			case 9:
				System.out.println("Exit");
				c = 11;
				break;

			default:
				System.out.println("Invalid choice ...");
				break;
			}
		} while (c < 10);

	}

}
