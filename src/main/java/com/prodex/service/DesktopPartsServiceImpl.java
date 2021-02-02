package com.prodex.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prodex.entity.DesktopParts;
import com.prodex.repository.IDesktopPartsRepository;
@Service
public class DesktopPartsServiceImpl implements IDesktpPartsService{
	
	@Autowired
	public IDesktopPartsRepository repo;

	@Transactional
	public String saveDetails(DesktopParts parts) {
		// TODO Auto-generated method stub
		
		return repo.save(parts).getCustomerName();
	}

	@Override
	public String validationDetails(String prop) {
		String message=null;
		Date oldDate = repo.searching(prop);
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		Date d=new Date();
		String current = sd.format(d);
		try {
			Date currentDate = sd.parse(current);
			if(currentDate.compareTo(oldDate)>0) {
				message="Expired in "+oldDate;
			}
			else if(currentDate.compareTo(oldDate)<0) {
				message="Not Expired ";
			}
			else if(currentDate.compareTo(oldDate)==0) {
				message="Today is the last Date So please Renewal";
			}
		} catch (ParseException e) {
			message=e.getMessage();
		}
		return message;
		
	}
}
