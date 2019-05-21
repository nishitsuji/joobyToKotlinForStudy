package org.example.context.controllers

import org.example.settings.registry.Param

class LoginController  {

    fun login(param: Param) : String {
        return "Au... not fund login ${param.id}/${param.pass}"
    }

    fun ok(param: Param) : String {
        return "ok login To ${param.id}/${param.pass}"
    }
}