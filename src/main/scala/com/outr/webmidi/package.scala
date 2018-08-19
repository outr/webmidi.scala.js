package com.outr

import org.scalajs.dom.Navigator

import scala.language.implicitConversions

package object webmidi {
  implicit def navigator2Midi(navigator: Navigator): NavigatorMidi = navigator.asInstanceOf[NavigatorMidi]
}