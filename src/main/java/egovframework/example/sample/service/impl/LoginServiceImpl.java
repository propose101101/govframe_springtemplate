package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.LoginService;
import egovframework.example.sample.service.MemberVO;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	@Resource(name="memberMapper")
	private MemberMapper memberMapper ; 
	
    public MemberVO loginMember(MemberVO vo) throws Exception {
        return memberMapper.loginMember(vo);
    }

}
