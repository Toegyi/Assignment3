package problem1;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[2];

        Address billingAddress1 = new Address("123 Main St", "Chicago", "IL", "60601");
        Address shippingAddress1 = new Address("456 State St", "Chicago", "IL", "60602");
        Customer customer1 = new Customer("John", "Doe", "111-11-1111");
        customer1.setBillingAddress(billingAddress1);
        customer1.setShippingAddress(shippingAddress1);
        customers[0] = customer1;

        Address billingAddress2 = new Address("789 Elm St", "New York", "NY", "10001");
        Address shippingAddress2 = new Address("1010 Park Ave", "New York", "NY", "10022");
        Customer customer2 = new Customer("Jane", "Wan", "222-22-2222");
        customer2.setBillingAddress(billingAddress2);
        customer2.setShippingAddress(shippingAddress2);
        customers[1] = customer2;

        for (int i = 0; i < customers.length; ++i) {
            Address b = customers[i].getBillingAddress();
            if (b.getCity() == "Chicago") {
                System.out.println(customers[i]);
            }
        }
    }
}
