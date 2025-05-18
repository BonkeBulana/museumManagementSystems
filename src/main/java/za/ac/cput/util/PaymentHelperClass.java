package za.ac.cput.util;

public class PaymentHelperClass {

    public static boolean isNullOrEmpty(String str) {
        if (str.isEmpty() || str == null) {
            return true;
        }
        return false;
    }

    public static boolean isValidAmount(double b) {
        if(b <= 0) {
            return false;
        }
        return true;
    }


}
