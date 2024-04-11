package com.example.demo.controller;

import com.example.demo.model.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    //display all rooms
    @GetMapping
    public String listRooms(Model model) {
        model.addAttribute("rooms", roomService.getAllRooms());
        return "rooms";
    }

    //show form for adding a new room
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("room", new Room());
        return "rooms";  //directs back to the rooms which must be adapted to show the form when needed
    }

    //save a new or existing room
    @PostMapping("/save")
    public String saveRoom(Room room, RedirectAttributes redirectAttributes) {
        roomService.saveRoom(room);
        redirectAttributes.addFlashAttribute("successMessage", "Room saved successfully!");
        return "redirect:/rooms";
    }
}
