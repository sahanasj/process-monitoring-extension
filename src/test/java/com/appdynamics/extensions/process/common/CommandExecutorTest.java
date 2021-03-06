/*
 * Copyright 2013. AppDynamics LLC and its affiliates.
 *  All Rights Reserved.
 *  This is unpublished proprietary source code of AppDynamics LLC and its affiliates.
 *  The copyright notice above does not evidence any actual or intended publication of such source code.
 */

package com.appdynamics.extensions.process.common;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


public class CommandExecutorTest {

    public static final Logger logger = Logger.getLogger(CommandExecutorTest.class);
    private CommandExecutor commandExecutor;

    @Before
    public void setup() {
        commandExecutor = new CommandExecutor();
    }

    @Test
    public void testCommand1() {
        List<String > processLines = commandExecutor.execute("ps aux");
        Assert.assertNotNull(processLines);
    }

    @Test
    public void testCommand2() {
        List<String > processLines = commandExecutor.execute("abc");
        Assert.assertNull(processLines);
    }


}
