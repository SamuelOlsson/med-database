package com.claim.MedicalDatabase.Utils;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.claim.MedicalDatabase.model.Users;
import com.claim.MedicalDatabase.repository.PatientRepository;


@Component
public class EmailSender {
	
	private JavaMailSender emailSender;
	
	private PatientRepository patientRepository;
	
	@Autowired
	public EmailSender(JavaMailSender emailSender) {
		super();
		this.emailSender = emailSender;
	}
	
	public void sendMail(String to, String msg, String subject) {
		
		
		MimeMessage message = emailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		try {
			message.setFrom("BonesawCCR@gmail.com");
			helper.setTo(to);
			helper.setText(msg);
			helper.setSubject(subject);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
		emailSender.send(message);
	}
	
	
	
	
	@ModelAttribute("user")
	Users user() {
		return new Users();
	}
}
