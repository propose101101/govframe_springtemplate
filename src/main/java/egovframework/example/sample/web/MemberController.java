package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.example.sample.service.LoginService;
import egovframework.example.sample.service.MemberService;
import egovframework.example.sample.service.MemberVO;

@Controller
public class MemberController {
	
    @Resource(name="memberService")
    private MemberService memberService;

    @RequestMapping(value="/join.do", method=RequestMethod.GET)
    public String joinForm() {
        return "sample/join";
    }

    @RequestMapping(value="/join.do", method=RequestMethod.POST)
    public String joinSubmit(@ModelAttribute("memberVO") MemberVO vo) throws Exception {
        memberService.registerMember(vo);
        return "redirect:/login.do";
    }
    
    
    
    @RequestMapping(value="/login.do", method=RequestMethod.GET)
    public String loginForm() {
        return "sample/login";
    }
    
    
    @Resource(name="loginService")
    private LoginService loginService;
    @RequestMapping(value="/login.do", method=RequestMethod.POST)
    public String loginSubmit(@ModelAttribute("memberVO") MemberVO vo) throws Exception {
        MemberVO result = loginService.loginMember(vo);
        if (result != null) {
            // 로그인 성공 처리 (세션 설정 등)
            return "redirect:/main.do"; // 성공 시 이동할 페이지
        } else {
            // 로그인 실패 처리
            return "sample/login"; // 다시 로그인 페이지로
        }
    }
    
    
}