  // nome do pacote
package apiTeste;

  // Biblioteca


  import org.junit.jupiter.api.MethodOrderer;
  import org.junit.jupiter.api.Order;
  import org.junit.jupiter.api.Test;
  import org.junit.jupiter.api.TestMethodOrder;

  import java.io.IOException;
  import java.nio.file.Files;
  import java.nio.file.Paths;
  import static io.restassured.RestAssured.given;
  import static org.hamcrest.Matchers.is;
  // Classe
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    public class TesteUser {       // inicio da classe
    //  Atributos


    static String ct = "application/json"; // content type
    static String uriUser = "https://petstore.swagger.io/v2/user/";
      // Funções e Métodos
    // funções de Apoio

    public static String lerArquivoJson(String arquivoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(arquivoJson)));
    }

      // Funções de Testes


    @Test @Order(1)
    public void testarIncluirUser() throws IOException {
        // carregar os dados da nossa JSON
        String jsonBody = lerArquivoJson("src/test/resources/json/user1.json");

        String userId = "1371534096";

        // realizar o teste
        given()                                            // Dado que
                .contentType(ct)                           // o tipo do conteúdo
                .log().all()                               // mostre Tudo
                .body(jsonBody)                            // corpo do requisição.when()
        .when()                                            // Quando
                .post(uriUser)                             // Endopoint / Onde
        .then()                                            // Então
                .log().all()                               // mostre tudo na volta
                .statusCode(200)                        // comunic. ida e volta ok
                .body( "code", is(200 ))            // tag code é 200
                .body( "type", is( "unknown"))    // tag type é o "unknown"
                .body( "message", is(userId))           // mensagem é inserida
        ;

    } // fim do post
   @Test
   public void testarConsultarUser(){
        String username = "Flex";

            // resultado esperado
        int userId = 1371534096;   // código usuário
        String email = "flex@teste.com";
        String senha = "123456";
        String phone = "1134494385";
            // realizar teste
        given()
                 .contentType(ct)
                 .log().all()
        .when()
                 .get(uriUser + username)                               // Response
        .then() //ValidatableResponse
                 .log().all()
                 .statusCode(200)
                 .body("id", is(userId))
                 .body("email", is(email))
                 .body("password", is(senha))
                 .body("phone", is(phone))
        ;
   } // fim get User
   @Test
   public void testarAlterarUser() throws IOException {  // inicio comando Put user get
        String jsonBody = lerArquivoJson("src/test/resources/json/user2.json");

        String userId = "1371534096";
        String username = "Flex";
                given()    // dado
                        .contentType(ct)
                        .log().all()
                        .body(jsonBody)
                .when()
                        .put(uriUser + userId)
                .then()
                        .log().all()
                        .statusCode(200)
                        .body("code", is(200))
                        .body("type", is("unknoan"))
                        .body("message", is(userId))
                ;

   } // fim Put user

} // fim da Classe


