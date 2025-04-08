package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "sample/login.do";
    }
    
    
    
    
    
}