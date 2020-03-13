package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import persistence.MemberDAO;
import persistence.MemberDAOImpl;
import persistence.MemberDTO;

public class MemberServiceImpl implements MemberService {

	private static Logger log = LoggerFactory.getLogger(MemberServiceImpl.class);
	MemberDAO mdao;
	public MemberServiceImpl() {
		mdao = new MemberDAOImpl();
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String email =request.getParameter("email");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		MemberDTO mdto = new MemberDTO(email, password, nickname);
	}
	
	@Override
	public boolean regist(MemberDTO mdto) {
		boolean flag = mdao.insert(mdto);
		
		if(flag) return true; else return false;
	}

}
