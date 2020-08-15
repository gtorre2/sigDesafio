INSERT INTO permissao VALUES (6, 'ROLE_CADASTRAR_EMPRESA');
INSERT INTO permissao VALUES (7, 'ROLE_CADASTRAR_CLIENTE');

INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 6);
INSERT INTO grupo_permissao (codigo_grupo, codigo_permissao) VALUES (1, 7);