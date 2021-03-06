package com.ancovy.funmath.datasource;

import android.content.Context;

import com.ancovy.funmath.R;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by msahakyan on 22/10/15.
 */
public class ExpandableListDataSource2 {

    /**
     * Returns fake data of films
     *
     * @param context
     * @return
     */
    public static Map<String, List<String>> getData(Context context) {
        Map<String, List<String>> expandableListData = new TreeMap<>();

        List<String> filmGenres = Arrays.asList(context.getResources().getStringArray(R.array.smpsma_class_expandable_drawer));

        List<String> actionFilms = Arrays.asList(context.getResources().getStringArray(R.array.kelas7_item_array));
        List<String> musicalFilms = Arrays.asList(context.getResources().getStringArray(R.array.kelas8_item_array));
        List<String> dramaFilms = Arrays.asList(context.getResources().getStringArray(R.array.kelas9_item_array));


        expandableListData.put(filmGenres.get(0), actionFilms);
        expandableListData.put(filmGenres.get(1), musicalFilms);
        expandableListData.put(filmGenres.get(2), dramaFilms);

        return expandableListData;
    }
}
