package securityDemo.securityDemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import securityDemo.securityDemo.entities.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
