/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.phreebie.okno.db;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

    private Long id;
    private String personFamily;
    private String personName;
    private String personSName;
    private boolean personFullAge;
    private String personParentFamily;
    private String personParentName;
    private String personParentSName;
    private boolean personMusicLevel;
    private String musicType;
    private String personPhone;
    private String personCountry;
    private String personCity;
    private String personEmail;
    private String personPassword;
    private boolean personHome;
    private boolean personAgreement;

    public Person(){
        
    }
    
    public Person(
            String personFamily,
            String personName,
            String personSName,
            boolean personFullAge,
            String personParentFamily,
            String personParentName,
            String personParentSName,
            boolean personMusicLevel,
            String musicType,
            String personPhone,
            String personCountry,
            String personCity,
            String personEmail,
            String personPassword,
            boolean personHome,
            boolean personAgreement) {
        this.personFamily = personFamily;
        this.personName = personName;
        this.personSName = personSName;
        this.personFullAge = personFullAge;
        this.personParentFamily = personParentFamily;
        this.personParentName = personParentName;
        this.personParentSName = personParentSName;
        this.personMusicLevel = personMusicLevel;
        this.musicType = musicType;
        this.personPhone = personPhone;
        this.personCountry = personCountry;
        this.personCity = personCity;
        this.personEmail = personEmail;
        this.personPassword = personPassword;
        this.personHome = personHome;
        this.personAgreement = personAgreement;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "personFamily")
    public String getPersonFamily() {
        return personFamily;
    }

    public void setPersonFamily(String personFamily) {
        this.personFamily = personFamily;
    }

    @Column(name = "personName")
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Column(name = "personSName")
    public String getPersonSName() {
        return personSName;
    }

    public void setPersonSName(String personSName) {
        this.personSName = personSName;
    }

    @Column(name = "personFullAge")
    public boolean isPersonFullAge() {
        return personFullAge;
    }

    public void setPersonFullAge(boolean personFullAge) {
        this.personFullAge = personFullAge;
    }

    @Column(name = "personParentFamily")
    public String getPersonParentFamily() {
        return personParentFamily;
    }

    public void setPersonParentFamily(String personParentFamily) {
        this.personParentFamily = personParentFamily;
    }

    @Column(name = "personParentName")
    public String getPersonParentName() {
        return personParentName;
    }

    public void setPersonParentName(String personParentName) {
        this.personParentName = personParentName;
    }

    @Column(name = "personParentSName")
    public String getPersonParentSName() {
        return personParentSName;
    }

    public void setPersonParentSName(String personParentSName) {
        this.personParentSName = personParentSName;
    }

    @Column(name = "personMusicLevel")
    public boolean isPersonMusicLevel() {
        return personMusicLevel;
    }

    public void setPersonMusicLevel(boolean personMusicLevel) {
        this.personMusicLevel = personMusicLevel;
    }

    @Column(name = "musicType")
    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    @Column(name = "personPhone")
    public String getPersonPhone() {
        return personPhone;
    }

    void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    @Column(name = "personCountry")
    public String getPersonCountry() {
        return personCountry;
    }

    public void setPersonCountry(String personCountry) {
        this.personCountry = personCountry;
    }

    @Column(name = "personCity")
    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    @Column(name = "personEmail")
    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    @Column(name = "personPassword")
    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }

    @Column(name = "personHome")
    public boolean isPersonHome() {
        return personHome;
    }

    public void setPersonHome(boolean personHome) {
        this.personHome = personHome;
    }

    @Column(name = "personAgreement")
    public boolean isPersonAgreement() {
        return personAgreement;
    }

    public void setPersonAgreement(boolean personAgreement) {
        this.personAgreement = personAgreement;
    }
}
