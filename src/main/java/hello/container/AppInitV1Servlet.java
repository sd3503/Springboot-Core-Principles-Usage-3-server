package hello.container;

import hello.servlet.helloServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class AppInitV1Servlet implements AppInit{
    @Override
    public void onStartUp(ServletContext servletContext) {
        System.out.println("AppInitV1Servlet.onStartUp");

        ServletRegistration.Dynamic helloServlet =
                servletContext.addServlet("helloServlet", new helloServlet());
        helloServlet.addMapping("/hello-servlet");

    }
}
