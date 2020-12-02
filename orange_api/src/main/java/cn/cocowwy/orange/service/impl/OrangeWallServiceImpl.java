package cn.cocowwy.orange.service.impl;

import cn.cocowwy.orange.entity.OrangeWall;
import cn.cocowwy.orange.mapper.OrangeWallMapper;
import cn.cocowwy.orange.service.OrangeWallService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 橙愿墙信息表(OrangeWall)表服务实现类
 *
 * @authorCocowwy
 * @since 2020-12-02 14:03:28
 */
@Service
public class OrangeWallServiceImpl extends ServiceImpl<OrangeWallMapper, OrangeWall> implements OrangeWallService {
    @Autowired
    private OrangeWallMapper orangeWallMapper;

    @Override
    public boolean save(OrangeWall dto) {
        return super.save(dto);
    }

}