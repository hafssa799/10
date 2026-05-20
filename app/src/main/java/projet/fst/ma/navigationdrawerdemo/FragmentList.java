package projet.fst.ma.navigationdrawerdemo; // Assurez-vous que c'est votre package réel

import android.os.Bundle;
import androidx.fragment.app.ListFragment;
import android.widget.ArrayAdapter;

public class FragmentList extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Données à afficher dans la liste
        String[] items = {
                "Module Android", "Module Réseaux", "Module Base de données",
                "Module PHP", "Module Java avancée", "Item 6", "Item 7",
                "Item 8", "Item 9", "Item 10"
        };

        // Création de l'adaptateur pour lier les données à la vue
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1, // Layout standard Android pour une ligne
                items
        );

        // Appliquer l'adaptateur au ListFragment
        setListAdapter(adapter);
    }
}