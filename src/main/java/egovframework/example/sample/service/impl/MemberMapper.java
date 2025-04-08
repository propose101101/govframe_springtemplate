package egovframework.example.sample.service.impl;


import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.sample.service.MemberVO;

@Mapper
public interface MemberMapper {
    void insertMember(MemberVO vo);
    MemberVO loginMember(MemberVO vo);
}

