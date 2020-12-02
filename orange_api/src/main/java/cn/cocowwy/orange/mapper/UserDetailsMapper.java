package cn.cocowwy.orange.mapper;

import cn.cocowwy.orange.entity.UserDetails;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户详细信息表(UserDetails)表数据库访问层
 *
 * @author wangwy8@asiainfo.com
 * @since 2020-12-02 14:16:07
 */
@Mapper
public interface UserDetailsMapper extends BaseMapper<UserDetails> {

}