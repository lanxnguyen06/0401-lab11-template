package cafe;

public class Mobile extends Payment{
    private String mobileApp;
    private boolean authorized;

    public Mobile(String mobileApp, boolean authorized){
        this.mobileApp = mobileApp;
        this.authorized = authorized;
    }

    @Override
    public void makePayment(Order order){
        if (authorized){
            System.out.println(order.getCustomer().getName() + " is paying with the mobile app " + mobileApp + " for order #" + order.getOrderId());
            System.out.println("Payment processing... Payment successful!");
        }
        else
            System.out.println(order.getCustomer().getName() + " is paying with the mobile app " + mobileApp + " for order #" + order.getOrderId());
            System.out.println("Payment unauthorized! Payment failed!");
    }

    @Override
    public String getPaymentType(){
        return mobileApp;
    }
    
}
