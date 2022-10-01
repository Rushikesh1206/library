package com.cdac.Config;
//package com.example.demo.Config;
//
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class CustomUserDetails implements UserDetails {
//	private Userdtls u;
//	
//
//	public CustomUserDetails(Userdtls u) {
//		super();
//		this.u = u;
//	}
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		HashSet<SimpleGrantedAuthority> set=new HashSet<SimpleGrantedAuthority>(); 
//		return true;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return u.getpassword();
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return u.getId();
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return true;
//	}
//	
//
//}
