<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despligue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1>
        <br/>
        Variables en alcance Request: ${mensaje}
        <br/>
        <br/>
        Variable en alcance de sesion:
        <br/>
        Rectangulo:
        <br/>
        Base: ${rectangulo.base}
        <br/>
        Altura: ${rectangulo.altura}
        <br/>
        Area del triangulo: ${rectangulo.area}
        <br/>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
    </body>
</html>
