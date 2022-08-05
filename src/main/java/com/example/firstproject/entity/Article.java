package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity // DB가 해당 객체를 인식 가능!
@AllArgsConstructor
@NoArgsConstructor//디폴트생성자
@ToString
@Getter
public class Article {
    @Id//대표값을 지정! like a 주민등록번호
    @GeneratedValue(strategy = GenerationType.IDENTITY)//db가 id를 자동 생성 어노테이션
    private Long id;
    @Column
    private String title;
    @Column
    private String content;


    public void patch(Article article) {
        if(article.title !=null)
            this.title = article.title;
        if(article.content != null)
            this.content = article.content;
    }
}
