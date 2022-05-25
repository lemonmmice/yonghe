package com.hbnu.dao;

import com.hbnu.pojo.Door;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

/**
 * @author 李昌颐
 * @date 2022-04-19 14:34
 */
public interface DoorMapper {
/*
* 查找所有门店信息
* @return 所有门店信息
* */
    List<Door> findAllDoor();

    void addDoor(Door door);

    void deleteDoor(Integer id);

    Door findDoorById(Integer id);

    void updateDoorById(Door door);

}
