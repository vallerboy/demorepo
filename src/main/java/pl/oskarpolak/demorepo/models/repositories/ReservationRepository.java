package pl.oskarpolak.demorepo.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.oskarpolak.demorepo.models.ReservationModel;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationModel, Integer> {
//    List<ReservationModel> findByName(String name);
//    ReservationModel findByNameAndLastname(String name, String lastname);
//    List<ReservationModel> findByLastnameContaining(String text);
//    List<ReservationModel> findByIdGreaterThan(int howMany);
//    List<ReservationModel> findByDateAfter(LocalDate date);

      boolean existsByDateEquals(LocalDate date);
      List<ReservationModel> findByDateIsBetween(LocalDate date1, LocalDate date2);
      List<ReservationModel> findByLastname(String lastname);

}
