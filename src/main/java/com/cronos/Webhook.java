package com.cronos;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class Webhook {

    @RequestMapping(value = "webhook", method = RequestMethod.POST, consumes = "application/json", produces="application/json")
    public Response executeTask(@RequestBody String data) {

        System.out.println(data);

        // Parsing input Json from POST request
        JSONObject jsonBody = new JSONObject(data);
        // Get result object
        JSONObject result = jsonBody.getJSONObject("result");

        String action = result.getString("action");
        System.out.println("Action received = " + action);

        switch(action) {
            case "orderPizza":
                return new Response("Ok on commande une pizza", "Ok, on commande une pizza !");
            default:
                return new Response("Je ne comprends pas", "Je ne comprends pas");
        }
    }
}