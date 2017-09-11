package com.intellingence.dao;

import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserinfoDao {
    int countByExample(UserinfoQuery example);

    int deleteByExample(UserinfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    List<Userinfo> selectByExample(UserinfoQuery example);

    Userinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoQuery example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoQuery example);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}