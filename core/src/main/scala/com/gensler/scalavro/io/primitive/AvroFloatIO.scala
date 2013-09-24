package com.gensler.scalavro.io.primitive

import com.gensler.scalavro.io.AvroTypeIO
import com.gensler.scalavro.types.primitive.AvroFloat
import com.gensler.scalavro.error.{ AvroSerializationException, AvroDeserializationException }

import org.apache.avro.io.{ BinaryEncoder, BinaryDecoder }

import scala.util.{ Try, Success, Failure }
import scala.reflect.runtime.universe.TypeTag

object AvroFloatIO extends AvroFloatIO

trait AvroFloatIO extends AvroTypeIO[Float] {

  val avroType = AvroFloat

  def write[F <: Float: TypeTag](value: F, encoder: BinaryEncoder) = {
    encoder writeFloat value
    encoder.flush
  }

  def read(decoder: BinaryDecoder) = decoder.readFloat

}
