package com.cos.blog.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//ORM -> Java(다른언어) Object -> 테이블로 매핑해주는 기술
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //빌더 패턴!!
@Entity //User 클래스가 MySQL에 테이블이 생성이 된다. 
public class User {

	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 DB의 넘버링 전략을 따라간다. 
	private int id; //시퀀스(oracle) ,  auto_increment(mysql)
	
	@Column(nullable = false, length = 30) //username이 null 이될수 없게, 길이는 20자 이내
	private String username; //아이디
	
	@Column(nullable = false, length = 100) //123456 =>해쉬(비밀번호 암호화)
	private String password;  
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role;  //Enum을 사용(도메인을 설정할 수있다.즉, 어떤 범위가 정해져있다.)  //admin, user, manager 
	
	@CreatedDate//시간이 자동으로 입력 
	private Timestamp createDate;
	
}
