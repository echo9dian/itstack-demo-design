package org.itstack.demo.design.test;

import org.itstack.demo.design.CommodityFactory;
import org.itstack.demo.design.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;

public class CommodityTest {

    @Test
    public void test() throws Exception {
        CommodityFactory commodityFactory = new CommodityFactory();
        ICommodity commodityService = commodityFactory.getCommodityService(2);
        HashMap<String, String> map = new HashMap<>();
        commodityService.sendCommodity("101","111001","biz001",map);
    }
}
