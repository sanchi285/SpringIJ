
package com.lpt.gradesubmission;
import org.springframework.boot.SpringApplication;

@Controller
public class GradeConrtoller {
   
    @GetMapping("/hello")
    public String sayHello(){
        return "some htmlview";
    }
}
