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
@Table(name="COUNTRY")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Country {
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "COUNTRY_SEQ")
	@SequenceGenerator(name="COUNTRY_SEQ",initialValue = 1,allocationSize = 1,sequenceName = "EMP_SEQ")
	private Long id;
	@Column(name="NAME")
	private Long name;
}
