import React, { Component } from 'react';
//import ChildComponent from './Child.component';
import AddEmployee from "./Add.Employee";
import ListEmployees from "./List.Employees";
import DepartmentComponent from "./Department.Component";
import AddDepartment from './Add.Department';
class EmployeeComponent extends Component {
    state = {
        employees: [],
        departments: []
    }

    onEmployeeAdded = newEmployeeData => {
        console.log("new Data", newEmployeeData);
        let employees = [...this.state.employees];
        let newData = { ...newEmployeeData };
        employees.push(newData);
        this.setState({ employees: employees });
    };

    onDepartmentAdded = newDepartmentData => {
        console.log("new Data", newDepartmentData);
        let departments = [...this.state.departments];
        let newData = { ...newDepartmentData };
        departments.push(newData);
        this.setState({ departments: departments });
        console.log("Departments", departments)
    };

    render() {
        return (
            <React.Fragment>
                <AddEmployee onEmpAdd={this.onEmployeeAdded} departments={this.state.departments} />
                <ListEmployees employees={this.state.employees} />
                <DepartmentComponent employees={this.state.employees} departments={this.state.departments} />
                <AddDepartment onDepAdd={this.onDepartmentAdded} />
            </React.Fragment>
        );


        //return React.createElement("div", null, 
        //React.createElement("span",null,<ChildComponent name={this.name}/>));
    }
}

export default EmployeeComponent;