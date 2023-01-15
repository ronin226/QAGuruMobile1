package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/test.properties"})

public interface BrowserstackConfig extends Config {

    @Key("userName")
    String USERNAME();

    @Key("userKey")
    String USERKEY();

    @Key("appCode")
    String APPKEY();


    @Key("baseURL")
    String BASEURL();
}