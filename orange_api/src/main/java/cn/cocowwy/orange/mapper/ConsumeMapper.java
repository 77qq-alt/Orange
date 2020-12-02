package cn.cocowwy.orange.mapper;

import cn.cocowwy.orange.entity.Consume;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 消费记录表(Consume)表数据库访问层
 *
 * @author Cocowwy
 * @since 2020-12-02 14:01:43
 */
@Mapper
public interface ConsumeMapper extends BaseMapper<Consume> {

}