var listAccount = []
var listDepartment = []
var listPosition = []


$(function () {

    getListDepartment();
    getListPosition();

    $('#reset_bnt').click(function () {
        $('#FullName_ID').val("")
        $('#Email_ID').val("")
        $('#UserName_ID').val("")
        $('#FullName_ID').val("")
        $('#Password_ID').val("")
        $('#Re_Password_ID').val("")
    });

    $('#Main_From_id').submit(function () {
        var n_Email_ID = $('#Email_ID').val();
        var n_UserName_ID = $('#UserName_ID').val();
        var n_Password_ID = $('#Password_ID').val();
        var n_Re_Password_ID = $('#Re_Password_ID').val();
        var n_FullName_ID = $('#FullName_ID').val();
        var n_Department_ID = "Nhân sự";
        var n_Position_ID = "Dev";
        // var n_Create_Date_id = $('#Create_Date_id').val();


        if (n_Password_ID != n_Re_Password_ID) {
            alert('Mật khẩu không trùng khớp')
        }

        if (!n_Email_ID || n_Email_ID.length < 6 || n_Email_ID.length > 50) {
            // show thông báo
            alert("Email must be from 6 to 50 characters!")
            return false;
        }
        if (!n_UserName_ID || n_UserName_ID.length < 6 || n_UserName_ID.length > 50) {
            // show thông báo
            alert("Username must be from 6 to 50 characters!")
            return false;
        }
        if (!n_FullName_ID || n_FullName_ID.length < 6 || n_FullName_ID.length > 50) {
            // show thông báo
            alert("Fullname must be from 6 to 50 characters!")
            return false;
        }

        //Get đc id của department và position khi người dùng chọn vào tên của phòng ban. get trong list dep và post
        // Lấy ra id của Depaertment:
        // biến let đc khai báo có scope là block scoped. cho phép chúng ta cập nhập lại giá trị của biến. không cho phép tái khai báo giá trị của biến.
        for (let index = 0; index < listDepartment.length; index++) {
            if (listDepartment[index].departmentName == n_Department_ID) {
                var depID = listDepartment[index].departmentID
            }

        }
        // Lấy ra id của Position:
        // biến let đc khai báo có scope là block scoped. cho phép chúng ta cập nhập lại giá trị của biến. không cho phép tái khai báo giá trị của biến.
        for (let index = 0; index < listPosition.length; index++) {
            if (listPosition[index].positionName == n_Position_ID) {
                var posID = listPosition[index].positionID
            }

        }


        $.ajax({
            url: 'http://localhost:8080/api/v1/accounts/EmailExists/' + n_Email_ID,
            type: 'GET',
            contentType: "application/json",
            dataType: 'json', // datatype return
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
            },
            success: function (data, textStatus, xhr) {
                console.log(data);
                if (data) {
                    alert("Email đã tồn tại trên hệ thống")
                    return false;
                } else {
                    // Check Username đã có trên hệ thống hay chưa?
                    $.ajax({
                        url: 'http://localhost:8080/api/v1/accounts/UserNameExists/' + n_UserName_ID,
                        type: 'GET',
                        contentType: "application/json",
                        dataType: 'json', // datatype return
                        beforeSend: function (xhr) {
                            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
                        },
                        success: function (data, textStatus, xhr) {
                            console.log(data);
                            if (data) {
                                alert("Username đã tồn tại trên hệ thống")
                                return false;
                            } else {

                                // tạo ra 1 account chứa dữ liệu 
                                var account = {
                                    'email': n_Email_ID,
                                    'userName': n_UserName_ID,
                                    'fullName': n_FullName_ID,
                                    'departmentID': depID,
                                    'positionID': posID,
                                    'password': n_Password_ID,
                                    // 'CreateDate': n_Create_Date_id
                                }

                                $.ajax({
                                    url: 'http://localhost:8080/api/v1/accountsRegister/',
                                    type: 'POST',
                                    data: JSON.stringify(account),
                                    contentType: "application/json; charset=UTF-8",
                                    beforeSend: function (xhr) {
                                        xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
                                    },
                                    success: function (data, textStatus, xhr) {
                                        console.log(data);
                                        alert("Đăng ký thành công. Mời bạn xác thực Email để đang kí tài khoản")
                                        window.location.replace("http://127.0.0.1:5500/QLNV/login.html")
                                    },
                                    error(jqXHR, textStatus, errorThrown) {

                                        alert("error loading data");
                                        console.log(jqXHR);
                                        console.log(textStatus);
                                        console.log(errorThrown);

                                    }
                                });

                            }
                        },
                        error(jqXHR, textStatus, errorThrown) {
                            console.log(jqXHR);
                            console.log(textStatus);
                            console.log(errorThrown);
                        }
                    });

                }
            },
            error(jqXHR, textStatus, errorThrown) {
                console.log(jqXHR);
                console.log(textStatus);
                console.log(errorThrown);
            }
        });

        return false;
    });
})

function getListDepartment() {
    $.ajax({
        url: "http://localhost:8080/api/v1/departments/",
        type: 'GET',
        contentType: "application/json",
        dataType: 'json', // datatype return
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" +
                localStorage.getItem("PASSWORD")));
        },
        success: function (data, textStatus, xhr) {
            data.forEach(function (item) {
                var department = {
                    'departmentID': item.departmentID,
                    'departmentName': item.departmentName,
                }
                listDepartment.push(department)
            });
            for (let index = 0; index < listDepartment.length; index++) {
                $('#Department_ID').append(`
        <option>${listDepartment[index].departmentName}</option>
        `)
            }
        },
        error(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function getListPosition() {
    $.ajax({
        url: "http://localhost:8080/api/v1/positions/",
        type: 'GET',
        contentType: "application/json",
        dataType: 'json',
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" +
                localStorage.getItem("PASSWORD")));
        },
        success: function (data, textStatus, xhr) {
            data.forEach(function (item) {
                var position = {
                    'positionID': item.positionID,
                    'positionName': item.positionName,
                }
                listPosition.push(position)
            });
            for (let index = 0; index < listPosition.length; index++) {
                $('#Position_ID').append(`
                <option>${listPosition[index].positionName}</option>
                `)
            }
        },
        error(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

var storage = {
    saveRememberMe(isRememberMe) {
        localStorage.setItem("IS_REMEMBER_ME", isRememberMe);
    },

    getRememberMe() {
        var RememberMeStr = localStorage.getItem("IS_REMEMBER_ME");
        if (RememberMeStr == null) {
            return true;
        }
        return JSON.parse(RememberMeStr.toLowerCase());
    },

    setItem(key, value) {
        if (this.getRememberMe()) {
            localStorage.setItem(key, value);
        } else {
            sessionStorage.setItem(key, value);
        }
    },
    getItem(key) {
        if (this.getRememberMe()) {
            localStorage.getItem(key);
        } else {
            sessionStorage.getItem(key);
        }

    },
    removeItem(key) {
        if (this.getRememberMe()) {
            localStorage.removeItem(key);
        } else {
            sessionStorage.removeItem(key);
        }
    }
};