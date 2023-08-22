package com.example.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Updatemodel;
import com.example.project.service.Updateservice;

@RestController
public class Updatecontrol {
	@Autowired
	Updateservice updateservice;
	@PostMapping("/Save")
	public Updatemodel Save(@RequestBody Updatemodel u ) {
		return updateservice.show(u);
	}
	@GetMapping("/get")
	public List<Updatemodel>get(){
		return updateservice.show();
	
	}
}
