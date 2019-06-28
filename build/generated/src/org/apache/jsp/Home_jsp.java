package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import Backend.ServletControl.ProyectosControl;
import Entidades.Proyectos.Proyecto;
import java.util.ArrayList;
import Backend.Conexion;
import Backend.Conexion;
import Entidades.Users.Usuario;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\" />\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"Assets/img/favicon.ico\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("\t<title>Vista General</title>\n");
      out.write("\n");
      out.write("\t<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("     <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"Assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"Assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"Assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("    <script src=\"Assets/js/anime.min.js\"></script>\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"Assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("    a{\n");
      out.write("        color:#29B0C3;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("<body>\n");

try{
HttpSession sesionOk = request.getSession();
Usuario u = (Usuario)sesionOk.getAttribute("user");
    int v = 1;
   try{
        v = Integer.parseInt(request.getParameter("v"));
   }catch(NumberFormatException ne){
       v=1;
   }
   
    
    if (u.getRol()!=2 && v != 0) {
            response.sendRedirect("Home.jsp?v=0");
        }else if (u.getRol()==2&& v != 0) {
            response.sendRedirect("dashboard.jsp?v=0");
        }
    ArrayList<Proyecto> p = Conexion.getProyectos();  

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"wrapper\" >\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"font-icon-list col-lg-2 col-md-3 col-sm-4 col-xs-6 col-xs-6\" style=\"transform: translate(80vw,90vh); z-index: 1; position: fixed\">\n");
      out.write("        <button class=\"btn btn-neutral\">\n");
      out.write("            Ayuda\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"\" style=\"z-index:0;\">\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a href=\"index.html\" style=\"color: #29B0C3\"><h4><img style=\"width:30px;\" src=\"Assets/Bacteri-icon.png\">MICROUNIVERSE</h4></a>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"user.jsp\">\n");
      out.write("                               <p><h6>Usuario: ");
out.print(u.getNombre());
      out.write("</h6></p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                     \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"LogOff\">\n");
      out.write("                                <p>Cerrar Sesion</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                        <h3>Vista General</h3>\n");
      out.write("                        <div class=\"alert alert-success\" id=\"step1\">\n");
      out.write("                            <p>Esta es la ventana principal</p>\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"user.jsp\"><div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                    <div class=\"alert alert-success\" id=\"step2\">\n");
      out.write("                                        <p>Esta es la ventana principal</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                     <h4 class=\"center-block\">Datos de la cuenta</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content center-block\" style=\"width: 70%\" >\n");
      out.write("                                <img src=\"imagenes/usuario.png\" class=\"img-responsive img-circle\">\n");
      out.write("                            </div>\n");
      out.write("                        </div></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"Proyectos.jsp\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <div class=\"alert alert-success\" id=\"step3\">\n");
      out.write("                                    <p>Esta es la ventana principal</p>\n");
      out.write("                                </div>\n");
      out.write("                                 <h4>Proyectos</h4>\n");
      out.write("                                 \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content center-block\" style=\"width: 70%\">\n");
      out.write("                                <img src=\"imagenes/porta.png\" class=\"img-responsive img-circle\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <a href=\"tool.jsp\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <div id=\"step4\" class=\"alert alert-success\">\n");
      out.write("                                    <p>Esta es la ventana principal</p>\n");
      out.write("                                </div>\n");
      out.write("                                 <h4>Herramientas</h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content center-block\" style=\"width: 70%\">\n");
      out.write("                                <img src=\"imagenes/instrumentos.png\" class=\"img-responsive img-circle\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"card\" style=\"padding: 30px;\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h4 class=\"title\">Proyectos</h4>\n");
      out.write("                                <p class=\"category\">Y dias de investigacion</p>\n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"content\">     \n");
      out.write("                            ");

                                        
                                int contador = 0;
                                if (p.size()>0) {
                                    
      out.write("\n");
      out.write("                                    <div id=\"pry\" class=\"center-block\" style=\"width: 90%;margin-top: 30px;\"></div>\n");
      out.write("                                    <script type=\"text/javascript\">\n");
      out.write("                                            google.charts.load('current', {'packages':['bar']});\n");
      out.write("                                            google.charts.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("                                            function drawChart() {\n");
      out.write("                                              var data = google.visualization.arrayToDataTable([\n");
      out.write("                                                  [\"Proyecto\", \"Duracion\"],\n");
      out.write("                                                  \n");
      out.write("                                    ");
for (Proyecto pT : p) {
                                        if (pT.getId_usr()==((Usuario)sesionOk.getAttribute("user")).getId()) {
                                            out.print("['"+pT.getNombre()+"', "+ProyectosControl.RestarFechas(pT.getFechaDeInicio())+"],");
                                        
      out.write("\n");
      out.write("                                        ");

                                            }
                                        }
                                        
      out.write("\n");
      out.write("                                              ]);\n");
      out.write("\n");
      out.write("                                            var options = {\n");
      out.write("                                                \n");
      out.write("                                              axes: {\n");
      out.write("                                                x: {\n");
      out.write("                                                  0: { side: 'bottom', label: 'Duracion'} // Top x-axis.\n");
      out.write("                                                }\n");
      out.write("                                              },\n");
      out.write("                                              chart: {\n");
      out.write("                                                title: 'Proyectos',\n");
      out.write("                                                subtitle: 'Duración',\n");
      out.write("                                              },\n");
      out.write("                                              bars: 'horizontal' // Required for Material Bar Charts.\n");
      out.write("                                            };\n");
      out.write("\n");
      out.write("                                            var chart = new google.charts.Bar(document.getElementById('pry'));\n");
      out.write("\n");
      out.write("                                            chart.draw(data, google.charts.Bar.convertOptions(options));\n");
      out.write("                                          }\n");
      out.write("                                    </script>\n");
      out.write("                                      ");

                                        }else{
                                        
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <h6>Aun no has creado ningun proyecto</h6>\n");
      out.write("                                        \n");
      out.write("                                        ");
     
                                        }
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"header\">\n");
      out.write("                                <h4 class=\"title\">Bacterias</h4>\n");
      out.write("                                <p class=\"category\">Y reparticion de proyectos</p>\n");
      out.write("                            </div>  \n");
      out.write("                            ");

                                        
                                contador = 0;
                                if (p.size()>0) {
                                    
      out.write("\n");
      out.write("                                    <div id=\"pry1\" class=\"center-block\" style=\"width: 90%;margin-top: 30px;\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <script type=\"text/javascript\">\n");
      out.write("                                            google.charts.load('current', {'packages':['corechart']});\n");
      out.write("                                            google.charts.setOnLoadCallback(drawChart);\n");
      out.write("\n");
      out.write("                                            function drawChart() {\n");
      out.write("\n");
      out.write("                                              var data = google.visualization.arrayToDataTable([\n");
      out.write("                                                ['Bacteria', 'Proyectos'],\n");
      out.write("                                                ");

                                                try{
                                                      Connection c = Conexion.getConecction();
                                                      String q = "Select * from cbacteria;";
                                                       PreparedStatement set = c.prepareStatement(q);
                                                       ResultSet rs = set.executeQuery();

                                                       while(rs.next()){
                                                           contador = 0;
                                                           for(Proyecto pT:p){
                                                                if(rs.getInt(1)==pT.getBacteria()&&pT.getId_usr()==u.getId()){
                                                                    contador++;
                                                                }
                                                           }
                                                           out.print("['"+rs.getString(2)+"', "+contador+"],");
                                                       }

                                                       c.close();
                                                   }catch(Exception er){
                                                       System.out.println("no se conecto a la tabla");
                                                       System.out.println(er.getMessage());
                                                       System.out.println(er.getStackTrace());
                                                   }
                                                
      out.write("\n");
      out.write("                                                \n");
      out.write("                                              ]);\n");
      out.write("\n");
      out.write("                                              var options = {\n");
      out.write("                                                height:400,\n");
      out.write("                                                title: ''\n");
      out.write("                                              };\n");
      out.write("\n");
      out.write("                                              var chart = new google.visualization.PieChart(document.getElementById('pry1'));\n");
      out.write("\n");
      out.write("                                              chart.draw(data, options);\n");
      out.write("                                            }\n");
      out.write("                                          </script>\n");
      out.write("                                      ");

                                        }else{
                                        
      out.write("\n");
      out.write("                                        <h6>Aun no has creado ningun proyecto</h6>\n");
      out.write("                                        \n");
      out.write("                                        ");
     
                                        }
                                    
      out.write("\n");
      out.write("                                     \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");

}catch(NullPointerException ne){
    response.sendRedirect("Login.jsp?error=1&text=Tu sesion ha caducado");
}
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"footer\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                \n");
      out.write("                <p class=\"copyright pull-right\">\n");
      out.write("                    &copy; <script>document.write(new Date().getFullYear())</script> <a href=\"index.html\">Coatl - MicroUniverse</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\t<!--   Core JS Files   -->\n");
      out.write("    <script src=\"Assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"Assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JS/HA.js\"></script>\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"Assets/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"Assets/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"Assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"Assets/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("    \t$(document).ready(function(){\n");
      out.write("\n");
      out.write("        \tdemo.initChartist();\n");
      out.write("\n");
      out.write("        \t$.notify({\n");
      out.write("            \ticon: 'pe-7s-science',\n");
      out.write("            \tmessage: \"Bienvenido a <b>MicroUniverse</b>.\"\n");
      out.write("\n");
      out.write("            },{\n");
      out.write("                type: 'info',\n");
      out.write("                timer: 4000\n");
      out.write("            });\n");
      out.write("\n");
      out.write("    \t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
