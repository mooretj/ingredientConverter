package com.project;

import com.Ingredients.*;

import java.util.Scanner;

public class IngredientConverter {
	Ingredient ingredient = null;

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		IngredientConverter application = new IngredientConverter();

		System.out.print("" +
				" __  __    ___     ___     ___    _   _    ___     ___    _  _     ___              ___     ___    _  __    ___    _  _     ___   \n" +
				"|  \\/  |  | __|   /   \\   / __|  | | | |  | _ \\   |_ _|  | \\| |   / __|     o O O  | _ )   /   \\  | |/ /   |_ _|  | \\| |   / __|  \n" +
				"| |\\/| |  | _|    | - |   \\__ \\  | |_| |  |   /    | |   | .` |  | (_ |    o       | _ \\   | - |  | ' <     | |   | .` |  | (_ |  \n" +
				"|_|__|_|  |___|   |_|_|   |___/   \\___/   |_|_\\   |___|  |_|\\_|   \\___|   TS__[O]  |___/   |_|_|  |_|\\_\\   |___|  |_|\\_|   \\___|  \n" +
				"_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n" +
				"\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \n" +
				"   ___    _  _     ___     ___     ___     ___     ___     ___    _  _    _____    ___              ___   __   __                 \n" +
				"  |_ _|  | \\| |   / __|   | _ \\   | __|   |   \\   |_ _|   | __|  | \\| |  |_   _|  / __|     o O O  | _ )  \\ \\ / /                 \n" +
				"   | |   | .` |  | (_ |   |   /   | _|    | |) |   | |    | _|   | .` |    | |    \\__ \\    o       | _ \\   \\ V /                  \n" +
				"  |___|  |_|\\_|   \\___|   |_|_\\   |___|   |___/   |___|   |___|  |_|\\_|   _|_|_   |___/   TS__[O]  |___/   _|_|_                  \n" +
				"_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_| \"\"\" |                 \n" +
				"\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'                 \n" +
				" __   __   ___     _      _   _  __  __    ___              ___     ___              ___     ___     ___                          \n" +
				" \\ \\ / /  / _ \\   | |    | | | ||  \\/  |  | __|     o O O  |_ _|   / __|     o O O  | _ )   /   \\   |   \\                         \n" +
				"  \\ V /  | (_) |  | |__  | |_| || |\\/| |  | _|     o        | |    \\__ \\    o       | _ \\   | - |   | |) |                        \n" +
				"  _\\_/_   \\___/   |____|  \\___/ |_|__|_|  |___|   TS__[O]  |___|   |___/   TS__[O]  |___/   |_|_|   |___/                         \n" +
				"_| \"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|                        \n" +
				"\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'                        \n" +
				"   ___    _  _     ___            __   __   ___    _   _             ___    _  _     ___    _   _    _       ___                  \n" +
				"  /   \\  | \\| |   |   \\     o O O \\ \\ / /  / _ \\  | | | |    o O O  / __|  | || |   / _ \\  | | | |  | |     |   \\                 \n" +
				"  | - |  | .` |   | |) |   o       \\ V /  | (_) | | |_| |   o       \\__ \\  | __ |  | (_) | | |_| |  | |__   | |) |                \n" +
				"  |_|_|  |_|\\_|   |___/   TS__[O]  _|_|_   \\___/   \\___/   TS__[O]  |___/  |_||_|   \\___/   \\___/   |____|  |___/                 \n" +
				"_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_| \"\"\" |_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|                \n" +
				"\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'                \n" +
				"    ___    ___     ___     _                ___     ___     ___                                                                   \n" +
				"   | __|  | __|   | __|   | |       o O O  | _ )   /   \\   |   \\                                                                  \n" +
				"   | _|   | _|    | _|    | |__    o       | _ \\   | - |   | |) |                                                                 \n" +
				"  _|_|_   |___|   |___|   |____|  TS__[O]  |___/   |_|_|   |___/                                                                  \n" +
				"_| \"\"\" |_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| {======|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|                                                                 \n" +
				"\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'./o--000'\"`-0-0-'\"`-0-0-'\"`-0-0-'                                                                 ");

		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~|  Baking Recipe Fixer  |~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		application.run();
	}

	private void run() {

		boolean running = true;
		while (running) {
			printIngredientMenu();
			int selection = promptForMenuSelection();
			if (selection == 1) {
				ingredient = new Flour();
				requestUnitToConvert();
				running = false;
			} else if (selection == 2) {
				ingredient = new WhiteSugar();
				requestUnitToConvert();
				running = false;
			} else if (selection == 3) {
				ingredient = new BrownSugar();
				requestUnitToConvert();
				running = false;
			} else if (selection == 4) {
				ingredient = new PowderedSugar();
				requestUnitToConvert();
				running = false;
			} else if (selection == 5) {
				ingredient = new Salt();
				requestUnitToConvert();
				running = false;
			} else if (selection == 6) {
				ingredient = new BakingSoda();
				requestUnitToConvert();
				running = false;
			} else if (selection == 7) {
				ingredient = new BakingPowder();
				requestUnitToConvert();
				running = false;
			} else if (selection == 8) {
				ingredient = new VanillaExtract();
				requestUnitToConvert();
				running = false;
			} else if (selection == 9) {
				ingredient = new Butter();
				requestUnitToConvert();
				running = false;
			} else if (selection == 0) {
				System.out.println();
				System.out.println("Thanks for using IngredientConverter 3000, goodbye!");
				System.exit(0);
			}
			 else {
				displayError("Invalid option selected.");
			}
		}
	}

	public int promptForMenuSelection() {

		int menuSelection;
		System.out.print("Please choose an option: ");
		try {
			menuSelection = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			menuSelection = -1;
		}
		return menuSelection;
	}

	public void printIngredientMenu() {
		System.out.println();
		System.out.println("1: All Purpose Flour");
		System.out.println("2: White Sugar");
		System.out.println("3: Brown Sugar");
		System.out.println("4: Powdered Sugar");
		System.out.println("5: Salt");
		System.out.println("6: Baking Soda");
		System.out.println("7: Baking Powder");
		System.out.println("8: Vanilla Extract");
		System.out.println("9: Butter");
		System.out.println("0: Exit");
		System.out.println();
	}

	public void printUnitMenu() {
		System.out.println("What unit do you want to convert?");
		System.out.println("1. Cups");
		System.out.println("2. Teaspoons");
		System.out.println("3. Tablespoons");
		System.out.println("4. Return to Ingredients");
	}

	private void displayError(String message) {
		System.out.println();
		System.out.println("***" + message + "***");
		System.out.println();
	}

	public void requestUnitToConvert() {
		boolean newRunning = true;
		printUnitMenu();
		while (newRunning) {
			int selection = promptForMenuSelection();
			if (selection == 1) {
				cupsConvert();
				newRunning = false;
			} else if (selection == 2) {
				tspConvert();
				newRunning = false;
			} else if (selection == 3) {
				tbspConvert();
				newRunning = false;
			} else if(selection == 4) {
				newRunning = false;
				run();
			} else {
				displayError("Invalid option selected.");
			}
		}
	}

	public void cupsConvert() {
		System.out.println("How much " + ingredient.getName() + " do you want to convert? *Please input a number in 0.0 format.*");
		double unit = scanner.nextDouble();
		int grams = ingredient.cupsToGrams(ingredient, unit);
		System.out.println(unit + " cups of " + ingredient.getName() + " is " + grams + " grams of " + ingredient.getName());
		System.out.println();
		System.out.println("Press enter to continue.");
		scanner.nextLine();
		String userInput = scanner.nextLine();
		if (userInput.isEmpty()) {
			requestUnitToConvert();
		} else {
			System.out.println("Please press enter to continue.");
		}
	}

	public void tspConvert() {
		System.out.println("How much " + ingredient.getName() + " do you want to convert? *Please input a number in 0.0 format.*");
		double unit = scanner.nextDouble();
		int grams = ingredient.teaspoonsToGrams(ingredient, unit);
		System.out.println(unit + " teaspoons of " + ingredient.getName() + " is " + grams + " grams of " + ingredient.getName());
		System.out.println();
		System.out.println("Press enter to continue.");
		scanner.nextLine();
		String userInput = scanner.nextLine();
		if (userInput.isEmpty()) {
			requestUnitToConvert();
		} else {
			System.out.println("Please press enter to continue.");
		}
	}

	public void tbspConvert() {
		System.out.println("How much " + ingredient.getName() + " do you want to convert? *Please input a number in 0.0 format.*");
		double unit = scanner.nextDouble();
		int grams = ingredient.tablespoonsToGrams(ingredient, unit);
		System.out.println(unit + " tablespoons of " + ingredient.getName() + " is " + grams + " grams of " + ingredient.getName());
		System.out.println();
		System.out.println("Press enter to continue.");
		scanner.nextLine();
		String userInput = scanner.nextLine();
		if (userInput.isEmpty()) {
			requestUnitToConvert();
		} else {
			System.out.println("Please press enter to continue.");
		}
	}
}
