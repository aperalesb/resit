@ECHO OFF

echo.
echo.= ============================================================================================================ =
echo.=
echo.=
echo.=
echo.=     .----------------. .----------------. .----------------. .----------------. .----------------. 
echo.=     ^| .--------------. ^| .--------------. ^| .--------------. ^| .--------------. ^| .--------------. ^|
echo.=     ^| ^|  _______     ^| ^| ^|  _________   ^| ^| ^|    _______   ^| ^| ^|     _____    ^| ^| ^|  _________   ^| ^|
echo.=     ^| ^| ^|_   __ \    ^| ^| ^| ^|_   ___  ^|  ^| ^| ^|   /  ___  ^|  ^| ^| ^|    ^|_   _^|   ^| ^| ^| ^|  _   _  ^|  ^| ^|
echo.=     ^| ^|   ^| ^|__) ^|   ^| ^| ^|   ^| ^|_  \_^|  ^| ^| ^|  ^|  (__ \_^|  ^| ^| ^|      ^| ^|     ^| ^| ^| ^|_/ ^| ^| \_^|  ^| ^|
echo.=     ^| ^|   ^|  __ /    ^| ^| ^|   ^|  _^|  _   ^| ^| ^|   '.___`-.   ^| ^| ^|      ^| ^|     ^| ^| ^|     ^| ^|      ^| ^|
echo.=     ^| ^|  _^| ^|  \ \_  ^| ^| ^|  _^| ^|___/ ^|  ^| ^| ^|  ^|`\____) ^|  ^| ^| ^|     _^| ^|_    ^| ^| ^|    _^| ^|_     ^| ^|
echo.=     ^| ^| ^|____^| ^|___^| ^| ^| ^| ^|_________^|  ^| ^| ^|  ^|_______.'  ^| ^| ^|    ^|_____^|   ^| ^| ^|   ^|_____^|    ^| ^|
echo.=     ^| ^|              ^| ^| ^|              ^| ^| ^|              ^| ^| ^|              ^| ^| ^|              ^| ^|
echo.=     ^| '--------------' ^| '--------------' ^| '--------------' ^| '--------------' ^| '--------------' ^|
 echo.=     '----------------' '----------------' '----------------' '----------------' '----------------' 
echo.=
echo.=
echo.=
echo.= ============================================================================================================ =
echo.= Asegurese de que la estructura de ficheros cumple con la estructura siguiente =
echo.=                                                                               
echo.=  cualquier ruta
echo.=      ^| ^-^-^-^- Resit
echo.=      ^|        ^| ^-^-^-^- resit-controller
echo.=      ^|        ^|        ^| ^-^-^-^- package.bat
echo.=      ^|        ^|        ^| ^-^-^-^- [...]
echo.=      ^|        ^| ^-^-^-^- resit-core
echo.=      ^|        ^|        ^| ^-^-^-^- package.bat								 
echo.=      ^|        ^|        ^| ^-^-^-^- [...]						         	 
echo.=      ^|        ^| ^-^-^-^- resit-front 							 
echo.=      ^|        ^|        ^| ^-^-^-^- package.bat								 
echo.=      ^|        ^|        ^| ^-^-^-^- [...]							         
echo.=      ^|        ^| ^-^-^-^- resit-integration						 
echo.=      ^|        ^|        ^| ^-^-^-^- package.bat								 
echo.=      ^|        ^|        ^| ^-^-^-^- [...]
echo.=      ^|        ^| ^-^-^-^- resit-remote						 
echo.=      ^|        ^|        ^| ^-^-^-^- package.bat								 
echo.=      ^|        ^|        ^| ^-^-^-^- [...]									 
echo.=      ^|        ^| ^-^-^-^- resit-services									 
echo.=      ^|        ^|        ^| ^-^-^-^- package.bat								 
echo.=      ^|        ^|        ^| ^-^-^-^- [...]
echo.= ============================================================================= =
echo.

echo.OJO! si tienes activo un perfil en el fichero settings.xml de maven, se utilizara preferentemente siempre.
set profile=
echo.&set /p profile=Introduzca el perfil de compilacion o pulsa ENTER para salir: ||GOTO:EOF

echo.
echo.Compilacion para el entorno %profile%
echo.

call mvn -up -cpu -P %profile% clean install
echo.
echo.
echo.- Todos los paquetes compilados -------------------------------------------------
echo.
echo.
cd ./resit-front
echo.
echo.
echo.- Desplegando Resit.war en el servidor de aplicaciones -------------------------------------------------
echo.
echo.
call mvn -up -cpu -P %profile% tomcat:run

cd ..
pause

GOTO:EOF