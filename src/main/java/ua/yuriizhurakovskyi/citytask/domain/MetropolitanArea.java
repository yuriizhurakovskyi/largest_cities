package ua.yuriizhurakovskyi.citytask.domain;

import javax.persistence.*;

@Entity
@Table(name = "metropolitan_area")
public class MetropolitanArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "population_id")
    private Population population;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id")
    private Area area;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "density_id")
    private Density density;

    public MetropolitanArea() {
    }

    public Population getPopulation() {
        return population;
    }

    public void setPopulation(Population population) {
        this.population = population;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Density getDensity() {
        return density;
    }

    public void setDensity(Density density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "MetropolitanArea{" +
                "id=" + id +
                ", population=" + population +
                ", area=" + area +
                ", density=" + density +
                '}';
    }
}
