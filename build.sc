import mill._
import mill.scalalib._

object app extends SbtModule {

  def scalaVersion = "2.13.8"

  def ivyDeps = Agg(
    ivy"io.getquill::quill-sql:3.18.0"
  )
}
