CREATE TABLE simulation (
  id INT(6) AUTO_INCREMENT,
  simulation_number VARCHAR(10) NOT NULL,
  start_date DATE NOT NULL,
  duration INT(6) NOT NULL,
  frequency VARCHAR(10) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  birth_date DATE NOT NULL,
  phone_number VARCHAR(50) NOT NULL,
  email VARCHAR(50),
  PRIMARY KEY(id)
);

CREATE TABLE insurance (
  id INT(6) AUTO_INCREMENT,
  code VARCHAR(10) NOT NULL,
  sum DECIMAL(10,2) NOT NULL,
  base_product VARCHAR(1) NOT NULL,
  sim_id INT(6),
  PRIMARY KEY(id),
  FOREIGN KEY (sim_id) references simulation(id)
);