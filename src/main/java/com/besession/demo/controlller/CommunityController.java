package com.besession.demo.controlller;

import com.besession.demo.repository.Community;
import com.besession.demo.repository.dto.CommunityDTO;
import com.besession.demo.service.CommunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/v1/community")
public class CommunityController {

    private final CommunityService communityService;

    /**
     * 정보 가져오기
     * @param id
     * @return
     */
    @GetMapping(value = "getinfo")
    public ResponseEntity<Community> getInfo(
            @RequestParam Long id){

        Community result = communityService.getCommunityInfo(id);
        return ResponseEntity.ok(result);
    }

    /**
     * 정보 저장
     * @param communityDTO
     * @return
     */
    @PostMapping(value="/save")
    public ResponseEntity<Long> saveInfo(
            @RequestBody CommunityDTO communityDTO) {

        Long id = communityService.saveInfo(communityDTO);
        return ResponseEntity.ok(id);
    }
}
