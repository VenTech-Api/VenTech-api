## Introducción

VenTech es una aplicación web diseñada para facilitar la organización y participación en eventos de tecnología y networking. La plataforma permitirá a los usuarios crear, buscar y unirse a eventos relacionados con sus intereses tecnológicos, conectar con otros profesionales y compartir conocimientos. Este proyecto académico está diseñado para que los estudiantes desarrollen una aplicación que promueva el aprendizaje colaborativo y la creación de comunidades en el campo de la tecnología.

El objetivo de VenTech es ofrecer una plataforma integrada que combina la facilidad de organización y participación en eventos de tecnología, networking y aprendizaje colaborativo, todo en un entorno seguro y amigable.
Colaboradores del Proyecto

| **Nombre**                        | **Rol**                                     | 
|-----------------------------------|---------------------------------------------|
| Vasquez Castillo Jherson      | Líder del Proyecto |    

### Revisa el Progreso del Proyecto BookHub

| **Columna**       | **Descripción**                                                                                                                                    |
|-------------------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| **Backlog**       | Contiene todas las historias de usuario, tareas y características que deben desarrollarse. Es el listado de todo el trabajo pendiente.              |
| **En Progreso**   | Incluye las tareas que están actualmente en desarrollo. Visualiza el trabajo en curso para asegurar el flujo continuo de trabajo.                   |
| **Revisión**      | Después de completar una tarea, se mueve aquí para una revisión de código y revisión por pares (peer review). Esta fase incluye la creación de **pull requests** para asegurar que el código cumpla con los estándares de calidad antes de integrarse al proyecto principal. |
| **En Pruebas**    | Contiene las tareas que han pasado la revisión de código y necesitan pruebas exhaustivas (unitarias, de integración y de aceptación) para garantizar su calidad. |
| **Hecho**         | Las tareas completamente desarrolladas, revisadas y probadas se mueven aquí, indicando que están listas y finalizadas.                               |

Mira cómo va avanzando nuestro trabajo visitando el siguiente enlace: [Tablero de Trello]([https://trello.com/b/5sNtLdze](https://trello.com/b/j8qgAuYw/eventostecnologicos).

### Funcionalidades de la aplicación VenTech

### Módulo de Gestión de Usuarios
1. Registro y Perfiles de Usuarios: Los usuarios podrán registrarse y crear perfiles detallados, incluyendo sus intereses tecnológicos, habilidades, y enlaces a sus redes profesionales como LinkedIn.
2. Gestión de Perfiles: Funcionalidades CRUD para que los usuarios puedan editar sus perfiles, actualizar información y gestionar su presencia en la plataforma.

### Módulo de Creación y Gestión de Eventos
1. Creación de Eventos: Los usuarios podrán crear eventos con detalles como el título, la descripción, la ubicación (física o virtual), y la fecha y hora del evento.
2. Gestión de Eventos: Permitir a los organizadores editar o cancelar eventos creados, gestionar la lista de participantes, y enviar actualizaciones.

### Módulo de Inscripción y Participación en Meetups
1. Búsqueda de Eventos: Los usuarios podrán buscar meetups basados en su ubicación, intereses tecnológicos, o palabras clave.
2. Inscripción a Eventos: Facilitar la inscripción de los usuarios a eventos de su interés, con opciones para recibir notificaciones y recordatorios por correo electrónico.

### Módulo de Pagos en Línea
1. Pagos para Eventos Premium: Integración de un sistema de pagos que permita a los usuarios pagar para unirse a meetups premium, que pueden incluir acceso a charlas exclusivas, talleres, o networking especializado.

### Módulo de comentarios
1. Estadísticas de Participación: Los organizadores podrán generar reportes sobre la asistencia a sus eventos, interacciones, y feedback de los participantes.
2. Reportes de Actividad para Usuarios: Los usuarios podrán ver un resumen de los eventos a los que han asistido, conexiones realizadas, y áreas de interés.

### Segmento Objetivo:
- Profesionales de Tecnología: Personas interesadas en aprender, compartir conocimientos y hacer networking en áreas como desarrollo de software, ciberseguridad, inteligencia artificial, entre otros.
- Estudiantes de Tecnología: Estudiantes que buscan expandir su red profesional y aprender de expertos en el campo.
- Emprendedores en Tecnología: Fundadores y equipos de startups tecnológicas que desean conectar con potenciales socios, inversores, y mentores.


### Asignación de Historias de Usuario

**Sprint 1:**


| Integrante  | Módulo                       | Historia de Usuario                                                   | Descripción                                                                                                                                      |  
|-------------|------------------------------|----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Integrante 1| Gestión de usuario       | Historia de Usuario 1: Registro de usuario.                              | Como usuario, quiero registrarme en la plataforma para poder acceder a los eventos y crear mi perfil.                   | 
|             | Gestión de usuario           | Historia de Usuario 2:  Editar Perfil.                                  | Como usuario, quiero poder editar mi perfil para mantener actualizada mi información y mis intereses tecnológicos.       | 
| | Gestión de usuario           | Historia de Usuario 3: Visualizacion de perfiles.                                 | Como usuario, quiero poder ver otros perfiles para conocer a los participantes y establecer conexiones. | 
|             | Creación y Gestión de Eventos        | Historia de Usuario 4: Creación de Evento | Como organizador, quiero crear un evento para compartir mis conocimientos y conectarse con otros profesionales.            | 
| | Creación y Gestión de Eventos          | Historia de Usuario 5: Edición de Evento.                           | Como organizador, quiero editar los detalles de un evento para asegurarme de que la información esté actualizada .| 
|             | Creación y Gestión de Eventos          | Historia de Usuario 6: Cancelación de Evento. | Como organizador, quiero cancelar un evento si es necesario para mantener la transparencia con los participantes.                          | 


**Sprint 2:**


| Integrante  | Módulo                       | Historia de Usuario                                                   | Descripción                                                                                                                                      |  
|-------------|------------------------------|----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Integrante 1| Inscripción y Participación en Meetups      | Historia de Usuario 1: Búsqueda de Eventos.                              | Como usuario, quiero buscar eventos según mis intereses y ubicación para encontrar oportunidades relevantes.                  |  
|             | Inscripción y Participación en Meetups         | Historia de Usuario 2:  Inscripción a Eventos.                                | Como usuario, quiero inscribirme a eventos de mi interés para participar y aprender de otros profesionales.    | 
| | Gestión de usuario           | Historia de Usuario 3: Notificaciones de Eventos.                               | Como usuario, quiero recibir notificaciones sobre eventos a los que me he inscrito para no perderme información importante. |
|             | Pagos en línea       | Historia de Usuario 4: Pago por Eventos Premium. | Como usuario, quiero pagar por eventos premium para acceder a charlas exclusivas y talleres.     | 
| | Pagos en línea          | Historia de Usuario 5: Resumen de Pagos                           | Como organizador, quiero ver un resumen de los pagos realizados para gestionar los ingresos de mis eventos.  | 
|             | Comentarios        | Historia de Usuario 6: Dejar Comentarios. | Como usuario, quiero dejar comentarios sobre los eventos a los que ayudar para compartir mis impresiones y ayudar a otros                    | 
|             | Comentarios        | Historia de Usuario 7: Visualización de Comentarios. | Como organizador, quiero ver los comentarios dejados por los participantes para mejorar futuros eventos.                         | 
