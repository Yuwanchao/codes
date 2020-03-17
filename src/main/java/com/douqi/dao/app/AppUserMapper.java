package com.douqi.dao.app;

import com.douqi.dao.app.model.AppUser;
import com.douqi.dao.app.model.AppUserWrapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppUserMapper {
    int countByExample(AppUserWrapper example);

    int deleteByExample(AppUserWrapper example);

    int deleteByPrimaryKey(String id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    List<AppUser> selectByExample(AppUserWrapper example);

    AppUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppUser record, @Param("example") AppUserWrapper example);

    int updateByExample(@Param("record") AppUser record, @Param("example") AppUserWrapper example);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);
}