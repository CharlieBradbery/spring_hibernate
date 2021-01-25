package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int series;

    @Column
    private String model;


    public Car(){
    }

    public Car(String model, int series){
        this.model = model;
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeries() {return series;}

    public void setSeries(int series) {this.series = series;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
