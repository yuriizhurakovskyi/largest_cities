package ua.yuriizhurakovskyi.citytask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
