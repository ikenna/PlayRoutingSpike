import play.api.GlobalSettings
import play.api.mvc.{Handler, RequestHeader}

object Global extends GlobalSettings{


  override def onRouteRequest(req: RequestHeader): Option[Handler] = {
    req.host match {
      case "127.0.0.1:9000" =>  foo.Routes.routes.lift(req)
      case "localhost:9000" =>  bar.Routes.routes.lift(req)
      case _ =>  super.onRouteRequest(req)
    }
  }

}
