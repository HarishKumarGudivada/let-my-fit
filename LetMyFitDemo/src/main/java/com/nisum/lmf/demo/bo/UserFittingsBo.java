package com.nisum.lmf.demo.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ms_userfittingdetails")
public class UserFittingsBo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int catid;
	private int fittingid;
	private String userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public int getFittingid() {
		return fittingid;
	}

	public void setFittingid(int fittingid) {
		this.fittingid = fittingid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + catid;
		result = prime * result + fittingid;
		result = prime * result + id;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserFittingsBo other = (UserFittingsBo) obj;
		if (catid != other.catid)
			return false;
		if (fittingid != other.fittingid)
			return false;
		if (id != other.id)
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserFittingsBo [id=" + id + ", catid=" + catid + ", fittingid=" + fittingid + ", userid=" + userid
				+ "]";
	}


}
