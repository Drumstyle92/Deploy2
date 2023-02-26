package it.develhope.Deploy2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * @author Drumstyle92
 * Class that when you run your application using the java -jar command, a servlet container
 * embedded inside the WAR file is launched and the Spring Boot application runs inside it.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	/**
	 * @param application Parameter where you enter the application to configure in .war
	 * @return Returns the configuration made to the application
	 * Method that configures the application passed inside
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Deploy2Application.class);
	}

}
