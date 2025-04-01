package thiGK.ntu64130758.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import thiGK.ntu64130758.model.TopicModel;

@Controller
public class DuongThiAnhHong_ThiGiuaKyController {

    // Danh sách topic
    private List<TopicModel> topics = new ArrayList<>();
    @GetMapping("/")
    public String showTopicList(Model model) {
        if (topics.isEmpty()) {
            topics.add(new TopicModel("1", "Topic 1", "Supervisor A", "Research"));
            topics.add(new TopicModel("2", "Topic 2", "Supervisor B", "Development"));
            topics.add(new TopicModel("3", "Topic 3", "Supervisor C", "Analysis"));
        }
        model.addAttribute("topics", topics);
        return "home";  
    }

    @GetMapping("/topic/add")
    public String showAddTopicForm() {
        return "addnew_topic"; 
    }

    @PostMapping("/topic/add")
    public String addNewTopic(@RequestParam String id,
                              @RequestParam String topicName,
                              @RequestParam String supervisorID,
                              @RequestParam String topicType,
                              Model model) {
        TopicModel newTopic = new TopicModel(id, topicName, supervisorID, topicType);
        topics.add(newTopic);

        model.addAttribute("topics", topics);
        return "home";  
    }
}
