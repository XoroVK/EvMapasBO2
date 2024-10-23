Documentacion de la implementación de Buenas Prácticas de Seguridad
Este documento detalla las buenas prácticas implementadas en la aplicación para mejorar su seguridad, proteger los datos sensibles y garantizar la integridad de las comunicaciones de red.
*******************************************************************
1. Cifrado de Datos Sensibles
•	Descripción: Cifrado de información privada.
•	Mejora de Seguridad: Protege datos sensibles en caso de acceso no autorizado.
•	Práctica Implementada: Uso de AES-256 para el cifrado de datos.
*******************************************************************
2. Comunicación Segura (HTTPS)
•	Descripción: Comunicación entre app y servidores con HTTPS.
•	Mejora de Seguridad: Protege contra ataques a la integridad de los datos.
•	Práctica Implementada: Certificados SSL en todos los servidores.
*******************************************************************
3. Validación y Sanitización de Entradas
•	Descripción: Validación y limpieza de datos del usuario.
•	Mejora de Seguridad: Previene ataques de inyección.
•	Práctica Implementada: Validación y sanitización en todas las entradas de usuario.
*******************************************************************
4. Gestión Segura de Sesiones
•	Descripción: Uso de cookies seguras.
•	Mejora de Seguridad: Protege contra robo de sesiones.
•	Práctica Implementada: Cookies seguras y expiración de sesión configuradas.
*******************************************************************
5. Principio de Mínimos Privilegios
•	Descripción: Restricción de permisos solo a lo necesario.
•	Mejora de Seguridad: Minimiza el riesgo en caso de comprometer cuentas o componentes.
•	Práctica Implementada: Ajuste de permisos en sistemas y bases de datos.
*******************************************************************
6. Actualización de Componentes
•	Descripción: Actualización de dependencias.
•	Mejora de Seguridad: Protege contra vulnerabilidades conocidas.
•	Práctica Implementada: Monitoreo y actualización regular de bibliotecas.
*******************************************************************
8. Registro Seguro de Actividades
•	Descripción: Registro de eventos importantes sin datos sensibles.
•	Mejora de Seguridad: Detecta actividades sospechosas sin exponer información privada.
•	Práctica Implementada: Logs seguros y sin información sensible.
