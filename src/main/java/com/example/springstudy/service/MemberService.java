package com.example.springstudy.service;

import com.example.springstudy.model.Member;

import java.util.List;

public interface MemberService {
    List<Member> getAllMember();

    Member getMemberById(String Id);
}
