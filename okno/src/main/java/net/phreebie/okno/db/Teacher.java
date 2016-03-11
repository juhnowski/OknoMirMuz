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
@Table(name = "teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Teacher {

    private Long id;
    private String teacherFamily;
    private String teacherName;
    private String teacherSName;
    private boolean teacherExpOnline;
    private String teacherEducation;
    private String teachersAuthorsProgramm;
    private String teacherPhone;
    private String teacherCountry;
    private String teacherCity;
    private String teacherEmail;
    private String teacherPassword;
    private boolean teacherHome;
    private boolean teacherAgreement;

    public Teacher(){
        
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "teacherFamily")
    public String getTeacherFamily() {
        return teacherFamily;
    }

    public void setTeacherFamily(String teacherFamily) {
        this.teacherFamily = teacherFamily;
    }

    @Column(name = "teacherName")
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Column(name = "teacherSName")
    public String getTeacherSName() {
        return teacherSName;
    }

    public void setTeacherSName(String teacherSName) {
        this.teacherSName = teacherSName;
    }

    @Column(name = "teacherExpOnline")
    public boolean isTeacherExpOnline() {
        return teacherExpOnline;
    }

    public void setTeacherExpOnline(boolean teacherExpOnline) {
        this.teacherExpOnline = teacherExpOnline;
    }

    @Column(name = "teacherEducation")
    public String getTeacherEducation() {
        return teacherEducation;
    }

    public void setTeacherEducation(String teacherEducation) {
        this.teacherEducation = teacherEducation;
    }

    @Column(name = "teachersAuthorsProgramm")
    public String getTeachersAuthorsProgramm() {
        return teachersAuthorsProgramm;
    }

    public void setTeachersAuthorsProgramm(String teachersAuthorsProgramm) {
        this.teachersAuthorsProgramm = teachersAuthorsProgramm;
    }

    @Column(name = "teacherPhone")
    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    @Column(name = "teacherCountry")
    public String getTeacherCountry() {
        return teacherCountry;
    }

    public void setTeacherCountry(String teacherCountry) {
        this.teacherCountry = teacherCountry;
    }

    @Column(name = "teacherCity")
    public String getTeacherCity() {
        return teacherCity;
    }

    public void setTeacherCity(String teacherCity) {
        this.teacherCity = teacherCity;
    }

    @Column(name = "teacherEmail")
    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    @Column(name = "teacherPassword")
    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    @Column(name = "teacherHome")
    public boolean isTeacherHome() {
        return teacherHome;
    }

    public void setTeacherHome(boolean teacherHome) {
        this.teacherHome = teacherHome;
    }

    @Column(name = "teacherAgreement")
    public boolean isTeacherAgreement() {
        return teacherAgreement;
    }

    public void setTeacherAgreement(boolean teacherAgreement) {
        this.teacherAgreement = teacherAgreement;
    }

}
