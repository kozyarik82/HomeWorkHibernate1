package me.kozyar;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue
    private Integer id;
    private String cityName;
    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
