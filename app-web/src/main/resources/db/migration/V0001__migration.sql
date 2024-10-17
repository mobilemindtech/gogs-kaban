
create table user
(
    id int primary key auto_increment,
    created_at datetime default now(),
    updated_at datetime default now(),
    login varchar(50) not null,
    password varchar(100) not null,
    email varchar(50) not null,
    name varchar(50) not null,
    token varchar(100),
    enabled boolean not null
);

create table repository (
                            id int primary key auto_increment,
                            created_at datetime default now(),
                            updated_at datetime default now(),
                            name varchar(50) not null,
                            gogs_id int not null
);

create table milestone (
                           id int primary key auto_increment,
                           created_at datetime default now(),
                           updated_at datetime default now(),
                           name varchar(50) not null,
                           color varchar(50) not null,
                           gogs_id int not null
);

create table issue (
                       id int primary key auto_increment,
                       created_at datetime default now(),
                       updated_at datetime default now(),
                       name varchar(50) not null,
                       content varchar(50) not null,
                       milestone_id int,
                       FOREIGN KEY (milestone_id) REFERENCES milestone(id) ON DELETE CASCADE
);

create table issue_label (
                             issue_id int not null,
                             label varchar(50),
                             color varchar(50),
                             PRIMARY KEY (issue_id, label),
                             FOREIGN KEY (issue_id) REFERENCES issue(id) ON DELETE CASCADE
);

create table project (
                         id int primary key auto_increment,
                         created_at datetime default now(),
                         updated_at datetime default now(),
                         last_change_at datetime,
                         name varchar(50) not null,
                         content text,
                         active bool default true,
                         restricted bool default true,
                         creator_id int not null,
                         FOREIGN KEY (creator_id) REFERENCES user(id) ON DELETE CASCADE
);

create table project_user(
                             id int primary key auto_increment,
                             created_at datetime default now(),
                             updated_at datetime default now(),
                             user_id int not null,
                             project_id int not null,
                             active boolean null default true,
                             UNIQUE INDEX idx_project_user (project_id, user_id),
                             FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE,
                             FOREIGN KEY (project_id) REFERENCES project(id) ON DELETE CASCADE

);

create table project_task (
                              id int primary key auto_increment,
                              created_at datetime default now(),
                              updated_at datetime default now(),
                              name varchar(100) not null,
                              content longtext,
                              state varchar(20) not null,
                              closed bool not null,
                              size varchar(10),
                              priority varchar(10),
                              estimate int,
                              start_date date,
                              end_date date,
                              branch varchar(200),
                              project_id int not null,
                              repository_id int,
                              issue_id int,
                              poster_id int,
                              assignee_id int,
                              FOREIGN KEY (project_id) REFERENCES project(id) ON DELETE CASCADE,
                              FOREIGN KEY (repository_id) REFERENCES repository(id) ON DELETE CASCADE,
                              FOREIGN KEY (issue_id) REFERENCES issue(id) ON DELETE CASCADE,
                              FOREIGN KEY (poster_id) REFERENCES user(id) ON DELETE CASCADE,
                              FOREIGN KEY (assignee_id) REFERENCES user(id) ON DELETE CASCADE
);

create table project_label
(
    id         int primary key auto_increment,
    project_id int         not null,
    label      varchar(50) not null,
    color      varchar(50) not null,
    UNIQUE INDEX idx_project_label (project_id, label) ,
    FOREIGN KEY (project_id) REFERENCES project(id) ON DELETE CASCADE
);

create table project_task_label (
                                    task_id int not null,
                                    label_id int not null,
                                    PRIMARY KEY (task_id, label_id),
                                    FOREIGN KEY (task_id) REFERENCES project_task(id) ON DELETE CASCADE,
                                    FOREIGN KEY (label_id) REFERENCES project_label(id) ON DELETE CASCADE
);

create table project_history (
                                 id int primary key auto_increment,
                                 created_at datetime default now(),
                                 project_id int not null,
                                 user_id int not null,
                                 content text not null,
                                 FOREIGN KEY (project_id) REFERENCES project(id) ON DELETE CASCADE,
                                 FOREIGN KEY (user_id) REFERENCES user(id) ON DELETE CASCADE
);


delimiter //
CREATE TRIGGER project_task_update BEFORE UPDATE ON project_task
    FOR EACH ROW
BEGIN
    update project set last_change_at = now() where id = NEW.project_id;
END;//
delimiter ;

delimiter //
CREATE TRIGGER project_task_insert BEFORE INSERT ON project_task
    FOR EACH ROW
BEGIN
    update project set last_change_at = now() where id = NEW.project_id;
END;//
delimiter ;

delimiter //
CREATE TRIGGER project_task_delete BEFORE DELETE ON project_task
    FOR EACH ROW
BEGIN
    update project set last_change_at = now() where id = OLD.project_id;
END;//
delimiter ;