import org.junit.jupiter.api.*;

public class ContactTests {
    String name = "Alexandr";
    String number = "8-999-999-88-88";

    @BeforeAll
    public static void initSuite(){
        System.out.println("Tests starts");
    }

    @BeforeEach
    public void initTest(){
        System.out.println("Test start");
    }

    @AfterEach
    public void finishedTest(){
        System.out.println("Test completed");
    }

    @AfterAll
    public static void completeSuite(){
        System.out.println("All tests completed");
    }

    @Test
    public void testEquals(){
        String name2 = "Regina";
        String number2 = "8-999-999-88-88";
        Contact contact1 = new Contact(name, number);
        Contact contact2 = new Contact(name2, number2);

        boolean result = contact1.equals(contact2);

        Assertions.assertTrue(result);

    }

    @Test
    public void testToString(){
        Contact contact = new Contact(name, number);
        String expected = name + " (" + number + ")";

        String result = contact.toString();
        Assertions.assertEquals(expected, result);
    }
}
