package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;


@Controller
public class AppController {
	@Autowired
	private repo myRepo;
	
	@GetMapping("")
	public String showHome(Model model)
	{
		model.addAttribute("car", new Car());
		
		return "index";
	}
	@PostMapping("")
	public String sendToDb(Car car)
	
	{
		myRepo.save(car);
	
		return "index";
		
	}
	@GetMapping("/viewThem")
	
	public String showCars(Model model1)
	{
		List<Car> listCar = myRepo.findAll();
		model1.addAttribute("listCar", listCar);
		return "viewThem";
	}
	

}