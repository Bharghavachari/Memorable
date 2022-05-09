package com.project.dao;

import com.project.entity.Newspaper;

public interface NewspaperDAO {
	public boolean saveNewspaperEntity(Newspaper newspaper);
	public Newspaper getNewspaperEnity(String  NewspaprName);
}
