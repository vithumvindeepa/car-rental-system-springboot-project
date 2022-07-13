package lk.ijse.carrent.repo;


import lk.ijse.carrent.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepo extends JpaRepository<Booking,String> {

}
