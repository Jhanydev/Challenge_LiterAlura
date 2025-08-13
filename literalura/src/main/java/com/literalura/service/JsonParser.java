package com.literalura.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.literalura.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class JsonParserService {
    public List<Livro> parseLivros(String json) {
        List<Livro> livros = new ArrayList<>();
        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();
        JsonArray results = jsonObject.getAsJsonArray("results");

        for (JsonElement element : results) {
            JsonObject obj = element.getAsJsonObject();
            String titulo = obj.get("title").getAsString();
            JsonArray authors = obj.getAsJsonArray("authors");
            String autor = authors.size() > 0 ? authors.get(0).getAsJsonObject().get("name").getAsString() : "Desconhecido";
            JsonArray idiomas = obj.getAsJsonArray("languages");
            String idioma = idiomas.size() > 0 ? idiomas.get(0).getAsString() : "N/A";
            livros.add(new Livro(titulo, autor, idioma));
        }
        return livros;
    }
}
