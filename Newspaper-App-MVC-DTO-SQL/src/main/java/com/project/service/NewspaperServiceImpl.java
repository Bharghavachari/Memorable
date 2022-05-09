package com.project.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.project.dao.NewspaperDAO;
import com.project.dto.NewspaperDTO;
import com.project.entity.Newspaper;

@Component
public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperDAO newspaperdao; 
	
	public NewspaperServiceImpl() {
		System.out.println("Newspaper serviceImpl object is created");
	}
	
	@Override
	public boolean validateNewspaperDTO(NewspaperDTO newspaperdto) {
		System.out.println("Invoked validateNewpaperDTO method");
		boolean flag=false;
		
		if(newspaperdto.getNewspaperName()!=null &! newspaperdto.getNewspaperName().isEmpty()) {
			flag=true;
		}
		else {
			flag=false;
			System.out.println("NewspaperName is Invalid..");
			return flag;
		}
		
		
		if(newspaperdto.getPrice()>0) {
			flag=true;
		}
		else {
			flag=false;
			System.out.println("Newspaper price is invalid");
			return flag;
		}
		
		
		if(newspaperdto.getLanguage()!=null &! newspaperdto.getLanguage().isEmpty()) {
			flag=true;
		}
		else {
			flag=false;
			System.out.println("NewspaperLanguage is Invalid..");
			return flag;
		}
		
		
		if(newspaperdto.getNoOfPages()>0) {
			flag=true;
		}
		else{
			flag=false;
			System.out.println("NewspaperNoOfPages is Invalidis Invalid..");
			return flag;
		}
		
		return flag;
	}

	@Override
	public boolean saveNewspaperDTO(NewspaperDTO newspaperdto) {
		System.out.println("Invoke save newspaper dto method..");
		Newspaper newspaper = new Newspaper();
		BeanUtils.copyProperties(newspaperdto, newspaper);
		boolean result = this.newspaperdao.saveNewspaperEntity(newspaper);
		return false;
	}

}
