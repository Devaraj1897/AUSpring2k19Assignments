import React, { Component } from 'react';
//import ChildComponent from './Child.component';

class ListEmployees extends Component{
    render()
    {
       console.log("Employees", this.props.employees);
       let newEmployee = this.props.employees.map((employee,i)=>{
           return i;
       });
       return(
           <div>
               <button>List Employee</button><br/><br/>
               {
                   this.props.employees && 
                     this.props.employees.map((employee,i) => {
                         return <span key={employee.name}>{employee.name} {employee.age} {employee.department} {employee.location}<br/><br/></span>;
                     })
               }
           </div>
       );


      //return React.createElement("div", null, 
      //React.createElement("span",null,<ChildComponent name={this.name}/>));
    }
  }

export default ListEmployees;