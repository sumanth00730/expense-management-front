package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name="sumanthcategories")
public class Category {

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    private Integer cid;
    @Column(length=30,nullable = false)
    private String cname;

    @Column(length=30,nullable = false)
    private Integer uid;

//    @OneToMany(targetEntity = Expense.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="ce_fy",referencedColumnName = "cid")
//    private List<Expense> expenses;

    public Category() {
    }

    public Category(Integer cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

}
