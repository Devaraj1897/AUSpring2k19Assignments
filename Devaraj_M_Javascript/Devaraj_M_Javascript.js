"use strict"

//Initializing a parent object called Employee
function employee(e_id,e_name,e_age){
	this.e_id=e_id;
	this.e_name=e_name;
    this.e_age=e_age;
}
//Initializing a child object called manager for Employee
function manager(e_id,e_name,e_age,managing_team,team_size)
{
	employee.call(this,e_id,e_name,e_age);
	this.managing_team=managing_team;
	this.team_size=team_size;
}
//Initializing a child object called hr for Employee
function hr(e_id,e_name,e_age,hr_domain)
{
 	employee.call(this,e_id,e_name,e_age);
 	this.hr_domain=hr_domain;
}
//Linking prototypes and adding prototype methods
manager.prototype=Object.create(employee.prototype);
hr.prototype=Object.create(employee.prototype);

employee.prototype.work=function(){
	console.log(this.e_name+" is working.");
}

manager.prototype.manage = function(){
	console.log(this.e_name + " is managing the team called "+ this.managing_team);
}

hr.prototype.handles= function(){
	console.log(this.e_name + " handles the domain "+this.hr_domain);
}
//Initializing individual character instances
const emp1=new manager('E01','Kishore',22,'Gryffindor',21);
const emp2=new hr('E12','Shruthi',23,'Health Care');
emp1.work();
emp1.manage();
emp2.handles();

//emp1.__proto__;
//emp2.__proto__;

//hr.__proto__.address="Cessna Tech Park, Bangalore";
//hr.prototype.__proto__;
//employee.prototype.__proto__;

//Difference between Call Apply and Bind 
//1.call
var total=function(a,b,c)
{
	console.log(this.e_age+a+b+c);
}
total.call(emp1,10,20,30);
//2.apply
var args=[10,23,30];
total.apply(emp1,args);
//3.bind
var bound=total.bind(emp1);
bound(10,25,34);