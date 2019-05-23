package org.example.settings.registry

import org.example.context.controllers.LoginController
import org.jooby.Results.redirect
import org.jooby.mvc.GET
import org.jooby.mvc.POST
import org.jooby.mvc.Path
import javax.inject.Inject

data class Param(val id: String? = null,
                 val pass: String? = null)

@Path("/login")
class Login @Inject constructor(val loginController: LoginController) {

    @Path("/")
    @GET
    fun redirect(param: Param) = redirect("/login/to_redirect?pass=${param.pass}")


    @Path("/{id}")
    @GET
    fun get(param: Param): String = loginController.login(param)

    @Path("/{id}")
    @POST
    fun post(param: Param): String = loginController.ok(param)
}