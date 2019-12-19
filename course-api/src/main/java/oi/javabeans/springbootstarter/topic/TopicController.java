package oi.javabeans.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topic")
	public void getAllTopics() {
		System.out.println(" TOPICS");
		//return topicService.getAllTopics();
	}

}
