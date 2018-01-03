package com.excitedcoder.polyfest;


import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }

    Button nipsButton, gloryButton, clapButton, gGallery, feedback, winners, help, judges;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_event, container, false);


        nipsButton = (Button) v.findViewById(R.id.events_nips);
        nipsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Uri uri = Uri.parse("http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18/nips2k18"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/

                Intent nips_event_intent = new Intent(getActivity(), DetailActivity.class);
                nips_event_intent.putExtra("url","http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18/nips2k18");
                startActivity(nips_event_intent);
            }
        });

        gloryButton = (Button) v.findViewById(R.id.events_glory);
        gloryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Uri uri = Uri.parse("http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18/glory-paper-presentation"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/

                Intent glory_event_intent = new Intent(getActivity(), DetailActivity.class);
                glory_event_intent.putExtra("url","http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18/glory-paper-presentation");
                startActivity(glory_event_intent);
            }
        });

        clapButton = (Button) v.findViewById(R.id.events_clap);
        clapButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Uri uri = Uri.parse("http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18/2017-12-17-03-50-01"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/

                Intent clap_event_intent = new Intent(getActivity(), DetailActivity.class);
                clap_event_intent.putExtra("url","http://aanm-vvrsrpolytechnic.ac.in/index.php/polyfest2k18/2017-12-17-03-50-01");
                startActivity(clap_event_intent);
            }
        });

        gGallery = (Button) v.findViewById(R.id.guest_gallery);
        gGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://docs.google.com/forms/d/e/1FAIpQLSecaCsti0XIT9VvUpJW1-hUED3GBl_fICYQvheGIwNTR6wgiA/viewform");
                startActivity(downloads_intent);
            }
        });

        feedback = (Button) v.findViewById(R.id.feedback);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://docs.google.com/forms/d/e/1FAIpQLSc-tDmCeqIhF3oCkxVMv280gPhQ6YwS7iyOn-4Fn-UxyvThPg/viewform");
                startActivity(downloads_intent);
            }
        });

        winners = (Button) v.findViewById(R.id.winners_list);
        winners.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://goo.gl/forms/VOIvXFA052xiBB6p2");
                startActivity(downloads_intent);
            }
        });

        help = (Button) v.findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://goo.gl/forms/UuRbMRnfLKyP5SiG2");
                startActivity(downloads_intent);
            }
        });

        judges = (Button) v.findViewById(R.id.judges);
        judges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent downloads_intent = new Intent(getActivity(), DetailActivity.class);
                downloads_intent.putExtra("url","https://docs.google.com/forms/d/e/1FAIpQLSdpxJWvNiW8mVl-jv0p9v659uQQbhlsA55tlQMMMkuIUkluoA/viewform");
                startActivity(downloads_intent);
            }
        });



        return v;
    }

}
