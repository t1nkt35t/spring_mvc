package ru.my3tahk.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        System.out.println(emp.getSurName().length());
        if(bindingResult.hasErrors()){
            return "ask-emp-details-view";
        }
        else {
            return "show-emp-details-view";
        }

    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }
}
