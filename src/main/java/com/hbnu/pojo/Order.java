package com.hbnu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
/** 订单实体类 */
public class Order {
    private Integer id;	//订单id
    private Integer doorId;	//门店编号
    private String orderNo;	//订单编号
    private String orderType;	//订单类型
    private Integer pnum;	//用餐人数
    private String cashier;	//收银员


    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date orderTime;	//下单时间
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    private Date payTime;	//结账时间

    private String payType;	//支付方式
    private double price;	//支付金额

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", doorId=" + doorId +
                ", orderNo='" + orderNo + '\'' +
                ", orderType='" + orderType + '\'' +
                ", pnum=" + pnum +
                ", cashier='" + cashier + '\'' +
                ", orderTime=" + orderTime +
                ", payTime=" + payTime +
                ", payType='" + payType + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoorId() {
        return doorId;
    }

    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


