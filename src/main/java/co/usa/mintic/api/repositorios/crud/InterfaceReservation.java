package co.usa.mintic.api.repositorios.crud;

import co.usa.mintic.api.modelos.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservation extends CrudRepository<Reservation, Integer> {

}
