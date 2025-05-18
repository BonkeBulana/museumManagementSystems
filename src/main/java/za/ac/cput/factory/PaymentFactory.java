package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.PaymentHelperClass;

public class PaymentFactory {
    public static Payment createPayment(String paymentID, String paymentMethod, double amount, String status) {
        if (PaymentHelperClass.isNullOrEmpty(paymentID) || PaymentHelperClass.isNullOrEmpty(paymentMethod) || PaymentHelperClass.isNullOrEmpty(status)) {
            return null;
        }

        if (!PaymentHelperClass.isValidAmount(amount)) {
                return null;
            }
            return new Payment.Builder()
                    .setPaymentID(paymentID)
                    .setPaymentMethod(paymentMethod)
                    .setAmount(amount)
                    .setStatus(status)
                    .build();
        }
    }

