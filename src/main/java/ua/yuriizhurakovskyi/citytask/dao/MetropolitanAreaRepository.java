package ua.yuriizhurakovskyi.citytask.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.yuriizhurakovskyi.citytask.domain.MetropolitanArea;

@Repository
public interface MetropolitanAreaRepository extends JpaRepository<MetropolitanArea, Integer> {
}
