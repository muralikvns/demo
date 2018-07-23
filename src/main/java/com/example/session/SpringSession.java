package com.example.session;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.Session;
import org.springframework.session.SessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

@EnableSpringHttpSession
@Configuration
public class SpringSession implements SessionRepository{

	@Override
	public Session createSession() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Session getSession(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Session arg0) {
		// TODO Auto-generated method stub
		
	}
}