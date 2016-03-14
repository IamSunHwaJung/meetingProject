package party.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.commit;
import static common.JDBCTemplate.getConnection;
import static common.JDBCTemplate.rollback;

import java.sql.Connection;


import party.exception.PartyException;
import party.model.dao.PartyDao;
import party.model.vo.Party;

public class PartyService {

	public Party selectParty(int partyno)throws PartyException {
		Connection con = getConnection();
		Party p = new PartyDao().selectParty(con, partyno);
		close(con);
		return p;
	}

	
}