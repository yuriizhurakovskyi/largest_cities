package ua.yuriizhurakovskyi.citytask.domain;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "population_id")
    private Population population;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cityproper_id")
    private CityProper cityProper;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "urbanarea_id")
    private UrbanArea urbanArea;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "metropolitanarea_id")
    private MetropolitanArea metropolitanArea;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "definition_id")
    private Definition definition;

    @Column
    private Continent continent;

    public City() {
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Population getPopulation() {
        return population;
    }

    public void setPopulation(Population population) {
        this.population = population;
    }

    public CityProper getCityProper() {
        return cityProper;
    }

    public void setCityProper(CityProper cityProper) {
        this.cityProper = cityProper;
    }

    public UrbanArea getUrbanArea() {
        return urbanArea;
    }

    public void setUrbanArea(UrbanArea urbanArea) {
        this.urbanArea = urbanArea;
    }

    public MetropolitanArea getMetropolitanArea() {
        return metropolitanArea;
    }

    public void setMetropolitanArea(MetropolitanArea metropolitanArea) {
        this.metropolitanArea = metropolitanArea;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", population=" + population +
                ", cityProper=" + cityProper +
                ", urbanArea=" + urbanArea +
                ", metropolitanArea=" + metropolitanArea +
                ", definition=" + definition +
                ", continent=" + continent +
                '}';
    }
}
