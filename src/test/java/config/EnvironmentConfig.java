package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/${env}.properties"
})
public interface EnvironmentConfig extends Config {

    @Key("device")
    @DefaultValue("Google Pixel 9")
    String getDevice();

    @Key("versionOs")
    @DefaultValue("15.0")
    String getVersion();
}