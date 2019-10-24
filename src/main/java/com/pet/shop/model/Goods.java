package com.pet.shop.model;

import lombok.Data;

/**
 * 商品类
 */

@Data
public class Goods {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private String price;
    /**
     * 一级标题
     */
    private Integer supType;
    /**
     * 一级标题名称
     */
    private String supTypeDesc;
    /**
     * 二级标题
     */
    private Integer subType;
    /**
     * 二级标题名称
     */
    private String subTypeDesc;
    /**
     * 是否推荐(1,推荐，0,普通)
     */
    private Integer isRecommend;
    /**
     * 数据库保存的图片名字
     */
    private String image;
    /**
     * 宠物性别(0:母,1:公的)
     */
    private Integer sex;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 页码
     */
    private Integer page;
    /**
     * 每页大小
     */
    private Integer pageSize;
}