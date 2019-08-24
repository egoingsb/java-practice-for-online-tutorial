import java.io.File;

import org.apache.catalina.Context;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

class WelcomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("HelloWorld");
		pw.close();
	}
}

public class HelloworldWeb {
	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(6789);
		Context appContext = tomcat.addWebapp("", new File("").getAbsolutePath());
		System.out.println("configuring app with basedir: " + new File("").getAbsolutePath());
		Tomcat.addServlet(appContext, "welcome-servlet", new WelcomeServlet());
		appContext.addServletMappingDecoded("/welcome", "welcome-servlet");
		tomcat.start();
		tomcat.getServer().await();
	}
}