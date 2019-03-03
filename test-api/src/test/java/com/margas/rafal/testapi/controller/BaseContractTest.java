package com.margas.rafal.testapi.controller;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseContractTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new Controller());
    }

}
