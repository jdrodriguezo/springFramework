<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de variables</title>
    </head>
    <body>
        <h1>Alcance de variables</h1>
        <br/><br/>
        Variable request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br/><br/>
        Variable session:
        Base: ${rectanguloSession.base}
        Altura: ${rectanguloSession.altura}
        Area: ${rectanguloSession.area}
        <br/><br/>
        Variable Application:
        Base: ${rectanguloApplication.base}
        Altura: ${rectanguloApplication.altura}
        Area: ${rectanguloApplication.area}
        <br/><br/>
        <a href='${pageContext.request.contextPath}/index.jsp' > ir a inicio</a>
        
    </body>
</html>
