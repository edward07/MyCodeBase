delimiter //

create procedure test_parameter(in cont_name varchar(255) )
begin
		
	select count(*) from continent where name = cont_name   
	
end//

delimiter ;
