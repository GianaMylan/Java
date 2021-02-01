package org.test.debugs;

import org.junit.Assert;
import org.junit.Test;
import org.perscholas.example.TestThis;

public class TestThisTest {
    TestThis testThis = new TestThis();
    @Test
    public void testGetNameAtIndex0() {
        Assert.assertEquals("Tony", testThis.getNameAtIndex(2));
    }
    @Test
    public void testGetNameAtIndex1() {
        Assert.assertEquals("Mike", testThis.getNameAtIndex(0));
    }
    @Test
    public void testAddName0() {
        testThis.addName("Jared");
        Assert.assertEquals("Jared", testThis.getNameAtIndex(3));
    }
    @Test
    public void testAddName1() {
        testThis.addName("Angel");
        Assert.assertEquals("Angel", testThis.getNameAtIndex(3));
    }
}