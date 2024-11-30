package in.VP.SB_Logging_App.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
//@Slf4j
public class RepoertService {
	
	private Logger  log = LoggerFactory.getLogger(UserService.class);

	public void generateReport() {
		log.info("Method started");
		try {
			int i = 10/0;
		} catch (Exception e) {
			//e.printStacktrace
			log.error(e.getMessage());
		}
		// logic to generate report
		log.info("Method ended");
    }
}
