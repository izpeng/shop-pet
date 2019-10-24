package com.pet.shop.model;

import lombok.Data;

/**
 * 购物车实体类
 */
@Data
public class Cart {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 商品ID
     */
    private Integer gid;
    /**
     * 购物者ID
     */
    private Integer bid;
    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 逻辑删除标志
     */
    private Integer status;

    /**
     * 图片名称
     */
    private String image;

    /**
     * 商品名字
     */
    private String name;

    /**
     * 商品价格
     */
    private String price;

    /**
     * 总价格
     */
    private Double totalAmount;
}