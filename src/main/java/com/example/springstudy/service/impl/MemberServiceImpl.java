package com.example.springstudy.service.impl;

import com.example.springstudy.model.Member;
import com.example.springstudy.repository.MemberRepository;
import com.example.springstudy.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    @Override
    public List<Member> getAllMember() {

        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(String Id) {
        Optional<Member> member = memberRepository.findById(Id);
        if(member.isPresent()){
            return member.get();
        }
        Member defaultMember = new Member();
        defaultMember.setId("!no member");
        defaultMember.setEmail("!no member");
        defaultMember.setPassword("!no member");

        return defaultMember;
    }
}
