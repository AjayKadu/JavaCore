import java.util.Scanner;

public class Menu {

	private int price;
	private int quantity;
	private int totalBill;

	public Menu() {
		this.totalBill = 0;
	}

	public void addBill(int price) {
		this.totalBill += price;
	}

	public int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1. Dosa 40Rs\n2. Samosa 20Rs\n3. Idli 30Rs\n4. Kachori 20Rs\n5. Vada Pav 15Rs\n6. Maggi 20Rs\n7. Pizza 90Rs\n8. Pav Bhaji 40Rs\n9. Sandwich 40Rs\n10. Generate Bill");
		return sc.nextInt();
	}

	public void displayBill() {
		System.out.println("Total Bill: " + this.totalBill + " Rs");
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int choice = menu.menuList();

			if (choice == 10) {
				menu.displayBill();
				break;
			}

			switch (choice) {
			case 1:
				menu.price = 40;
				System.out.println("You selected Dosa.");
				break;
			case 2:
				menu.price = 20;
				System.out.println("You selected Samosa.");
				break;
			case 3:
				menu.price = 30;
				System.out.println("You selected Idli.");

				break;
			case 4:
				menu.price = 20;
				System.out.println("You selected Kachori.");

				break;
			case 5:
				menu.price = 15;
				System.out.println("You selected Vada Pav.");
				break;
			case 6:
				menu.price = 20;
				System.out.println("You selected Maggi.");
				break;
			case 7:
				menu.price = 90;
				System.out.println("You selected Pizza.");
				break;
			case 8:
				menu.price = 40;
				System.out.println("You selected Pav Bhaji.");
				break;
			case 9:
				menu.price = 40;
				System.out.println("You selected Sandwich.");
				break;
			default:
				System.out.println("Invalid Item Input. Please select again.");
				break;
			}
			System.out.print("Enter quantity: ");
	        menu.quantity = sc.nextInt();
			menu.addBill(menu.price * menu.quantity);
		}
		sc.close();
	}
}
