package com.raiseup.recipeApp.otherModels;

import javax.persistence.*;

@Entity
public class Etesali {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Post post;
    private Integer etesaliID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Integer getEtesaliID() {
        return etesaliID;
    }

    public void setEtesaliID(Integer etesaliID) {
        this.etesaliID = etesaliID;
    }
}
