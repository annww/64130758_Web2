package thiGK.ntu64130758.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import thiGK.ntu64130758.model.TopicModel;

@Controller
public class DuongThiAnhHong_ThiGiuaKyController {
	@GetMapping("/")
    public String showTopicList(Model model) {
        List<TopicModel> topics = new ArrayList<>();
        topics.add(new TopicModel("1", "Topic 1", "Supervisor A", "Research"));
        topics.add(new TopicModel("2", "Topic 2", "Supervisor B", "Development"));
        topics.add(new TopicModel("3", "Topic 3", "Supervisor C", "Analysis"));

        model.addAttribute("topics", topics);
        return "home";  // Tên của trang HTML
    }
}
