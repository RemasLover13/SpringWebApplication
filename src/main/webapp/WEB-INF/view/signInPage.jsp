
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <c:url value="/assets/css/bootstrap.min.css" var="cssUrl" />
    <link href="${cssUrl}" rel="stylesheet" type="text/css" />

    <c:url value="/assets/js/bootstrap.min.js" var="jsUrl" />
    <script src="${jsUrl}" type="text/javascript"></script>
</head>
<body>

<div class="container-fluid">

    <div class="col-md-4 offset-md-4">
        <div class="form-container">
            <div class="form-icon"><i class="fa fa-user"></i></div>
            <h3 class="title">Login</h3>
            <form class="form-horizontal">
                <div class="form-group">
                    <label>email</label>
                    <input class="form-control" type="email" placeholder="email address">
                </div>
                <div class="form-group">
                    <label>password</label>
                    <input class="form-control" type="password" placeholder="password">
                </div>
                <button type="button" class="btn btn-default">Login</button>
            </form>
        </div>
    </div>

</div>

</body>
</html>
