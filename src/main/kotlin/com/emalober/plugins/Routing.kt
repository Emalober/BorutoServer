package com.emalober.plugins

import com.emalober.routes.root
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {

    routing {
        root()
    }
}
