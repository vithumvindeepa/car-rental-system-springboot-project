package lk.ijse.carrent.service.impl;
import lk.ijse.carrent.dto.BillingDTO;
import lk.ijse.carrent.dto.BookingDTO;
import lk.ijse.carrent.entity.Billing;
import lk.ijse.carrent.entity.Booking;
import lk.ijse.carrent.repo.BookingRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Type;

public class BookingServiceIMPL {
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

    public void deleteBooking(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Booking ID.. No Such Booking..!");
        }
    }

    public void updateBooking(BookingDTO dto) {

        if (!repo.existsById(dto.getBookingID())) {
            repo.save(map.map(dto, Booking.class));
        } else {
            throw new RuntimeException("No Such Billing To Update..! Please Check the ID!");
        }
    }

    public BookingDTO searchBooking(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(), (Type) BookingDTO.class);
        }else {
            throw new RuntimeException("No Booking For " + id + " ..!");
        }
    }


}
