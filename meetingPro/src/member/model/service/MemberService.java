package member.model.service;
import java.sql.Connection;

import member.exception.MemberException;
import member.model.dao.MemberDao;
import member.model.vo.Member;
import static common.JDBCTemplate.*;

public class MemberService {

	public Member loginCheck(String uid, String upwd) throws MemberException {
		Connection con = getConnection();
		Member m = new MemberDao().loginCheck(con, uid, upwd);
		close(con);			
		return m;
	}

	public int deleteMember(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
