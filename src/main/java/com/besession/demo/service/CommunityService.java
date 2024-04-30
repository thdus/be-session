package com.besession.demo.service;

import com.besession.demo.repository.Community;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommunityService {
    private final CommunityService communityService;

    public Community getCommunityInfo(Long id){


        return communityRepository.findById(id).orElseThrow(()->new RuntimeException());
    }

    public Long saveInfo(Community community) {
        return communityRepository.save(community).getId();
    }
}
