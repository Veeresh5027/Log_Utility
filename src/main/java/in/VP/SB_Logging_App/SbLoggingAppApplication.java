package in.VP.SB_Logging_App;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import in.VP.SB_Logging_App.service.RepoertService;
import in.VP.SB_Logging_App.service.UserService;

@SpringBootApplication
public class SbLoggingAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbLoggingAppApplication.class, args); 
		UserService bean = context.getBean(UserService.class);
		bean.saveUser();
		RepoertService reportService = context.getBean(RepoertService.class);
		reportService.generateReport();
}
}