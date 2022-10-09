package ua.yuriizhurakovskyi.citytask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.CityProper;

@Repository
public interface CityProperRepository extends JpaRepository<CityProper,Integer> {
}
