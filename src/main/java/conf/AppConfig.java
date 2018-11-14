package conf;

public class AppConfig extends ConfigReader implements IAppConfig {
   private static String CONFIG_FILENAME = "config.properties";
   public AppConfig() {
       super(CONFIG_FILENAME);
   }
   @Override
   public String getBaseURL() {
       return getValue("BASE_URL");
   }
   @Override
   public String getUsername() {
       return getValue("USERNAME");
   }
   @Override
   public String getPassword() {
       return getValue("PASSWORD");
   }

    @Override
    public String getGrantType() {
        return getValue("GRANT_TYPE");
    }

    @Override
    public String getKey() {
        return getValue("KEY");
    }

    @Override
    public String getProvider() {
        return getValue("PROVIDER");
    }
}
