package cn.cocowwy.orange.service.impl;

import cn.cocowwy.orange.entity.Trade;
import cn.cocowwy.orange.mapper.TradeMapper;
import cn.cocowwy.orange.service.TradeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单表(Trade)表服务实现类
 *
 * @author wangwy8@asiainfo.com
 * @since 2020-12-03 14:27:42
 */
@Service
public class TradeServiceImpl extends ServiceImpl<TradeMapper, Trade> implements TradeService {
    @Autowired
    private TradeMapper tradeMapper;

    @Override
    public boolean save(Trade dto) {
        return super.save(dto);
    }

}