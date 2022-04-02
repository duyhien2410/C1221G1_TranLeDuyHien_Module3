create database product;
use product;

create table products(
id int primary key,
product_code varchar(20),
product_name varchar(45),
product_price double,
product_amount int,
product_description varchar(45),
product_status varchar(45)
);

insert into products 
values 
(1,'F2G1', 'Ferrari 250 GT0 1963', 76.0, 6, 'made in Italia', 'import'),
(2,'AMV', 'Aston Martin Victor', 58.5, 35, 'made in England', 'import'),
(3,'MBB', 'Mulliner Bacalar Bentley', 42.0, 16, 'made in England', 'import'),
(4,'VRL', 'Veneno Roader Lamborghini', 36.7, 62, 'made in Italia', 'import'),
(5,'VP', 'Vinfast President', 25.0, 99, 'made in Vietnam', 'export');

select * from products;

create unique index products_index
on products (product_code);

create index products_name_price
on products(product_name, product_price);

explain select * from products where product_name = "Vinfasst President";

drop index products_name_price on products;

create view products_view as
select products.product_code, products.product_name, products.product_price, products.product_status
from products;

select * from products_view;

create or replace view products_view as 
select product_code, product_name, product_price, product_status
from products;

select * from products_view;
        
drop view products_view;


DELIMITER //
create procedure find_all_products() 
begin
select * from products;
end
// DELIMITER ;
call find_all_products(); 

DELIMITER //
create procedure new_products(
id int,
product_code varchar(20),
product_name varchar(45),
product_price double,
product_amount int,
product_description varchar(45),
product_status varchar(45))
begin
insert into products value 
(id, product_code, product_name, product_price, product_amount, product_description, product_status);
end;
// DELIMITER ;
call new_products(6, 'MB', 'Maybach', 66.0, 16,'made in Germany', 'import');
select * from products;

DELIMITER //
create procedure edit_products (
id int ,
product_code varchar(25),
product_name varchar(50),
product_price double,
product_amount int,
product_description varchar(50),
product_status varchar(50))
begin
update products
set
product_code = product_code,
product_name = product_name,
product_price = product_price,
product_amount = product_amount,
product_description = product_description,
product_status = product_status
where products.id = id;
end; 
// DELIMITER ;
call edit_products(5, 'RRS', 'Rolls-Royce Sweptail', 120.0, 9,'made in England', 'import');

select * from products;