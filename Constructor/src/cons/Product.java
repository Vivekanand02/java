package cons;
public class Product {
    String Product_Name;
    String Product_Category;
    double Product_Price;
    String Date_of_Manufacture;
    String Date_of_Expiry;

    public static void main(String[] args) {
        Product P1 = new Product();
        System.out.println(P1.Product_Name);
        System.out.println(P1.Product_Category);
        System.out.println(P1.Product_Price);
        System.out.println(P1.Date_of_Manufacture);
        System.out.println(P1.Date_of_Expiry);

        P1.Product_Name = "Toned Milk";
        P1.Product_Category= "Dairy";
        P1.Product_Price= 45.5;
        P1.Date_of_Manufacture = "18-08-2025";
        P1.Date_of_Expiry = "19-08-2025";

        System.out.println(P1.Product_Name);
        System.out.println(P1.Product_Category);
        System.out.println(P1.Product_Price);
        System.out.println(P1.Date_of_Manufacture);
        System.out.println(P1.Date_of_Expiry);
    }
    
}
