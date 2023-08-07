package com.jp.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jp.vending.service.VendingService;

@Controller
public class VendingMachineController {

	@Autowired
	private VendingService vendingService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("items", vendingService.getAllItems());
		return "index";
	}
}
