package party.model.dao;

import static common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import party.exception.PartyException;
import party.model.vo.Party;

public class PartyDao {




	public Party selectParty(Connection con, int partyno) throws PartyException {
		Party p = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String query = "select *from party where partyno = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, partyno);
			
			rset = pstmt.executeQuery();
			if (rset.next()) {
				p = new Party(
						rset.getInt("partyno"),
						rset.getString("partytitle"),
						rset.getString("partycontent"),
						rset.getString("partyaddress"),
						rset.getString("photos"),
						rset.getInt("limitage"),
						rset.getInt("limitmale"),
						rset.getInt("limitfemale"),
						rset.getInt("malefee"),
						rset.getInt("femalefee"),
						rset.getDate("limitDate"));
			} else
				throw new PartyException(partyno + "번글 상세조회에 문제가 발생하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new PartyException(e.getMessage());
		} finally {
			close(rset);
			close(pstmt);
		}

		
		return p;
	}
	
	


}
