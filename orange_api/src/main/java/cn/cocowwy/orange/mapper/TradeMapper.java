package cn.cocowwy.orange.mapper;

import cn.cocowwy.orange.entity.Trade;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单表(Trade)表数据库访问层
 *
 * @author Cocowwy
 * @since 2020-12-02 14:04:21
 */
@Mapper
public interface TradeMapper extends BaseMapper<Trade> {

}