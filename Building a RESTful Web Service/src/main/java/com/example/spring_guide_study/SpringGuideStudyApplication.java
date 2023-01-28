package com.example.spring_guide_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/*
cmd로 실행하기
cd C:\Users\dpgbu\Desktop\SAE\tool\github\spring-guide-study\Building a RESTful Web Service
gradlew build
java -jar build/libs/Building-a-RESTful-Web-Service-0.0.1-SNAPSHOT.jar
*/

@SpringBootApplication
public class SpringGuideStudyApplication {
	public static void main(String[] args) {
		// PID 문서 생성 참고: https://heowc.dev/2018/12/27/spring-boot-graceful-shutdown/
		SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder();
		applicationBuilder.sources(SpringGuideStudyApplication.class);
		applicationBuilder.listeners(new ApplicationPidFileWriter("./application.pid"));
		applicationBuilder.build();

		SpringApplication.run(SpringGuideStudyApplication.class, args);
	}

	// 서버 안전하고 깔끔하게 종료하기 참고: https://blog.marcosbarbero.com/graceful-shutdown-spring-boot-apps/
	@Bean
	public GracefulShutdown gracefulShutdown() {
		return new GracefulShutdown();
	}

	@Bean
	public ConfigurableServletWebServerFactory webServerFactory(final GracefulShutdown gracefulShutdown) {
		TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
		factory.addConnectorCustomizers(gracefulShutdown);
		return factory;
	}
}
