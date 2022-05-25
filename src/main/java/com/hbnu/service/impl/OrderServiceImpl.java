package com.hbnu.service.impl;

import com.hbnu.dao.OrderMapper;
import com.hbnu.pojo.Order;
import com.hbnu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @date
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired//自动注入（由spring创建mapper对象为属性赋值）
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAll() {
        List<Order> list= orderMapper.findAll();
        //将所有订单信息以list集合返回
        return list;
    }

    /**
     * 2.添加订单信息
     * @param
     */
    @Override
    public void addOrder(Order order) {
        //调用ordermapper的addorder方法，新增订单信息
        orderMapper.addOrder(order);
    }

    /**
     * 3.删除订单信息
     * @param
     */
    @Override
    public void deleteById(Integer id) {
        orderMapper.deleteById(id);
    }
    /**
     * @param id
     * @return 订单信息
     */
    @Override
    public Order findOrderById(Integer id) {
        Order orderById = orderMapper.findOrderById(id);
        return orderById;
    }
    /**
     * @param order
     * @return 更新订单信息
     */
    @Override
    public void updateById(Order order) {
        orderMapper.updateById(order);

    }






}
