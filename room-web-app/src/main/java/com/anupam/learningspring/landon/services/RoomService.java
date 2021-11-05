package com.anupam.learningspring.landon.services;

import com.anupam.learningspring.landon.models.Room;
import com.anupam.learningspring.landon.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return this.roomRepository.findAll();
    }

    public Room getById(long id) {
        return this.roomRepository.findById(id).get();
    }
}
