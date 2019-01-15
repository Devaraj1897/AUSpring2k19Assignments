import React, { Component } from 'react';

class AddDepartment extends Component{
    data = {};

    handleChange = event => {
        console.log(event.target.value);
        this.data[event.target.id] = event.target.value;
        //console.log("Id bruh: " + event.target.id)
    }

    add = e => {
        e.preventDefault();
        console.log("data",this.data["name"]);
        var validator=true;
        if(!this.data["name"])
        {
               console.log("Enter Department");
               validator=false;
            }
        if(validator)
            this.props.onDepAdd(this.data);
    }


    render()
    {
       return(
           <div>
                <span>Department:</span><input type="text" id="name" placeholder="Enter Department" onChange={this.handleChange}/><br/><br/>
                <button onClick= {this.add}>Add</button>
           </div>
       );
    }
  }

export default AddDepartment;