
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

    var confirm_del = confirm('Bạn có chắc chắn muốn xóa Department này không')
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
    getListDepartments();
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
    getListDepartments();
}











