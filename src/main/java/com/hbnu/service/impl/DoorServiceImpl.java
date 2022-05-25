package com.hbnu.service.impl;

import com.hbnu.dao.DoorMapper;
import com.hbnu.pojo.Door;
import com.hbnu.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 李昌颐
 * @date 2022-04-19 14:32
 */
@Service
public class DoorServiceImpl implements DoorService {
    @Autowired
    private DoorMapper doorMapper;

    @Override
    public List<Door> findAll() {
        return doorMapper.findAllDoor();
    }

    @Override
    public void addDoor(Door door) {
        doorMapper.addDoor(door);

    }

    @Override
    public void deleteDoor(Integer id) {
        doorMapper.deleteDoor(id);
    }

    @Override
    public Door findDoorById(Integer id) {
        Door door = doorMapper.findDoorById(id);
        return door;

    }

    @Override
    public void updateDoorById(Door door) {
         doorMapper.updateDoorById(door);
    }


}
