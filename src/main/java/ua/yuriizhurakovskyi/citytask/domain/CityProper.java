package ua.yuriizhurakovskyi.citytask.domain;

import javax.persistence.*;

@Entity
@Table(name = "cityproper")
public class CityProper {

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "definition_id")
    private Definition definition;

    public CityProper() {
    }

    public Population getPopulation() {
        return population;
    }

    public void setPopulation(Population population) {
        this.population = population;
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

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CityProper{" +
                "id=" + id +
                ", population=" + population +
                ", area=" + area +
                ", density=" + density +
                ", definition=" + definition +
                '}';
    }
}
