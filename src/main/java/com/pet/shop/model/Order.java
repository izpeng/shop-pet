package com.pet.shop.model;

import lombok.Data;
import java.util.Date;

/**
 * 订单实体类
 */

@Data
public class Order {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 购物者ID
     */
    private Integer bid;

    /**
     * 购物着姓名
     */
    private String name;

    /**
     * 收货手机号
     */
    private String phone;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 订单状态 0,废弃1,完成，2,待支付,3,待发货,4,已发货
     */
    private Integer status;

    private String statusDesc;

    /**
     * 订单创建时间
     */
    private Date creatTime;

    /**
     * 订单发货时间
     */
    private Date sendTime;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页大小
     */
    private Integer pageSize;
}