import React, { Component } from "react";
import "./App.css";
import ComponentsBottom from "./Components/ComponentsBottom";
import ComponentsTop from "./Components/ComponentsTop";
import DataContext from "./Context/DataContext";
// function App() {
//   // Ham nhan lai du lieu tu ComponentsTop
//   let getDataFromComponentsTop = (data) => {
//     console.log("data APP: ", data);
//     alert("Du lieu App nhan duoc tu ComponentsTop: " + data);
//   };
//   return (
//     <div className="App">
//       <ComponentsTop
//         heading_panel="-----Components Top-----"
//         getData={getDataFromComponentsTop}
//       />
//       <br />
//       <br />
//       <ComponentsBottom message="Wellcome to VTI Academy!" />
//     </div>
//   );
// }

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      data: "",
    };
  }
  getDataFromComponentsTop = (data) => {
    this.setState({
      data: data,
    });
  };
  render() {
    let data = this.state.data;
    return (
      <div>
        <div className="App">
          <DataContext.Provider value={"This is data  From App to Top_Child"}>
            <ComponentsTop
              heading_panel="-----Components Top-----"
              getData={this.getDataFromComponentsTop}
              dataToTopChild={"This is data From App to Top_Child"}
            />
          </DataContext.Provider>
          <br />
          <br />

          <ComponentsBottom message="Wellcome to VTI Academy" data={data} />
        </div>
      </div>
    );
  }
}
export default App;
