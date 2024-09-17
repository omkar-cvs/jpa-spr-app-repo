package com.oks.jpa.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@EqualsAndHashCode
@Entity
@Table(name="USER_TBL")
public class User {
	 private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USER_SEQ")
	@SequenceGenerator(name = "USER_SEQ",initialValue = 1,allocationSize = 1,sequenceName = "USER_SEQ")
	@Column(name="USER_ID")
	private Long id;
	@Column(name="USER_NAME")
    private String name;	
	@Column(name="MAIL_ID")
	private String mailId;
	@Column(name="PASSWORD")
	private String password;
	
	 public User(String name, String mailId, String password) {
	        this.name = name;
	        this.mailId = mailId;
	        this.password = password;
	    } 
	 
	 public User(String name, String mailId, String password, List<Post> posts) {
	        this.name = name;
	        this.mailId = mailId;
	        this.password = password;
	        this.posts = posts;
	    }
	 
     @OneToMany(mappedBy = "user",cascade = {CascadeType.ALL},fetch = FetchType.LAZY, orphanRemoval = true)   
     @JsonIgnore
     //@JsonManagedReference //not working
	 List<Post> posts;
}


