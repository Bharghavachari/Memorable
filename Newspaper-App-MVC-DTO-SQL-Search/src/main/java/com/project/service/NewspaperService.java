package com.project.service;

import com.project.dto.NewspaperDTO;

public interface NewspaperService {
	public boolean validateNewspaperDTO(NewspaperDTO newspaperdto);
	public boolean saveNewspaperDTO(NewspaperDTO newspaperdto);
	public NewspaperDTO getNewspaperName (String NewspaperName);
	public boolean validateNewspaperName(String NewspaperName);
}
