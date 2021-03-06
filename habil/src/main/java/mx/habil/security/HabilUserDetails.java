package mx.habil.security;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@AllArgsConstructor
@Data public class HabilUserDetails implements UserDetails{
	private static final long serialVersionUID = 20141104001L;
	
	private String username;
	private String password;
	private String commonName;
	private Collection<GrantedAuthority> authorities;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
