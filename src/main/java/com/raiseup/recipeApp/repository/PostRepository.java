package com.raiseup.recipeApp.repository;

import com.raiseup.recipeApp.otherModels.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
