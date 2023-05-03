package br.com.davero.authserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserStoreConfig {
    
    @Bean
    UserDetailsService userDatailsService() {   
        var userDatailsManager = new InMemoryUserDetailsManager();

        userDatailsManager.createUser(
            User.withUsername("User")
            .password("{noop}password")
            .roles("USER")
            .build());
        return userDatailsManager;
    }
}
