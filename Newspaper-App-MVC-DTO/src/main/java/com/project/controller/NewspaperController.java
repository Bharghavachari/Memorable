package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dto.NewspaperDTO;
import com.project.service.NewspaperServiceImpl;

@Component
@RequestMapping("/")
public class NewspaperController {
	@Autowired
	private NewspaperServiceImpl serviceImpl;

	public NewspaperController() {
		System.out.println("Object Created");
	}

	@RequestMapping("/news.abc")
	public String SaveNewspaper(@ModelAttribute NewspaperDTO newspaperdto, Model model) {
		System.out.println("invoked newspaper save method ");
		if (this.serviceImpl.validateNewspaperDTO(newspaperdto)) {

			model.addAttribute("Name", newspaperdto.getNewspaperName());
			model.addAttribute("Price", newspaperdto.getPrice());
			model.addAttribute("Language", newspaperdto.getLanguage());
			model.addAttribute("No_Of_Pages", newspaperdto.getNoOfPages());

			System.out.println("Newspaper data is sucessfully saved ");
			model.addAttribute("validateMessage", "data is sucessfully saved ");
		} else {
			model.addAttribute("validationMessage", "Invalid Data.. check again");
		}

		return "/WEB-INF/Pages/NewspaperDetails.jsp";

	}

}
