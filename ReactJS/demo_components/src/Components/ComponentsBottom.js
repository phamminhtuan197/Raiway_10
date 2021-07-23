import React from "react";
// Tạo ComponentsBottom viết theo dạng function Components, nội dung sẽ return ra 1 react element, để trong 1 thẻ div
function ComponentsBottom(props) {
  return (
    <div className="row">
      <div className="col-xs-6 col-sm-6 col-md-6 col-lg-6">
        <div className="panel panel-warning">
          <div className="panel-heading">Components_Bottom</div>
          <div className="panel-body">
            <div>
              <textarea
                name=""
                id="input"
                className="form-control"
                rows="3"
                required="required"
              >
                {props.message}
              </textarea>
            </div>
          </div>
        </div>
      </div>
      {/* </div> */}
    </div>
  );
}
export default ComponentsBottom;
