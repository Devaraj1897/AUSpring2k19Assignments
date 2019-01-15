import React, { Component } from 'react';

class AddEmployee extends Component{
    data = {};
    state = {
        shown: false
    }

    onClick = () => {
       this.setState({shown: true});
    };
    onCancel = e => {
        e.preventDefault();
        this.setState({ shown: false});
    };

    handleChange = event => {
        //console.log(event.target.value);
        this.data[event.target.id] = event.target.value;
        //console.log("Id bruh: " + event.target.id)
    }
    
    add = e => {
        e.preventDefault();
        console.log("data",this.data);
        
        var validator=true;
        if(!this.data["age"] || this.data["age"]<19) 
        {
               console.log("Invalid age");
               alert("Invalid age");
               validator=false;
            } 
        if(!this.data["name"])
        {
               console.log("Enter name");
               alert("Enter name");
               validator=false;
            }
            else{
                if(document.getElementById("name").value.length>20)
                {
                    validator=false;
                    alert("Name too long");
                }
            }
        if(validator)
            this.props.onEmpAdd(this.data);
    }


    render()
    {
       return(
           <div>
               <button onClick={this.onClick}>Add Employee</button>
               {this.state.shown && (
               <div>
                   <form>
                       <span>First Name:</span><input type="text" id="name" placeholder="Enter First name" onChange={this.handleChange}/><br/><br/>
                       <span>Last Name:</span><input type="text" id="lastname" placeholder="Enter last name" onChange={this.handleChange}/><br/><br/>
                       <span>Age:</span><input type="text" id="age" placeholder="Enter age" onChange={this.handleChange}/><br/><br/>
                       <span>Department:</span><select id="department" onChange={this.handleChange} >
                            {
                                this.props.departments && this.props.departments.map((department, i) => {
                                    return (
                                        <option key={department.name}>{department.name}</option>
                                    )
                                })
                            }
                            </select>
                       <span>Designation:</span><input type="text" id="designation" placeholder="Enter designation" onChange={this.handleChange}/><br/><br/>
                       <span>Location:</span><input type="text" id="location" placeholder="Enter location" onChange={this.handleChange}/><br/><br/>
                       <button onClick= {this.add}>Add</button>
                       <button onClick={this.onCancel}>Cancel</button>
                   </form>
               </div>
               )}
           </div>
       );


      //return React.createElement("div", null, 
      //React.createElement("span",null,<ChildComponent name={this.name}/>));
    }
  }

export default AddEmployee;