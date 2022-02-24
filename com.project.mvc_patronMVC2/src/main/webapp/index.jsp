<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo mvc 2</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Ejemplo mcv 2</h1>
        <br/>
        <div style="color:red;">${mensaje}</div>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al servlet controlador sin parametros
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariables">
            Link al servlet controlador para agregar variables
        </a>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
            Link al servlet controlador para listar variables
        </a>
        <br/><br/>
    </body>
</html>
