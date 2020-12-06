package kbwebapp2;

import com.mycompany.kbwebapp2.KBTest.java;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rashad
 */
@WebServlet(urlPatterns = {"/KBServlet"})
public class KBServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public KBServlet() {
        super();
    }
    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println();
        }
    }

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        KBTest.authorJset(request);
        response = KBTest.kbtest(request);
        doGet(request, response);
    }


}
