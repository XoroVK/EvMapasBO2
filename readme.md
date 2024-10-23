EvMapasBO2
Descripción
Este proyecto es una aplicación Android que utiliza una api de google para poder acceder al mapa en tiempo real directamente de la app y permite crear marcadores en puntos establecidos.

###Vulnerabilidades Identificadas
- Inyección SQL
- Comunicación no segura
- Exposición de datos sensibles
- Manejo inadecuado de sesiones
- Ataques de intermediario (MITM)

###Mejoras Implementadas
- Cifrado de datos sensibles (AES-256)
- Comunicación segura mediante HTTPS
- Validación y sanitización de entradas de usuario
- Autenticación y autorización seguras (JWT y RBAC)
- Protección contra ataques de fuerza bruta
- Gestión segura de sesiones

###Documentación
Vulnerabilidades: Detalla todas las vulnerabilidades encontradas y su impacto.
Best Practices: Lista de buenas prácticas implementadas en la aplicación.
Security Tips: Consejos específicos para fortalecer la seguridad de la aplicación.
Security Improvement Program: Programa estructurado para evaluar y mejorar la seguridad de la aplicación a largo plazo.

##Cómo Ejecutar la Aplicación de Forma Segura
- Clonar el repositorio: "git clone https://github.com/usuario/nombre-del-proyecto.git"
- Importar el proyecto en Android Studio.
- Ejecutar la aplicación en un dispositivo o emulador compatible.
- Asegurarse de que los siguientes permisos están configurados adecuadamente:
  -   ACCESS_FINE_LOCATION
  -   ACCESS_NETWORK_STATE
  -   INTERNET
- Verificar que el dispositivo esté conectado a una red segura para evitar ataques MITM.
- Para un entorno de producción, se recomienda deshabilitar el modo depuración y revisar los permisos antes del lanzamiento.
###Reporte de Vulnerabilidades
El reporte detallado de las pruebas de vulnerabilidad realizadas junto a la propuesta de programa de mejora se encuentran en el archivo vulnerability_report.pdf.
