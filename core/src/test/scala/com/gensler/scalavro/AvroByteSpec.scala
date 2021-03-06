package com.gensler.scalavro.test

import scala.collection.mutable
import scala.util.{ Try, Success, Failure }
import scala.reflect.runtime.universe._

import com.gensler.scalavro.types._
import com.gensler.scalavro.types.primitive._

class AvroByteSpec extends AvroSpec {

  val ab = AvroByte

  "AvroByte" should "be a subclass of AvroType[Byte]" in {
    ab.isInstanceOf[AvroType[Byte]] should be (true)
    typeOf[ab.scalaType] =:= typeOf[Byte] should be (true)
  }

  it should "be a primitive AvroType" in {
    ab.isPrimitive should be (true)
  }

}