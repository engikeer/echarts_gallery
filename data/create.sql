CREATE TABLE customers
(
  cust_id      integer       PRIMARY KEY AUTOINCREMENT ,
  cust_name    char(50)  NOT NULL ,
  cust_address char(50)  NULL ,
  cust_city    char(50)  NULL ,
  cust_state   char(5)   NULL ,
  cust_zip     char(10)  NULL ,
  cust_country char(50)  NULL ,
  cust_contact char(50)  NULL ,
  cust_email   char(255) NULL
);

CREATE TABLE orderitems
(
  order_num  integer         NOT NULL ,
  order_item integer          NOT NULL ,
  prod_id    char(10)     NOT NULL ,
  quantity   integer          NOT NULL ,
  item_price decimal(8,2) NOT NULL ,
  PRIMARY KEY (order_num, order_item),
  FOREIGN KEY (order_num) REFERENCES orders (order_num) ,
  FOREIGN KEY (prod_id) REFERENCES products (prod_id)
);


CREATE TABLE orders
(
  order_num  integer      PRIMARY KEY AUTOINCREMENT ,
  order_date datetime NOT NULL ,
  cust_id    integer      NOT NULL,
  FOREIGN KEY (cust_id) REFERENCES customers (cust_id)
);

CREATE TABLE vendors
(
  vend_id      integer      PRIMARY KEY AUTOINCREMENT ,
  vend_name    char(50) NOT NULL ,
  vend_address char(50) NULL ,
  vend_city    char(50) NULL ,
  vend_state   char(5)  NULL ,
  vend_zip     char(10) NULL ,
  vend_country char(50) NULL
);

CREATE TABLE products
(
  prod_id    char(10)      PRIMARY KEY ,
  vend_id    integer           NOT NULL ,
  prod_name  char(255)     NOT NULL ,
  prod_price decimal(8,2)  NOT NULL ,
  prod_desc  text          NULL,
  FOREIGN KEY (vend_id) REFERENCES vendors (vend_id)
);

CREATE TABLE productnotes
(
  note_id    integer           PRIMARY KEY AUTOINCREMENT ,
  prod_id    char(10)      NOT NULL,
  note_date datetime       NOT NULL,
  note_text  text          NULL
);
