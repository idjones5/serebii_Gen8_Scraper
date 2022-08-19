package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String no;
    private String name;
    private String type;
    private String abilities;
    private List<Stats> baseStats;

    // constructor

    public Pokemon() {}

    public Pokemon(String no, String name, String type, String abilities, List<Stats> baseStats) {
        this.no = no;
        this.name = name;
        this.type = type;
        this.abilities = abilities;
        this.baseStats = baseStats;
    }

    // methods

    /** This method scrapes the gen8 table from the website serebii and returns a list of the pokemon*/
    public List<Pokemon> pokemonList() {
        List<Pokemon> list = new ArrayList<>();

        try {
            Document page = Jsoup
                    .connect("https://serebii.net/pokemon/gen8pokemon.shtml")
                    .get();

            Element tbody = page
                    .getElementsByTag("tbody").get(0);

            Elements rows = tbody
                    .children();

            rows.remove(0);
            rows.remove(1);
            rows.remove(rows.first());

            for (Element r : rows) {

                Elements tds = r.getElementsByTag("td");

                String no = tds.get(0).text();
                String name = tds.get(3).text();
                String type = tds.get(4).text();
                String abilities = tds.get(5).text();
                List<Stats> l = new ArrayList<>();

                Stats stats = new Stats();
                stats.setHp(tds.get(6).text());
                stats.setAtt(tds.get(7).text());
                stats.setDef(tds.get(8).text());
                stats.setSAtt(tds.get(9).text());
                stats.setDef(tds.get(10).text());
                stats.setSpd(tds.get(11).text());

                l.add(stats);

                list.add(
                        new Pokemon(
                                no,
                                name,
                                type,
                                abilities,
                                l
                        )
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    // getters and setters

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public List<Stats> getBaseStats() {
        return baseStats;
    }

    public void setBaseStats(List<Stats> baseStats) {
        this.baseStats = baseStats;
    }
}
