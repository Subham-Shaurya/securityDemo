package securityDemo.securityDemo.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import securityDemo.securityDemo.services.PostService;
import securityDemo.securityDemo.dto.PostDTO;

import java.util.List;

@RestController
@RequestMapping(path = "/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostDTO> getAllPosts() {
        return postService.getAllPosts();
    }
    @GetMapping("/{postId}")
    public PostDTO getPostById(@PathVariable Long postId){
        return postService.getPostById(postId);
    }

    @PostMapping
    public PostDTO createNewPost(@RequestBody PostDTO inputPost){
        return postService.createNewPost(inputPost);
    }

}
