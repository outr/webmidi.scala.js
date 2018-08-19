package com.outr.webmidi

import scala.scalajs.js

@js.native
trait NavigatorMidi extends js.Object {
  def requestMIDIAccess(options: MIDIOptions = js.native): js.Promise[MIDIAccess] = js.native
}