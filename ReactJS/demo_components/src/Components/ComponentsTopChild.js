import React, { Component } from "react";
import DataContext from "../Context/DataContext";

class ComponentsTopChild extends Component {
  render() {
    return (
      <div>
        <DataContext.Consumer>
          {(data) => <h3>Dữ liệu nhận được từ App: {data}</h3>}
        </DataContext.Consumer>
      </div>
    );
  }
}

export default ComponentsTopChild;
