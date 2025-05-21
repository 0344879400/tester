package com.anhnt.model.data;

import org.anhnt.globals.ConfigsGlobal;
import com.anhnt.model.LoginPOJO;

public class LoginPOJO_Builder {

    public static LoginPOJO getDataLogin(){
        return LoginPOJO.builder()
                .username(ConfigsGlobal.USERNAME)
                .password(ConfigsGlobal.PASSWORD)
                .build();
    }

}
