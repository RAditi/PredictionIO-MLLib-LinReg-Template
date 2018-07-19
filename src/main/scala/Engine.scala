
package org.template.vanilla


import org.apache.predictionio.controller.IEngineFactory
import org.apache.predictionio.controller.Engine

class Query(
  val features: Array[Double]
) extends Serializable

class PredictedResult(
  val prediction: Double
) extends Serializable

object VanillaEngine extends IEngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("algo" -> classOf[algo]),
      classOf[Serving])
  }
}
