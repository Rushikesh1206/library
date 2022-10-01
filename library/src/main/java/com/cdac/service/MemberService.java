
package com.cdac.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.pojo.Member;
import com.cdac.repository.MemberRepo;
@Service
public class MemberService {
	
	@Autowired
	private MemberRepo repo;
	
	public void addMember(Member m)
	{
		repo.save(m);
	}

	public List<Member> getAllmember() {
		return repo.findAll();
	}
	public Member login(String email,String password) {
		
		Member member=repo.findByEmailAndPassword(email,password);
		return member;
	}
	
	
	

}