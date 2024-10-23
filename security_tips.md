Documentacion de los consejos de Seguridad Implementados (security tips)
*****************************************************
1. Protección contra Ataques de Inyección SQL
•	Descripción: Implementación de medidas para prevenir inyecciones SQL.
•	Mejora de Seguridad: Evita que atacantes manipulen consultas a la base de datos.
•	Medidas Implementadas: Uso de consultas preparadas y ORM (Object-Relational Mapping) para interactuar con la base de datos, eliminando la construcción manual de consultas SQL.
*****************************************************
2. Autenticación y Autorización Seguras
•	Descripción: Mejora de los mecanismos de autenticación y autorización.
•	Mejora de Seguridad: Protege el acceso a recursos de la aplicación.
•	Medidas Implementadas: Uso de autenticación basada en tokens (JWT), junto con control de acceso basado en roles (RBAC) para restringir funciones según permisos.
*****************************************************
3. Protección contra Ataques de Red (MITM)
•	Descripción: Mitigación de ataques de intermediario (Man-in-the-Middle).
•	Mejora de Seguridad: Protege las comunicaciones entre la aplicación y los servidores.
•	Medidas Implementadas: Uso de HTTPS con certificados SSL/TLS, y validación estricta de certificados para asegurar la integridad de los datos en tránsito.
*****************************************************
4. Cifrado de Datos Sensibles
•	Descripción: Protección de datos confidenciales en reposo y en tránsito.
•	Mejora de Seguridad: Evita la exposición de información sensible.
•	Medidas Implementadas: Uso de cifrado AES-256 para el almacenamiento de datos y cifrado TLS para las comunicaciones.
*****************************************************
5. Protección contra Ataques de Fuerza Bruta
•	Descripción: Prevención de intentos repetidos de autenticación.
•	Mejora de Seguridad: Reduce la posibilidad de comprometer cuentas mediante ataques de fuerza bruta.
•	Medidas Implementadas: Limitación de intentos de inicio de sesión y uso de CAPTCHAs para evitar intentos automatizados.
*****************************************************
6. Gestión Segura de Sesiones
•	Descripción: Mejoras en el manejo de sesiones de usuario.
•	Mejora de Seguridad: Evita el robo de sesiones y el secuestro de cuentas.
•	Medidas Implementadas: Uso de tokens de sesión con expiración automática, protección contra ataques CSRF y cookies seguras con HttpOnly y Secure.
*****************************************************
7. Monitoreo y Auditoría de Seguridad
•	Descripción: Implementación de sistemas de monitoreo continuo.
•	Mejora de Seguridad: Detecta actividades sospechosas o comportamientos inusuales.
•	Medidas Implementadas: Registro de eventos críticos, auditoría de accesos y alertas en tiempo real ante posibles amenazas.

