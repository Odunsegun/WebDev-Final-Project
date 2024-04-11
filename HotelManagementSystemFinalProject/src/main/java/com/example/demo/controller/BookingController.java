package com.example.demo.controller;

import com.example.demo.model.Booking;
import com.example.demo.model.Customer;
import com.example.demo.model.Room;
import com.example.demo.service.BookingService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;
    private final CustomerService customerService;
    private final RoomService roomService;

    @Autowired
    public BookingController(BookingService bookingService, CustomerService customerService, RoomService roomService) {
        this.bookingService = bookingService;
        this.customerService = customerService;
        this.roomService = roomService;
    }

    @GetMapping
    public String listBookings(Model model) {
        model.addAttribute("bookings", bookingService.getAllBookings());
        return "bookings";
    }

    @GetMapping("/add")
    public String showAddBookingForm(Model model) {
        model.addAttribute("booking", new Booking());
        model.addAttribute("customers", customerService.getAllCustomers());
        model.addAttribute("rooms", roomService.getAllRooms());
        return "bookings";
    }

    @PostMapping("/add")
    public String addBooking(@ModelAttribute Booking booking) {
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }
}