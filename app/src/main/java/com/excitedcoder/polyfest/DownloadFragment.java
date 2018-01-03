package com.excitedcoder.polyfest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class DownloadFragment extends Fragment {


    public DownloadFragment() {
        // Required empty public constructor
    }

    Button siteButton;
    Button brocher, poster, ib, invite;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_download, container, false);

       siteButton = (Button) v.findViewById(R.id.site_button);
       brocher = (Button) v.findViewById(R.id.download_brocher);
       poster = (Button) v.findViewById(R.id.download_poster);
       ib = (Button) v.findViewById(R.id.download_ib);
       invite = (Button) v.findViewById(R.id.invite_button);


        siteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Uri uri = Uri.parse("http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18"); // missing 'http://' will cause crash
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/

                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18");
                startActivity(downloads_intent);
            }
        });
        brocher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/polyfest-excitedcoder.appspot.com/o/BROUCHURE12.pdf?alt=media&token=cd3772e0-34f0-4f8f-9620-877465c58802");
                startActivity(downloads_intent);
            }
        });

        poster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/polyfest-excitedcoder.appspot.com/o/FESTPOSTER12.jpg?alt=media&token=9840f845-ab65-49a1-88d5-369c39d5bbd7");
                startActivity(downloads_intent);
            }
        });

        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/polyfest-excitedcoder.appspot.com/o/ibond.doc?alt=media&token=713f3b61-3a0a-4d57-b832-e3b45da6a426");
                startActivity(downloads_intent);
            }
        });

        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","http://aanm-vvrsrpolytechnic.ac.in/images/polytech/invitation030.jpg");
                startActivity(downloads_intent);
            }
        });




        return v;
    }


}
