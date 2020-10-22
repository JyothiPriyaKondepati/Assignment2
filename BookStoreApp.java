import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore b = new BookStore();
		System.out.println("Enter 1 to display books");
		System.out.println("Enter 2 to order books");
		System.out.println("Enter 3 to sell books");
		System.out.println("Enter 0 to exit");

		while (true) {
			System.out.print("Enter input: ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				b.display();
				break;
			case 2:
				b.sell("Jyothi", 1);
				break;
			case 3:
				b.order("70700", 2);
				break;
			default:
				return;
			}
		}
	}
}