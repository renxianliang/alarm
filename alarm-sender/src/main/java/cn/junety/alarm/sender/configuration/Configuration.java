package cn.junety.alarm.sender.configuration;

import cn.junety.alarm.base.util.properties.Config;
import cn.junety.alarm.base.util.properties.Key;
import cn.junety.alarm.base.util.properties.PropertiesLoader;

/**
 * Created by caijt on 2017/3/4.
 */
@Config("alarm-config.properties")
public class Configuration {

    @Key("mail.sender.username")
    public static String MAIL_SENDER_USERNAME;
    @Key("mail.sender.password")
    public static String MAIL_SENDER_PASSWORD;
    @Key("mail.sender.smtp.host")
    public static String MAIL_SENDER_SMTP_HOST;
    @Key("mail.sender.smtp.port")
    public static Integer MAIL_SENDER_SMTP_PORT;
    @Key("mail.sender.name")
    public static String MAIL_SENDER_NAME;
    @Key("qq.qrcode.path")
    public static String QQ_QRCODE_PATH;
    @Key("wechat.qrcode.path")
    public static String WECHAT_QRCODE_PATH;

    static {
        PropertiesLoader.init(Configuration.class);
    }
}
