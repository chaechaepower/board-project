package com.study.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity //Board클래스가 DB에 있는 테이블임을 의미. jpa가 읽어서 처리.
@Data
public class Board {
    @Id //primary key를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mySql, mariaDB
    private Integer id;

    private String title;

    private String content;
}
