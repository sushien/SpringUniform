# SpringUniform
displays students school uniform information in json



the csv file is loaded into sql database using following command:

LOAD DATA LOCAL INFILE 'data.csv' INTO TABLE uniform_data (Id, Student_Name, School_Name, Uniform_Id);
