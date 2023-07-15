package org.scrapping;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Data
@AllArgsConstructor
@ToString
public class Product {
    private String name;
    private String prc;
    @Override
    public String toString() {
        return "{ \"url\":\"" + name + "\"," +
                "\"price\": \"" + prc + "\" }";
    }
}
