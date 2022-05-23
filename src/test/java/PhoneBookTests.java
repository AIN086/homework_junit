import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


public class PhoneBookTests {
    PhoneBook sut;

    @BeforeAll
    public static void initSuite(){
        System.out.println("Tests starts");
    }

    @BeforeEach
    public void initTest(){
        sut = new PhoneBook();
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
    public void testMakeGroup(){
        String groupName = "Friends";
        sut.makeGroup(groupName);
        boolean result = sut.phoneBook.containsKey(groupName);

        Assertions.assertTrue(result);
    }

    @Test
    public void testMakeContact(){
        List<Contact> list = new ArrayList<>();
        String name = "Alexandr";
        String number = "8-999-888-99-88";

        sut.makeContact(list, name, number);

        boolean result = list.isEmpty();

        Assertions.assertFalse(result);                // проверка на заполнение list созданным контактом


    }
}
