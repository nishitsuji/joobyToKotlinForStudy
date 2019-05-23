package org.example.context.domain.service

import com.google.inject.Inject
import org.example.context.domain.repository.LoginRepository

class LoginService
// @Inject constructor(var loginRepository :LoginRepository)
{
    fun doLogin() :String {
        return "ok doLogin"
//       return loginRepository.loginsql(1)
    }
}