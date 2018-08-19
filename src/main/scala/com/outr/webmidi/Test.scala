package com.outr.webmidi

import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.scalajs.js
import scala.scalajs.js.typedarray.Uint8Array

object Test {
  @JSExportTopLevel("application")
  def main(): Unit = {
    window.navigator.requestMIDIAccess().toFuture.map { access =>
      println(s"MidiAccess: $access")
      val outputs = access.outputs
      println(s"Outputs: ${outputs.size}")
      println(s"Testing: ${outputs.values().toIterator.size}")

      outputs.forEach((output, key) => {
        println(s"Key: $key, Output: ${output.name}")
        try {
          output.send(new Uint8Array(js.Array(0x90, 3, 32)))
        } catch {
          case t: Throwable => t.printStackTrace()
        }
      })
      println("Done!")
    }
    println("Hello, World!")
  }
}
