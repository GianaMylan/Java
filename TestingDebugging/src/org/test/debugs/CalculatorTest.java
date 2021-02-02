package org.test.debugs;

import org.junit.Test;
import org.junit.Assert;
import org.perscholas.example.CalDebug;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Assert.assertEquals(12, CalDebug.add(6, 6));
    }
    @Test //must repeat the annotation with each test
    public void testSubtract () {
        Assert.assertEquals(-2, CalDebug.subtract(2, 4));
    }
    @Test
    public void testMultiply () {
        Assert.assertEquals(16, CalDebug.multiply(4, 4));
    }
    @Test
    public void testDivide () {
        Assert.assertEquals(1, CalDebug.divide(2, 2));
    }
}
