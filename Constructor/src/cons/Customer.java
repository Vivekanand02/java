package cons;
public class Customer {
    int Cous_id;
    String Cous_Name;

    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println(c1.Cous_Name);
        System.out.println(c1.Cous_id);
        c1.Cous_Name = "Arpit";
        c1.Cous_id = 30;
        System.out.println(c1.Cous_Name);
        System.out.println(c1.Cous_id);

    }
}
