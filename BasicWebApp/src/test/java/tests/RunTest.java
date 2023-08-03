package tests;

import factory.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunTest {


    @Test
    public void test_JUnit() {
        Assertions.assertEquals("This is the testcase in this class", Calculation.returnString());
    }
}
