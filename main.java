import java.util.Scanner;
public class Main
{
    static void ProductManagement(){
        Scanner sc = new Scanner(System.in);
        int productChoice;
        System.out.println("Enter your choice : \n1.Create new product \n2.View Products \n3.Edit Products \n4.Delete Products");
        productChoice = sc.nextInt();
        
        if(productChoice==1){
            System.out.println("Product Created");
        }else if(productChoice==1){
            
        }
    }
    
    static void InventoryManagement(){
        Scanner sc = new Scanner(System.in);
        int inventoryChoice;
        System.out.println("Enter your choice : \n1.Add Stock \n2.Remove Stock \n3.View Stock");
        inventoryChoice = sc.nextInt();
        
        if(inventoryChoice==1){
            
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Hello World");
	Scanner sc = new Scanner(System.in);
		
		int choice1;
		
        System.out.println("Enter your choice : \n1.Product Management\n2.Inventory Management");
        choice1 = sc.nextInt();
        if(choice1==1){
            System.out.println("Product\n");
            ProductManagement();
        }else{
            System.out.println("Inventory\n");
            InventoryManagement();
        }
	}
}

class Product{
    int productId;
    String productName;
    int price;
    int quantityInStock;
    String category;
    String description;
}

class Transactions{
    int transactionId;
    int productId;
    String transactionType;
    int quantity;
    String transactionDate;
}