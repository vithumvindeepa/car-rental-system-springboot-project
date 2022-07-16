package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.BookingDTO;
import lk.ijse.carrent.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ResponceUtil;

@RestController
@RequestMapping("Booking")
@CrossOrigin

public class BookingController {
    @Autowired
    BookingService bookingService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SaveBooking(BookingDTO bookingdto) {
        bookingService.saveBookling(bookingdto);
        return new ResponceUtil(200, "save", null);

    }




}
