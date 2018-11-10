package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Studij extends PlanStudija {

    ArrayList<IzborniPredmet> izborniPredmet = new ArrayList<>();
    Studij(String nazivStudija, ArrayList<Predmet> predmeti) {
        super(nazivStudija, predmeti);
    }

}
