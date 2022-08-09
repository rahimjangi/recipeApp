package com.raiseup.recipeApp.otherModels;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Kafu kafu;
    private String postName;
    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private List<Etesali>etesalis= new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kafu getKafu() {
        return kafu;
    }

    public void setKafu(Kafu kafu) {
        this.kafu = kafu;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public List<Etesali> getEtesalis() {
        return etesalis;
    }

    public void setEtesalis(List<Etesali> etesalis) {
        this.etesalis = etesalis;
    }
}
