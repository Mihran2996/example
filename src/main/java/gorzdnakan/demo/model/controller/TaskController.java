package gorzdnakan.demo.model.controller;

import gorzdnakan.demo.model.Task;
import gorzdnakan.demo.model.services.CategoryService;
import gorzdnakan.demo.model.services.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TaskController {
private final TaskService taskService;

    @GetMapping("/")
    public String homePage(Model model){
        List<Task> tasks = taskService.getAllTask();
        model.addAttribute("tasks",tasks);
       taskService.getAllCategory();
        return "homePage";
    }
}
