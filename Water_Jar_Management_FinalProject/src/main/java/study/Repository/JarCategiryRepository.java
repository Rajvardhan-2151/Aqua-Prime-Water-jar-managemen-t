package study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.entity.JarCategory;

@Repository
public interface JarCategiryRepository extends JpaRepository<JarCategory, Integer>{

}
