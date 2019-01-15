import React, { Component } from 'react';
import ChildComponent from './Child.component';

class Parent extends Component{
    state={
    name: "Dheeraj"
    };
    constructor(){
        super();
        this.handleClick=this.handleClick.bind(this);
    }
    
    
    
    
    onUpdate = data => {
        console.log("Yeah we got data from child",data);
    };



        
    handleClick(){
        setTimeout(() => {
            this.setState({
                name: "Dheeraj Arya"
            });
        
        },2000);
    }
    render()
    {
       return(
           <div>
               <button  onClick={this.handleClick}>Change</button>
               {
                   this.state.name === "Dheeraj Arya" && (
                       <span>hello</span>
                   )
               }
               <ChildComponent name={this.state.name} onUpdate={this.onUpdate}/>
           </div>
       );


      //return React.createElement("div", null, 
      //React.createElement("span",null,<ChildComponent name={this.name}/>));
    }
  }

export default Parent;