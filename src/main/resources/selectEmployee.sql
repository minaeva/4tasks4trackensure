select employee.name as Employee
from employee
         inner join employee manager on manager.id = employee.manager_id
where employee.salary > manager.salary
