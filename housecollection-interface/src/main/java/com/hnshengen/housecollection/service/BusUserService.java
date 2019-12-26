package com.hnshengen.housecollection.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hnshengen.housecollection.bean.BusUser;

import java.util.Map;

public interface BusUserService {

    /**
     * 查询所有用户信息
     * @return
     */
    Page<Map<String, Object>> getAllUserInfo(String condition);


    boolean save(BusUser busUser);

    void delete(BusUser busUser);
}
