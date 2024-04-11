package com.example.demo.service;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    //setup to work once booking repos is made
    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    //add a new booking
    public Booking addBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    //update an existing booking
    public Booking updateBooking(Booking booking) {
        return bookingRepository.save(booking); 
    }

    //fetch all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    //fetch a single booking by ID
    public Optional<Booking> getBookingById(Long id) {
        return bookingRepository.findById(id);
    }

    //delete a booking
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}