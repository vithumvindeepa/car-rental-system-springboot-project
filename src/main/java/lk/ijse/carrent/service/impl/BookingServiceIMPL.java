package lk.ijse.carrent.service.impl;
import lk.ijse.carrent.dto.BookingDTO;
import lk.ijse.carrent.entity.Booking;
import lk.ijse.carrent.repo.BookingRepo;
import lk.ijse.carrent.service.BookingService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Type;
import java.util.List;

public class BookingServiceIMPL implements BookingService {
    @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper map;

    @Override
    public void saveBookling(BookingDTO dto) {

        if (!repo.existsById(dto.getBookingID())) {
            repo.save(map.map(dto, Booking.class));
        } else {
            throw new RuntimeException("This Booking ID id is already exists....!!!");
        }
    }

    @Override
    public void deleteBookling(String id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Booking ID.. No Such Booking..!");
        }
    }

    @Override
    public void updateBookling(BookingDTO dto) {

        if (!repo.existsById(dto.getBookingID())) {
            repo.save(map.map(dto, Booking.class));
        } else {
            throw new RuntimeException("No Such Billing To Update..! Please Check the ID!");
        }
    }

    @Override
    public BookingDTO searchBookling(String id) {

        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(), (Type) BookingDTO.class);
        }else {
            throw new RuntimeException("No Booking For " + id + " ..!");
        }
    }

    @Override
    public List<BookingDTO> getAllBookling() {

        return map.map(repo.findAll(), new TypeToken<List<BookingDTO>>() {
        }.getType());
    }

}
