package com.example.springstudy.controller;


import com.example.springstudy.model.Member;
import com.example.springstudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/AllMember")
    public List<Member> AllMember(){
        return memberService.getAllMember();
    }

    @GetMapping(path = "/oneMemberById/{Id}")
    public Member oneMemberById(@PathVariable(name = "Id") String Id){
        return memberService.getMemberById(Id);
    }
}
