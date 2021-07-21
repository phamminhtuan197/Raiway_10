import React, { Component } from "react";
// Tạo ComponentsTop viết theo dạng Class Components, chú ý có phương thức render, nôi dung sẽ return ra 1 react element, để trong 1 thẻ div
class ComponentsTop extends Component {
  render() {
    return (
      <div className="row">
        <div className="col-xs-6 col-sm-6 col-md-6 col-lg-6">
          <div className="panel panel-primary">
            <div className="panel-heading">Components_Top</div>
            <div className="panel-body">
              <div className="row">
                <form method="" id="Main_Form_ID">
                  <div className="col-xs-10 col-sm-10 col-md-10 col-lg-10">
                    <input
                      type="text"
                      name="Input_Name"
                      id="input"
                      className="form-control"
                      value=""
                      required="required"
                      pattern=""
                      title=""
                      placeholder="Input something here"
                    />
                  </div>

                  <div className="row">
                    <div className="col-xs-2 col-sm-2 col-md-2 col-lg-2">
                      <button type="button" className="btn btn-danger">
                        Sent Data
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
export default ComponentsTop;
