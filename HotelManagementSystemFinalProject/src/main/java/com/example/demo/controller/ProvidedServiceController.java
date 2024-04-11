package com.example.demo.controller;

import com.example.demo.model.ProvidedService;
import com.example.demo.service.ProvidedServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/services")
public class ProvidedServiceController {

    private final ProvidedServiceService providedServiceService;

    @Autowired
    public ProvidedServiceController(ProvidedServiceService providedServiceService) {
        this.providedServiceService = providedServiceService;
    }

    //display all services
    @GetMapping
    public String listServices(Model model) {
        model.addAttribute("services", providedServiceService.getAllProvidedServices());
        return "services";
    }

    //dhow form for adding a new service
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("providedService", new ProvidedService());
        return "services";  //directs back to the services which must be adapted to show the form when needed
    }

    //dave a new/existing service
    @PostMapping("/save")
    public String saveProvidedService(ProvidedService providedService, RedirectAttributes redirectAttributes) {
        providedServiceService.saveProvidedService(providedService);
        redirectAttributes.addFlashAttribute("successMessage", "Service saved successfully!");
        return "redirect:/services";
    }
}
