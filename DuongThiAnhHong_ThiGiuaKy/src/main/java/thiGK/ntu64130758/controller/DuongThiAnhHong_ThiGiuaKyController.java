package thiGK.ntu64130758.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thiGK.ntu64130758.model.TopicModel;

@Controller
@RequestMapping("/topic")
public class DuongThiAnhHong_ThiGiuaKyController {

    private List<TopicModel> topics = new ArrayList<>();

    public DuongThiAnhHong_ThiGiuaKyController() {
        topics.add(new TopicModel("1", "Topic 1", "Supervisor A", "Research"));
        topics.add(new TopicModel("2", "Topic 2", "Supervisor B", "Development"));
        topics.add(new TopicModel("3", "Topic 3", "Supervisor C", "Analysis"));
    }

    @GetMapping("/all")
    public String showTopicList(Model model) {
        model.addAttribute("topics", topics);
        return "topic-list";
    }

    @GetMapping("/new")
    public String showAddTopicForm() {
        return "topic-addnew";
    }
    
    @PostMapping("/new")
    public String addNewTopic(@RequestParam String id,
                              @RequestParam String topicName,
                              @RequestParam String supervisorID,
                              @RequestParam String topicType,
                              Model model) {
        topics.add(new TopicModel(id, topicName, supervisorID, topicType));
        model.addAttribute("topics", topics);
        return "redirect:/topic/all";
    }

    @GetMapping("/view/{id}")
    public String viewTopic(@PathVariable String id, Model model) {
        Optional<TopicModel> topic = topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst();
        
        if (topic.isPresent()) {
            model.addAttribute("topic", topic.get());
            return "topic-view";
        } else {
            return "redirect:/topic/all";
        }
    }

    @GetMapping("/delete/{id}")
    public String deleteTopic(@PathVariable String id) {
        topics.removeIf(t -> t.getId().equals(id));
        return "redirect:/topic/all";
    }
}