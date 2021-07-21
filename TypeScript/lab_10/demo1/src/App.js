import React from "react";
import "./App.css";

function App() {
  // const divStyle = {
  //   color: 'red',
  //   backgroundColor: 'blue',
  //   with: '200px',
  //   height: '200px',
  //   texAlign: 'center',
  //   paddingTop: '50px'

  // }
  const handleClick = () => {
    alert("Hello!!");
    console.log("Ban vua click!!");
  };
  return (
    // React.createElement('div', {style: divStyle}, React.createElement('h1', null, "Hello VTI"))
    // <div className="App" style = {divStyle}>
    <div className="App">
      <h1>Hello VTI JSX</h1>
      <button type="button" onClick={handleClick}>
        Click me
      </button>
    </div>
  );
}

export default App;
