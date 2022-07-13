package lk.ijse.carrent.service.impl;
import lk.ijse.carrent.repo.BookingRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BooklingServiceIMPL {
    @Autowired
    private BookingRepo repo;

    @Autowired
    private ModelMapper map;

}
