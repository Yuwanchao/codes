package com.douqi.dao.unknown;

import com.douqi.dao.unknown.model.Unknown;
import com.douqi.dao.unknown.model.UnknownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnknownMapper {
    int countByExample(UnknownExample example);

    int deleteByExample(UnknownExample example);

    int insert(Unknown record);

    int insertSelective(Unknown record);

    List<Unknown> selectByExample(UnknownExample example);

    int updateByExampleSelective(@Param("record") Unknown record, @Param("example") UnknownExample example);

    int updateByExample(@Param("record") Unknown record, @Param("example") UnknownExample example);
}