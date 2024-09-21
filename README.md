<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI1110
### Grade Calculator In Java

#### Project Description
This project is an implementation of Assignment 01 for the CSCI 1110 course (Fall 2020). The program calculates final grades for students based on their performance in tests, assignments, practicums, and Problem of the Day (PoD) assessments. It also computes class statistics including averages and medians.

#### Features
1. Calculate individual student's final grade and letter grade.
2. Process multiple students' grades.
3. Compute class averages for each assessment type.
4. Calculate class medians for each assessment type.

#### How to Run
1. Clone this repository.
2. Navigate to the project directory.
3. Compile and run the program.
   
#### Input Format
The program expects input in the following format:
1. Number of students in the class.
2. For each student-
- Banner number (String)
- 3 test scores (int)
- 5 assignment scores (int)
- 4 practicum scores (int)
- 1 PoD score (int)

Example input:
```
3
B00123456 90 95 100 85 90 90 99 10 100 95 100 100 98
B00408996 30 12 45 40 90 30 45 60 55 65 32 80 50
B00989439 85 80 79 90 80 77 88 90 87 96 81 83 80
```
The program will output:
1. Each student's banner number and final letter grade.
2. Class averages for tests, assignments, practicums, and PoDs.
3. Class medians for tests, assignments, practicums, and PoDs.
