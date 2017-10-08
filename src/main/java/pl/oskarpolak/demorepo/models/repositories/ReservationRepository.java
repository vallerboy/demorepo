package pl.oskarpolak.demorepo.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.demorepo.models.ReservationModel;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {
}
