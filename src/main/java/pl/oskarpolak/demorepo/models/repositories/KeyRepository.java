package pl.oskarpolak.demorepo.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.oskarpolak.demorepo.models.KeyModel;

public interface KeyRepository extends CrudRepository<KeyModel, Integer> {
    boolean existsByKeyEquals(String key);
    KeyModel findByKey(String key);
}
