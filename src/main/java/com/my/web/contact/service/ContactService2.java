package com.my.web.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.web.contact.dao.ContactDao;
import com.my.web.contact.domain.Contact;

@Service
public class ContactService2 {

	@Autowired
	private ContactDao contactDao;
	
	public int deleteContact(Contact contact) {
		return contactDao.deleteContact(contact);
	}
	
}
