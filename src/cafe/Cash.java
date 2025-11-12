package cafe;

public class Cash extends Payment{
    private double cash;

    public Cash(double cash){
        this.cash = cash;
    }

    @Override
    public void makePayment(Order order){
        System.out.println(order.getCustomer().getName() + " is paying with cash for order #" + order.getOrderId());
        System.out.println("Amount recieved: $" + cash);
        System.out.println("Payment successful!");
    }

    @Override
    public String getPaymentType(){
        return "cash";
    }
}
