
CREATE TABLE manufacturers (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  country VARCHAR(100)
);

CREATE TABLE model (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  manufacturer_id INT NOT NULL,
  FOREIGN KEY (manufacturer_id) REFERENCES manufacturers(id)
);

CREATE TABLE colors (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100)
);

CREATE TABLE cars (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  model_id INT NOT NULL,
  color_id INT NOT NULL,
  engine INT,
  FOREIGN KEY (model_id) REFERENCES model(id),
  FOREIGN KEY (color_id) REFERENCES colors(id)
);

