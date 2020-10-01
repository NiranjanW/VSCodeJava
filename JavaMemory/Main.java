package JavaMemory;

import java.nio.file.Files;
import java.util.List;

public class Main {

    public static void main(String[] args) {
         CustomerRecords records = new CustomerRecords();
        records.addCustomer (new Customer("John"));
        records.addCustomer (new Customer("Jack"));

    for (Customer next : records.getCustomers().values()){
        System.out.println(next);
    }
   

 }
}