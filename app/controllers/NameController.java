package controllers;

import Utils.Utils;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Names;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Date;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class NameController extends Controller {

  public Result create() {
    String nameToSave = Utils.getRandomString();

    Names name = new Names(nameToSave, new Date(), new Date());
    name.save();

    ObjectNode result = Json.newObject();
    result.put("status", "ok");
    result.put("name", nameToSave);

    return ok(result);
  }
}
