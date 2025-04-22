package thiGK.ntu64130758.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import thiGK.ntu64130758.model.TopicModel;

@Controller
public class TopicController {

    @GetMapping("/topics")
    public String getTopics(Model model) {
        return "topics";
    }
}