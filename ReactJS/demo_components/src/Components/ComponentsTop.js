import React, { Component } from "react";
import ComponentsTopChild from "./ComponentsTopChild";
// Tạo ComponentsTop viết theo dạng Class Components, chú ý có phương thức render, nôi dung sẽ return ra 1 react element, để trong 1 thẻ div
class ComponentsTop extends Component {
  constructor(props) {
    super(props);
    this.state = {
      // click_Number: 0,
      Input_Name: "",
    };
  }
  // Dem so lan click
  // click = () => {
  //   this.setState({
  //     click_Number: this.state.click_Number + 1,
  //   });
  // };

  // gui du lieu khi nhap vao input
  handleChange = (event) => {
    let name = event.target.name;
    let value = event.target.value;
    console.log(name);
    console.log(value);
    this.setState({
      [name]: value,
    });
  };

  // xu lis su kien khi click vao nut sentdata
  // click = () => {
  //   alert(this.state.Input_Name);
  // };

  // Gui du lieu tu ComponentsTop den App
  click = () => {
    this.props.getData(this.state.Input_Name);
  };

  render() {
    return (
      <div className="row">
        <div className="col-xs-6 col-sm-6 col-md-6 col-lg-6">
          <div className="panel panel-primary">
            <div className="panel-heading">{this.props.heading_panel}</div>
            <div className="panel-body">
              <div className="row">
                <form method="" id="Main_Form_ID">
                  <div className="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                    <input
                      type="text"
                      name="Input_Name"
                      id="input"
                      className="form-control"
                      value={this.state.click_Number}
                      required="required"
                      pattern=""
                      title=""
                      placeholder="Input something here"
                      // set state va render lai du lieu cho value
                      name="Input_Name"
                      value={this.state.Input_Name}
                      onChange={this.handleChange}
                    />
                  </div>

                  <div className="row">
                    <div className="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                      <button
                        type="button"
                        className="btn btn-danger"
                        onClick={this.click}
                      >
                        Sent Data
                      </button>
                    </div>
                  </div>
                </form>
              </div>
              <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
                  <ComponentsTopChild
                    dataToTopChild={this.props.dataToTopChild}
                  />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
export default ComponentsTop;
