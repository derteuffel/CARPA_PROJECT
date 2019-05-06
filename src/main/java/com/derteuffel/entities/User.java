package com.derteuffel.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by derteuffel on 06/05/2019.
 */
@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long userId;
    @Column
    @NotEmpty
    @Size(min = 4)
    private String nom;
    @Column
    @NotEmpty
    @Size(min = 4)
    private String prenom;
    @Column
    @NotEmpty
    @Size(min = 4)
    private String matricule;
    @Column
    @NotEmpty
    @Size(min = 4)
    private String telephone;
    @Column
    @NotEmpty
    @Email
    @Size(min = 6)
    private String email;
    @Column
    @NotEmpty
    @Size(min = 6)
    private String password;
    @Column
    private String avatar;
    @Column
    private Boolean active;
    private String resetToken;

    @ManyToMany
    @JoinTable(name = "user_courier", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "courier_id"))
    private Set<Courier> couriers;
    @ManyToMany
    @JoinTable(name = "user_project", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects;

    public User() {
    }

    public User(@NotEmpty @Size(min = 4) String nom, @NotEmpty @Size(min = 4) String prenom,
                @NotEmpty @Size(min = 4) String matricule, @NotEmpty @Size(min = 4) String telephone,
                @NotEmpty @Email @Size(min = 6) String email, @NotEmpty @Size(min = 6) String password,
                String avatar, Boolean active, String resetToken, Set<Courier> couriers, Set<Project> projects) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.active = active;
        this.resetToken = resetToken;
        this.couriers = couriers;
        this.projects = projects;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Set<Courier> getCouriers() {
        return couriers;
    }

    public void setCouriers(Set<Courier> couriers) {
        this.couriers = couriers;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
