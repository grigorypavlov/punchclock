package ch.zli.m223.punchclock;

import ch.zli.m223.punchclock.repository.EntryRepository;
import ch.zli.m223.punchclock.repository.OvertimeRepository;
import ch.zli.m223.punchclock.repository.UserRepository;
import ch.zli.m223.punchclock.repository.WorkLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PunchclockApplication {
	@Autowired
	EntryRepository entryRepository;
	OvertimeRepository overtimeRepository;
	UserRepository userRepository;
	WorkLocationRepository workLocationRepository;

	public static void main(String[] args) {
		SpringApplication.run(PunchclockApplication.class, args);
	}

	@RestController
	public class IndexController implements ErrorController {

		private static final String PATH = "/error";

		@RequestMapping(value = PATH)
		public String error() {
			return "404";
		}

		@Override
		public String getErrorPath() {
			return PATH;
		}
	}
}
