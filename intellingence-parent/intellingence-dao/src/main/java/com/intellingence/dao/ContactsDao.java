package com.intellingence.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.intellingence.pojo.Contacts;
import com.intellingence.pojo.ContactsQuery;

public interface ContactsDao {
    int countByExample(ContactsQuery example);

    int deleteByExample(ContactsQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Contacts record);

    int insertSelective(Contacts record);

    List<Contacts> selectByExample(ContactsQuery example);

    Contacts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Contacts record, @Param("example") ContactsQuery example);

    int updateByExample(@Param("record") Contacts record, @Param("example") ContactsQuery example);

    int updateByPrimaryKeySelective(Contacts record);

    int updateByPrimaryKey(Contacts record);
}