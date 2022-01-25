package notice.model.vo;

import java.util.ArrayList;

public class PageData { // 리턴 값 noitceList, pageNavi 값을 객체에 담아서 넘기기 위한 클래스 
	
	private ArrayList<Notice> noticeList;
	private String pageNavi;
	
	public PageData() {} // 기본 생성자
	
	public ArrayList<Notice> getNoticeList() {
		return noticeList;
	}
	public void setNoticeList(ArrayList<Notice> noticeList) {
		this.noticeList = noticeList;
	}
	public String getPageNavi() {
		return pageNavi;
	}
	public void setPageNavi(String pageNavi) {
		this.pageNavi = pageNavi;
	}
	
	
}
