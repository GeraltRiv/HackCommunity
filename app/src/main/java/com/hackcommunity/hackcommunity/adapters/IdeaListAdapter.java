package com.hackcommunity.hackcommunity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.hackcommunity.hackcommunity.R;
import com.hackcommunity.hackcommunity.model.IdeaModel;

import java.util.ArrayList;

/**
 * Created by taras on 22.02.2015.
 */
public class IdeaListAdapter extends BaseAdapter {

    Context context;
    ArrayList<IdeaModel> ideas;
    private static LayoutInflater inflater = null;

    public IdeaListAdapter(Context context, ArrayList<IdeaModel> ideas) {
        this.context = context;
        this.ideas = ideas;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return ideas.size();
    }

    @Override
    public Object getItem(int i) {
        return ideas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item_idea, viewGroup, false);
        }
        IdeaModel idea = (IdeaModel) getItem(i);

        TextView title = (TextView) view.findViewById(R.id.idea_title);
        TextView smallText = (TextView) view.findViewById(R.id.small_text);

        title.setText(idea.getTitle());
        smallText.setText(idea.getShortText());

        return view;
    }
}
