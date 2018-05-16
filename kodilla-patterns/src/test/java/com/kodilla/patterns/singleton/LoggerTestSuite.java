package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        //Given
        Logger.getInstance().log("The logger is started");

        //When
        String log = Logger.getInstance().getLastLog();
        System.out.println("Last log: " + log);

        //Then
        Assert.assertEquals("The logger is started", log);
    }

}
