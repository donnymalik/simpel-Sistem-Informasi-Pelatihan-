package id.go.jatengprov.bpsdmd.simpel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;

import id.go.jatengprov.bpsdmd.simpel.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
/*        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }*/
    }

    public void webviewakd(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/akd");
        startActivity(webviewactivity);
    }

    public void webviewagenda(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/siagnes/");
        startActivity(webviewactivity);
    }

    public void webviewprofilwi(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/pakwi/profilwi.php");
        startActivity(webviewactivity);
    }

    public void webviewdaftaronline(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://daftar.bpsdmd.jatengprov.go.id/");
        startActivity(webviewactivity);
    }

    public void webviewrwytdiklat(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/infografis/riwayatdiklat/");
        startActivity(webviewactivity);
    }

    public void webviewelaporan(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/eproper/");
        startActivity(webviewactivity);
    }

    public void webviewepublik(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/epublic/");
        startActivity(webviewactivity);
    }

    public void webviewinfosewa(View view) {
        Intent webviewactivity= new Intent(MainActivity.this, WebviewActivity.class);
        webviewactivity.putExtra("url", "https://bpsdmd.jatengprov.go.id/infosewa/");
        startActivity(webviewactivity);
    }
    
}
