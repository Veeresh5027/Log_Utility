package in.VP.SB_Logging_App.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
//@Slf4j
public class UserService {
	
	private Logger  log = LoggerFactory.getLogger(UserService.class);
	
	public void saveUser() {
		log.trace("This is trace message");
		log.debug("This is debug message");
		log.info("This is info message : method start");
		//logic to save user with db
		log.warn("This is warn message");
		log.error("This is error message");

	}

}
