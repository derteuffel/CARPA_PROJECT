package com.derteuffel.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Entity
public class Status implements Serializable {

    @Id
    @GeneratedValue
    private Long statusId;
    @Column
    private Boolean status;
    @OneToMany(mappedBy = "status")
    private List<Courrier> courriers;

    public Status(Boolean status, List<Courrier> courriers) {
        this.status = status;
        this.courriers = courriers;
    }

    public Status() {
    }

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Courrier> getCourriers() {
        return courriers;
    }

    public void setCourriers(List<Courrier> courriers) {
        this.courriers = courriers;
    }
}
