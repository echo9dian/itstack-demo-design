package org.itstack.demo.design.goods;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 模拟实物商品服务
 */
public class GoodsService {

    private static final Logger log = LoggerFactory.getLogger(GoodsService.class);

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        log.info("模拟发货实物商品一个：{}" ,JSON.toJSONString(req));
        return true;
    }

}
