package config;

import org.aeonbits.owner.Config;

@EnvironmentConfig.LoadPolicy(AppConfig.LoadType.FIRST)
@Config.Sources({
        "classpath:properties/${env}.properties",
        "classpath:properties/android.properties
})
public interface EnvironmentConfig extends Config {

    @Key("device")
    @DefaultValue("Google Pixel 9")
    String getDevice();

    @Key("versionOs")
    @DefaultValue("15.0")
    String getVersion();
}