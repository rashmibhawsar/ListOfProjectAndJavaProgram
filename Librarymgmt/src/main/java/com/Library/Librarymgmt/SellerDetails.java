package com.Library.Librarymgmt;


import java.util.Set;



//import javax.annotation.Generated;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name="sellerdetailTABLE")
public class SellerDetails {
    @Id
 
	int sid;

	@Column(name="companyname") 
	String companyname;
    @Column(name="address")
	String address;
    @Column(name="mobile")//-- here u van give col name for table.. it will take only given @column  in mysql- not neccessary to write->
	int mobile;
    @OneToMany(mappedBy="sd" ,fetch = FetchType.EAGER)
    @Cascade(value = { CascadeType.DELETE, CascadeType.SAVE_UPDATE })
  // @CascadeOnDelete
    Set<Customer> cutm;
    public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Set<Customer> getCutm() {
		return cutm;
	}
	public void setCutm(Set<Customer> cutm) {
		this.cutm = cutm;
	}

	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobile() {

		return mobile;
	}
	public void setMobile(int mobile) {

		this.mobile = mobile;
	}
	
}
