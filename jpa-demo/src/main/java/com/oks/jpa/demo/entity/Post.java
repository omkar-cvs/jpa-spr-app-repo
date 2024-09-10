package com.oks.jpa.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="POST")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "POST_SEQ")
	@SequenceGenerator(name = "POST_SEQ",initialValue = 1,allocationSize = 1,sequenceName = "POST_SEQ")
	@Column(name="POST_ID")
	Long id;	
	@Column(name="TITLE")
	private String title;
	@Column(name="CONTENTS")
	private String contents;
	
	 public Post(String title, String contents, User user) {
	        this.title = title;
	        this.contents = contents;
	        this.user = user;
	    } 
	 public Post(String title, String contents) {
	        this.title = title;
	        this.contents = contents;
	      
	    } 
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="USER_ID")
	User user;
    
}
