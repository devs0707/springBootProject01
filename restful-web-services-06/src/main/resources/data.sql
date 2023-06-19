insert into user_details (id,birth_date,name)
	values (10001, current_date(),'Dev');
insert into user_details (id,birth_date,name)
	values (10002, current_date(),'Abhi');
insert into user_details (id,birth_date,name)
	values (10003, current_date(),'Yews');
	
	
insert into post (id,description,user_id)values(20001, 'Learn Aws',10001);
insert into post (id,description,user_id)values(20002, 'Learn DevOps', 10001);
insert into post (id,description,user_id)values(20003, 'Learn Spring', 10001);
insert into post (id,description,user_id)values(20004, 'Learn Google', 10002);
insert into post (id,description,user_id)values(20005, 'Learn Aws', 10002);
insert into post (id,description,user_id)values(20006, 'Learn Cloud', 10002);
insert into post (id,description,user_id)values(20007, 'Learn Cloud', 10003);