package pojo;

public class Scooter {
    private Integer id;
    private Integer status_id;
    private Integer location_id;

    public Scooter(Integer id, Integer status_id, Integer location_id) {
        this.id = id;
        this.status_id = status_id;
        this.location_id = location_id;
    }

    public Scooter(Integer status_id, Integer location_id) {
        this.status_id = status_id;
        this.location_id = location_id;
    }

    public Scooter() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", status_id=" + status_id +
                ", location_id=" + location_id +
                '}';
    }
}
