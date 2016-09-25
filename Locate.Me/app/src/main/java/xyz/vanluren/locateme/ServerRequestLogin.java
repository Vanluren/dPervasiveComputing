package xyz.vanluren.locateme;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ServerRequestLogin extends StringRequest{
    private static final String REQUEST_URL = "http://192.168.87.102:3000/users/login";
    private final HashMap params;

    public ServerRequestLogin(String email, String password, Response.Listener<String> listener) {

        super(Request.Method.POST, REQUEST_URL, listener, null);

        params = new HashMap<>();
        params.put("email", email);
        params.put("password", password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
