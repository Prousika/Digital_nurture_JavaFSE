Product.java

public class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
    }

    public void display(){
        System.out.println(productId+" "+productName+" "+category);
    }
}

LinearSearch.java

public class LinearSearch {

    public static Product search(Product[] products, int key){
        for(Product p : products){
            if(p.productId == key){
                return p;
            }
        }
        return null;
    }
}

BinarySearch.java

public class BinarySearch {

    public static Product search(Product[] products, int key){

        int low=0;
        int high = products.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(products[mid].productId==key)
                return products[mid];

            else if(products[mid].productId < key)
                low = mid+1;

            else
                high = mid-1;

        }
        return null;
    }
}


SearchFunction.java

import java.util.Arrays;
import java.util.Comparator;

public class SearchFunction {

    public static void main(String[] args){

        Product[] products = {
                new Product(103,"Laptop","Electronics"),
                new Product(105, "Mouse", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(102, "Bag", "Fashion")
        };

        int searchId = 104;

        System.out.println("Linear Search");
        Product result1 = LinearSearch.search(products, searchId);

        if(result1!=null){
            result1.display();
        }
        else{
            System.out.println("Product Not Found");
        }

        System.out.println("\nBinary Search");
        Arrays.sort(products, Comparator.comparingInt(p->p.productId));
        Product result2 = BinarySearch.search(products, searchId);

        if(result2!=null)
            result2.display();
        else
            System.out.println("Product Not Found");

    }
}

/*
Output:
Linear Search
104 Watch Accessories

Binary Search
104 Watch Accessories
*/

/*
TIME COMPLEXITY

  Linear Search
  Best Case -> O(1)
  Average Case -> O(n)
  Worst Case ->O(n)

  Binary Search
  Best Case -> O(1)
  Average Case -> O(log n)
  Worst Case -> O(log n)

Most Suitable Algorithim
  Binary Search Alogorithm - when we have large datasets and efficent for RealTime E-commerce platforms

*/
  
