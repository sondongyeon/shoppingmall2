package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Category;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    List<Category> findByname(String name);
}
