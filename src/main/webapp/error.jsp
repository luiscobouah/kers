<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>      
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <title>Error</title>
    <link rel="stylesheet" href="css/main.css">    
</head>    
<body>
    <% String objeto = (String) session.getAttribute("objeto"); %>
    <header class="site-header inicio">
        <div class="contenedor contenido-header">
           <h1>Simulación sistema KERS</h1>
        </div>
    </header>
    <section class="contenedor seccion"> 
        <h1>El <%=objeto%> no se ha guardado correctamente</h1>         
    </section>
 </body>
</html>
