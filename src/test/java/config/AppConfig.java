package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties"
})

public interface AppConfig extends Config {

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("projectName")
    @DefaultValue("First Mobile Java Project")
    String getProjectName();

    @Key("buildName")
    @DefaultValue("android-browserstack-build-1")
    String getBuildName();

    @Key("testName")
    @DefaultValue("my first Android test")
    String getTestName();
}
