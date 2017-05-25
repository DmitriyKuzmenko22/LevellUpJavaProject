<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Search</title>
</head>
<body>
        <input type="text" id="user-login"/><span>
    <input type="text" id="user-phone"/><span>
    <button onclick="search()">Search</button></span></span>
    </div>
    <table>
        <thead>
        <tr>
            <td>Id</td>
            <td>Login</td>
            <td>Name</td>
            <td>Last Name</td>
            <td>Phone</td>
            <td>Email</td>
            <td></td>
            <td></td>
        </tr>
        </thead>
        <tbody id="user-table">
        </tbody>
    </table>


    <script type="text/javascript">
    function fillTable(userList) {
        var userTable = document.getElementById("user-table");
        clearTable(userTable);
        userList.forEach(function (user) {
            var row = userTable.insertRow();
            var id = row.insertCell(0);
            var login = row.insertCell(1);
            var name = row.insertCell(2);
            var lastName = row.insertCell(3);
            var phone = row.insertCell(4);
            var email = row.insertCell(5);
            var del = row.insertCell(6);
            var upd = row.insertCell(7);
            /*var button = '<button>Update</button>';
            var button = '<button>Delete</button>';*/
            id.innerHTML = user.id;
            login.innerHTML = user.login;
            name.innerHTML = user.name;
            lastName.innerHTML = user.lastName;
            phone.innerHTML = user.phone;
            email.innerHTML = user.email;
            del.innerHTML = del.innerHTML + '<button id="button1">delete</button>'; /*'<button id="button1">delete</button>';*/
            upd.innerHTML = upd.innerHTML + '<button id="button1">Update</button>';
        });
    }
    <%--<button data-id="77" id="btn" onclick="sendRequest(this)">Click</button>--%>
    <%--<script type="text/javascript">--%>
    <%--function sendRequest(data) {--%>
    <%--console.log(data.dataset);--%>
    <%--}--%>
    <%--</script>--%>


 /*   function del(userId) {

    }

    function upd(button) {

        document.location.href = "/updateUser?user_id=" + button.id;
    }*/

    function clearTable(table) {
        table.innerHTML = '';
    }


    function search() {

        var query = document.getElementById("user-login").value;
        query = " " + query + "," + document.getElementById("user-phone").value + " ";
        fetch('/search', {
            method: 'POST',
            headers: {'Content-Type': 'application/x-www-form-urlencoded'},
            body: 'query=' + query
        })
            .then(function (response) {
                return response.json();
            })
            .then(function (userList) {
                fillTable(userList);
            })
            .catch(alert);
    }</script>

</body>
</html>