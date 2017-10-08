package pl.oskarpolak.demorepo.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.demorepo.models.ReservationModel;

import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {
    List<ReservationModel> findByName(String name);
    ReservationModel findByNameAndLastname(String name, String lastname);
}
