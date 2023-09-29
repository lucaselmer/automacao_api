package api;

public class APIClient {
    public static void configure() {
        RestAssured.baseURI = "https://reqres.in/api/"; // Substitua pela URL da sua API
        // Outras configurações comuns, como autenticação, podem ser definidas aqui
    }
}
