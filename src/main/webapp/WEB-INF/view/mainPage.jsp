<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Anime&Manga</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <c:url value="/assets/css/bootstrap.min.css" var="cssUrl" />
    <link href="${cssUrl}" rel="stylesheet" type="text/css" />

    <c:url value="/assets/js/bootstrap.min.js" var="jsUrl" />
    <script src="${jsUrl}" type="text/javascript"></script>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="signIn">SignIn</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="signUp">SignUp</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Posts
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Anime</a></li>
                            <li><a class="dropdown-item" href="#">Manga</a></li>
                            <li><hr class="dropdown-divider"></li>
                        </ul>


                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="profile">Profile</a>
                    </li>

                </ul>
            </div>
        </div>
    </nav>
</header>

<main>
    <h1>Добро пожаловать на Anime&Manga!</h1>
    <p>Здесь вы найдете множество интересных постов про аниме и мангу.</p>

    <section class="anime-posts">
        <h2>Посты про аниме</h2>

        <div class="post">
            <h3>Название аниме 1</h3>
            <p>Описание аниме 1</p>
        </div>

        <div class="post">
            <h3>Название аниме 2</h3>
            <p>Описание аниме 2</p>
        </div>

        <!-- Добавьте свои посты про аниме здесь -->

    </section>

    <section class="manga-posts">
        <h2>Посты про мангу</h2>

        <div class="post">
            <h3>Название манги 1</h3>
            <p>Описание манги 1</p>
        </div>

        <div class="post">
            <h3>Название манги 2</h3>
            <p>Описание манги 2</p>
        </div>

        <!-- Добавьте свои посты про мангу здесь -->

    </section>
</main>

<footer>
    <p>&copy; Anime&Manga 2023</p>
</footer>

<script>
    var app = angular.module('myApp', []);
    app.controller('myCtrl', function($scope) {
        $scope.title = 'Добро пожаловать на Anime&Manga!';
        $scope.description = 'Здесь вы найдете множество интересных постов про аниме и мангу.';
        $scope.animePosts = [
            {title: 'Название аниме 1', description: 'Описание аниме 1'},
            {title: 'Название аниме 2', description: 'Описание аниме 2'}
        ];
        $scope.mangaPosts = [
            {title: 'Название манги 1', description: 'Описание манги 1'},
            {title: 'Название манги 2', description: 'Описание манги 2'}
        ];
    });
</script>

</body>
</html>