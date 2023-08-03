package tests;

import factory.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunTest {


//    @Test
//    public void testFindMax1(){
//        int expectedValue=4;
//        Assertions.assertEquals(expectedValue, Calculation.findMax1(new int[]{1,3,4,2}));
//        //change the method in the below calculation.findmax2 method to findMax1 & you can re-create a junit failure*
//        expectedValue=-1;
//        Assertions.assertEquals(expectedValue, Calculation.findMax2(new int[]{-12,-1,-3,-4,-2}));
//
//    }
//
//    @Test
//    public void testFindMax2(){
//        Assertions.assertEquals(4, Calculation.findMax2(new int[]{1,3,4,2}));
//        Assertions.assertEquals(-1, Calculation.findMax2(new int[]{-12,-1,-3,-4,-2}));
//    }

    @Test
    public void testFindMax3(){
        Assertions.assertTrue(Calculation.findMax3(3));
    }
}
