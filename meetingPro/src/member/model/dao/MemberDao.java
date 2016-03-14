package member.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import member.exception.MemberException;
import member.model.vo.Member;

public class MemberDao {

	public Member loginCheck(Connection con, String userId, String userPwd) throws MemberException {
		Member m = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;

		String query = "select * from user where userid = ? and userpwd = ?";

		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				m = new Member();
				m.setUnum(rset.getInt("usernumber"));
				m.setUid(userId);
				m.setUpwd(userPwd);
				m.setUname(rset.getString("username"));
				m.setUgender(rset.getString("gender"));
				m.setUphone(rset.getString("phone"));
				m.setUemail(rset.getString("email"));
				m.setUbirth(rset.getDate("birth"));
				m.setUaddress(rset.getString("address"));
				m.setUjoindate(rset.getDate("joindate"));
				m.setUlevel(rset.getInt("level"));
				

			} else {
				throw new MemberException("로그인 실패");
			}

		} catch (Exception e) {
			throw new MemberException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}

		return m;
	}
}
