package com.KP.simonicv2.Reportc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.KP.simonicv2.R;
import com.skyhope.expandcollapsecardview.ExpandCollapseCard;
import com.skyhope.expandcollapsecardview.ExpandCollapseListener;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ReportcFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ReportcFragment extends Fragment   {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ReportcFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ReportFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ReportcFragment newInstance(String param1, String param2) {
        ReportcFragment fragment = new ReportcFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private ArrayList<Report_c> reportlist = new ArrayList<>();
    private RecyclerView Rv_reportc;
    private ReportcAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_report, container, false);
        addData();
        Rv_reportc = (RecyclerView) view.findViewById(R.id.rv_reportc);

        Rv_reportc.setHasFixedSize(true);
        ReportcAdapter adapter = new ReportcAdapter(getActivity(),reportlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        Rv_reportc.setLayoutManager(layoutManager);
        Rv_reportc.setAdapter(adapter);

        adapter.notifyDataSetChanged();
        return view;
    }

    private void addData(){
        reportlist = new ArrayList<>();
        reportlist.add(new Report_c("RS. Hasan Sadikin","Senin, 24/08/2020"));
        reportlist.add(new Report_c("RS. Hasan Sadikin","Senin, 24/08/2020"));
        reportlist.add(new Report_c("RS. Hasan Sadikin","Senin, 24/08/2020"));
        reportlist.add(new Report_c("RS. Hasan Sadikin","Senin, 24/08/2020"));
        reportlist.add(new Report_c("RS. Hasan Sadikin","Senin, 24/08/2020"));

    }

}