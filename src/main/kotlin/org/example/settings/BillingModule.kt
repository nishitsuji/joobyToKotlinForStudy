package org.example.settings

import com.google.inject.AbstractModule
import com.google.inject.Binder
import com.typesafe.config.Config
import org.example.context.domain.repository.LoginRepository
import org.example.context.domain.service.LoginService
import org.jooby.Env
import org.jooby.Jooby

abstract class BillingModule : Jooby.Module, AbstractModule() {
    override fun configure(env: Env, conf: Config, binder: Binder) {
        binder.install(this)
        binder.bind(LoginRepository::class.java)
    }

    public override fun binder(): Binder {
        return super.binder()
    }

    override fun configure() {
    }
}