package za.ac.cput.factory;
import za.ac.cput.domain.Curator;

import za.ac.cput.util.CuratorHelperClass;

import java.time.LocalDate;

public class CuratorFactory {
    public static Curator createCurator(String firstName, String lastName, String email) {

        if (CuratorHelperClass.isNullOrEmpty(firstName) || CuratorHelperClass.isNullOrEmpty(lastName))
            return null;

        if (!CuratorHelperClass.isValidEmail(email)) {
            return null;
        }
        return new Curator.Builder().setFirstName(firstName).setLastName(lastName)
                .setEmail(email)
                .build();
    }

    public static Curator createCurator(String curatorID, String firstName, String lastName, String email,
                                         String phoneNumber, String specialization, LocalDate hireDate) {

        if (CuratorHelperClass.isNullOrEmpty(firstName) || CuratorHelperClass.isNullOrEmpty(lastName) || CuratorHelperClass.isNullOrEmpty(email) ||
                CuratorHelperClass.isNullOrEmpty(phoneNumber) || CuratorHelperClass.isNullOrEmpty(specialization) || CuratorHelperClass.isNullOrEmpty(hireDate))
            return null;

        return new Curator.Builder().setFirstName(firstName).setLastName(lastName)
                .setEmail(email).setPhoneNumber(phoneNumber).setSpecialization(specialization)
                .setHireDate(hireDate)
                .build();
    }

}
