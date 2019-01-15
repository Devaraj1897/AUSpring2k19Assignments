import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
//import ParentComponent from "./Parent.Component";
//import ChildComponent from "./Child.component";
import EmployeeComponent from './Employee.Component';


class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    );
  }
}

class ComponentName extends Component{
  render()
  {
    return React.createElement("div", null, <EmployeeComponent />);
  }
}
//const FunctionComponent = (props) => {
  //return (
    //React.createElement("div", null, React.createElement("span",null,
    //React.createElement("span", null, props.name +" Function "+ props.lname))
    //)
  //);
//}

export default ComponentName;
//export default FunctionComponent;
