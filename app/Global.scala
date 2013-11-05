import play.api.GlobalSettings
import play.api.mvc.{Handler, RequestHeader}

object Global extends GlobalSettings{


  override def onRouteRequest(req: RequestHeader): Option[Handler] = {
    if (req.host == "127.0.0.1:9000") {
      foo.Routes.routes.lift(req)
    } else if (req.host == "localhost:9000") {
      bar.Routes.routes.lift(req)
    } else {
      super.onRouteRequest(req)
    }
  }

}
