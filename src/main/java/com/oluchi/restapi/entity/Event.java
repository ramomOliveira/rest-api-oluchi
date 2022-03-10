package com.oluchi.restapi.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event {

    @Id
    private String id;

    private String name;

    private String description;

    private String city;

    private String address;

    private String district;

    private String stateUf;

    private String number;

    private String dateEvent;

    private String hourEvent;

    private String prece;

    private String urlImgEvent;

    private String email;

    private String tel;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStateUf() {
        return stateUf;
    }

    public void setStateUf(String stateUf) {
        this.stateUf = stateUf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getHourEvent() {
        return hourEvent;
    }

    public void setHourEvent(String hourEvent) {
        this.hourEvent = hourEvent;
    }

    public String getPrece() {
        return prece;
    }

    public void setPrece(String prece) {
        this.prece = prece;
    }

    public String getUrlImgEvent() {
        return urlImgEvent;
    }

    public void setUrlImgEvent(String urlImgEvent) {
        this.urlImgEvent = urlImgEvent;
    }

}
