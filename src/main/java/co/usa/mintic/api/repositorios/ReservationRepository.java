package co.usa.mintic.api.repositorios;

import co.usa.mintic.api.modelos.Reservation;
import co.usa.mintic.api.repositorios.crud.InterfaceReservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {

    @Autowired
    private InterfaceReservation crud;

    public List<Reservation> getAll() {
        return (List<Reservation>) crud.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return crud.findById(id);
    }

    public Reservation save(Reservation reservation) {
        return crud.save(reservation);
    }
    
    public void delete (Reservation reservation){
        crud.delete(reservation);
    }
}
