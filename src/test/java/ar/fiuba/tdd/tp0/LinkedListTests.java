package ar.fiuba.tdd.tp0;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class LinkedListTests {
    private Queue<Object> emptyQueue;
    private Queue<Integer> intQueue;
    private Random random = new Random();
    private int[] intNumbers = new int[]{
            random.nextInt(),
            random.nextInt(),
            random.nextInt(),
            random.nextInt()
    };

    @Before
    public void setUp() {
        emptyQueue = new LinkedList<>();
        intQueue = new LinkedList<>();
    }

    @Test
    public void testIsEmpty() {
        Assert.assertEquals(true, emptyQueue.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        intQueue.add(random.nextInt());
        Assert.assertEquals(false, intQueue.isEmpty());
    }

    @Test
    public void testEmptySize() {
        Assert.assertEquals(0, emptyQueue.size());
    }

    @Test
    public void testSize() {
        for (int n : intNumbers) {
            intQueue.add(n);
        }
        Assert.assertEquals(intNumbers.length, intQueue.size());
    }

    @Test(expected = AssertionError.class)
    public void testErrorOnRemoveFromEmpty() {
        emptyQueue.remove();
    }

    @Test(expected = AssertionError.class)
    public void testErrorOnGetFromEmpty() {
        emptyQueue.top();
    }

    @Test
    public void testGetAndRemove() {
        for (int n : intNumbers) {
            intQueue.add(n);
        }
        for (int intNumber : intNumbers) {
            Assert.assertEquals(intNumber, intQueue.top(), 0);
            intQueue.remove();
        }
    }

    @Test
    public void testIntegration() {
        int firstItem = random.nextInt();
        int secondItem = random.nextInt();
        intQueue.add(firstItem);
        intQueue.add(secondItem);
        Assert.assertEquals(intQueue.top(), firstItem, 0);
        Assert.assertEquals(intQueue.size(), 2, 0);
        intQueue.remove();
        Assert.assertEquals(intQueue.top(), secondItem, 0);
        Assert.assertEquals(intQueue.size(), 1, 0);

        int thirdItem = random.nextInt();
        intQueue.add(thirdItem);
        Assert.assertEquals(intQueue.size(), 2, 0);
    }

}
