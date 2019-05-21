package org.example.settings.registry

import org.example.context.controllers.LoginController
import org.jooby.Kooby
import org.jooby.Results.redirect

data class Param(val id: String? = null,
                 val pass: String? = null)

class Login : Kooby({
    get("/login") {
        req ->
        var param = req.params(Param::class.java)
        redirect("/login/to_redirect?pass=${param.pass}")

    }

    get("/login/{id}") {
        req ->
        var param = req.params(Param::class.java)
        var c =  LoginController()
        c.login(param)
    }

    post ("/login/{id}") {
        req ->
        var param = req.params(Param::class.java)

        var c =  LoginController()
        c.ok(param)
    }
})