package com.whatsapp.service;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	int createProfileService(WhatsappUser wu);

	WhatsappUser viewProfileService(WhatsappUser wu);

}
