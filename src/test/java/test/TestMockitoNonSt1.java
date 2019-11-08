package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestMockitoNonSt1 {

    @Test
    public void test1() {

        TestNonStatic1 testNonStatic1 = new TestNonStatic1();

        String str = testNonStatic1.test1("");

        Assertions.assertEquals(TestConstants.FLAG1, str);
    }

    @Test
    public void test2() {

        TestNonStatic1 testNonStatic1Mock = Mockito.mock(TestNonStatic1.class);

        String str = testNonStatic1Mock.test1("");

        Assertions.assertNull(str);
    }

    @Test
    public void test3() {

        TestNonStatic1 testNonStatic1Mock = Mockito.mock(TestNonStatic1.class);

        Mockito.when(testNonStatic1Mock.test1(Mockito.anyString())).thenReturn(TestConstants.FLAG2);

        String str = testNonStatic1Mock.test1("");

        Assertions.assertEquals(TestConstants.FLAG2, str);
    }
}
