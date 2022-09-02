package com.MovieProject;

import org.hibernate.SessionFactory;

import javax.persistence.*;

@Entity
@Table(name = "names")
public class VoteEntity {

 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

 @Column(name = "voter_name")
    private String voterName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoterName() {
        return voterName;
    }

    public void setVoterName(String userName) {
        this.voterName = voterName;
    }
}
