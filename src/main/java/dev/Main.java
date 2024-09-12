package dev;

import dev.nouveautes.java17.PatternMatching;
import dev.nouveautes.java17.PatternMatchingSwitch;
import dev.nouveautes.java21.StringTemplate;
import dev.nouveautes.java21.record.Adresse;
import dev.nouveautes.java21.record.Compagnie;
import dev.nouveautes.java21.record.Personne;
import dev.nouveautes.java21.record.Point;
import dev.nouveautes.java21.record.RecordGeneric;
import dev.nouveautes.java21.RecordPattern;
import dev.nouveautes.java21.UnnamedPatternVariable;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println(STR."i = \{i}");
        }

        PatternMatching patternMatching = new PatternMatching();
        patternMatching.afficherCollectionImmuable();


        System.out.println(PatternMatchingSwitch.formatterPatternSwitch("Bonjour"));

        UnnamedPatternVariable.processPoint(new Point(4.5, 6.7));
        UnnamedPatternVariable.addListInt();
        UnnamedPatternVariable.forEachUnnamed();


        RecordPattern.printAngleFromXAxis(new Point(4.5, 6.7));
        RecordPattern.printAngleFromXAxisVar(new Point(4.5, 6.7));
        RecordPattern.printAngleFromXAxisTypePattern(new Point(4.5, 6.7));


        RecordGeneric<Integer, String> recordGeneric = new RecordGeneric<>(1, "David");
        RecordPattern.printRecordGeneric(recordGeneric);


        Adresse address = new Adresse("17 Avenue General Leclerc", "Nanterre");
        Personne personne = new Personne("Isabelle", address);
        Personne p2 = new Personne("Balkany", new Adresse("56 Rue St-Pierre", "Aubervilliers"));
        RecordPattern.printCity(personne);

        Compagnie company = new Compagnie("Tech Co. IT", List.of(personne, p2));

        RecordPattern.printEmployeeCities(company);

        StringTemplate.exempleSTR();

    }
}