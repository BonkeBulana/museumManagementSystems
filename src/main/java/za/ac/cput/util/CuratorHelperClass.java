package za.ac.cput.util;
import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;

public class CuratorHelperClass {

    public static boolean isNullOrEmpty(String str) {
        if (str.isEmpty() || str == null) {
            return true;
        }
        return false;
    }


    public static boolean isValidEmail (String email){
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (emailValidator.isValid(email)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNullOrEmpty(LocalDate hireDate) {
        return false;
    }
}
