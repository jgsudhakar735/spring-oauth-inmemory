/**
 * 
 */
package com.jgsudhakar.oauth.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author sudhakar.t
 *
 */
@ConditionalOnProperty(value = "use.javaconfiguration" , havingValue = "true")
@Configuration
public class UserConfiguration extends GlobalAuthenticationConfigurerAdapter{
	
	PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		auth.
			inMemoryAuthentication().
				withUser("Sriyaan").password(passwordEncoder.encode("Sriyaan")).
										roles("USER").
											authorities("READ","WRITE","DELET").
				and().
				withUser("Sanvi").password("Sanvi").
					roles("ADMIN").
						authorities("READ","WRITE","DELET");
						
		
	}
}
