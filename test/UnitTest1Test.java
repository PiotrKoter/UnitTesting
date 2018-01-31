import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest1Test {

    @Test
    void test() {
        UnitTest1 test = new UnitTest1();
        int result = test.addNumber(5, 2);
        assertEquals(7, result);
        int result2 = test.Mnozenie(5,5);
        assertEquals(25, result2);

    }
}