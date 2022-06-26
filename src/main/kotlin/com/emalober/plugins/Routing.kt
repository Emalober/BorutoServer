package com.emalober.plugins

import com.emalober.routes.getAllHeroes
import com.emalober.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*

fun Application.configureRouting() {

    routing {
        root()
        getAllHeroes()
        static("/images") {
            resources("images")
        }
    }
}
