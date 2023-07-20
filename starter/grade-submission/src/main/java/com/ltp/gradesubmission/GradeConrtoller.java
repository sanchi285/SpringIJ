
package com.ltp.gradesubmission;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.ui.Model;
import org.thymeleaf.model.IModel;

@Controller
public class GradeConrtoller {
   
    @GetMapping("/hello")
    public String sayHello(Model model){
        Grade grade = new Grade("Harry","Portion","A");
        model.addAttribute("grade",grade);
        return "grades";
    }
}
