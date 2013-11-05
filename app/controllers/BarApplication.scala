package controllers

import play.api._
import play.api.mvc._

object BarApplication extends Controller {

  def index = Action {
    Ok("This is being served from the Bar controller")
  }

}