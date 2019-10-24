package com.pet.shop.model;

import lombok.Data;

/**
 * 二级标题实体类
 */

@Data
public class SecondTitle {
    /**
     * id
     */
    private Integer id;
    /**
     * 关联的一级标题ID
     */
    private Integer refId;
    /**
     * 一级标题对应的名称
     */
    private String refIdDesc;

    /**
     * 二级标题
     */
    private String name;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusDesc;
}