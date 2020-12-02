package cn.cocowwy.orange.service.impl;

import cn.cocowwy.orange.entity.TradeOperateResords;
import cn.cocowwy.orange.mapper.TradeOperateResordsMapper;
import cn.cocowwy.orange.service.TradeOperateResordsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单操作记录表(TradeOperateResords)表服务实现类
 *
 * @author Cocowwy
 * @since 2020-12-02 14:04:31
 */
@Service
public class TradeOperateResordsServiceImpl extends ServiceImpl<TradeOperateResordsMapper, TradeOperateResords> implements TradeOperateResordsService {
    @Autowired
    private TradeOperateResordsMapper tradeOperateResordsMapper;

    @Override
    public boolean save(TradeOperateResords dto) {
        return super.save(dto);
    }

}