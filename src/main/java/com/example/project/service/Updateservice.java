package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Updatemodel;
import com.example.project.repository.Updaterepository;
//import com.example.project.serviceimpl.Serviceimpl;

@Service
public class Updateservice  {
	@Autowired
	Updaterepository updaterepository;
	public List<Updatemodel> show(){
		return  updaterepository.findAll();
		
	}
	public Updatemodel show (Updatemodel u) {
		return updaterepository.save(u);
	}
//	public boolean addTask(Updatemodel ok) 
		
		
		
	

}
