package com.bazlur.tips.solid.srp.before;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/7/16.
 */
public class PaymentGateway {
    private String credentials;
    private String cardNumber;
    private int expirationMonth;
    private int expirationYear;
    private String nameOnCard;
    private double amountToCharge;

    public void charge() throws AddressVerificationServiceMismatchException {
        System.out.println("payment has been made");
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public void setAmountToCharge(double amountToCharge) {
        this.amountToCharge = amountToCharge;
    }
}
