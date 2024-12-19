package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:properties/project.properties"
})

public interface CredentialsConfig extends Config {

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("user")
    String getUser();

    @Key("key")
    String getKey();

}
