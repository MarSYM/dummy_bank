package gec.scf;

import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration
//@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public AxisServlet dispatcherServlet() {
		return new AxisServlet();
	}

	@Bean
	public ServletRegistrationBean dispatchServletRegistration() {

		ServletRegistrationBean registration = new ServletRegistrationBean(
				dispatcherServlet(), "/services/*");

		registration
				.setName(DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_REGISTRATION_BEAN_NAME);

		return registration;

	}
    

}
