package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.ContactsDao;
import com.intellingence.pojo.Contacts;
import com.intellingence.pojo.ContactsQuery;
import com.intellingence.service.ContactsService;
@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsDao contactsDao;
	@Override
	public  void insert(Contacts contacts) {
		contactsDao.insert(contacts);
	}  
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return contactsDao.deleteByPrimaryKey(id);
	}
	@Override
	public Contacts selectByPrimaryKey(Integer id) {  
		
		return contactsDao.selectByPrimaryKey(id);
	}
	@Override
	public int updateByPrimaryKeySelective(Contacts record) {
		return contactsDao.updateByPrimaryKeySelective(record);
	}
	@Override
	public List<Contacts> selectByExample(ContactsQuery example) {
		return contactsDao.selectByExample(example);
	}

}  
