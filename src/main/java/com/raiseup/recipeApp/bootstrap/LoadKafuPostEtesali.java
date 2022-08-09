package com.raiseup.recipeApp.bootstrap;

import com.raiseup.recipeApp.otherModels.Etesali;
import com.raiseup.recipeApp.otherModels.Kafu;
import com.raiseup.recipeApp.otherModels.Post;
import com.raiseup.recipeApp.repository.EtesaliRepository;
import com.raiseup.recipeApp.repository.KafuRepository;
import com.raiseup.recipeApp.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadKafuPostEtesali implements CommandLineRunner {
    private final EtesaliRepository etesaliRepository;
    private final KafuRepository kafuRepository;
    private final PostRepository postRepository;

    public LoadKafuPostEtesali(EtesaliRepository etesaliRepository, KafuRepository kafuRepository, PostRepository postRepository) {
        this.etesaliRepository = etesaliRepository;
        this.kafuRepository = kafuRepository;
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Kafu k1= new Kafu();
        k1.setKafuName("K001");
        kafuRepository.save(k1);
        Post p1= new Post();
        p1.setPostName("001");
        p1.setKafu(k1);
        k1.getPosts().add(p1);
        postRepository.save(p1);

        Etesali e1= new Etesali();
        e1.setPost(p1);
        e1.setEtesaliID(1);
        etesaliRepository.save(e1);

        Etesali e2= new Etesali();
        e2.setPost(p1);
        e2.setEtesaliID(2);
        etesaliRepository.save(e2);

        Etesali e3= new Etesali();
        e3.setPost(p1);
        e3.setEtesaliID(3);
        etesaliRepository.save(e3);

        Etesali e4= new Etesali();
        e4.setPost(p1);
        e4.setEtesaliID(4);
        etesaliRepository.save(e4);

        Etesali e5= new Etesali();
        e5.setPost(p1);
        e5.setEtesaliID(5);
        etesaliRepository.save(e5);

    }
}
