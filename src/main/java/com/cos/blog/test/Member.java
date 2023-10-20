package com.cos.blog.test;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
@Data // @Getter + @Setter
//@AllArgsConstructor //생성자
@NoArgsConstructor //빈 생성자
public class Member {
	private int id; //data의 불변성을 유지하기 위해서 final 을 써준다. 
	private String username;
	private  String password;
	private  String email;
	
	@Builder
	//생성자
	public Member(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}	
	
	
}
