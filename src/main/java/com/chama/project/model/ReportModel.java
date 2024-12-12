package com.chama.project.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="reports", schema="chama")
@Getter
@Setter
@AllArgsConstructor
public class ReportModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String description;
	private boolean isFire;
	private boolean status;
	@Lob
	private byte[] img;
	@Lob
	private String base64Image;
	private Long userId;

	public ReportModel() {
		this.isFire = false;
		this.status = true;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "addressId")
	@JsonManagedReference
	private ReportAddressModel address;

}
