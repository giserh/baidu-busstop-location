package com.yourblogz.busstop.example;

import org.junit.Test;

import junit.framework.TestCase;

public class DongGuanBuslineGeneratorTest extends TestCase {

    @Test
    public void testStart() {
        DongGuanBuslineGenerator generator = new DongGuanBuslineGenerator("c3");
        generator.setConnectTimeout(10000).start();
    }
}
