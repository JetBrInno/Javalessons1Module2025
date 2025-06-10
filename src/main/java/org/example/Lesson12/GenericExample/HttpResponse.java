package org.example.Lesson12.GenericExample;

import java.util.Map;

public class HttpResponse<T> {
    private int code;

    private Map<String, String> headers;

    private T body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HttpResponse(int code, T body) {
        this.code = code;
        this.body = body;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
