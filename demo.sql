create table product
(
    id     int auto_increment
        primary key,
    img    longtext     null,
    name   varchar(200) null,
    amount int          null,
    price  double       null
);

create table roles
(
    id   int auto_increment
        primary key,
    name varchar(50) null
);

create table account
(
    id          int auto_increment
        primary key,
    username    varchar(200) null,
    password    varchar(200) null,
    phonenumber varchar(200) null,
    email       varchar(200) null,
    birthday    date         null,
    status      tinyint(1)   null,
    id_role     int          null,
    constraint account_ibfk_1
        foreign key (id_role) references roles (id)
);

create index id_role
    on account (id_role);

create table bill
(
    id         int auto_increment
        primary key,
    id_account int    null,
    totalprice double null,
    constraint bill_ibfk_1
        foreign key (id_account) references account (id)
);

create index id_account
    on bill (id_account);

create table billdetail
(
    id         int auto_increment
        primary key,
    amount     int null,
    id_product int null,
    id_bill    int null,
    constraint billdetail_ibfk_1
        foreign key (id_product) references product (id),
    constraint billdetail_ibfk_2
        foreign key (id_bill) references bill (id)
);

create index id_bill
    on billdetail (id_bill);

create index id_product
    on billdetail (id_product);

