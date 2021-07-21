
var listAccount = []
var listDepartment = []
var listPosition = []
// Khai báo các biến sử dụng trong phân trang
var currentPage = 1;
var size = 5;
// Lưu thông tin tổng số trang
var totalPages;
// Tạo các biến sử dụng để sort, ban đầu mặc định khi khởi động sẽ sort theo id
var sortField = "accountID";
var isAsc = true;
$(function () {

    getListEmployees();
    getListDepartment();
    getListPosition();
    showAvatar();

    $('#CreateDate_ID').attr('disabled', 'disabled')
    $('#ID_ID').attr('disabled', 'disabled')

    $('#reset_btn').click(function () {

        $('#ID_ID').val("")
        $('#Email_ID').val("")
        $('#UserName_ID').val("")
        $('#FullName_ID').val("")
        $('#Department_ID').val("")
        $('#Position_ID').val("")
        $('#CreateDate_ID').val("")
    })


    $('#Main_Form_ID').submit(function () {
        var v_ID_ID = $('#ID_ID').val()
        var v_Email_ID = $('#Email_ID').val()
        var v_UserName_ID = $('#UserName_ID').val()
        var v_FullName_ID = $('#FullName_ID').val()
        var v_Department_ID = $('#Department_ID').val()
        var v_Position_ID = $('#Position_ID').val()
        //  var v_CreateDate_ID = $('#CreateDate_ID').val()

        if (!v_Email_ID || v_Email_ID.length < 6 || v_Email_ID.length > 50) {
            // show error message
            alert("Email must be from 6 to 50 characters!");
            return false;
        }
        if (!v_UserName_ID || v_UserName_ID.length < 6 || v_UserName_ID.length > 50) {
            // show error message
            alert("UserName must be from 6 to 50 characters!");
            return false;
        }
        if (!v_FullName_ID || v_FullName_ID.length < 6 || v_FullName_ID.length > 50) {
            // show error message
            alert("FullName must be from 6 to 50 characters!");
            return false;
        }
        if (!v_Department_ID || v_Department_ID == '--Select a Department--') {
            // show error message
            alert("Pls choose Department!");
            return false;
        }
        if (!v_Position_ID || v_Position_ID == '--Select a Position--') {
            // show error message
            alert("Pls choose Position!");
            return false;
        }

        for (let index = 0; index < listDepartment.length; index++) {
            if (listDepartment[index].departmentName == v_Department_ID) {
                var depID = listDepartment[index].departmentID
            }
        }
        for (let index = 0; index < listPosition.length; index++) {
            if (listPosition[index].positionName == v_Position_ID) {
                var posID = listPosition[index].positionID
            }
        }

        $.ajax({
            url: "http://localhost:8080/api/v1/accounts/EmailExists/" + v_Email_ID,
            type: 'GET',
            contentType: "application/json",
            dataType: 'json', // datatype return
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME")
                    + ":" + localStorage.getItem("PASSWORD")));
            },
            success: function (data, textStatus, xhr) {
                if (data) {
                    alert("Email đã tồn tại trên hệ thống")
                    return false;
                } else {
                    $.ajax({
                        url: "http://localhost:8080/api/v1/accounts/UserNameExists/" + v_UserName_ID,
                        type: 'GET',

                        contentType: "application/json",
                        dataType: 'json', // datatype return
                        beforeSend: function (xhr) {
                            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem
                                ("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
                        },
                        success: function (data, textStatus, xhr) {
                            if (data) {
                                alert("Username đã tồn tại trên hệ thống")
                                return false;
                            } else {
                                $.ajax({
                                    url: 'http://localhost:8080/api/v1/accounts/',
                                    type: 'POST',
                                    data: JSON.stringify(account),
                                    contentType: "application/json",
                                    beforeSend: function (xhr) {
                                        xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME")
                                            + ":" + localStorage.getItem("PASSWORD")));
                                    },
                                    success: function (data, textStatus, xhr) {
                                        currentPage = totalPages;
                                        getListEmployees();
                                    },
                                    error(jqXHR, textStatus, errorThrown) {
                                        alert("Error when loading data");
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
        var account = {
            'email': v_Email_ID,
            'userName': v_UserName_ID,
            'fullName': v_FullName_ID,
            'departmentID': depID,
            'positionID': posID,
            // 'CreateDate': v_CreateDate_ID
        }


        return false;

    })
})

function showAccount() {
    $('#Email_ID').removeAttr("disabled")
    $('#UserName_ID').removeAttr("disabled")

    $('#Result_TB').empty()

    for (var index = 0; index < listAccount.length; index++) {
        $('#Result_TB').append(`
              <tr>
              <th>${listAccount[index].accountID}</th>
              <th>${listAccount[index].email}</th>
              <th>${listAccount[index].userName}</th>
              <th>${listAccount[index].fullName}</th>
              <th>${listAccount[index].department}</th>
              <th>${listAccount[index].position}</th>   
              <th>${listAccount[index].createDate}</th>
              <th><button class="btn btn-warning" onclick="editAccount(${index})">Edit</button></th>
              <th><button class="btn btn-warning" onclick="deleteAccount(${index})">Delete</button></th>
              </tr>
              `)
    }
}

function deleteAccount(Index) {
    var v_del_ID = listAccount[Index].accountID;

    var confirm_del = confirm('Bạn có chắc chắn muốn xóa Account này không')
    if (confirm_del) {
        $.ajax({
            url: 'http://localhost:8080/api/v1/accounts/' + v_del_ID,
            type: 'DELETE',
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + " : " + localStorage.getItem("PASSWORD")));
            },
            success: function (result) {
                // error
                if (result == undefined || result == null) {
                    alert("Error when loading data");
                    return;
                }
                // success
                resetPaging();
                getListEmployees();
            }
        });
    } else {
        return
    }
}

function editAccount(Index) {
    $('#ID_ID').val(listAccount[Index].accountID)
    $('#Email_ID').val(listAccount[Index].email)
    $('#UserName_ID').val(listAccount[Index].userName)
    $('#FullName_ID').val(listAccount[Index].fullName)
    $('#Department_ID').val(listAccount[Index].department)
    $('#Position_ID').val(listAccount[Index].position)
    $('#CreateDate_ID').attr('disabled', 'disabled')


    $('#update_btn').click(function () {
        var v_ID_ID = $('#ID_ID').val()
        var v_Email_ID = $('#Email_ID').val()
        var v_UserName_ID = $('#UserName_ID').val()
        var v_FullName_ID = $('#FullName_ID').val()
        var v_Department_ID = $('#Department_ID').val()
        var v_Position_ID = $('#Position_ID').val()
        // var v_CreateDate_ID = $('#CreateDate_ID').val()

        for (let index = 0; index < listDepartment.length; index++) {
            if (listDepartment[index].departmentName == v_Department_ID) {
                var depID = listDepartment[index].departmentID
            }
        }

        for (let index = 0; index < listPosition.length; index++) {
            if (listPosition[index].positionName == v_Position_ID) {
                var posID = listPosition[index].positionID
            }
        }
        if (!v_FullName_ID || v_FullName_ID.length < 6 || v_FullName_ID.length > 50) {
            // show error message
            alert("FullName must be from 6 to 50 characters!");
            return false;
        }
        var account = {
            // 'AccountID': v_ID_ID,
            'email': v_Email_ID,
            'userName': v_UserName_ID,
            'fullName': v_FullName_ID,
            'departmentID': depID,
            'positionID': posID,
            // 'CreateDate': v_CreateDate_ID,
        }
        $.ajax({
            url: 'http://localhost:8080/api/v1/accounts/' + v_ID_ID,
            type: 'PUT',
            data: JSON.stringify(account), // body
            contentType: "application/json", // type of body (json, xml, text)
            beforeSend: function (xhr) {
                xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
            },
            success: function (data, textStatus, xhr) {
                getListEmployees();
            },
            error(jqXHR, textStatus, errorThrown) {
                alert("Error when loading data");
                console.log(jqXHR);
                console.log(textStatus);
                console.log(errorThrown);
            }
        });
    })
}



function getListEmployees() {

    var url = "http://localhost:8080/api/v1/accounts/";
    url += "?page=" + currentPage + "&size=" + size;
    url += "&sort=" + sortField + "," + (isAsc ? "asc" : "desc");
    var search = $('#search-input').val();
    if (search != null) {
        url += "&search=" + search;
    }
    // 
    $.ajax({
        url: url,
        type: 'GET',
        contentType: "application/json",
        dataType: 'json', // datatype return
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" +
                localStorage.getItem("PASSWORD")));
        },
        success: function (data, textStatus, xhr) {
            // reset list employees
            listAccount = [];
            parseData(data);
            showAccount();
            totalPages = data.totalPages;
            pagingTable(totalPages);
        },
        error(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function parseData(data) {

    data.content.forEach(function (item) {
        var account = {
            'accountID': item.accountID,
            'email': item.email,
            'userName': item.userName,
            'fullName': item.fullName,
            'department': item.department,
            'position': item.position,
            'createDate': item.createDate,
        }
        listAccount.push(account)
    });
}

function getListDepartment() {
    // $.get("http://localhost:8080/api/v1/departments/", function (data, status) {
    //     listDepartment = [];

    //     if (status == "error") {

    //         alert("Error when loading data");
    //         return;
    //     }
    //     data.forEach(function (item) {
    //         var department = {
    //             'departmentID': item.departmentID,
    //             'departmentName': item.departmentName
    //         }
    //         listDepartment.push(department)
    //     });
    //     for (let index = 0; index < listDepartment.length; index++) {
    //         $('#Department_ID').append(`
    //         <option>${listDepartment[index].departmentName}</option>
    //         `)
    //     }
    // });
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
    // $.get("http://localhost:8080/api/v1/positions/", function (data, status) {
    //     listPosition = [];

    //     if (status == "error") {

    //         alert("Error when loading data");
    //         return;
    //     }
    //     data.forEach(function (item) {
    //         var position = {
    //             'positionID': item.positionID,
    //             'positionName': item.positionName
    //         }
    //         listPosition.push(position)
    //     });
    //     for (let index = 0; index < listPosition.length; index++) {
    //         $('#Position_ID').append(`
    //         <option>${listPosition[index].positionName}</option>
    //         `)
    //     }
    // });
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

// Nhóm hàm xử lý phân trang
// Hàm Gen ra các icon dùng trong phân trang
function pagingTable(pageAmount) {
    var pagingStr = "";
    if (pageAmount > 1 && currentPage > 1) {
        pagingStr +=
            '<li class="page-item">' +
            '<a class="page-link" onClick="prevPaging()">Previous</a>' +
            '</li>';
    }
    // Hàm Gen nút số trang 1,2,3 ...
    for (i = 0; i < pageAmount; i++) {
        pagingStr +=
            '<li class="page-item ' + (currentPage == i + 1 ? "active" : "") + '">' +
            '<a class="page-link" onClick="changePage(' + (i + 1) + ')">' + (i + 1) + '</a>' +
            '</li>';
    }
    // Hàm Gen nút Next
    if (pageAmount > 1 && currentPage < pageAmount) {
        pagingStr +=
            '<li class="page-item">' +
            '<a class="page-link" onClick="nextPaging()">Next</a>' +
            '</li>';
    }
    $('#pagination').empty();
    $('#pagination').append(pagingStr);
}
// Hàm thực hiện khi nhấn vào các nút phân trang 1, 2, 3
function changePage(page) {
    if (page == currentPage) {
        return;
    }
    currentPage = page;
    getListEmployees();
}
// Hàm reset về trang mặc định, trang đầu tiên 1. Sử dụng khi xóa dữ liệu
function resetPaging() {
    currentPage = 1;
    size = 5;
}
// Hàm xử lý khi nhấn nút Previous
function prevPaging() {
    changePage(currentPage - 1);
}
// Hàm xử lý khi nhấn nút next
function nextPaging() {
    changePage(currentPage + 1);
}

// Nhóm hàm xử lý Sort dữ liệu
function changeSort(field) {
    if (field == sortField) {
        isAsc = !isAsc;
    } else {
        sortField = field;
        isAsc = true;
    }
    getListEmployees();
}

function handleSearch() {
    getListEmployees();
}

function returnPageRegister() {
    window.location.replace("http://127.0.0.1:5500/QLNV/RegisterPage.html")
}

function loginSuccess() {
    var v_UserName_Login_ID = $('#UserName_Login_ID').val()
    var v_Password_Login_ID = $('#Password_Login_ID').val()

    $.ajax({
        url: 'http://localhost:8080/api/v1/login',
        type: 'GET',
        contentType: "application/json",
        dataType: 'json',
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", "Basic " + btoa(v_UserName_Login_ID + ":" + v_Password_Login_ID));
        },
        success: function (data, textStatus, xhr) {
            if (data.status == "NOT_ACTIVE") {
                alert("Tài khoản chưa kích hoạt, vui lòng kích hoạt để sử dụng.")
                return;
            } else if (data.status == "ACTIVE") {
                alert("Chào mừng " + v_UserName_Login_ID + "Đăng nhập thành công")
            }

            localStorage.setItem("ID", data.accountID);
            localStorage.setItem("FULL_NAME", data.fullName);
            localStorage.setItem("USERNAME", v_UserName_Login_ID);
            localStorage.setItem("PASSWORD", v_Password_Login_ID);
            localStorage.setItem("Role", data.role);
            localStorage.setItem("Role", data.status);
            console.log(data);
            window.location.replace("http://127.0.0.1:5500/QLNV/QLNV.html");
        },
        error(jqXHR, textStatus, errorThrown) {
            if (jqXHR.status == 401) {
                alert("Kiểm tra lại thông tin!!")
            } else {
                console.log(jqXHR);
                console.log(textStatus);
                console.log(errorThrown);
            }
        }
    });
}
function handKeyUpEventForSearching(event) {
    if (event.keyCode === 13) {
        event.preventDefault();
        loginSuccess();
    }

}

// Nhóm hàm Show Avatar
function showAvatar() {
    // Get ImgName
    var url = "http://localhost:8080/api/v1/files/image/";
    url += localStorage.getItem("ID"); // Gửi kèm id của User đăng nhập cho Backend
    $.ajax({
        url: url,
        type: 'GET',
        // Kiểu dữ liệu trả về là String nên khi chuyển sang bên Frontend sẽ gọi là text.html
        contentType: "text/html", // Đổi kiểu dữ liệu text cho phù hợp với kiểu trả về là tên ảnh trong Backend
        dataType: 'html', // datatype return
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
        },
        success: function (data, textStatus, xhr) {
            console.log(data);
            // Đoạn lệnh này copy từ phần gọi Ajax theo cách không xác thực commemt bên trên xuống.
            // Show Avatar, thêm thể img vào thẻ div tương ứng trong html
            $('.imgAvatar').append(`<img src="img/${data}" style="vertical-align: middle; width: 200px; height: 200px; border-radius:50%;">`);
        },
        error(jqXHR, textStatus, errorThrown) {
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });

}

// Nhóm hàm Upload ảnh
$('#btn_changeAvatar').click(function () {
    // Test sự kiện onclick
    console.log('btn_changeAvatar clicked!')
    // Tạo đối tượng Form Data để lưu thông tin gửi đi 
    var myform = $('#form_avatar');
    var fomrData = new FormData(myform[0]);
    // Set file input vào Form data trước khi gửi đi
    fomrData.append('image', $('#files')[0].files[0]);
    // Set id của User đăng nhập vào Form data trước khi gửi đi
    var id = localStorage.getItem("ID")
    fomrData.append('id', id);

    // fomrData.append('id', '4');

    $.ajax({
        url: 'http://localhost:8080/api/v1/files/',
        type: 'POST',
        data: fomrData, // body
        processData: false,
        contentType: false, // Không để kiểu Content do đang gửi dữ liệu Formdata
        // dataType: 'json', // datatype return
        beforeSend: function (xhr) {
            xhr.setRequestHeader("Authorization", "Basic " + btoa(localStorage.getItem("USERNAME") + ":" + localStorage.getItem("PASSWORD")));
        },
        success: function (data, textStatus, xhr) {
            showAvatar() // Sau khi thay đổi avatar thành công gọi lại hàm này để show lại ảnh.
        },
        error(jqXHR, textStatus, errorThrown) {
            alert("Error when loading data");
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
})
