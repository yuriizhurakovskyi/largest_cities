package ua.yuriizhurakovskyi.citytask.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area,Integer> {
}
