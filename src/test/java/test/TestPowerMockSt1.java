package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.ClassNotPreparedException;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

//PowerMock不支持JUnit5
@RunWith(PowerMockRunner.class)
@PowerMockIgnore({"javax.management.*", "javax.net.ssl.*", "javax.crypto.*"})
@PrepareForTest({TestStatic1.class})
public class TestPowerMockSt1 {

    @Test
    public void test() {

        ClassNotPreparedException e = Assertions.assertThrows(ClassNotPreparedException.class, () -> PowerMockito
                .mockStatic(TestStatic1.class), "error occurs");

        e.printStackTrace();
    }
}
