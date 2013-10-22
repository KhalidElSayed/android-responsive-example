package es.catmobil.tornofici.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;

import es.catmobil.tornofici.R;
import es.catmobil.tornofici.ui.fragment.NavigationDrawerFragment;

/**
 * Created by Bernat on 22/10/13.
 */
public class FirstActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks  {

    private NavigationDrawerFragment mNavigationDrawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        setUpNavigation();
        setUpFragments();
    }

    private void setUpNavigation() {
        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);

        // Set up the drawer.
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationDrawerFragment.setUp(R.id.navigation_drawer, drawerLayout);
    }

    private void setUpFragments() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content1, new Fragment());
        ft.commit();
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mNavigationDrawerFragment.syncState();
    }
}
