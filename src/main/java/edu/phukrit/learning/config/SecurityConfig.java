package edu.phukrit.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 1. Defines the password encoder (BCrypt is the standard)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // 2. Defines the user(s) with an encoded password
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
        UserDetails adminUser = User.builder()
                .username("admin")
                // This is "1234" encoded with BCrypt
                .password(encoder.encode("1234"))
                .roles("ADMIN", "USER")
                .build();

        UserDetails regularUser = User.builder()
                .username("user")
                .password(encoder.encode("1234"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(adminUser, regularUser);
    }

    // 3. Defines the security rules for different URLs
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/index.html", "/css/**", "/js/**", "/images/**").permitAll() // Allow public access to these paths
                .requestMatchers("/admin/**").hasRole("ADMIN") // Only users with ADMIN role can access /admin
                .anyRequest().authenticated() // All other requests require login
            )
            .formLogin(withDefaults()); // Enable the default login form

        return http.build();
    }
}