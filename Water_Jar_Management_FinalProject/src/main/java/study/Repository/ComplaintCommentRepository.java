package study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.ComplaintComment;

public interface ComplaintCommentRepository extends JpaRepository<ComplaintComment, Integer>{

}
