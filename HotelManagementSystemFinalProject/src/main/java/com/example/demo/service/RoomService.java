package com.example.demo.service;

import com.example.demo.model.Room;
import com.example.demo.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //add or update a room 
    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    //fetch all rooms
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    //fetch a single room by ID
    public Optional<Room> getRoomById(Long id) {
        return roomRepository.findById(id);
    }

    //delete a room by ID
    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
