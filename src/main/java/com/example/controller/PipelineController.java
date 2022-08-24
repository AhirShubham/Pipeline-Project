

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PipelineController {

@RequestMapping
public String sayHello() {
	return "Hello"; 		
}
}
