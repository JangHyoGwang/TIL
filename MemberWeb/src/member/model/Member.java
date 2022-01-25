package member.model.vo;

import java.sql.Date;
// 서블릿에서 받은 9개의 정보를 하나로 담아서 사용하기 위해서 
// 테이블에서 가져온 데이터를 출력하기 위해서
// 멤버변수는 테이블에서 테이블명을 CamelCase화 해서 만듬.
public class Member {
		private String memberId;
		private String memberPwd;
		private String memberName;
		private int memberAge;
		private String memberEmail;
		private String memberPhone;
		private String memberAddress;
		private String memberGender;
		private String memberHobby;
		private Date memberDate;
		
		public Member() {} // 기본 생성자

		public Member(String memberId, String memberPwd, String memberName, int memberAge, String memberEmail,
				String memberPhone, String memberAddress, String memberGender, String memberHobby) { // 멤버변수 생성자
			super();
			this.memberId = memberId;
			this.memberPwd = memberPwd;
			this.memberName = memberName;
			this.memberAge = memberAge;
			this.memberEmail = memberEmail;
			this.memberPhone = memberPhone;
			this.memberAddress = memberAddress;
			this.memberGender = memberGender;
			this.memberHobby = memberHobby;
		}

		public String getMemberId() {
			return memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getMemberPwd() {
			return memberPwd;
		}

		public void setMemberPwd(String memberPwd) {
			this.memberPwd = memberPwd;
		}

		public String getMemberName() {
			return memberName;
		}

		public void setMemberName(String memberName) {
			this.memberName = memberName;
		}

		public int getMemberAge() {
			return memberAge;
		}

		public void setMemberAge(int memberAge) {
			this.memberAge = memberAge;
		}

		public String getMemberEmail() {
			return memberEmail;
		}

		public void setMemberEmail(String memberEmail) {
			this.memberEmail = memberEmail;
		}

		public String getMemberPhone() {
			return memberPhone;
		}

		public void setMemberPhone(String memberPhone) {
			this.memberPhone = memberPhone;
		}

		public String getMemberAddress() {
			return memberAddress;
		}

		public void setMemberAddress(String memberAddress) {
			this.memberAddress = memberAddress;
		}

		public String getMemberGender() {
			return memberGender;
		}

		public void setMemberGender(String memberGender) {
			this.memberGender = memberGender;
		}

		public String getMemberHobby() {
			return memberHobby;
		}

		public void setMemberHobby(String memberHobby) {
			this.memberHobby = memberHobby;
		}

		public Date getMemberDate() {
			return memberDate;
		}

		public void setMemberDate(Date memberDate) {
			this.memberDate = memberDate;
		}

		@Override
		public String toString() {
			return "Member [아이디=" + memberId + ", 패스워드=" + memberPwd + ", 이름=" + memberName
					+ ", 나이=" + memberAge + ", 이메일=" + memberEmail + ", 전화번호=" + memberPhone
					+ ", 주소=" + memberAddress + ", 성별=" + memberGender + ", 취미="
					+ memberHobby + ", 날짜=" + memberDate + "]";
		}
		
		
		
		
}
