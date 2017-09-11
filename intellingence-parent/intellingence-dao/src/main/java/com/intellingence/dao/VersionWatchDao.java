package com.intellingence.dao;

import com.intellingence.pojo.VersionWatch;
import com.intellingence.pojo.VersionWatchQuery;
import com.intellingence.pojo.VersionWatchWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VersionWatchDao {
    int countByExample(VersionWatchQuery example);

    int deleteByExample(VersionWatchQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(VersionWatchWithBLOBs record);

    int insertSelective(VersionWatchWithBLOBs record);

    List<VersionWatchWithBLOBs> selectByExampleWithBLOBs(VersionWatchQuery example);

    List<VersionWatch> selectByExample(VersionWatchQuery example);

    VersionWatchWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VersionWatchWithBLOBs record, @Param("example") VersionWatchQuery example);

    int updateByExampleWithBLOBs(@Param("record") VersionWatchWithBLOBs record, @Param("example") VersionWatchQuery example);

    int updateByExample(@Param("record") VersionWatch record, @Param("example") VersionWatchQuery example);

    int updateByPrimaryKeySelective(VersionWatchWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(VersionWatchWithBLOBs record);

    int updateByPrimaryKey(VersionWatch record);
    
    public VersionWatchWithBLOBs selectLastVersion();
}