package com.nisum.lmf.demo.service;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

import com.nisum.lmf.demo.dto.OrderDetailsDto;

@Component
public class MailingService {


	public String sendMail(String userId,int status,double addPrice,String orderNo) {

		final String fromEmail=OrderDetailsDto.FROMEMAILID;
		final String fromPassword=OrderDetailsDto.PASSWORD;

		//Get the session object  
		Properties props = new Properties();  
		props.put("mail.smtp.host", "smtp.gmail.com");  
		props.put("mail.smtp.socketFactory.port", "465");  
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
		props.put("mail.smtp.auth", "true");  
		props.put("mail.smtp.port", "465");  

		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {  
			protected PasswordAuthentication getPasswordAuthentication() {  
				return new PasswordAuthentication(fromEmail,fromPassword);//change accordingly  
			}  
		});  

		//compose message  
		try {  
			MimeMessage message = new MimeMessage(session);  
			message.setFrom(new InternetAddress(fromEmail));//change accordingly  
			message.addRecipient(javax.mail.Message.RecipientType.TO,new InternetAddress(userId));  
			message.setSubject("Hackaton Test Mail");  

			StringBuffer sb=new StringBuffer();
			if(status==2)
				sb.append(this.templateForAcepted(addPrice,orderNo));
			if(status==3)
				sb.append(this.templateForRejected(orderNo))	;

			message.setContent(sb.toString(),"text/html" );  

			//send message  
			Transport.send(message);  

			return "message sent successfully";
		} catch (Exception e) {throw new RuntimeException(e);}  

	}

	
	public StringBuffer templateForAcepted(double addPrice,String OrderNo) throws Exception{
		StringBuffer sb=new StringBuffer();
		try {
			sb.append("<html>");
			sb.append("<script src='https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js'></script>");
			sb.append("<table cellspacing='1' cellpadding='1' border='1'>");
			sb.append("<tbody > ");
			sb.append("<tr>");
			sb.append("<td colspan='1'><span  ng-init=myVar = '/resources/images/Accepted.png'>");
			//sb.append("<img style='height: 300px;width: 300px' ng-src='{{myVar}}'>test</span> ");
			sb.append("<span style='text-align: left; color: #000000; font-family: 'Arial', sans-serif; font-size: 10pt; font-weight: bold'> Hello Harish</span><br>");

			sb.append("<span style='text-align: left; margin-top: 0px; margin-bottom: 0px; color: #000000; font-family: 'Arial', sans-serif; font-weight: normal;font-size: 9pt;");

			sb.append(">Your Order "+OrderNo+"is Accepted. Please find additional charges below.</span><br>");

			sb.append("</td>");

			sb.append("</tr>");
			sb.append("<tr>");
			sb.append("<td valign='top' style='padding-left: 0px; padding-top: 8px; padding-bottom: 0px; padding-right: 0px;'>");
			sb.append("<span style='color: #8A8A8A; font-family: 'Calibri', sans-serif; font-size: 8pt; font-weight: regular;'>");
			sb.append("<b>Total Price Detals are: "+addPrice+"</b> </span>");
			sb.append("</td>");
			sb.append("</tr>");
			sb.append("<tr>");
			sb.append("<td valign='top' style='padding-left: 0px; padding-top: 8px; padding-bottom: 0px; padding-right: 0px;'>");
			sb.append("<span style='color: #8A8A8A; font-family: 'Calibri', sans-serif; font-size: 8pt; font-weight: regular;'>");
			sb.append("<b>your can checkout this order <a href='http://localhost:8080/orderCheckout'>Checkout</a></b> </span>");
			sb.append("</td>");
			sb.append("</tr>");
			sb.append("<tr>");
			sb.append("<td valign='top' style='padding-left: 0px; padding-top: 8px; padding-bottom: 0px; padding-right: 0px;'>");
			sb.append("<span style='color: #8A8A8A; font-family: 'Calibri', sans-serif; font-size: 8pt; font-weight: regular;'>");
			sb.append("<b>Confidentiality Note: </b> This email may contain confidential and/or private information. If you received this email in error please delete and notify sender.</span>");
			sb.append("</td>");
			sb.append("</tr>");
			sb.append("</tbody>");
			sb.append("</table>");
			sb.append("</body>");
			sb.append("</html>");
		}catch (Exception e) {
			throw e;
		}
		return sb;
	}

	
	
	

	public StringBuffer templateForRejected(String orderNO) throws Exception{
		StringBuffer sb=new StringBuffer();
		try {
			sb.append("<html>");
			sb.append("<table cellspacing='1' cellpadding='1' border='1'>");
			sb.append("<tbody > ");
			sb.append("<tr>");
			sb.append("<td colspan='1'><span  ng-init=myVar = '/resources/images/Accepted.png'>");
			sb.append("<img style='height: 300px;width: 300px' ng-src='{{myVar}}'>test</span> ");
			sb.append("<span style='text-align: left; color: #000000; font-family: 'Arial', sans-serif; font-size: 10pt; font-weight: bold'> Hello $user</span><br>");

			sb.append("<span style='text-align: left; margin-top: 0px; margin-bottom: 0px; color: #000000; font-family: 'Arial', sans-serif; font-weight: normal;font-size: 9pt;");

			sb.append(">We are unable to process Your Order "+orderNO+". </span><br>");

			sb.append("</td><tr>");

			sb.append("<tr>");
			sb.append("<td valign='top' style='padding-left: 0px; padding-top: 8px; padding-bottom: 0px; padding-right: 0px;'>");
			sb.append("<span style='color: #8A8A8A; font-family: 'Calibri', sans-serif; font-size: 8pt; font-weight: regular;'>");
			sb.append("<b>Confidentiality Note: </b> This email may contain confidential and/or private information. If you received this email in error please delete and notify sender.</span>");
			sb.append("</td>");
			sb.append("</tr>");
			sb.append("</tbody>");
			sb.append("</table>");
			sb.append("</body>");
			sb.append("</html>");
		}catch (Exception e) {
			throw e;
		}
		return sb;
	}
}
