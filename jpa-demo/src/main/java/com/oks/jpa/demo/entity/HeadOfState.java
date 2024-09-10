package com.oks.jpa.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="HEAD_OF_STATE")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class HeadOfState {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "HEAD_OF_STATE_SEQ")
	@SequenceGenerator(name="HEAD_OF_STATE_SEQ",initialValue = 1,allocationSize = 1,sequenceName = "HEAD_OF_STATE_SEQ")
	private Long id;
	@Column(name="NAME")
	private String name;
	@Column(name="TITLE")
	private String title;
}
