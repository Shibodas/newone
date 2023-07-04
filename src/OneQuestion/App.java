package OneQuestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		int option = 1;
		String name;
		String type;
		double price;
		int quantity;
		String choice;
		ArrayList<Item> items = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				
				System.out.println("Enter name of the product: ");
				name = reader.readLine();
				System.out.println("Enter type of the product: ");
				type = reader.readLine();
				System.out.println("Enter price of the product: ");
				price = Double.parseDouble(reader.readLine());
				System.out.println("Enter quantity of the product: ");
				quantity = Integer.parseInt(reader.readLine());
				
				Item item = new Item(name, type, price, quantity);
				item.calculateTax();
				items.add(item);
				for (Item i : items) {
					System.out.println(i);
				}
				option = 2;
				while(option == 2) {
					System.out.println("Do you want to enter details of any other item (y/n):");
					choice = reader.readLine();
					if(choice.equalsIgnoreCase("y")) {
						option = 1;
					}
					else if(choice.equalsIgnoreCase("n")) {
						option = 0;
					} else {
						System.out.println("Choice is incorrect");
						option = 2; 
					}
				}
			}catch(Exception e) {
				System.out.println("Enter a valid input");
				System.out.println(e.getMessage());
			}
		} while(option == 1);
		try {
			reader.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
