package com.nisum.lmf.demo.dto;

public class CustomFittingsDto {
	private int chest;
	private int	waist;
	private int hip;
	private int	hipWaist;
	private int	leineNeck;
	private int armLength;
	private int	chestToWaist;
	private int	bust;
	private int	belowBust;
	private int	aboveBust;
	private int waistToDesiredLength;
	public int getChest() {
		return chest;
	}
	public void setChest(int chest) {
		this.chest = chest;
	}
	public int getWaist() {
		return waist;
	}
	public void setWaist(int waist) {
		this.waist = waist;
	}
	public int getHip() {
		return hip;
	}
	public void setHip(int hip) {
		this.hip = hip;
	}
	public int getHipWaist() {
		return hipWaist;
	}
	public void setHipWaist(int hipWaist) {
		this.hipWaist = hipWaist;
	}
	public int getLeineNeck() {
		return leineNeck;
	}
	public void setLeineNeck(int leineNeck) {
		this.leineNeck = leineNeck;
	}
	public int getArmLength() {
		return armLength;
	}
	public void setArmLength(int armLength) {
		this.armLength = armLength;
	}
	public int getChestToWaist() {
		return chestToWaist;
	}
	public void setChestToWaist(int chestToWaist) {
		this.chestToWaist = chestToWaist;
	}
	public int getBust() {
		return bust;
	}
	public void setBust(int bust) {
		this.bust = bust;
	}
	public int getBelowBust() {
		return belowBust;
	}
	public void setBelowBust(int belowBust) {
		this.belowBust = belowBust;
	}
	public int getAboveBust() {
		return aboveBust;
	}
	public void setAboveBust(int aboveBust) {
		this.aboveBust = aboveBust;
	}
	public int getWaistToDesiredLength() {
		return waistToDesiredLength;
	}
	public void setWaistToDesiredLength(int waistToDesiredLength) {
		this.waistToDesiredLength = waistToDesiredLength;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aboveBust;
		result = prime * result + armLength;
		result = prime * result + belowBust;
		result = prime * result + bust;
		result = prime * result + chest;
		result = prime * result + chestToWaist;
		result = prime * result + hip;
		result = prime * result + hipWaist;
		result = prime * result + leineNeck;
		result = prime * result + waist;
		result = prime * result + waistToDesiredLength;
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
		CustomFittingsDto other = (CustomFittingsDto) obj;
		if (aboveBust != other.aboveBust)
			return false;
		if (armLength != other.armLength)
			return false;
		if (belowBust != other.belowBust)
			return false;
		if (bust != other.bust)
			return false;
		if (chest != other.chest)
			return false;
		if (chestToWaist != other.chestToWaist)
			return false;
		if (hip != other.hip)
			return false;
		if (hipWaist != other.hipWaist)
			return false;
		if (leineNeck != other.leineNeck)
			return false;
		if (waist != other.waist)
			return false;
		if (waistToDesiredLength != other.waistToDesiredLength)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomFittingsDto [chest=" + chest + ", waist=" + waist + ", hip=" + hip + ", hipWaist=" + hipWaist
				+ ", leineNeck=" + leineNeck + ", armLength=" + armLength + ", chestToWaist=" + chestToWaist + ", bust="
				+ bust + ", belowBust=" + belowBust + ", aboveBust=" + aboveBust + ", waistToDesiredLength="
				+ waistToDesiredLength + "]";
	}

	
	

}
