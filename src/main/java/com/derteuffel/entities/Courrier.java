package com.derteuffel.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Entity
public class Courrier implements Serializable{

    @Id
    @GeneratedValue
    private Long courrierId;
    @Column
    @NotEmpty
    @Size(min = 6)
    private String reference;
    @Column
    private String objet;
    @Column
    private String emetteur;
    @Column
    private String recepteur;
    @Column
    private String order_number;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateEnvoi;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateReception;
    @Column
    private String typeCourrier;
    @Column
    private String fileType;
    @Column
    private ArrayList<String> pieces= new ArrayList<>();

    @ManyToMany(mappedBy = "courriers")
    private Set<User> users;

    @ManyToOne
    private Status status;

    public Courrier() {
    }

    public Courrier(@NotEmpty @Size(min = 6) String reference, String objet, String emetteur, String recepteur,
                    String order_number, Date dateEnvoi, Date dateReception, String fileType, ArrayList<String> pieces,
                    Set<User> users, Status status, String typeCourrier) {
        this.reference = reference;
        this.objet = objet;
        this.emetteur = emetteur;
        this.recepteur = recepteur;
        this.order_number = order_number;
        this.dateEnvoi = dateEnvoi;
        this.dateReception = dateReception;
        this.fileType = fileType;
        this.pieces = pieces;
        this.users = users;
        this.status=status;
        this.typeCourrier = typeCourrier;
    }

    public Long getCourrierrId() {
        return courrierId;
    }

    public void setCourrierId(Long courierId) {
        this.courrierId = courrierId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(String emetteur) {
        this.emetteur = emetteur;
    }

    public String getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(String recepteur) {
        this.recepteur = recepteur;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ArrayList<String> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<String> pieces) {
        this.pieces = pieces;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTypeCourrier() {
        return typeCourrier;
    }

    public void setTypeCourrier(String typeCourier) {
        this.typeCourrier = typeCourier;
    }
}
