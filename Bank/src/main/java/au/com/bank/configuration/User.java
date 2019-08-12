package au.com.bank.configuration;

import au.com.bank.model.UserMap;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "user")
public class User {

    private List<UserMap> userMap = new ArrayList<>();

    public List<UserMap> getUserMap() {
        return userMap;
    }

    public void setUserMap(List<UserMap> userMap) {
        this.userMap = userMap;
    }
}
