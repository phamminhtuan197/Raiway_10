
var listDepartment = []
var currentPage = 1;
var size = 5;
var totalPages;
var sortField = "departmentID";
var isAsc = true;
$(function () {

    getListDepartments();

    $('#ID_ID').attr('disabled', 'disabled')

    $('#reset_btn').click(function () {
        $('#ID_ID').val("")
        $('#DepartmentName_ID').val("")
    })

    $('#Main_Form_ID').submit(function () {
        var v_ID_ID = $('#ID_ID').val()
        var v_DepartmentName_ID = $('#DepartmentName_ID').val()

        var department = {
            'departmentName': v_DepartmentName_ID
        }

        $.ajax({
            url: 'http://localhost:8080/api/v1/departments', data: department,
            type: 'POST',
            success: function (result) {

                if (result == undefined || result == null) {
                    alert("Error when loading data");
                    return;
                }

                currentPage = totalPages;
                getListDepartments();
            }
        });
        return false;

    })
})

function showDepartment() {
    // $('#ID_ID').removeAttr("disabled")
    $('#Result_TB').empty()
    for (var index = 0; index < listDepartment.length; index++) {
        $('#Result_TB').append(`
        <tr>
        <th>${listDepartment[index].departmentID}</th>
        <th>${listDepartment[index].departmentName}</th>
        <th><button class="btn btn-warning" onclick="editDepartment(${index})">Edit</button></th>
        <th><button class="btn btn-warning" onclick="deleteDepartment(${index})">Delete</button></th>
        </tr>
    `)
    }
}

function getListDepartments() {
    var url = "http://localhost:8080/api/v1/departments/";
    url += "?page=" + currentPage + "&size=" + size;
    url += "&sort=" + sortField + "," + (isAsc ? "asc" : "desc");
    $.get(url, function (data, status) {

        listDepartment = [];

        if (status == "error") {

            alert("Error when loading data");
            return;
        }

        parseData(data);
        showDepartment();
    });
}

function parseData(data) {
    data.content.forEach(function (item) {
        var department = {
            'departmentID': item.departmentID,
            'departmentName': item.departmentName
        }
        listDepartment.push(department)
    });
}

function deleteDepartment(Index) {
    var v_del_ID = listDepartment[Index].departmentID;

    var confirm_del = confirm('B???n c?? ch???c ch???n mu???n x??a Department n??y kh??ng')
    if (confirm_del) {
        $.ajax({
            url: 'http://localhost:8080/api/v1/departments/departmentID/' + v_del_ID,
            type: 'DELETE',
            success: function (result) {

                if (result == undefined || result == null) {
                    alert("Error when loading data");
                    return;
                }

                resetPaging();
                getListDepartments();
            }
        });
    } else {
        return
    }
}

function editDepartment(Index) {
    $('#ID_ID').val(listDepartment[Index].departmentID)
    $('#DepartmentName_ID').val(listDepartment[Index].departmentName)


    $('#update_btn').click(function () {
        var v_ID_ID = $('#ID_ID').val()
        var v_DepartmentName_ID = $('#DepartmentName_ID').val()

        var department = {
            'departmentName': v_DepartmentName_ID
        }
        $.ajax({
            url: 'http://localhost:8080/api/v1/departments/departmentID/' + v_ID_ID,
            type: 'PUT',
            data: department,
            success: function (result) {

                if (result == undefined || result == null) {
                    alert("Error when loading data");
                    return;
                }
                getListDepartments();
            }
        });
    })
}

function pagingTable(pageAmount) {
    var pagingStr = "";
    if (pageAmount > 1 && currentPage > 1) {
        pagingStr +=
            '<li class="page-item">' +
            '<a class="page-link" onClick="prevPaging()">Previous</a>' +
            '</li>';
    }
    // H??m Gen n??t s??? trang 1,2,3 ...
    for (i = 0; i < pageAmount; i++) {
        pagingStr +=
            '<li class="page-item ' + (currentPage == i + 1 ? "active" : "") + '">' +
            '<a class="page-link" onClick="changePage(' + (i + 1) + ')">' + (i + 1) + '</a>' +
            '</li>';
    }
    // H??m Gen n??t Next
    if (pageAmount > 1 && currentPage < pageAmount) {
        pagingStr +=
            '<li class="page-item">' +
            '<a class="page-link" onClick="nextPaging()">Next</a>' +
            '</li>';
    }
    $('#pagination').empty();
    $('#pagination').append(pagingStr);
}
// H??m th???c hi???n khi nh???n v??o c??c n??t ph??n trang 1, 2, 3
function changePage(page) {
    if (page == currentPage) {
        return;
    }
    currentPage = page;
    getListDepartments();
}
// H??m reset v??? trang m???c ?????nh, trang ?????u ti??n 1. S??? d???ng khi x??a d??? li???u
function resetPaging() {
    currentPage = 1;
    size = 5;
}
// H??m x??? l?? khi nh???n n??t Previous
function prevPaging() {
    changePage(currentPage - 1);
}
// H??m x??? l?? khi nh???n n??t next
function nextPaging() {
    changePage(currentPage + 1);
}

// Nh??m h??m x??? l?? Sort d??? li???u
function changeSort(field) {
    if (field == sortField) {
        isAsc = !isAsc;
    } else {
        sortField = field;
        isAsc = true;
    }
    getListDepartments();
}











