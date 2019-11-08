package test;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

//注解@DisplayName，可以指定测试类或测试方法在测试结果中的显示名称
public class TestJUnit1 {

    private static List<String> orderList = new ArrayList<>();

    public static final String NAME_BEFOREALL = "beforeAll";
    public static final String NAME_BEFOREEACH = "beforeEach";
    public static final String NAME_TEST1 = "test1";
    public static final String NAME_AFTEREACH = "afterEach";
    public static final String NAME_AFTERALL = "afterAll";

    @BeforeAll
    public static void beforeAll() {
        orderList.add(NAME_BEFOREALL);
    }

    @BeforeEach
    public void beforeEach() {
        orderList.add(NAME_BEFOREEACH);
    }

    @Test
    @DisplayName("this is just a test")
    public void test1() {
        orderList.add(NAME_TEST1);
    }

    @AfterEach
    public void afterEach() {
        orderList.add(NAME_AFTEREACH);
    }

    @AfterAll
    public static void afterAll() {
        orderList.add(NAME_AFTERALL);

        Assertions.assertEquals(5, orderList.size());

        Assertions.assertEquals(NAME_BEFOREALL, orderList.get(0));
        Assertions.assertEquals(NAME_BEFOREEACH, orderList.get(1));
        Assertions.assertEquals(NAME_TEST1, orderList.get(2));
        Assertions.assertEquals(NAME_AFTEREACH, orderList.get(3));
        Assertions.assertEquals(NAME_AFTERALL, orderList.get(4));
    }
}
