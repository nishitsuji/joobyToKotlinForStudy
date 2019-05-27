/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.example

import org.example.context.domain.repository.LoginRepository
import org.example.settings.BillingModule
import org.example.settings.Router
import org.jooby.Kooby
import org.jooby.apitool.ApiTool
import org.jooby.jdbc.Jdbc
import org.jooby.jdbi.Jdbi3
import org.jooby.json.Jackson
import org.jooby.run
import org.jooby.jdbi.TransactionalRequest
import org.jdbi.v3.core.kotlin.KotlinPlugin
import org.jdbi.v3.postgres.PostgresPlugin
import org.jdbi.v3.sqlobject.SqlObjectPlugin
import org.jdbi.v3.sqlobject.kotlin.KotlinSqlObjectPlugin
import org.jooby.flyway.Flywaydb


class App : Kooby({

    // 標準モジュールの定義
    use(Jackson())
    use(Jdbc())
    use(Jdbi3()
            .doWith { jdbi ->
                jdbi.installPlugin(SqlObjectPlugin())
                jdbi.installPlugin(KotlinPlugin())
                jdbi.installPlugin(KotlinSqlObjectPlugin())
                jdbi.installPlugin(PostgresPlugin())
            }
            /** Simple transaction per request and bind the PetRepository to it:  */
            .transactionPerRequest(
                    TransactionalRequest()
                            .attach(LoginRepository::class.java)
            ))
    use(Flywaydb())
    use(ApiTool().swagger().raml())

    // Web Routeの定義
    use(Router())
})

fun main(args: Array<String>) {
    run(::App, *args)
}