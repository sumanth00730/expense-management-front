package com.example.demo.entities;

import javax.persistence.*;

@Entity

@Table(name="sumanthexpenitives")
public class Expense {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer eid;
    @Column(length=30,nullable = false)
    private String edate;
    @Column(length=30,nullable = false)
    private String description;
    @Column(length=30,nullable = false)
    private String location;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Expense(Integer eid, String edate, String description, String location, Integer uid, Integer cid) {
        this.eid = eid;
        this.edate = edate;
        this.description = description;
        this.location = location;
        this.uid = uid;
        this.cid = cid;
    }

    @Column(length=30,nullable = false)
    private Integer uid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Column(length=30,nullable = false)
    private Integer cid;


    public Expense() {
    }

    public Expense(Integer eid, String edate, String description, String location, Integer cid) {
        this.eid = eid;
        this.edate = edate;
        this.description = description;
        this.location = location;
        this.cid = cid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
