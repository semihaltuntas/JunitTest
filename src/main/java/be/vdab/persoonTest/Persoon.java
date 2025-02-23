package be.vdab.persoonTest;

import java.util.Set;

public class Persoon {
    public Set<String> voornamen;

    public Persoon() {
        this.voornamen = voornamen;
    }

    public void add(String voornaam) {
        if (voornaam == null) {
            throw new NullPointerException("Voornaam kan niet null zijn!");
        }
        if (voornaam.trim().isEmpty()) {
            throw new IllegalArgumentException("Voornaam kan niet leeg zijn.");
        }
        if (voornamen.contains(voornaam)) {
            throw new IllegalArgumentException("Mag niet dezelfde naam bevatten");
        }
        voornamen.add(voornaam);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String voornaam : voornamen) {
            builder.append(voornaam).append(" ");
        }
        return builder.toString().trim();
    }
}
