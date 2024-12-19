package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties",
        "classpath:properties/android.properties"})

public interface EnvironmentConfig extends Config {

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String getDevice();

    @Key("versionOs")
    @DefaultValue("9.0")
    String getVersionOs();


}