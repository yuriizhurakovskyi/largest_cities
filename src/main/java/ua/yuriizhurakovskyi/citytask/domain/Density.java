package ua.yuriizhurakovskyi.citytask.domain;

import javax.persistence.*;

@Entity
@Table(name = "density")
public class Density {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Double density;

    public Density() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return "Density{" +
                "id=" + id +
                ", density=" + density +
                '}';
    }
}
