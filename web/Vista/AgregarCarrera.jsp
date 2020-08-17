<%-- 
    Document   : AgregarCarrera
    Created on : 14/08/2020, 11:07:48 PM
    Author     : Ori
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Carrera</title>
        <link href="CSS/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <form name="AgregarCarreraForm" action="ControladorCarrera" method="get">
                <table  class="table">
                    <thead>
                        <tr>
                            <th class="text-center" colspan="2">Agregar Carrera</th>                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="text-right">Nombre</td>
                            <td><input class="form-control" type="text" name="f_nombre" value="" maxlength="30" size="20" /></td>
                        </tr>
                        <tr>
                            <td class="text-right">Estado</td>
                            <td><input class="form-control" type="text" name="f_estado" value="" maxlength="1" size="2" /></td>
                        </tr>
                        <tr>
                            <td colspan="2" class="text-center">
                                <input class="btn-primary" type="submit" value="Agregar Carrera" name="agregar" />
                                <input type="hidden" value="agregarcarrera02" name="f_accion"/>
                                    
                            </td>
                        </tr>
                        
                    </tbody>
                    <table border="0" cellspacing="0" cellpagging="0" align="center">

                
                  
                </table>
                
            </form>
        </div>
    </body>
</html>
