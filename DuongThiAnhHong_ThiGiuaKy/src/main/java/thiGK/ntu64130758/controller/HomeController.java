package thiGK.ntu64130758.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64130758.model.Student;
import thiGK.ntu64130758.model.Topic;

@Controller
public class HomeController {
	ArrayList<Student> dsStudents = new ArrayList<>();
	ArrayList<Topic> dsTopics = new ArrayList<>();
	
	public HomeController() {
		dsTopics.add(new Topic(1, "AI in Education", "Ứng dụng trí tuệ nhân tạo trong giáo dục", 101, "Research"));
		dsTopics.add(new Topic(2, "IoT Smart Home", "Nhà thông minh với IoT", 102, "Project"));
		dsTopics.add(new Topic(3, "Blockchain Voting", "Hệ thống bỏ phiếu sử dụng blockchain", 103, "Research"));
		
		dsStudents.add(new Student(1, "Nguyen Van A", "NTU01"));
        dsStudents.add(new Student(2, "Tran Thi B", "NTU02"));
        dsStudents.add(new Student(3, "Le Van C", "NTU03"));
	}
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/topic/all")
	public String TopicList(ModelMap m) {
		m.addAttribute("dsTopics", dsTopics);
		return "topic/topicList";
	}
	
	@GetMapping("/topic/new")
	public String AddNewTopic() {
		return "topic/new";
	}
	
	@GetMapping("/topic/add")
	public String addTopic(@RequestParam("topicName") String topicName,
						   @RequestParam("topicDescription") String topicDescription,
						   @RequestParam("supervisorId") int supervisorId,
						   @RequestParam("topicType") String topicType) {
		int newId = dsTopics.size() + 1;
		Topic newTopic = new Topic(newId, topicName, topicDescription, supervisorId, topicType);
		dsTopics.add(newTopic);
		return "redirect:/topic/all";
	}
	
	@GetMapping("/topic/view/{id}")
	public String viewTopic(@PathVariable("id") int id, ModelMap model) {
		for (Topic topic : dsTopics) {
			if (topic.getId() == id) {
				model.addAttribute("topic", topic);
				break;
			}
		}
		return "topic/view";
	}
	
	@GetMapping("/topic/delete/{id}")
	public String deleteTopic(@PathVariable("id") int id) {
		dsTopics.removeIf(topic -> topic.getId() == id);
		return "redirect:/topic/all";
	}
}
