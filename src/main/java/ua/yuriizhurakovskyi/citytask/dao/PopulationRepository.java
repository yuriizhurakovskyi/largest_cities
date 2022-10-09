package ua.yuriizhurakovskyi.citytask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.Population;

@Repository
public interface PopulationRepository extends JpaRepository<Population, Integer> {
}
