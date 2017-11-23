CREATE TABLE `letmyfit`.`ms_category` (
  `catid` INT NOT NULL,
  `catname` VARCHAR(45) NULL,
  PRIMARY KEY (`catid`));

CREATE TABLE `letmyfit`.`ms_parameter` (
  `paramid` INT NOT NULL,
  `paramname` VARCHAR(45) NULL,
  PRIMARY KEY (`catid`));


CREATE TABLE `letmyfit`.`ms_catparameter` (
	id int not null,
  `paramid` INT NOT NULL,
  `catid` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  
  
CREATE TABLE `letmyfit`.`ms_products` (
  `productid` INT NOT NULL,
  `catid` INT NOT NULL,
  `productname` VARCHAR(45) NULL,
  PRIMARY KEY (`productid`));


CREATE TABLE `letmyfit`.`ms_measurements` (
  `fittingid` INT NOT NULL,
  `measurements` longtext NOT NULL,
  PRIMARY KEY (`fittingid`));
  
CREATE TABLE `letmyfit`.`ms_userfittingdetails` (
 id INT NOT NULL,
 `catid` INT NOT NULL,
  `fittingid` INT NOT NULL,
  `userid` INT NOT NULL,
  PRIMARY KEY (`id`));
  
  
  
CREATE TABLE `letmyfit`.`ms_order` (
 orderid INT NOT NULL,
 userid varchar(50),
  `productid` INT NOT NULL,
  `fittingid` INT NOT NULL,
  ordernumber varchar(50) NOT NULL,
  orderdate timestamp not null,
  orderstatus int not null,
  price double not null,
  PRIMARY KEY (`orderid`));