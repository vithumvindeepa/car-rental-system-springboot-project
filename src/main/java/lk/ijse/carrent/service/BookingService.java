package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.BookingDTO;

import java.util.List;

public interface BookingService {

    void saveBookling(BookingDTO dto);

    void deleteBookling(String id);

    void updateBookling(BookingDTO dto);

    BookingDTO searchBookling(String id);

    List<BookingDTO> getAllBookling();
}
