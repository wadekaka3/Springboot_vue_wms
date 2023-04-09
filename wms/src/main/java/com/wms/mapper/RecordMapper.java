package com.wms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.wms.entity.Record;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wms
 * @since 2023-04-09
 */
@Mapper
public interface RecordMapper extends BaseMapper<Record> {
    IPage pageCC(IPage<Record> page, @Param(Constants.WRAPPER) Wrapper wrapper);
}
