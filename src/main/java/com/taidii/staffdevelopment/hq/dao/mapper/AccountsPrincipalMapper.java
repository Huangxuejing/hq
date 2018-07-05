package com.taidii.staffdevelopment.hq.dao.mapper;

import com.taidii.staffdevelopment.hq.entity.AccountsPrincipal;
import com.taidii.staffdevelopment.hq.entity.AccountsPrincipalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountsPrincipalMapper {
    long countByExample(AccountsPrincipalExample example);

    int deleteByExample(AccountsPrincipalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountsPrincipal record);

    int insertSelective(AccountsPrincipal record);

    List<AccountsPrincipal> selectByExample(AccountsPrincipalExample example);

    AccountsPrincipal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountsPrincipal record, @Param("example") AccountsPrincipalExample example);

    int updateByExample(@Param("record") AccountsPrincipal record, @Param("example") AccountsPrincipalExample example);

    int updateByPrimaryKeySelective(AccountsPrincipal record);

    int updateByPrimaryKey(AccountsPrincipal record);
}