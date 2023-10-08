insert into user_details(id,birth_date,name)
values(1001,current_date(),'Ranga');

insert into user_details(id,birth_date,name)
values(1002,current_date(),'Ravi');
insert into user_details(id,birth_date,name)
values(1003,current_date(),'Sathish');

insert into  post(id,description,user_id)
values(2001,'i want to learn Devops',1001);

insert into  post(id,description,user_id)
values(2002,'i want to get AWS Certified',1001);
insert into  post(id,description,user_id)
values(2003,'i want to learn MultiCloud',1002);