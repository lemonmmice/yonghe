package com.hbnu.controller;

import com.hbnu.pojo.Door;
import com.hbnu.service.DoorService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;


/**
 * @author 李昌颐
 * @date 2022-04-19 14:31
 */
@Controller
public class DoorController {
    @Autowired
    private DoorService doorService;
    /*
     * 查找所有门店信息
     * @return 所有门店信息
     * */
    @RequestMapping("/doorList")
    public String findAllDoor(Model model){
        //获取所有门店数据
        List<Door> doorList = doorService.findAll();
        //将数据封装到model对象中
        model.addAttribute("list",doorList);
        //返回页面和数据
        return "door_list";
    }
   @RequestMapping("/doorAdd")
    public String addDoor(Model model,Door door){
        doorService.addDoor(door);
        List<Door> doorList = doorService.findAll();
        model.addAttribute("list",doorList);
        return "door_list";
   }
   @RequestMapping("/doorDelete")
    public String deleteDoor(Integer id){
        doorService.deleteDoor(id);

      return "forward:/doorList";
   }
   @RequestMapping("/doorInfo")
    public String findDoorBuId(Integer id,Model model){
       Door doorById = doorService.findDoorById(id);

       model.addAttribute("door",doorById);
       return "door_update";
   }
   @RequestMapping("/doorUpdate")
    public String updateDoorById(Door door){
       doorService.updateDoorById(door);

       return "forward:/doorList";
   }
}
