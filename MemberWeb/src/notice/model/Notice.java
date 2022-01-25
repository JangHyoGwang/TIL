package notice.model.vo;

import java.sql.Date;

public class Notice {
	// 제목, 내용, 작성자, 작성일
	private int noticeNo;
	private String noticeSubject;
	private String noticeContents;
	private String noticeUserId;
	private Date noticeDate;
	
	public  Notice() {} // 기본 생성자

	public int getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}

	public String getNoticeSubject() {
		return noticeSubject;
	}

	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}

	public String getNoticeContents() {
		return noticeContents;
	}

	public void setNoticeContents(String noticeContents) {
		this.noticeContents = noticeContents;
	}

	public String getNoticeUserId() {
		return noticeUserId;
	}

	public void setNoticeUserId(String noticeUserId) {
		this.noticeUserId = noticeUserId;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	@Override
	public String toString() {
		return "Notice [작성번호=" + noticeNo + ", 제목=" + noticeSubject + ", 내용="
				+ noticeContents + ", 작성자=" + noticeUserId + ", 작성일=" + noticeDate + "]";
	}
	
	
	
}
