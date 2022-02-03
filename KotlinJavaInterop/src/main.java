import java.util.List;

public class main {
    public static void main(String[] args) {
        Customer phil = new Customer(1,"Phil");
        CustomerDatabase db = new CustomerDatabase();
//        List<Customer> customers = db.getCustomers();
        try{
            db.addCustomer(phil);
        }
        catch (IllegalAccessException e){
            System.out.println("Caught Exception");
        }
//        customers.add(phil);
        for(Customer c : db.getCustomers()) {
            System.out.println(c);
        }

        CustomerDatabase.helloWorld();
    }

}
