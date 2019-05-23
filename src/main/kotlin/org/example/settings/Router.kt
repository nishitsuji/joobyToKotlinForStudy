package org.example.settings

import org.example.settings.registry.Login
import org.jooby.Kooby

class Router : Kooby({

    path("/api") {
        use(Login::class)
    }
})


