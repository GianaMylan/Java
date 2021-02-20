package com.example.rabbit.model;


import javax.persistence.*;

@Entity
@Table(name = "rabbit")
public class Rabbit {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rabbitId;

    @Column
    private String name;
    @Column
    private String breed;
    @Column
    private String color;
    @Column
    private Boolean ear_floop;
    @Column
    private Boolean long_hair;
    @Column
    private Boolean tail_floof;
    @Column
    private Integer age;


    public Rabbit() {
    }

    public Long getRabbitId() {
        return rabbitId;
    }
    public void setRabbitId(Long rabbitId) {
        this.rabbitId = rabbitId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getEar_floop() {
        return ear_floop;
    }
    public void setEar_floop(Boolean ear_floop) {
        this.ear_floop = ear_floop;
    }

    public Boolean getLong_hair() {
        return long_hair;
    }
    public void setLong_hair(Boolean long_hair) {
        this.long_hair = long_hair;
    }

    public Boolean getTail_floof() {
        return tail_floof;
    }
    public void setTail_floof(Boolean tail_floof) {
        this.tail_floof = tail_floof;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
