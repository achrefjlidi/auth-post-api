package com.achref.authpost.post;


import com.achref.authpost.user.TokenRepository;
import com.achref.authpost.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.*;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Object findAllBooks(int page, int size, Authentication connectedUser) {
        User user = ((User) connectedUser.getPrincipal());
        List<Post> posts = postRepository.findAll();
        return posts;
    }

    public Long save(PostRequest request, Authentication connectedUser) {
        User user = ((User) connectedUser.getPrincipal());
        // Create a new post entity from the request data
        Post post = new Post();
        post.setTitle(request.getTitle());
        post.setContent(request.getContent());

        // Save the post to the database
        return postRepository.save(post).getId();
    }
}
