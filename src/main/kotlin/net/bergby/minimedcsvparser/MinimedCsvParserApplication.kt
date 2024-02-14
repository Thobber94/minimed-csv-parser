package net.bergby.minimedcsvparser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MinimedCsvParserApplication

fun main(args: Array<String>) {
	runApplication<MinimedCsvParserApplication>(*args)
}
