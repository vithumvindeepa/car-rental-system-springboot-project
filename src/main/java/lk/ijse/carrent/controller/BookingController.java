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
    public ResponceUtil SaveBooking(BookingDTO bookingDTO) {
        bookingService.saveBookling(bookingDTO);
        return new ResponceUtil(200, "save", null);

    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil DeleteBooking(@RequestParam String iD) {
        bookingService.deleteBookling(iD);
        return new ResponceUtil(200, "delete", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil updateBooking(@RequestBody BookingDTO bookingDTO) {
        bookingService.updateBookling(bookingDTO);
        return new ResponceUtil(200, "update", null);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil SearchBooking(@PathVariable String iD) {
        return new ResponceUtil(200, "search", bookingService.searchBookling(iD));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponceUtil getAllBooking() {
        return new ResponceUtil(200, "all", bookingService.getAllBookling());
    }

}
