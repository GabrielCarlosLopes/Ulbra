create schema aula13;

use aula13;

SET SQL_SAFE_UPDATES = 0;

create table pessoas(
	id int not null primary key,
    nome varchar(100) not null,
    sexo char(1) not null,
    data_nascimento date
);

select * from pessoas;

-- 1-1
delimiter $$
create procedure sp_insert_pessoas(nome varchar(100), sexo char(1), data_nasciento date)
begin
	declare var_last_id int default 0;
    
    if((select count(id) from pessoas) = 0) then
		set var_last_id = 1;
	else
		set var_last_id = ((select max(id) from pessoas) + 1);
	end if;
    
    insert into pessoas values(var_last_id, nome, sexo, data_nasciento);
    select * from pessoas;
end $$

call sp_insert_pessoas('cassio', 'm', '1899-05-12');

-- 1-2
delimiter $$
create procedure sp_verifica_quantidade_por_genero()
begin
	declare var_n_homens int default 0;
    declare var_n_mulheres int default 0;
    
    set var_n_homens = (select count(sexo) from pessoas where sexo = 'm');
    set var_n_mulheres = (select count(sexo) from pessoas where sexo = 'f');
    
    select concat('Existem cadastrados ', var_n_homens, 
			      ' homens cadastrados e ', var_n_mulheres, ' mulheres'
				 ) as mensagem;
    
    
end $$

call sp_verifica_quantidade_por_genero();

select * from pessoas;

-- 1-3
delimiter $$
create procedure sp_verifica_idade()
begin
	declare var_n_homens_maiores int;
    declare var_n_homens_menores int;
    declare var_n_mulheres_maiores int;
    declare var_n_mulheres_menores int;
    
    set var_n_homens_maiores =  
		(select count(id) from pessoas 
			where sexo = 'm' and ((year(current_date()) - year(data_nascimento)) > 18));
    set var_n_homens_menores =  
		(select count(id) from pessoas 
			where sexo = 'm' and ((year(current_date()) - year(data_nascimento)) < 18));
	set var_n_mulheres_maiores =  
		(select count(id) from pessoas 
			where sexo = 'f' and ((year(current_date()) - year(data_nascimento)) > 18));
	set var_n_mulheres_menores =  
		(select count(id) from pessoas 
			where sexo = 'f' and ((year(current_date()) - year(data_nascimento)) < 18));
	

	select concat(
				'existem ',var_n_homens_maiores,' maiores de 18 anos e ', 
				var_n_homens_menores, ' menores de 18 anos homens e ',
				var_n_mulheres_maiores, ' maiores de 18 anos e ', var_n_mulheres_menores, 
				' menores de 18 anos mulheres'
				) as mensagem;

end $$

call sp_verifica_idade();


-- 2-1

delimiter $$
create procedure sp_operacoes_matematicas(num1 decimal(10,2), num2 decimal(10,2))
begin
	declare soma decimal(10,2); 
	declare subtracao decimal(10,2); 
    declare multiplicacao decimal(10,2); 
    declare divisao decimal(10,2); 
    
	set soma = (num1 + num2);
	set subtracao = (num1 - num2);
	set multiplicacao = (num1 * num2);
    set divisao = (num1 / num2);
    
    select concat('soma de ',num1,'+',num2,'=', soma,
				  ' subtração: ',subtracao,
                  ' multiplicação: ',multiplicacao,
                  ' divisão: ', divisao) as mensagem;

end $$

call sp_operacoes_matematicas(5, 5.74);

