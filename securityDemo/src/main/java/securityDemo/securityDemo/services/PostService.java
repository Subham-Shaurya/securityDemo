package securityDemo.securityDemo.services;

import securityDemo.securityDemo.dto.PostDTO;

import java.util.List;


public interface PostService {
    public List<PostDTO> getAllPosts();
    public PostDTO createNewPost(PostDTO inputPost);
    public PostDTO getPostById(Long postId);

}
