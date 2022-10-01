package com.cdac.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cdac.pojo.Member;


@Repository
public interface MemberRepo extends JpaRepository<Member,Integer> {
	
	@Query("SELECT m FROM Member m WHERE m.email = ?1")
    public Member findByEmail(String email);

	public Member findByEmailAndPassword(String email, String password);
	
	
	
	

}