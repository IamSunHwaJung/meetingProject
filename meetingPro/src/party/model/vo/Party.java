package party.model.vo;

import java.sql.Date;

//모임 정보 테이블
public class Party {

//  모임번호
private int partyno;

//  모임제목
private String partytitle;

//  모임설명
private String partycontent;

//  모임지 주소
private String partyaddress;

//  모임설명사진
private String photos;

//  참가제한 나이
private int limitage;

//  남 제한인원
private int limitmale;

//  여 제한인원
private int limitfemale;

//  남자 참가비
private int malefee;

//  여자 참가비
private int femalefee;

//  마감일자
private Date limitdate;

public Party(int partyno, String partytitle, String partycontent, String partyaddress, String photos, int limitage,
		int limitmale, int limitfemale, int malefee, int femalefee, Date limitdate) {
	super();
	this.partyno = partyno;
	this.partytitle = partytitle;
	this.partycontent = partycontent;
	this.partyaddress = partyaddress;
	this.photos = photos;
	this.limitage = limitage;
	this.limitmale = limitmale;
	this.limitfemale = limitfemale;
	this.malefee = malefee;
	this.femalefee = femalefee;
	this.limitdate = limitdate;
}

public int getPartyno() {
	return partyno;
}

public void setPartyno(int partyno) {
	this.partyno = partyno;
}

public String getPartytitle() {
	return partytitle;
}

public void setPartytitle(String partytitle) {
	this.partytitle = partytitle;
}

public String getPartycontent() {
	return partycontent;
}

public void setPartycontent(String partycontent) {
	this.partycontent = partycontent;
}

public String getPartyaddress() {
	return partyaddress;
}

public void setPartyaddress(String partyaddress) {
	this.partyaddress = partyaddress;
}

public String getPhotos() {
	return photos;
}

public void setPhotos(String photos) {
	this.photos = photos;
}

public int getLimitage() {
	return limitage;
}

public void setLimitage(int limitage) {
	this.limitage = limitage;
}

public int getLimitmale() {
	return limitmale;
}

public void setLimitmale(int limitmale) {
	this.limitmale = limitmale;
}

public int getLimitfemale() {
	return limitfemale;
}

public void setLimitfemale(int limitfemale) {
	this.limitfemale = limitfemale;
}

public int getMalefee() {
	return malefee;
}

public void setMalefee(int malefee) {
	this.malefee = malefee;
}

public int getFemalefee() {
	return femalefee;
}

public void setFemalefee(int femalefee) {
	this.femalefee = femalefee;
}

public Date getLimitdate() {
	return limitdate;
}

public void setLimitdate(Date limitdate) {
	this.limitdate = limitdate;
}


}