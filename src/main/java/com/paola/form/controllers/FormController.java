package com.paola.form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.paola.form.models.FormData;

@Controller
public class FormController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute FormData formData, Model model) {
        model.addAttribute("formData", formData);
        return "result";
    }
}