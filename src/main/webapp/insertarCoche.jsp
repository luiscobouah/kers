<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>      
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"/>
    <title>Nuevo Coche</title>
    <link rel="stylesheet" href="css/main.css">    
</head>    
<body>
    <header class="site-header inicio">
        <div class="contenedor contenido-header">
           <h1>Simulación Sistema KERS</h1>
        </div>
    </header>
    <section class="contenedor seccion"> 
        <h1>Nuevo Coche</h1>
        <div class="nuevoCoche">            
           <form action="/KERS/ServicioCoche" method="POST">             
            <p class="campoFormulario"> Nombre <input type="text" id="nombreCoche" name="nombreCoche" required ></p>
            <p class="campoFormulario"> Ganancia <input type="number" id="gananciaCurva" name="gananciaCurva"  min="4" max="10" required ></p>            
            <input type="submit" name="B1" value="Guardar" class="boton">    
            <input type="reset" value="Borrar" class="boton">
            <a href="index.html"><button type="button" class="boton" >Volver</button></a>
           </form>       
        </div>
    </section>
 </body>
</html>