En este documento se entregan todas las vulnerabilidades encontradas en la apk de EvMapas encontradas mediante escaneo estatico y dinamico en https://mobsf.live, junto a una descripcion y posible solucion.
1. ACCESS_COARSE_LOCATION
•	Descripción: Acceso a la ubicación aproximada del usuario.
•	Severidad: Alta.
•	Impacto: Rastrear la ubicación del usuario sin su consentimiento.
•	Steps to Reproduce: Conceder permiso a una app y monitorear la ubicación aproximada.
•	Recomendación: Limitar su uso a funcionalidades críticas y solicitar el permiso solo cuando sea necesario.
________________________________________
2. ACCESS_FINE_LOCATION
•	Descripción: Acceso a la ubicación precisa del usuario mediante GPS.
•	Severidad: Alta.
•	Impacto: Rastrear la ubicación exacta del usuario y consumir batería.
•	Steps to Reproduce: Conceder permiso y monitorear la ubicación precisa a través del GPS.
•	Recomendación: Usar solo cuando sea imprescindible. Preferir ACCESS_COARSE_LOCATION si es posible.
________________________________________
3. INTERNET
•	Descripción: Acceso completo a Internet.
•	Severidad: Media.
•	Impacto: Posible fuga de datos no cifrados y uso de redes inseguras.
•	Steps to Reproduce: Revisar conexiones HTTP no seguras.
•	Recomendación: Usar HTTPS y limitar el acceso a Internet solo cuando sea necesario.
________________________________________
4. Permiso desconocido (DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION)
•	Descripción: Permiso no documentado que puede exponer vulnerabilidades.
•	Severidad: Alta.
•	Impacto: Riesgo de acceso no autorizado a componentes del sistema.
•	Steps to Reproduce: Revisar en el manifiesto y analizar su uso.
•	Recomendación: Realizar auditoría y eliminar si no es necesario.
________________________________________
5. Almacenamiento Inseguro de Datos
•	Descripción: Datos sensibles almacenados en texto plano.
•	Severidad: Crítica.
•	Impacto: Exposición de información confidencial a atacantes.
•	Steps to Reproduce: Inspeccionar el almacenamiento interno de la app.
•	Recomendación: Implementar cifrado para datos sensibles.
________________________________________
6. Falta de Certificado SSL
•	Descripción: Conexiones no seguras (HTTP) que exponen datos.
•	Severidad: Crítica.
•	Impacto: Posibilidad de interceptar comunicaciones mediante ataques Man-in-the-Middle.
•	Steps to Reproduce: Inspeccionar las solicitudes de red de la aplicación.
•	Recomendación: Implementar HTTPS para todas las comunicaciones.
________________________________________
7. Fuga de Información en Logs
•	Descripción: Registros con datos sensibles.
•	Severidad: Alta.
•	Impacto: Exposición de información privada en archivos de registro.
•	Steps to Reproduce: Revisar los archivos de log generados por la app.
•	Recomendación: Evitar registrar información sensible y auditar los logs.
________________________________________
8. Uso de Componentes Desactualizados
•	Descripción: Dependencias de terceros desactualizadas.
•	Severidad: Media.
•	Impacto: Exposición a vulnerabilidades conocidas.
•	Steps to Reproduce: Revisar versiones de bibliotecas en el archivo de dependencias.
•	Recomendación: Actualizar todas las dependencias a las versiones más recientes.
________________________________________
9. Exposición de Receptores Dinámicos
•	Descripción: Receptores dinámicos vulnerables a activación por aplicaciones externas.
•	Severidad: Media.
•	Impacto: Posible invocación de comportamientos no deseados en la aplicación.
•	Steps to Reproduce: Revisar los receptores dinámicos no protegidos.
•	Recomendación: Proteger los receptores dinámicos para evitar accesos no autorizado

