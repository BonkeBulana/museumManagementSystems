package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Curator;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
class CuratorFactoryTest {

    private static Curator curator1 = CuratorFactory.createCurator("Avuyile", "Matutu", "avuyilevuvu@gmail.com");
    private static Curator curator2 = CuratorFactory.createCurator("8511128962114","Tshepiso","Magrimbe","tshepisogrim@gmail.com"
            ,"0727245766","contemporary art", LocalDate.parse("10-11-11"));
    private static Curator curator3 = CuratorFactory.createCurator("770305987623","Jabu","Maake",
            "jabugmail.com", "0749935643","archaeology", LocalDate.parse("08-01-11"));


    @Test
    public void testCreateCurator() {
        assertNotNull(curator1);
        System.out.println(curator1.toString());
    }

    @Test
    public void testCreateCuratorWithFullAttributes() {
        assertNotNull(curator2);
        System.out.println(curator2.toString());
    }

    @Test
    public void testCreateCuratorThatFails() {
        assertNotNull(curator3);
        System.out.println(curator3.toString());
    }

    @Disabled
    @Test
    public void testUnderConstruction() {
        //ToDo
    }

  
}