package thiGK.ntu64130758.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        // Add any necessary attributes to the model here
        return "dashboard"; // This will return the dashboard.html template
    }
}