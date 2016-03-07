package com.bazlur.tips.solid.srp.before;

public class Order {

    public void checkout(Cart cart, PaymentDetails paymentDetails, boolean notifyCustomer) throws OrderException {
        if (paymentDetails.getPaymentMethod() == PaymentMethod.CREDIT_CARD) {
            chargeCard(paymentDetails, cart);
        }

        reserveInventory(cart);

        if (notifyCustomer) {
            notifyCustomer(cart);
        }
    }

    private void notifyCustomer(Cart cart) {
        String customerEmailAddress = cart.getCustomerEmailAddress();
        sendEmail(customerEmailAddress);
    }

    private void reserveInventory(Cart cart) {
        InventoryService inventoryService = new InventoryService();
        cart.getItems().forEach(orderItem ->
                inventoryService.reserve(orderItem.getSku(), orderItem.getQuantity()));
    }

    private void chargeCard(PaymentDetails paymentDetails, Cart cart) throws OrderException {
        PaymentGateway paymentGateway = new PaymentGateway();
        try {
            paymentGateway.setCredentials("account credentials.. ");
            paymentGateway.setCardNumber(paymentDetails.getCardNumber());
            paymentGateway.setAmountToCharge(cart.getTotal());
            paymentGateway.setExpirationMonth(paymentDetails.getExpirationMonth());
            paymentGateway.setExpirationYear(paymentDetails.getExpirationYear());
            paymentGateway.setNameOnCard(paymentDetails.getNameOnCard());

            paymentGateway.charge();
        } catch (AddressVerificationServiceMismatchException exception) {
            throw new OrderException("The card gateway rejected the card based on the address provided.", exception);
        } catch (Exception ex) {
            throw new OrderException("There was a problem with your card.", ex);
        }
    }

    private void sendEmail(String customerEmailAddress) {
        System.out.println("Email has been sent to : " + customerEmailAddress);
    }
}
