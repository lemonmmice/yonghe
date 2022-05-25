package com.hbnu.dao;

import com.hbnu.pojo.Door;
import com.hbnu.pojo.Order;

import java.util.List;

/**
 * @author
 * @date
 */
public interface OrderMapper {
   /**
    * 1.查询订单信息
    */
   List<Order>findAll();
   /**
    * 2.新增订单信息
    */
   void addOrder(Order Order);

   /**
    * 3.删除订单信息
    * @param
    */
   void deleteById(Integer id);

   /**
    * 根据id查询订单信息
    */
   Order findOrderById(Integer id);
   /**
    * 根据id更新订单信息
    */
  void updateById(Order order);

}
