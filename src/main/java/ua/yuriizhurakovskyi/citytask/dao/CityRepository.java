package ua.yuriizhurakovskyi.citytask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
