package com.besession.demo.repository;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name="community")
public class Community {


    @Id
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = 'community_id')
    private long id:

    private String title:
    private String

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = 'community_id')
        private long id:

        private String title:
        private String
    }
}
