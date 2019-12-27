package com.hnshengen.housecollection.usermanage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hnshengen.housecollection.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
