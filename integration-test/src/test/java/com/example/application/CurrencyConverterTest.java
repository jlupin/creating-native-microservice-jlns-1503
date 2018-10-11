package com.example.application;

import com.example.application.base.BaseTest;
import com.example.application.service.interfaces.WelcomeService;
import com.jlupin.impl.client.util.JLupinClientUtil;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class CurrencyConverterTest extends BaseTest {
    @Test
    public void exampleTest() {
        WelcomeService service = JLupinClientUtil.generateRemote(getJLupinDelegator(), "welcome-microservice", WelcomeService.class);
        assertEquals(Collections.singletonMap("message", "Hello Piotr!"), service.getWelcomeMessage(Collections.singletonMap("name", "Piotr")));
    }
}