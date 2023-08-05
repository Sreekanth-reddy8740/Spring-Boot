package com.Sreekanth.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sreekanth.SpringBoot.entity.RegisterEntity;
import com.Sreekanth.SpringBoot.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	private RegisterRepository registerRepository;
	
	public void saveDetails(RegisterEntity registerEntity) {
		registerRepository.saveDetails(registerEntity);
	}
}
