# UserRegistration-JUnit
UC1: As a User need to
enter a valid First
Name
- First name starts with Cap and has
minimum 3 characters

UC2: As a User need to
enter a valid Last
Name
- Last name starts with Cap and has
minimum 3 characters

UC3: As a User need to
enter a valid email 
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) with
precise @ and . positions

UC4: As a User need to
follow pre-defined Mobile Format 
- E.g. 91 9919819801 
- Country code follow by space and 10 digit number

UC5: As a User need to
follow pre-defined Password rules. Rule1– minimum 8Characters 
- NOTE – All rules must be passed

UC6: Rule2 – Should have at least 1 Upper Case 
- NOTE – All rules must be passed

UC7: Rule3 – Should have at least 1 numeric number in the password 
- NOTE – All rules must be passed

UC8: Rule4 – Has exactly 1 Special Character
- NOTE – All rules must be passed

UC9: Should clear all email samples provided separately

UC10: Write JUnit Test to validate the User
Entry for First Name, Last Name,
Email, Mobile, and Password.
- Write Junit Test for Happy as well as Sad test
case.
- Happy Test Case validates the Entry Successfully
- Sad Test Cases fails the Entry

UC11: Write JUnit Parameterised Test to validate multiple entry
for the Email Address.

UC12: Refactor the Code to throw custom
exceptions in case of Invalid User Details 
- Rewrite all Test Cases to take in Custom
Exception for Invalid First Name, Last
Name, Email, Mobile, and Password

UC13: Refactor the Code to use Lambda Function
to validate User Entry
- Use Lambda Function to validate First
Name, Last Name, Email, Mobile, and
Password
