package com.hbnu.controller;

import com.hbnu.pojo.Door;
import com.hbnu.pojo.Order;
import com.hbnu.service.DoorService;
import com.hbnu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author李昌颐
 * @date
 */

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private DoorService doorService;
    /**
     * 查询所有订单信息
     */

    @RequestMapping("/orderList")
    public String findAllOrder(Model model){
        //调用orderservice的findall方法查询所有订单
        List<Order> orderList=orderService.findAll();
        //将所有订单的list集合存入model中
        model.addAttribute("orderList", orderList);

        List<Door> doorList=doorService.findAll();
        model.addAttribute("doorList", doorList);
        return "order_list";
    }
    /** 2.1.添加订单信息 -- 查询所有门店并跳转到添加订单页面 */
    @RequestMapping("/findAllDoorToOrderAdd")
    public String toDoorAdd(Model model){
        //1.调用doorService的findAll方法, 查询所有门店信息
        List<Door> doorList = doorService.findAll();
        //2.将所有门店List存入model中
        model.addAttribute("doorList", doorList);

        return "order_add";
    }
    /** 2.添加订单信息 */
    @RequestMapping("/orderAdd")
    public String orderAdd(Order order){
        //1.调用service层的addOrder方法，新增订单信息
        orderService.addOrder(order);
        //2.重定向到订单列表页面, 显示所有订单信息
        return "redirect:/orderList";
    }
    /** 3.根据id删除订单信息 */
    @RequestMapping("/orderDelete")
    public String orderDelete(Integer id){
        //1.调用service层的deleteById方法，删除指定id的订单信息
        orderService.deleteById(id);
        //2.重定向到订单列表页面, 显示所有订单信息
        return "redirect:/orderList";
    }

    /** 4.根据id查询订单信息*/
    @RequestMapping("/orderInfo")
    public String orderInfo(Integer id,Model model){
        //调用doorservice的findall方法，查询所有门店信息
        List<Door> doorList=doorService.findAll();
        //将所有门店信息放入model中
        model.addAttribute("doorList", doorList);
        //调用service层的findid方法，根据id查询订单信息
        Order order = orderService.findOrderById(id);
        System.out.println(order);
        //将订单信息保存到model中
        model.addAttribute("order", order);
        //将订单信息带到order—update进行回显
        return "order_update";
    }
    @RequestMapping("/orderUpdate")
    public String orderUpdate(Order order){
        System.out.println(order);
         orderService.updateById(order);
        //重定向到订单列表页面，显示所有信息
        return "forward:/orderList";
    }

    @InitBinder
    public void initBinderXXX(WebDataBinder binder) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }





}
