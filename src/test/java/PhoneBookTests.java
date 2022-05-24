import org.junit.jupiter.api.*;


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
    public void testAddContactToGroup(){
        String groupname = "Friends";
        String name = "Alexandr";
        String number = "8-999-888-99-88";

        sut.makeGroup(groupname);
        sut.addContactToGroup(new Contact(name, number), groupname);

        boolean result = sut.searchGroupOfContact(groupname).isEmpty();

        Assertions.assertFalse(result);                // проверка на заполнение list созданным контактом
    }

    @Test
    public void testSearchGroupOfContact(){
        String groupName = "Friends";
        String name = "Alexandr";
        String number = "8-999-888-99-88";

        sut.makeGroup(groupName);
        sut.addContactToGroup(new Contact(name, number), groupName);

        String expected = "Список контактов в группе " + groupName + ":" + "\n"
                + name + " " + "(" + number + ")\n";

        String result = sut.searchGroupOfContact(groupName);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSearchContactOfNumber(){
        String groupName = "Friends";
        String name = "Alexandr";
        String number = "8-999-888-99-88";

        sut.makeGroup(groupName);
        sut.addContactToGroup(new Contact(name, number), groupName);

        String expected = name + " (" + number + ")";
        String result = String.valueOf(sut.searchContactOfNumber(number));

        Assertions.assertEquals(expected, result);
    }

}
