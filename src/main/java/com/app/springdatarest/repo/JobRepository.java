package com.app.springdatarest.repo;

import com.app.springdatarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<JobPost, Integer> {


//    List<JobPost> findByPostProfileContainingOrPostDescContaining(String keyword1, String keyword2);
}
