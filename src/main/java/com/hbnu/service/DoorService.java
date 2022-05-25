package com.hbnu.service;

import com.hbnu.pojo.Door;

import java.util.List;

/**
 * @author 李昌颐
 * @date 2022-04-19 14:32
 */
public interface DoorService {
    /*
     * 查找所有门店信息
     * @return 所有门店信息
     * */
    List<Door> findAll();

    void addDoor(Door door);

    void deleteDoor(Integer id);

   Door findDoorById(Integer id);

   void updateDoorById(Door door);
}
