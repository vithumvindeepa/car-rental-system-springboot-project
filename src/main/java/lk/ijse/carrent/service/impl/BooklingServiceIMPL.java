package lk.ijse.carrent.service.impl;
import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.BookingDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.entity.Booking;
import lk.ijse.carrent.repo.BookingRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BooklingServiceIMPL {
    @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper map;

    public void saveBooking(BookingDTO dto) {

        if (!repo.existsById(dto.getBookingID())) {
            repo.save(map.map(dto, Booking.class));
        } else {
            throw new RuntimeException("This Booking ID id is already exists....!!!");
        }
    }



}
