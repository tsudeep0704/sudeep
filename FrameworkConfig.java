package com.utility.config;

import com.utility.driver.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/main/resources/property/config.properties",
        "file:${user.dir}/src/main/resources/property/dev-CMRI-config.properties",
        "file:${user.dir}/src/main/resources/property/dev-OASIS-config.properties"
})
public interface FrameworkConfig extends Config {
    @ConverterClass(StringToBrowserTypeConverter.class)
    @DefaultValue("CHROME")
    BrowserType browser();

    @DefaultValue("dev")
    String environment();

    @DefaultValue("CMRI")
    String application();

    @Key("${environment}.${application}.webURL")
    @DefaultValue("www.yahoo.com")
    String webURL();

    @Key("${environment}.${application}.dbConnectionString")
    String dbConnectionString();

    @Key("${environment}.${application}.dbUserName")
    String dbUserName();

    @Key("${environment}.${application}.dbPassword")
    String dbPassword();
}
