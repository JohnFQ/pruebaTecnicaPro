package co.com.proteccion.pruebaTecnica.PruebaTecnica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class enviarCorreoService implements IenviarCorreoService{
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void enviarCorreo() {
		
		SimpleMailMessage mailMessagePost = new SimpleMailMessage();
		
		mailMessagePost.setFrom("jhonfredyquiceno46@gmail.com");
		mailMessagePost.setTo("john_quiceno23191@elpoli.edu.co");
		mailMessagePost.setSubject("TestEmail desde SpringBoot");
		mailMessagePost.setText("Esto es una prueba de como se envian correos desde sring");
		
		javaMailSender.send(mailMessagePost);
		
	}
	
}
