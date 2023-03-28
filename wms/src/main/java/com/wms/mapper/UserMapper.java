package com.wms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wms.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Brian
 * @version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    List<User> listAll();
}
