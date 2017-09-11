package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.Contacts;
import com.intellingence.pojo.ContactsQuery;

public interface ContactsService {
	public void insert(Contacts contacts);
	public int deleteByPrimaryKey(Integer id);
	public Contacts selectByPrimaryKey(Integer id);
	public int updateByPrimaryKeySelective(Contacts record);
	public List<Contacts> selectByExample(ContactsQuery example);
}