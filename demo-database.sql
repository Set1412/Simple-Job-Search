create database job;
use job;
create table user( id int not null auto_increment,
					address varchar(255),
                    description varchar(255),
                    email varchar(255),
                    full_name varchar(255),
                    password varchar(255),
                    phone_number varchar(255),
                    status varchar(255),
                    primary key(id) );

create table cv( id int not null auto_increment,
				 file_name varchar(255),
                 user_id int, 
                 primary key(id),
                 foreign key(user_id) references user(id));

create table company( id int not null auto_increment,
						address varchar(255),
                        description text,
                        email varchar(255),
                        logo varchar(255),
                        company_name varchar(255),
                        phone_number varchar(255),
                        status varchar(255),
                        primary key(id) );
                        
create table category( id int not null auto_increment,
						name varchar(255),
                        primary key(id) );
                        
create table recruitment( id int not null auto_increment,
                          type varchar(255),
						  created varchar(255),
                          title varchar(255),
                          description varchar(255),
                          experience varchar(255),
                          quantity int,
                          salary varchar(255),
                          status varchar(255),
                          category_id int,
                          company_id int,
                          primary key(id),
                          foreign key(category_id) references category(id),
                          foreign key(company_id) references company(id) );

create table save_job( id int not null auto_increment,
						recruitment_id int,
                        user_id int,
                        primary key(id) );
                        
create table follow( id int not null auto_increment,
					 company_id int,
                     user_id int,
                     primary key(id) );
                     
create table apply( id int not null auto_increment,
					created varchar(255),
                    recruitment_id int,
                    user_id int,
                    cv_name varchar(255),
                    status varchar(255),
                    primary key(id) );