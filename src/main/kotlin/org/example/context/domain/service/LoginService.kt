package org.example.context.domain.service

import org.example.context.domain.repository.LoginRepository
import javax.inject.Inject

class LoginService
 @Inject constructor(var loginRepository :LoginRepository)
{
    fun doLogin() :String {
       return loginRepository.loginsql(1)
    }
}