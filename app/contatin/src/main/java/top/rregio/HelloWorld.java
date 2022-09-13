
package top.rregio;

import io.javalin.Javalin;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.start(7000);
    app.get("/",
      ctx -> ctx.result("Olá este aplicativo é uma api..."));
  }
}
