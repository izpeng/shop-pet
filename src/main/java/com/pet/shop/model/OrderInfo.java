package com.pet.shop.model;

import lombok.Data;

/**
 * 订单详情表
 */

@Data
public class OrderInfo {
    /**
     * 自增ID
     */
    private Integer id;
    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 商品ID
     */
    private Integer gid;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 商品价格
     */
    private String price;

    /**
     * 商品购买总量
     */
    private Integer total;
}