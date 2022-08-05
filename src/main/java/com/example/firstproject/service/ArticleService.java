package com.example.firstproject.service;

import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service // 서비스 선언  (서비스 객체를 스프링 부트에 생성)

public class ArticleService {
    @Autowired //DI
    private ArticleRepository articleRepository;
}
