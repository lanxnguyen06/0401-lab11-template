package cafe;

public class Card extends Payment{
    private String cardType; // credit or debit

    public Card(String cardType){
        this.cardType = cardType;
    }

    @Override
    public void makePayment(Order order){
        System.out.println(order.getCustomer().getName() + " is paying with their " + cardType + " card for order #" + order.getOrderId());
        System.out.println("Payment processing... Payment successful!");
    }

    @Override
    public String getPaymentType(){
        return cardType + " card";
    }
    
}
