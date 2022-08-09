package com.raiseup.recipeApp.otherModels;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Kafu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String kafuName;

    @OneToMany(mappedBy = "kafu",cascade = CascadeType.ALL)
    private List<Post> posts= new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKafuName() {
        return kafuName;
    }

    public void setKafuName(String kafuName) {
        this.kafuName = kafuName;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
