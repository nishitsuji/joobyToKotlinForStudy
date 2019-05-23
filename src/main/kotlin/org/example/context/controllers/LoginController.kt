package org.example.context.controllers

import org.example.context.domain.service.LoginService
import org.example.settings.registry.Param
import javax.inject.Inject

class LoginController  @Inject constructor(val loginService: LoginService) {
    fun login(param: Param): String = "Au... not fund login ${param.id}/${param.pass}" + loginService.doLogin()

    fun ok(param: Param): String = "ok login To ${param.id}/${param.pass}" + loginService.doLogin()
}