package com.project.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class NewspaperController {

	public NewspaperController() {
		System.out.println("Object Created");
	}

	@RequestMapping("/news.abc")
	public String SaveNewspaper(@RequestParam String NewspaperName, @RequestParam double Price,
			@RequestParam String Language, @RequestParam int NoOfPages, Model model) {
		System.out.println("invoked newspaper save method ");

		System.out.println("NewspaperName : " + NewspaperName);
		System.out.println("Price : " + Price);
		System.out.println("Language : " + Language);
		System.out.println("NoOfPges : " + NoOfPages);

		model.addAttribute("Name", NewspaperName);
		model.addAttribute("Price", Price);
		model.addAttribute("Language", Language);
		model.addAttribute("No_Of_Pages", NoOfPages);

		return "/WEB-INF/Pages/NewspaperDetails.jsp";

	}

}
