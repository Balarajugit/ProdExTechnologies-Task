package com.prodex.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodex.entity.DesktopParts;
import com.prodex.service.IDesktpPartsService;
import com.prodex.validator.CustomValidation;

@RestController
@RequestMapping("/desktop")
public class DesktopPartsRestController {
	@Autowired
	public CustomValidation validation;
	
	@Autowired
	public IDesktpPartsService service;
	
	@PostMapping("/register")
	public String saveDesktopParts(@RequestBody DesktopParts d) {
		String mess = validation.checkingInputs(d);
		if(mess==null) {
			return service.saveDetails(d)+" details has been saved sucessfully";
		}
		else {
		return mess;
		}
	}
	
	@GetMapping("/check/{prop}")
	public String chekingDateOfExpire(@PathVariable("prop") String search) {
		String validationDetails = service.validationDetails(search);
		
		return validationDetails;
	}

}
