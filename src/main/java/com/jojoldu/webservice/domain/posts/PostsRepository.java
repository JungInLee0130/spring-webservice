package com.jojoldu.webservice.domain.posts;

import com.jojoldu.webservice.web.dto.PostsSaveRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    // 게시판 전체 조회 기능 만들기
    // Jpa에서 제공하지 않는 메소드 : @Query로 작성
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
