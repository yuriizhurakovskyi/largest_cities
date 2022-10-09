package ua.yuriizhurakovskyi.citytask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.UrbanArea;

@Repository
public interface UrbanAreaRepository extends JpaRepository<UrbanArea, Integer> {
}
