# Internship

Use Case:
Students apply for internships; companies shortlist, HR tracks progress and issues offer 
letters.(Edited)


a company can have many internships 
a student can apply for multiple internships


1. Student Entity -
    1. id
    2. name

2. Company Entity -
    1. id
    2. name

3. internships entity
    1. id
    2. company id
    3. intern role

4. apply Entity
    1. id
    2. stud id
    3. company id
    4. intern id
    5. status

5. HR entity
    1. id
    2. company id
    3. HR name

6. offer entity
    1. id
    2. company id
    3. hr id
    4. intern id
    5. stud id
    6. date

Company -> internship - one to many
internship -> company - many to one 

student -> intership - one to many
intern -> student - many to one

apply -> student - many to one
student -> apply - one to many

apply -> company - many to one
company -> apply - one to many

apply -> intern - many to one
intern -> apply - one to many

