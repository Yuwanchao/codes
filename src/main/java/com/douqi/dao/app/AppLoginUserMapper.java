package com.douqi.dao.app;

import com.douqi.dao.app.model.AppLoginUser;
import com.douqi.dao.app.model.AppLoginUserWrapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppLoginUserMapper {
    int countByExample(AppLoginUserWrapper example);

    int deleteByExample(AppLoginUserWrapper example);

    int deleteByPrimaryKey(String id);

    int insert(AppLoginUser record);

    int insertSelective(AppLoginUser record);

    List<AppLoginUser> selectByExample(AppLoginUserWrapper example);

    AppLoginUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AppLoginUser record, @Param("example") AppLoginUserWrapper example);

    int updateByExample(@Param("record") AppLoginUser record, @Param("example") AppLoginUserWrapper example);

    int updateByPrimaryKeySelective(AppLoginUser record);

    int updateByPrimaryKey(AppLoginUser record);
}