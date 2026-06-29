import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product{
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Product(int productId, String productName, int quantity, double price){
        this.productId=productId;
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }

    public String toString(){
        return "ID: " + productId +
                " "+ "Name: "+productName+
                " "+"Quantity: "+quantity+
                " "+"Price: "+price;
    }
}

enum UpdateField{
    name,quantity,price
}

class Inventory{
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product){
        if(inventory.containsKey(product.getProductId())){
            System.out.println("Product already Exists");
            return;
        }
        inventory.put(product.getProductId(), product);
        System.out.println("Added: "+ product);
    }

    public void updateProduct(int id, UpdateField field, Object newValue){
        Product product = inventory.get(id);
        if(product == null){
            System.out.println("No such Product exists");
            return;
        }
        switch(field){
            case name:
                product.setProductName( (String) newValue);
                System.out.println("Product name updated");
                break;
            case quantity:
                product.setQuantity((int) newValue);
                System.out.println("Product Quantity Updated");
                break;
            case price:
                product.setPrice((double) newValue);
                System.out.println("Product price updated");
                break;
            default:
                System.out.println("Unknown Field");
                break;
        }

    }

    public void deleteProduct(int productId){
        Product old = inventory.remove(productId);
        if(old==null){
            System.out.println("Product not found");
        }
        else{
            System.out.println("Product deleted");
        }
    }

    public void displayInventory(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is Empty");
        }else{
            for(Map.Entry<Integer, Product> entry : inventory.entrySet()){
                System.out.println(entry.getValue());
            }
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args){
        Inventory in = new Inventory();
        Scanner sc = new Scanner(System.in);
        int Choice;

        do{
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display All Products");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            Choice = sc.nextInt();
            switch(Choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    in.addProduct(new Product(id, name, qty, price));
                    break;
                case 2:
                    System.out.println("Enter productId you want to update: ");
                    int updateid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Field to be updated(Name/ Quantity/ Price): ");
                    String field = sc.nextLine();
                    System.out.println("Enter newValue to be updated: ");
                    if (field.equalsIgnoreCase("name")) {
                        String newName = sc.nextLine();
                        in.updateProduct(updateid, UpdateField.name, newName);
                    } else if (field.equalsIgnoreCase("quantity")) {
                        int newqty = sc.nextInt();
                        in.updateProduct(updateid, UpdateField.quantity, newqty);
                    } else if (field.equalsIgnoreCase("price")) {
                        double newprice = sc.nextDouble();
                        in.updateProduct(updateid, UpdateField.price, newprice);
                    } else {
                        System.out.println("No such field exits");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();
                    in.deleteProduct(deleteId);
                    break;

                case 4:
                    in.displayInventory();
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        }while(Choice!=0);
        sc.close();

    }

}

  /*
  output
  1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
1
Enter Product ID: 101
Enter Product Name: laptop
Enter Quantity: 50
Enter Price: 140000.00
Added: ID: 101 Name: laptop Quantity: 50 Price: 140000.0

1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
1
Enter Product ID: 102
Enter Product Name: macbook
Enter Quantity: 45
Enter Price: 200000.00
Added: ID: 102 Name: macbook Quantity: 45 Price: 200000.0

1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
2
Enter productId you want to update: 
101
Enter Field to be updated(Name/ Quantity/ Price): 
price
Enter newValue to be updated: 
15000.00

Product price updated
1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
4
ID: 101 Name: laptop Quantity: 50 Price: 15000.0
ID: 102 Name: macbook Quantity: 45 Price: 200000.0

1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
3
Enter Product ID to Delete: 102
Product deleted

1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
4
ID: 101 Name: laptop Quantity: 50 Price: 15000.0

1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
2
Enter productId you want to update: 
103
Enter Field to be updated(Name/ Quantity/ Price): 
name
Enter newValue to be updated: 
mackook
No such Product exists

1. Add Product
2. Update Product
3. Delete Product
4. Display All Products
0. Exit
Enter your choice: 
0
Exiting... Goodbye!
*/


