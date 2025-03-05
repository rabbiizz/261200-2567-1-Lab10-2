import silphco.PayD;
import teamrocket.Xpay;

public class Main {
    public static void main(String[] args) {
        Xpay xpay = new Xpayimpi() ;
        xpay.setCreditCardNo("4789565874102365");
        xpay.setCustomerName("Somchai Jaidee");
        xpay.setCardExpMonth("09");
        xpay.setCardExpYear("25");
        xpay.setCardCVVNo((short) 235);
        xpay.setAmount(2565.23);

        PayD payX = new XpayToPayDAdapter(xpay);

    }
}