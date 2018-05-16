package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    public void testGetLastLog() {

        //Given
        logger = new Logger();
        logger.log("The logger is started");

        //When
        String log = logger.getLastLog();
        System.out.println("Last log: " + log);

        //Then
        Assert.assertEquals("The logger is started", log);
    }

}
