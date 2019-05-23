package org.example.context.domain.repository

import org.jdbi.v3.sqlobject.config.RegisterRowMapper
import org.jdbi.v3.sqlobject.customizer.Define
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator
import org.jdbi.v3.sqlobject.statement.SqlQuery
import java.io.Closeable

//@UseClasspathSqlLocator
interface LoginRepository: Closeable  {

    @SqlQuery("select 1 from SYSTEM_RANGE(1, 1)" )
//    @RegisterRowMapper(Login)
    fun loginsql(@Define("autoId") autoId:Int) :String
}
