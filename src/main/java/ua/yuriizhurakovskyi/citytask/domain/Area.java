package ua.yuriizhurakovskyi.citytask.domain;

import javax.persistence.*;

@Entity
@Table(name = "population")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer area;

    public Area() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", area=" + area +
                '}';
    }
}
