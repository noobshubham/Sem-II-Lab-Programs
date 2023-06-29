DBMS Lab Programs
===================

a database containing database difficulties

<br>

# College
Create the following tables with properly specifying Primary Keys, Foreign Keys & Solve the following Queries.
- BRANCH (Branchid, Branchname, HOD) 
- STUDENT (USN, Name, Address, Branchid, sem) 
- BOOK (Bookid, Bookname, Authorid, Publisher, Branchid) 
- AUTHOR (Authorid, Authorname, Country, age) 
- BORROW (USN, Bookid, Borrowed_Date)

<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li>List the details of Students who are all studying in the 2nd sem MCA.</li>
<li>List the students who have not borrowed any books.</li>
<li>Display the USN, Student name, Branch_name, Book_name, Author_name, Books_Borrowed_Date of 2nd sem MCA Students who borrowed books.</li>
<li>Display the number of books written by each Author.</li>
<li>Display the student details who have borrowed more than two books.</li>
<li>Display the student details who have borrowed books of more than one Author.</li>
<li>Display the Book names in descending order of their names.</li>
<li>List the details of students who borrowed books which are all published by the same publisher.</li>
</ol>

</details>

<br>

# Student

Consider the following Schema:
- STUDENT (USN, name, date_of_birth, branch, mark1, mark2, mark3, total, GPA)

<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li> Update the column total by adding the columns mark1, mark2, mark3.</li> 
<li> Find the GPA score of all the students.</li> 
<li> Find the students who were born on a particular year of birth from the date_of_birth column.</li> 
<li> List the students who are studying in a particular branch of study.</li> 
<li> Find the maximum GPA score of the student branch-wise.</li> 
<li> Find the students whose name starts with the alphabet "S".</li> 
<li> Find the students whose name ends with the alphabets "AR".</li> 
<li> Delete the student details whose USN is given as 1001.</li>
</ol>

</details>

<br>

# Cricket
Design an ER-Diagram for the following scenario, Convert the same into a relational model and then solve the following Queries:

ER-Diagram:
•	Tournament (Tournament_id, Tournament_name, Organizer)
•	Team (Team_id, Team_name, City, Coach)
•	Player (Player_id, Name, Age)
•	Phone (Player_id, Phone_number)
•	Stadium (Stadium_id, Stadium_name, Address)
•	Match (Match_id, Team_id_1, Team_id_2, Date, Time, Winner_id)
•	Award (Match_id, Player_id)
<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li> Display the youngest player (in terms of age) Name, Team name, and age in which he belongs to the tournament.</li> 
<li> List the details of the stadium where the maximum number of matches were played.</li> 
<li> List the details of the player who is not a captain but got the man_of _match award at least in two matches.</li> 
<li> Display the Team details who won the maximum matches.</li> 
<li> Display the team name where all its won matches were played in the same stadium.</li>
</ol>

</details>

<br>

# Voters
4.	ER-Diagram and Queries: ER-Diagram:
•	Country (Country_id, Country_name)
•	Constituency (Constituency_id, Name, State, Number_of_voters)
•	Voter (Voter_id, Name, Age, Address, Constituency_id)
•	Candidate (Candidate_id, Name, Phone_no, Age, State, Party_id)
•	Party (Party_id, Party_Name, Party_symbol)
•	Vote (Voter_id, Candidate_id)
<details>
    <summary>Execute the following Queries</summary>
<ol type="i">
<li> List the details of the candidates who are contesting from more than one constituencies which belong to different states.</li>
<li> Display the state name having the maximum number of constituencies.</li>
<li> Create a stored procedure to insert the tuple into the voter table by checking the voter age.</li>
<li> Create a stored procedure to display the number_of_voters in the specified constituency.</li>
<li> Create a TRIGGER to UPDATE the count of "Number_of_voters" of the respective constituency in "CONSTITUENCY" table, AFTER inserting a tuple into the "VOTERS" table.</li>
</ol>

</details>

<br>

# Tourism
5.	ER-Diagram and Queries: ER-Diagram:
•	Country (Country_id, Country_name)
•	State (State_id, State_name)
•	Tourist_Place (Tourist_Place_id, Name, State_id, Distance_from_capital, History)
•	Tourist (Tourist_id, Name, Age, Country_id)
•	Tourist_Email (Tourist_id, Email)
•	Visit (Tourist_id, Tourist_Place_id, Visit_date)
<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li> List the state name which has the maximum number of tourist places. </li>
<li> List the details of the tourist place where the maximum number of tourists visited. </li>
<li> List the details of tourists who visited all tourist places of the state "KARNATAKA". </li>
<li> Display the details of the tourists who visited at least one tourist place of the state but visited all states' tourist places. </li>
<li> Display the details of the tourist place visited by the tourists of all countries.</li>
</ol>

</details>

<br>

# Enrollment
Consider the following database of student enrollment in courses and books adopted for each course. 
- STUDENT (regno#: string, name: string, major: string, bdate: date) 
- COURSE (course#: int, cname: string, dept: string) 
- TEXT (book_ISBN#: int, book_title: string, publisher: string, author: string) 
- ENROLL (regno#: string, course#: int, sem: int, marks: int) 
- BOOK_ADOPTION (course#: int, sem: int, book_ISBN: int)

<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li> Create the above tables by properly specifying the primary keys and the foreign keys</li>
<li> Enter at least 7 to 10 records to each table. Execute SQL
queries for the following requirements:</li>
<li> List out the student details and their course details ordered in a semester-wise manner.</li> 
<li> List out the student details under a particular department whose names are ordered in a semester-wise manner.</li> 
<li> List out all the book details under a particular course.</li> 
<li> Find out the Courses in which the number of students studying is more than 2.</li> 
<li> Find out the Publisher who has published more than 2 books.</li> 
<li> Find out the authors who have written a book for the I semester, computer science course.</li>
<li> List out the student details whose total number of months starting from their date of birth is more than 225.</li>
<li> Find out the course name to which the maximum number of students have joined.</li>
</ol>

</details>
