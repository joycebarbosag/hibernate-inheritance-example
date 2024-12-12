package com.chama.project.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_address", schema = "chama")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserAddressModel extends AddressModel{

	@OneToOne(mappedBy = "address")
	@JsonBackReference
	private UserModel userModel;

}
