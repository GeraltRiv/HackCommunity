package com.hackcommunity.hackcommunity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.hackcommunity.hackcommunity.adapters.IdeaListAdapter;
import com.hackcommunity.hackcommunity.model.IdeaModel;

import java.util.ArrayList;

/**
 * Created by taras on 22.02.2015.
 */
public class IdeaListFragment extends Fragment {

    ListView listview;
    IdeaListAdapter adapter;
    ArrayList<IdeaModel> ideaList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_idea_list, null);


        listview = (ListView) view.findViewById(R.id.ideaListView);
        ideaList = new ArrayList<IdeaModel>();
        ideaList.add(new IdeaModel("Linkedin Transformer","Генерація резюме з профіля LinkedIn",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("Спорт для чайників","Веб сайт (+розробка мобільних аплікацій на перспективу),\n який акумулює усю можливу інформацію про спортивні клуби, майданчики,\n платні, безкоштовні стадіони, маршрути для бігу тощо. ",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("Safe maps","Small text about this idea, just in two words1",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("File sender","Приложение для компьютера и смартфона для передачи файлов между собой. ",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("Party Up","Синхронное мигание вспышки, дисплея телефона разными цветами, плюс, возможно,\n воспроизведение музыки на нескольких Android телефонов одновременно.",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("Title6","Small text about this idea, just in two words1",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("Title7","Small text about this idea, just in two words1",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        ideaList.add(new IdeaModel("Title8","Small text about this idea, just in two words1",
                "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 " +
                        "Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 Big text1 "));
        adapter = new IdeaListAdapter(getActivity(), ideaList);
        listview.setAdapter(adapter);
        return view;
    }
}
