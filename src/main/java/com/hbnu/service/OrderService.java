package com.hbnu.service;

import com.hbnu.pojo.Order;

import java.util.List;

/**
 * @author
 * @date
 */
public interface OrderService {

    /**
     * @return 所有订单信息
     */
    List<Order>findAll();
    /**
     * 2.新增订单信息
     * @param order
     */
    void addOrder(Order order);
    /**
     * 3.删除订单信息
     * @param
     */
    void deleteById(Integer id);
    /**
     * 根据id查询指定的订单信息
     */
    Order findOrderById(Integer id);
    /**
     * 根据id更新指定的订单信息
     * @return
     */
   void updateById(Order order);



}
