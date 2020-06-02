#!/usr/bin/env kotlin

@file:DependsOn("com.squareup.okio:okio:2.1.0")

import okio.buffer
import okio.source
import java.io.File
import java.util.regex.Pattern

val urlPattern: Pattern = Pattern.compile(
  "(?:(?:https?|ftp|file):\\/\\/|www\\.|ftp\\.)(?:\\([-A-Z0-9+&@#/%=~_|\$?!:,.]*\\)|[-A-Z0-9+&@#/%=~_|\$?!:,.])*(?:\\([-A-Z0-9+&@#/%=~_|\$?!:,.]*\\)|[A-Z0-9+&@#/%=~_|\$])",
  Pattern.CASE_INSENSITIVE
)

val pocketLinks = links(args[0])
val instapaperLinks = links(args[1])

(pocketLinks - instapaperLinks).forEach {
  println("Pocket only: $it") 
}

(instapaperLinks - pocketLinks).forEach {
  println("Instapaper only: $it") 
}

fun links(filename: String): Set<String> {
  val urls = mutableSetOf<String>()
  File(filename).source().buffer().use { source ->
    while (!source.exhausted()) {
      val matcher = urlPattern.matcher(source.readUtf8Line())
      if (matcher.find()) {
        urls.add(matcher.group())
      }
    }
  }
  return urls
}
