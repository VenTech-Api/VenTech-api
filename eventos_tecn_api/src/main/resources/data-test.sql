-- Inserción en la tabla usuarios
INSERT INTO usuarios (id, nombre, email, contraseña) VALUES
                                                         (1, 'Juan Pérez', 'juan.perez@example.com', 'password123'),
                                                         (2, 'Ana Gómez', 'ana.gomez@example.com', 'password456'),
                                                         (3, 'Carlos López', 'carlos.lopez@example.com', 'password789'),
                                                         (4, 'María Rodríguez', 'maria.rodriguez@example.com', 'password101');

-- Inserción en la tabla perfiles
INSERT INTO perfiles (id, intereses_tecnologicos, habilidades, linkedin, usuario_id) VALUES
                                                                                         (1, 'Desarrollo Java, Microservicios', 'Java, Spring Boot', 'https://linkedin.com/in/juanperez', 1),
                                                                                         (2, 'Desarrollo Frontend, React', 'JavaScript, React', 'https://linkedin.com/in/anagomez', 2),
                                                                                         (3, 'Ciberseguridad, Ethical Hacking', 'Pentesting, Seguridad en redes', 'https://linkedin.com/in/carloslopez', 3),
                                                                                         (4, 'Data Science, Machine Learning', 'Python, TensorFlow', 'https://linkedin.com/in/mariarodriguez', 4);

-- Inserción en la tabla eventos
INSERT INTO eventos (titulo, descripcion, ubicacion, fecha_hora, tipo, organizador_id) VALUES
                                                                                           ('Conferencia de Desarrollo', 'Una conferencia sobre las últimas tendencias en desarrollo de software.', 'Auditorio Central', '2024-09-20 10:00:00', 1, 1),
                                                                                           ('Workshop de React', 'Un taller práctico sobre el framework React.', 'Sala de Talleres', '2024-09-25 14:00:00', 2, 2),
                                                                                           ('Conferencia de Ciberseguridad', 'Discusión sobre las últimas amenazas y cómo proteger los sistemas.', 'Centro de Convenciones', '2024-10-01 09:00:00', 1, 3),
                                                                                           ('Taller de Machine Learning', 'Un taller sobre los conceptos básicos de Machine Learning.', 'Sala de Informática', '2024-10-05 11:00:00', 2, 4);

-- Inserción en la tabla inscripciones
INSERT INTO inscripciones (fecha_inscripcion, usuario_id, evento_id) VALUES
                                                                         ('2024-09-15 09:00:00', 1, 1),
                                                                         ('2024-09-18 15:00:00', 2, 2),
                                                                         ('2024-09-25 08:30:00', 3, 3),
                                                                         ('2024-09-28 12:45:00', 4, 4);

-- Inserción en la tabla pagos
INSERT INTO pagos (monto, fecha_pago, usuario_id, evento_id) VALUES
                                                                 (100.00, '2024-09-15 09:30:00', 1, 1),
                                                                 (50.00, '2024-09-18 15:30:00', 2, 2),
                                                                 (75.00, '2024-09-25 09:00:00', 3, 3),
                                                                 (120.00, '2024-09-28 13:00:00', 4, 4);

-- Inserción en la tabla reportes
INSERT INTO reportes (contenido, evento_id, usuario_id) VALUES
                                                            ('El evento fue muy bien organizado y tuvo buena asistencia.', 1, 1),
                                                            ('El taller de React fue muy útil y los instructores fueron excelentes.', 2, 2),
                                                            ('La conferencia de ciberseguridad abordó temas cruciales y fue muy instructiva.', 3, 3),
                                                            ('El taller de Machine Learning fue muy práctico y aprendí mucho.', 4, 4);
