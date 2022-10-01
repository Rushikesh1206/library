package com.cdac.Controller;

import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cdac.pojo.Member;
import com.cdac.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/")
	public String home(Model mem)
	{
		
		
		List<Member> m=service.getAllmember();
		mem.addAttribute("member");
		return "Basic/index";
	}
	
	
	
	@GetMapping("/addmember")
	public String addmemberForm()
	{
		
		return "Basic/add_member";
	}
	
	@PostMapping("/register")
	public String membRegister(@ModelAttribute Member m,HttpSession session) {
		
		System.out.println(m);
		service.addMember(m);
		session.setAttribute("msg", "New Member Added Successfully");
		return "redirect:/";
	}
	
	
	@GetMapping("/Memberlogin")
	
	  public ModelAndView login()
	{ 
		ModelAndView mem=new ModelAndView("Memberlogin");
		mem.addObject("member",new Member());
	  
		return mem; 
	}
	
	
	
	@PostMapping("/Memberlogin")
	public String login(@ModelAttribute("member") Member  member)
	{
		Member mem=service.login(member.getEmail(),member.getPassword());
		System.out.print(mem);

		if(Objects.nonNull(mem))
		{
			return "redirect:/";
		}
		else 
		{	  
			return "redirect:/Memberlogin";
			
		}
		
	}
	
}
