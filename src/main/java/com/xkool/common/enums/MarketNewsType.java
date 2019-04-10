package com.xkool.common.enums;

import com.alibaba.fastjson.annotation.JSONType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;
import java.util.List;

import static com.xkool.common.constant.MarketNewsTypeIdConstant.*;
import static com.xkool.common.constant.MarketNewsTypeNameConstant.*;

@JSONType(serializeEnumAsJavaBean = true)
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum MarketNewsType {

    ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE(ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE_ID, ESTATE_MARKET_POLICY_MARKET_NEWS_TYPE_NAME),
    MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE(MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE_ID, MONTHLY_PAYMENTS_SITUATION_MARKET_NEWS_TYPE_NAME),
    DEAL_SITUATION_MARKET_NEWS_TYPE(DEAL_SITUATION_MARKET_NEWS_TYPE_ID, DEAL_SITUATION_MARKET_NEWS_TYPE_NAME);

    private int id;
    private String name;

    MarketNewsType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static MarketNewsType getMarketNewsTypeById(int id) {
        for (MarketNewsType marketNewsType : MarketNewsType.values()) {
            if (marketNewsType.getId() == id) {
                return marketNewsType;
            }
        }
        return null;
    }

    public static MarketNewsType getMarketNewsTypeByName(String name) {
        for (MarketNewsType marketNewsType : MarketNewsType.values()) {
            if (marketNewsType.getName().equals(name)) {
                return marketNewsType;
            }
        }
        return null;
    }

    public static List<MarketNewsType> getMarketNewsTypes() {
        return Arrays.asList(MarketNewsType.values());
    }
}
