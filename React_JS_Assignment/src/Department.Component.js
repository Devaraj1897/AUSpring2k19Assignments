import React, { Component } from 'react';

class DepartmentComponent extends Component {

    data = {};
    state = {
        shown: false,
        filteredEmployees: []
    }
    handleChange = event => {
        this.data[event.target.id] = event.target.value;
    }

    getDepartment = e => {
        e.preventDefault()
        // this.setState({ shown: true });

        let filteredEmployees = this.props.employees.filter((employee) => {
            if (employee.department === this.data.departments) {
                return true;
            } else {
                return false;
            }
        });
        this.setState({ filteredEmployees: filteredEmployees });
        //console.log(this.props.employees);
        console.log("Shown true", this.data);
    }

    render() {
        console.log("this.employees",this.props.employees);
        
        return (
            
            <div>
                <select id="departments" onChange={this.handleChange}>
                    {
                        this.props.departments && this.props.departments.map((department, i) => {
                            return (
                                <option key={department.name}>{department.name}</option>
                            )
                        })
                    }
                </select>
                <button onClick={this.getDepartment}>List Employees as per department</button>
                {
                    <div>
                        <h1>Here i am</h1>
                        {
                            this.state.filteredEmployees &&
                            this.state.filteredEmployees.map((employee, i) => {

                                return (<span key={employee.name}>
                                    {employee.name}
                                    {employee.age}
                                    {employee.department}
                                    {employee.location}
                                    <br /><br /></span>);


                            })
                        }
                    </div>
                }
            </div>
        );
    }
}

export default DepartmentComponent;