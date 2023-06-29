DBMS Lab Programs
===================

Create the following tables with properly specifying Primary Keys, Foreign Keys & Sovle the Following Queries.
-------------------------------------
- BRANCH (Branchid, Branchname, HOD) 
- STUDENT (USN, Name, Address, Branchid, sem) 
- BOOK (Bookid, Bookname, Authorid, Publisher, Branchid) 
- AUTHOR (Authorid, Authorname, Country, age) 
- BORROW (USN, Bookid, Borrowed_Date)

Execute the following Queries:
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


2.	Tables: 
a. STUDENT (USN, name, date_of_birth, branch, mark1, mark2, mark3, total, GPA)
Queries: 
i. Update the column total by adding the columns mark1, mark2, mark3. 
ii. Find the GPA score of all the students. 
iii. Find the students who were born on a particular year of birth from the date_of_birth column. 
iv. List the students who are studying in a particular branch of study. 
v. Find the maximum GPA score of the student branch-wise. 
vi. Find the students whose name starts with the alphabet "S". 
vii. Find the students whose name ends with the alphabets "AR". 
viii. Delete the student details whose USN is given as 1001.


3.	ER-Diagram and Queries: ER-Diagram:
•	Tournament (Tournament_id, Tournament_name, Organizer)
•	Team (Team_id, Team_name, City, Coach)
•	Player (Player_id, Name, Age)
•	Phone (Player_id, Phone_number)
•	Stadium (Stadium_id, Stadium_name, Address)
•	Match (Match_id, Team_id_1, Team_id_2, Date, Time, Winner_id)
•	Award (Match_id, Player_id)
Queries: 
i. Display the youngest player (in terms of age) Name, Team name, and age in which he belongs to the tournament. 
ii. List the details of the stadium where the maximum number of matches were played. 
iii. List the details of the player who is not a captain but got the man_of _match award at least in two matches. 
iv. Display the Team details who won the maximum matches. 
v. Display the team name where all its won matches were played in the same stadium.


4.	ER-Diagram and Queries: ER-Diagram:
•	Country (Country_id, Country_name)
•	Constituency (Constituency_id, Name, State, Number_of_voters)
•	Voter (Voter_id, Name, Age, Address, Constituency_id)
•	Candidate (Candidate_id, Name, Phone_no, Age, State, Party_id)
•	Party (Party_id, Party_Name, Party_symbol)
•	Vote (Voter_id, Candidate_id)
Queries: 
i. List the details of the candidates who are contesting from more than one constituencies which belong to different states. 
ii. Display the state name having the maximum number of constituencies. 
iii. Create a stored procedure to insert the tuple into the voter table by checking the voter age. 
iv. Create a stored procedure to display the number_of_voters in the specified constituency. 
v. Create a TRIGGER to UPDATE the count of "Number_of_voters" of the respective constituency in "CONSTITUENCY" table, AFTER inserting a tuple into the "VOTERS" table.

5.	ER-Diagram and Queries: ER-Diagram:
•	Country (Country_id, Country_name)
•	State (State_id, State_name)
•	Tourist_Place (Tourist_Place_id, Name, State_id, Distance_from_capital, History)
•	Tourist (Tourist_id, Name, Age, Country_id)
•	Tourist_Email (Tourist_id, Email)
•	Visit (Tourist_id, Tourist_Place_id, Visit_date)
Queries: 
i. List the state name which has the maximum number of tourist places. 
ii. List the details of the tourist place where the maximum number of tourists visited. 
iii. List the details of tourists who visited all tourist places of the state "KARNATAKA". 
iv. Display the details of the tourists who visited at least one tourist place of the state but visited all states' tourist places. 
v. Display the details of the tourist place visited by the tourists of all countries.


6.	Tables: 
a. STUDENT (regno#, name, major, bdate) 
b. COURSE (course#, cname, dept) 
c. TEXT (book_ISBN#, book_title, publisher, author) 
d. ENROLL (regno#, course#, sem, marks) 
e. BOOK_ADOPTION (course#, sem, book_ISBN)
Queries: 
i. List out the student details and their course details ordered in a semester-wise manner. 
ii. List out the student details under a particular department whose names are ordered in a semester-wise manner. 
iii. List out all the book details under a particular course. 
iv. Find out the Courses in which the number of students studying is more than 2. 
v. Find out the Publisher who has published more than 2 books. 
vi. Find out the authors who have written a book for the I semester, computer science course. 
vii. List out the student details whose total number of months starting from their date of birth is more than 225. 
viii. Find out the course name to which the maximum number of students have joined.


