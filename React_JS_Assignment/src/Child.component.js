import React, { Component } from 'react';


const ChildComponent = (props) => {
    //return (
      //React.createElement("div", null, React.createElement("span",null,props.name)
      //)
    //);
    let localFn = () =>{
        props.onUpdate("hello");
    };
    return (
        <div>
            <button onClick={ localFn}>
             Send data back
            </button>
        </div>
    );
  };

export default ChildComponent;