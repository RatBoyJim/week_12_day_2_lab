public class CreditCard extends BankCard {


    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }


    public String scan() {
        return "Payment Successful";
    }
}
