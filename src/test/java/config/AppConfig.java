package config;

import org.aeonbits.owner.Config;

@AppConfig.LoadPolicy(AppConfig.LoadType.FIRST)
@Config.Sources({
        "classpath:properties/${env}.properties",
        "classpath:properties/android.properties"
})
public interface AppConfig extends Config {

    @Key("app")
    @DefaultValue("bs://sample.app")
    String getApp();

    @Key("projectName")
    @DefaultValue("First Java Project")
    String getProjectName();

    @Key("buildName")
    @DefaultValue("browserstack-build-1")
    String getBuildName();

    @Key("testName")
    @DefaultValue("My First Test")
    String getTestName();
}