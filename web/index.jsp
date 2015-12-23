<%-- 
    Document   : index
    Created on : 13-dic-2015, 18:40:56
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Calculadora" method="POST">
            <center>
                <h2>Calculadora Web Service</h2>
                <p><label>Número 1: </label> <input type="number" name="num1" required /></p>
                <p><label>Número 2: </label> <input type="number" name="num2" required /></p>
                <p><button type="submit" name="operacion" value="sumar"> Sumar</button>
                    <button type="submit" name="operacion" value="restar"> Restar</button>
                    <button type="submit" name="operacion" value="multiplicar"> Multiplicar</button>
                    <button type="submit" name="operacion" value="dividir"> Dividir</button>
                </p>
                ${respuesta}
            </center>
        </form>
    </body>
</html>
