//
//
//package config;
//
//import org.aeonbits.owner.Config;
//import org.aeonbits.owner.ConfigFactory;
//
//public class UserProperties {
//    private static final UserConfig CONFIG = ConfigFactory.create(UserConfig.class, System.getProperties());
//
//    public static final String
//            USERNAME = CONFIG.userName(),
//            USERKEY = CONFIG.userKey();
//
//
//    @Config.Sources("classpath:config/test.properties")
//    private interface UserConfig extends Config {
//
//        @Key("username")
//        String userName();
//
//        @Key("userkey")
//        String userKey();
//
//
//    }
//}
//
