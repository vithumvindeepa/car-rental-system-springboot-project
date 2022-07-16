package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.BookingDTO;
import lk.ijse.carrent.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteBooking(@RequestParam String iD) {
        bookingService.deleteBookling(iD);
        return new ResponceUtil(200, "delete", null);
    }


}
