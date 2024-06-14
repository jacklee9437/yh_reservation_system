package com.yhrsv.reservation_system.configuration

import mu.KotlinLogging
import org.springframework.beans.factory.DisposableBean
import org.springframework.beans.factory.InitializingBean
import org.springframework.stereotype.Component
import java.io.File

@Component
class FrontendHook: InitializingBean, DisposableBean {

    private val logger = KotlinLogging.logger {  }
    private var process: Process? = null

    override fun afterPropertiesSet() {
        val builder = ProcessBuilder("npm", "start")
        builder.directory(File("ui"))
        process = builder.start()

        logger.info { "React server started." }
    }

    override fun destroy() {
        process?.destroy()

        logger.info { "React server stopped." }
    }
}