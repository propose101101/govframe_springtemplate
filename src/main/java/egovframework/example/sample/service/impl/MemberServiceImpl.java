package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Resource(name="memberMapper")
    private MemberMapper memberMapper;

    public void registerMember(MemberVO vo) throws Exception {
        // 여기서 암호화나 유효성 체크 가능
        memberMapper.insertMember(vo);
    }
}
