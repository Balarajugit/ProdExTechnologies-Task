package com.prodex.validator;

import java.util.Date;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.prodex.entity.DesktopParts;
@Component
public class CustomValidation {
	
	public String checkingInputs(DesktopParts d) {
		
		String mess=null;
		if(!StringUtils.hasText(d.getCustomerName())) {
			mess="please write your company name";
		}
		else if(!StringUtils.hasText(d.getInstanceName())) {
			mess="please write instance name";
		}
		else if (!StringUtils.hasText(d.getIpAddress())) {
			mess="please give instance no";
		}
		return mess;
	}

}
