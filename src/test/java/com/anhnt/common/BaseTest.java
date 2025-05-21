package com.anhnt.common;

import org.anhnt.globals.ConfigsGlobal;
import org.anhnt.globals.EndPointGlobal;
import org.anhnt.globals.TokenGlobal;
import org.anhnt.helpers.PropertiesHelper;
import org.anhnt.keywords.ApiKeyword;
import com.anhnt.listeners.TestListener;
import com.anhnt.model.LoginPOJO;
import com.anhnt.model.data.LoginPOJO_Builder;
import org.anhnt.reports.AllureManager;
import org.anhnt.utils.LogUtils;
import com.google.gson.Gson;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

@Listeners(TestListener.class)
public class BaseTest {

    @BeforeTest
    public void loginUser() {
        LoginPOJO loginPOJO = LoginPOJO_Builder.getDataLogin();

//        Gson gson = new Gson();
//
//        Response response = ApiKeyword.postNotAuth(EndPointGlobal.EP_LOGIN, gson.toJson(loginPOJO));
//
//        response.then().statusCode(200);
//
//        TokenGlobal.TOKEN = response.getBody().path("token");
//        System.out.println("token"+ TokenGlobal.TOKEN );
//        LogUtils.info("Token Global: " + TokenGlobal.TOKEN);
//        AllureManager.saveTextLog("Token Global: " + TokenGlobal.TOKEN);
    }
}