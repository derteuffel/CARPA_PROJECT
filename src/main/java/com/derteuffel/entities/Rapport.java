package com.derteuffel.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Entity
public class Rapport implements Serializable {

    @Id
    @GeneratedValue
    private Long rapportId;
    @Column
    private String title;
    @Column
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date created_date;
     @Column
    private String container;

    private ArrayList<String> pieces;
    @ManyToOne
    private Project project;

    public Rapport() {
    }

    public Rapport(String title, Date created_date, String container, ArrayList<String> pieces, Project project) {
        this.title = title;
        this.created_date = created_date;
        this.container = container;
        this.pieces=pieces;
        this.project = project;
    }

    public Long getRapportId() {
        return rapportId;
    }

    public void setRapportId(Long rapportId) {
        this.rapportId = rapportId;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<String> pieces) {
        this.pieces = pieces;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
