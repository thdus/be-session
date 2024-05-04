package com.besession.demo.service;

import com.besession.demo.repository.Community;
import com.besession.demo.repository.CommunityRepository;
import com.besession.demo.repository.dto.CommunityDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommunityService {

    private final CommunityRepository communityRepository;

    public Community getCommunityInfo(Long id) {

        return communityRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Long saveInfo(CommunityDTO communityDTO) {

        Community community = Community.builder()
                .title(communityDTO.getTitle())
                .content(communityDTO.getContent())
                .build();

        communityRepository.save(community);
        return community.getId();
    }
}
