package com.netsky.zerozapp.about;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.netsky.zerozapp.R;
import com.vansuita.materialabout.builder.AboutBuilder;

/**
 * Created by zyxins on 2017-03-05.
 */

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = AboutBuilder.with(this)
                .setPhoto(R.drawable.zyxins)
                .setCover(R.mipmap.profile_cover)
                .setName("章永新")
                .setSubTitle("Mobile Developer")
                .setBrief("有知,有行,知行合一")
                .setAppIcon(R.mipmap.ic_launcher)
                .setAppName(R.string.app_name)
                .setLinksColumnsCount(4)
                .addGitHubLink("zyxins")
                .addFacebookLink("user")
                .addTwitterLink("user")
                .addGooglePlusLink("+zyxins")
                .addYoutubeChannelLink("zyxins")
                .addEmailLink("zyxins@gmail.com")
                .addGoogleLink("user")
                .addAndroidLink("user")
                .addFiveStarsAction()
                .setVersionNameAsAppSubTitle()
                .addShareAction(R.string.app_name)
                .setWrapScrollView(true)
                .setLinksAnimated(true)
                .build();
        setContentView(view);

    }
}
