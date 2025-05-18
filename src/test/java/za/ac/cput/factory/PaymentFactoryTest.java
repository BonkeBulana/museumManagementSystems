package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Payment;

import static org.junit.jupiter.api.Assertions.*;

class PaymentFactoryTest {
     private static Payment payment1 = PaymentFactory.createPayment("12345", "Credit Card", 150.00, "Completed");
     private static Payment payment2 = PaymentFactory.createPayment(null, "PayPal", 200.00, "Pending");
     private static Payment payment3 = PaymentFactory.createPayment("54321", "Debit Card", -300.00, "Failed");

    @Test
    public void testCreatePaymentWithFullAttributes() {
        assertNotNull(payment1);
        System.out.println(payment1.toString());
    }

    @Test
    public void testCreatePaymentThatFails() {
        assertNotNull(payment2);
        System.out.println(payment2.toString());
    }

    @Test
    public void testCreatePaymentWithInvalidAmount() {
        assertNull(payment3);
        System.out.println(payment3.toString());
    }

    @Disabled
    @Test
    public void testUnderConstruction() {
        //ToDo
    }

}