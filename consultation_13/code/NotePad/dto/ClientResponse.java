package NotePad.dto;

import java.util.List;

public class ClientResponse <T>{
    private int responseCode;
    private T responseInfo;
    private List<String> message;

    public ClientResponse(int responseCode, T responseInfo, List<String> message) {
        this.responseCode = responseCode;
        this.responseInfo = responseInfo;
        this.message = message;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public T getResponseInfo() {
        return responseInfo;
    }

    public List<String> getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ClientResponse{" +
                "responseCode=" + responseCode +
                ", responseInfo=" + responseInfo +
                ", message=" + message +
                '}';
    }
}
