package com.my.web.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.my.web.contact.domain.Contact;
import com.my.web.contact.service.ContactService;

@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Contact> getContactList() {
		return contactService.getContactList();
	}
	
}
