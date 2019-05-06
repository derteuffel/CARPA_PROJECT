package com.derteuffel.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Entity
public class Project implements Serializable {
    @Id
    @GeneratedValue
    private Long projectId;

    @Column
    @NotEmpty
    @Size(min = 6)
    private String reference;
    @Column
    @NotEmpty
    private String objet;
    @Column
    private String nomProjet;
    @Column
    private String description;
    @Column
    private String secteurActivite;
    @Column
    private String pointFocal;
    @Column
    private String situation;
    @Column
    @NotEmpty
    private String partenairePub;
    @Column
    @NotEmpty
    private String partenairePri;
    @Column
    @Size(min = 6)
    private String montant;
    @Column
    @NotEmpty
    private String prod;
    @Column
    private String duree;
    @Column
    private String fileType;
    @Column
    private ArrayList<String> pieces= new ArrayList<>();

    @ManyToMany(mappedBy = "projects")
    private Set<User> users;
    @OneToMany(mappedBy = "project")
    private List<Rapport> rapports;

    public Project() {
    }

    public Project(@NotEmpty @Size(min = 6) String reference, @NotEmpty String objet, String nomProjet,
                   String description, String secteurActivite, String pointFocal, String situation, @NotEmpty String partenairePub,
                   @NotEmpty String partenairePri, @Size(min = 6) String montant, @NotEmpty String prod, String duree,
                   String fileType, ArrayList<String> pieces, Set<User> users, List<Rapport> rapports) {
        this.reference = reference;
        this.objet = objet;
        this.nomProjet = nomProjet;
        this.description = description;
        this.secteurActivite = secteurActivite;
        this.pointFocal = pointFocal;
        this.situation = situation;
        this.partenairePub = partenairePub;
        this.partenairePri = partenairePri;
        this.montant = montant;
        this.prod = prod;
        this.duree = duree;
        this.fileType = fileType;
        this.pieces = pieces;
        this.users = users;
        this.rapports = rapports;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
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

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getPointFocal() {
        return pointFocal;
    }

    public void setPointFocal(String pointFocal) {
        this.pointFocal = pointFocal;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getPartenairePub() {
        return partenairePub;
    }

    public void setPartenairePub(String partenairePub) {
        this.partenairePub = partenairePub;
    }

    public String getPartenairePri() {
        return partenairePri;
    }

    public void setPartenairePri(String partenairePri) {
        this.partenairePri = partenairePri;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
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

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }
}
