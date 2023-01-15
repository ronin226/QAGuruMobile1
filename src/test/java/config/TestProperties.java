//
//
//package config;
//
//import org.aeonbits.owner.Config;
//import org.aeonbits.owner.ConfigFactory;
//
//public class TestProperties {
//    private static final UserConfig CONFIG = ConfigFactory.create(UserConfig.class, System.getProperties());
//
//    public static final String
//            APPCODE = CONFIG.appcode(),
//            BASEURL = CONFIG.baseurl();
//
//    @Config.Sources("classpath:config/test.properties")
//    private interface UserConfig extends Config {
//
//        @Key("appCode")
//        String appcode();
//
//        @Key("baseUrl")
//        String baseurl();
//
//    }
//}
//
