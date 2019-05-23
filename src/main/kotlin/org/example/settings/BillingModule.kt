package org.example.settings

import com.google.inject.Binder
import com.typesafe.config.Config
import org.jooby.Env
import org.jooby.Jooby

class BillingModule : Jooby.Module  {
    override fun configure(env: Env, conf: Config, binder: Binder) {
    }
}