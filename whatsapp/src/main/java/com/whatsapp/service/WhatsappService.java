package com.whatsapp.service;

import java.util.List;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {

	@Override
	public int createProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		int i=wd.createProfileDAO(wu);
		return i;
	}

	@Override
	public WhatsappUser viewProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd=new WhatsappDAO();
		WhatsappUser w1=wd.viewProfileDAO(wu);
		return w1;
	}

	@Override
	public List<WhatsappUser> viewAllProfileService() {
		WhatsappDAOInterface wd=new WhatsappDAO();
		
	List<WhatsappUser> ll=	wd.viewAllProfileDAO();
		return ll;
	}

}








