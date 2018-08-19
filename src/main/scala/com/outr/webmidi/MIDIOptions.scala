package com.outr.webmidi

import scala.scalajs.js
import scala.scalajs.js.typedarray.Uint8Array

trait MIDIOptions extends js.Object {
  var sysex: js.UndefOr[Boolean] = js.undefined
  var software: js.UndefOr[Boolean] = js.undefined
}

trait MIDIAccess extends js.Object {
  def inputs: MIDIInputMap
  def outputs: MIDIOutputMap
  def onstatechange: EventHandler
  def sysexEnabled: Boolean
}

trait MIDIInputMap extends js.Object {
}

trait MIDIOutputMap extends js.Object {
  def size: Int
  def values(): js.Iterator[MIDIOutput]
  def forEach(f: js.Function2[MIDIOutput, String, _]): Unit
}

trait EventHandler extends js.Object {

}

trait MIDIOutput extends js.Object {
  def name: String
  def send(data: Uint8Array): Unit
}