DBMS Lab Programs
===================

a database containing database problems

<br>

# College
Create the following tables with properly specifying Primary Keys, Foreign Keys & Solve the following Queries.
```
BRANCH (Branchid, Branchname, HOD)
STUDENT (USN, Name, Address, Branchid, sem)
BOOK (Bookid, Bookname, Authorid, Publisher, Branchid)
AUTHOR (Authorid, Authorname, Country, age)
BORROW (USN, Bookid, Borrowed_Date)
```

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

> [The answer to all of queries can be found right here.](https://pasty.lus.pm/6wxBcU)

</details>

<br>

# Student

Consider the following Schema:

```
STUDENT (USN, name, date_of_birth, branch, mark1, mark2, mark3, total, GPA)
```

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

> [The answer to all of queries can be found right here.](https://pasty.lus.pm/HuZ18T)

</details>

<br>

# Cricket
Design an ER-Diagram for the following scenario, Convert the same into a relational model and then solve the following Queries: 
- Consider a Cricket Tournament “ABC CUP” organized by an organization. 
- In the tournament there are many teams are contesting each having a Teamid, Team_Name, City, a coach. Each team is uniquely identified by using Teamid.
- A team can have many Players and a captain. Each player is uniquely identified by Playerid, having a Name, and multiple phone numbers, age. 
- A player represents only one team. There are many Stadiums to conduct matches. Each stadium is
identified using Stadium_id, having a stadium_name, Address (involves city, area_name, pincode).
- A team can play many matches. Each match played between the two teams in the scheduled date and time in the predefined Stadium. Each match is identified uniquely by using Match_id. Eachmatch won by any of the one team that also wants to record in the database. 
- For each match man_of_the match award given to a player.

<details>
    <summary>Hint: ER-Diagram</summary>
    
```
Tournament (Tournament_id, Tournament_name, Organizer)
Team (Team_id, Team_name, City, Coach)
Player (Player_id, Name, Age)
Phone (Player_id, Phone_number)
Stadium (Stadium_id, Stadium_name, Address)
Match (Match_id, Team_id_1, Team_id_2, Date, Time, Winner_id)
Award (Match_id, Player_id)
```

</details>


<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li> Display the youngest player (in terms of age) Name, Team name, and age in which he belongs to the tournament.</li> 
<li> List the details of the stadium where the maximum number of matches were played.</li> 
<li> List the details of the player who is not a captain but got the man_of _match award at least in two matches.</li> 
<li> Display the Team details who won the maximum matches.</li> 
<li> Display the team name where all its won matches were played in the same stadium.</li>
</ol>

> [The answer to all of queries can be found right here.](https://pasty.lus.pm/uDLmwx)

</details>

<br>

# Voters
- A country wants to conduct an election for the parliament. 
- A country having many constituencies. Each constituency is identified uniquely by Constituency_id, having the Name, belongs to a state,Number_of_voters. 
- A constituency can have many voters. Each voter is uniquely identified by using Voter_id, having the Name, age, address (involves Houseno,city,state,pincode). Each voter belongs to only one constituency. 
- There are many candidates contesting in the election. Each candidates are uniquely identified by using candidate_id, having Name, phone_no, age, state. A candidate belongs to only one party.
- There are many parties. Each party is uniquelyidentified by using Party_id, having Party_Name,Party_symbol. A candidate can contest from many constituencies under a same party. A party can have
many candidates contesting from different constituencies. No constituency having the candidates from the same party.
A constituency can have many contesting candidates belongs to different parties. 
- Each voter votes only one candidate
of his/her constituencty

<details>
    <summary>Hint: ER-Diagram</summary>

```
Country (Country_id, Country_name)
Constituency (Constituency_id, Name, State, Number_of_voters)
Voter (Voter_id, Name, Age, Address, Constituency_id)
Candidate (Candidate_id, Name, Phone_no, Age, State, Party_id)
Party (Party_id, Party_Name, Party_symbol)
Vote (Voter_id, Candidate_id)
```
</details>


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
Design an ER-diagram for the following scenario, Convert the same into a relational model, normalize Relations into a
suitable Normal form and then solve the following queries. 
- A country can have many Tourist places. 
- Each Tourist place is identified by using tourist_place_id, having a name, belongs to a state, Number of kilometers away from the 02.03.2021 updated 52/ 104 capital city of that state, history. There are many Tourists visits tourist places every year.
- Each tourist is identified uniquely by using Tourist_id, having a Name, age, Country and multiple emailids. 
- A tourist visits many Tourist places, it is also required to record the visted_date in the database. A tourist can visit a Tourist place many times at different dates. A Tourist place can be visited by many tourists either in the same date or at different
dates.

<details>
    <summary>Hint: ER-Diagram</summary>

```
Country (Country_id, Country_name)
State (State_id, State_name)
Tourist_Place (Tourist_Place_id, Name, State_id, Distance_from_capital, History)
Tourist (Tourist_id, Name, Age, Country_id)
Tourist_Email (Tourist_id, Email)
Visit (Tourist_id, Tourist_Place_id, Visit_date)
```
</details>

<details>
    <summary>Execute the following Queries</summary>

<ol type="i">
<li> List the state name which has the maximum number of tourist places. </li>
<li> List the details of the tourist place where the maximum number of tourists visited. </li>
<li> List the details of tourists who visited all tourist places of the state "KARNATAKA". </li>
<li> Display the details of the tourists who visited at least one tourist place of the state but visited all states' tourist places. </li>
<li> Display the details of the tourist place visited by the tourists of all countries.</li>
</ol>


> [The answer to all of queries can be found right here.](https://pasty.lus.pm/PFED5F)

</details>

<br>

# Enrollment
Consider the following database of student enrollment in courses and books adopted for each course. 
```
STUDENT (regno#: string, name: string, major: string, bdate: date) 
COURSE (course#: int, cname: string, dept: string) 
TEXT (book_ISBN#: int, book_title: string, publisher: string, author: string) 
ENROLL (regno#: string, course#: int, sem: int, marks: int) 
BOOK_ADOPTION (course#: int, sem: int, book_ISBN: int)
```

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
