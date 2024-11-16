package com.example.assignment_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class BookExpandableAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> bookTypesList;
    private HashMap<String, List<String>> bookDetailsMap;

    public BookExpandableAdapter(Context context, List<String> bookTypesList, HashMap<String, List<String>> bookDetailsMap) {
        this.context = context;
        this.bookTypesList = bookTypesList;
        this.bookDetailsMap = bookDetailsMap;
    }

    @Override
    public int getGroupCount() {
        return bookTypesList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return bookDetailsMap.get(bookTypesList.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return bookTypesList.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return bookDetailsMap.get(bookTypesList.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.group_item, null); // Inflate custom layout for group
        }

        TextView textView = convertView.findViewById(R.id.groupTitle);
        textView.setText((String) getGroup(groupPosition)); // Set the group title
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_item, null); // Inflate custom layout for child
        }

        TextView textView = convertView.findViewById(R.id.childSummary);
        textView.setText((String) getChild(groupPosition, childPosition)); // Set the child summary
        return convertView;
    }


    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
