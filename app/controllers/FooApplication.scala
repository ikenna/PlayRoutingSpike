package controllers

import play.api._
import play.api.mvc._

object FooApplication extends Controller {

  def index = Action {
    Ok("This is being served from the Foo controller")
  }

}