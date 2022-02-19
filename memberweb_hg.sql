CREATE TABLE MEMBER_TBL_HG (
    MEMBER_ID VARCHAR2(20) PRIMARY KEY,
    MEMBER_PWD VARCHAR2(50) NOT NULL,
    MEMBER_NAME VARCHAR2(20) NOT NULL,
    MEMBER_AGE NUMBER,
    MEMBER_EMAIL VARCHAR2(100),
    MEMBER_PHONE VARCHAR2(11),
    MEMBER_ADDRESS VARCHAR2(500),
    MEMBER_GENDER VARCHAR2(6),
    MEMBER_HOBBY VARCHAR2(300),
    MEMBER_DATE DATE DEFAULT SYSDATE
);
DROP TABLE MEMBER_TBL;


SELECT * FROM MEMBER_TBL;

CREATE TABLE NOTICE_TBL (
    NOTICE_NO NUMBER PRIMARY KEY,
    NOTICE_SUBJECT VARCHAR2(300) NOT NULL,
    NOTICE_CONTENTS VARCHAR2(2000) NOT NULL,
    NOTICE_USERID VARCHAR2(30) NOT NULL,
    NOTICE_DATE DATE DEFAULT SYSDATE
);

CREATE SEQUENCE SEQ_NOTICE_NO;

SELECT ROWNUM, NOTICE_TBL. * FROM NOTICE_TBL; --ROWNUM은 행 번호를 생성. (정렬안하고)

-- 정렬하고 번호를 생성 
-- SELECT를 하면서 넘버링을 하기 때문에 WHERE 조건절 적용이 불가능함.- > SELECT 추가 및 괄호로 묶어서 사용해야 한다.(선택적으로 가져올 수 있게 된다.)
SELECT *
FROM (SELECT ROW_NUMBER() OVER(ORDER BY NOTICE_NO DESC) AS NUM, NOTICE_TBL. * FROM NOTICE_TBL) WHERE NUM BETWEEN ? AND ?;
-- ROW_NUMBER()를 통해서 SELECT한 결과값에 넘버링을 하게 되는데
-- 이때 WHERE 조건절을 쓰게되면 오류가 발생함
-- 그래서 ROW_NUMBER()를 한 결과값은 테이블로 보고 다시 SELECT를 한 후에
-- WHERE 조건절을 쓰면 쿼리가 가능합니다.


SELECT COUNT(*) "TOTALCOUNT" FROM NOTICE_TBL; -- 전체 게시물 개수를 구하는 쿼리문 









