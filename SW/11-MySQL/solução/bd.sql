/* 1 */
ALTER TABLE modelo ADD fotografia TEXT;

/* 2 */
SELECT mc_id, mc_marca, md_id, md_modelo, md_cilindrada, md_marca FROM marca, modelo WHERE md_marca = mc_id;

/* 3 */
UPDATE modelo set fotografia = "audi_a3.jpg" where md_modelo="a3";
UPDATE modelo set fotografia = "ford_fiesta.jpg" where md_modelo="fiesta";
UPDATE modelo set fotografia = "ford_focus.jpg" where md_modelo="focus";
UPDATE modelo set fotografia = "renault_clio.jpg" where md_modelo="clio";
