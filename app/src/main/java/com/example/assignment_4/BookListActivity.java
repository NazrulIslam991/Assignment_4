package com.example.assignment_4;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookListActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    HashMap<String, List<String>> bookDetailsMap;
    List<String> bookTitlesList;
    String selectedBookType;
    TextView subtitleTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        getWindow().setStatusBarColor(ContextCompat.getColor(BookListActivity.this, R.color.Home));


        expandableListView = findViewById(R.id.expandableListView);
        selectedBookType = getIntent().getStringExtra("bookType");

        // Set the subtitle TextView to show the selected book type
        subtitleTextView = findViewById(R.id.sub_title_book);
        subtitleTextView.setText(selectedBookType + " Story book");



        bookDetailsMap = new HashMap<>();
        bookTitlesList = new ArrayList<>();

        // Populate books by type (hardcoded)
        loadBooks();

        BookExpandableAdapter adapter = new BookExpandableAdapter(this, bookTitlesList, bookDetailsMap);
        expandableListView.setAdapter(adapter);
    }

    private void loadBooks() {
        if ("Science".equals(selectedBookType)) {
            // Add Science books and summaries
            addBookWithSummary(R.string.martian_title, R.string.martian_summary);
            addBookWithSummary(R.string.contact_title, R.string.contact_summary);
            addBookWithSummary(R.string.jurassic_title, R.string.jurassic_summary);
            addBookWithSummary(R.string.frankenstein_title, R.string.frankenstein_summary);
            addBookWithSummary(R.string.andromeda_title, R.string.andromeda_summary);
            addBookWithSummary(R.string.brave_new_world_title, R.string.brave_new_world_summary);
            addBookWithSummary(R.string.flowers_for_algernon_title, R.string.flowers_for_algernon_summary);
            addBookWithSummary(R.string.flatland_title, R.string.flatland_summary);
            addBookWithSummary(R.string.time_machine_title, R.string.time_machine_summary);
            addBookWithSummary(R.string.invisible_man_title, R.string.invisible_man_summary);
            addBookWithSummary(R.string.island_of_doctor_moreau_title, R.string.island_of_doctor_moreau_summary);
        }
        else if ("Fiction".equals(selectedBookType)) {
            // Add Fiction books and summaries
            addBookWithSummary(R.string.martian_title, R.string.martian_summary);
            addBookWithSummary(R.string.contact_title, R.string.contact_summary);
            addBookWithSummary(R.string.jurassic_title, R.string.jurassic_summary);
            addBookWithSummary(R.string.frankenstein_title, R.string.frankenstein_summary);
            addBookWithSummary(R.string.andromeda_title, R.string.andromeda_summary);
            addBookWithSummary(R.string.brave_new_world_title, R.string.brave_new_world_summary);
            addBookWithSummary(R.string.flowers_for_algernon_title, R.string.flowers_for_algernon_summary);
            addBookWithSummary(R.string.flatland_title, R.string.flatland_summary);
            addBookWithSummary(R.string.time_machine_title, R.string.time_machine_summary);
            addBookWithSummary(R.string.invisible_man_title, R.string.invisible_man_summary);
            addBookWithSummary(R.string.island_of_doctor_moreau_title, R.string.island_of_doctor_moreau_summary);
        }

        else if ("Thriller".equals(selectedBookType)) {
            // Add Thriller books and summaries
            addBookWithSummary(R.string.girl_with_dragon_tattoo_title, R.string.girl_with_dragon_tattoo_summary);
            addBookWithSummary(R.string.gone_girl_title, R.string.gone_girl_summary);
            addBookWithSummary(R.string.silent_patient_title, R.string.silent_patient_summary);
            addBookWithSummary(R.string.shutter_island_title, R.string.shutter_island_summary);
            addBookWithSummary(R.string.woman_in_window_title, R.string.woman_in_window_summary);
            addBookWithSummary(R.string.before_i_go_to_sleep_title, R.string.before_i_go_to_sleep_summary);
            addBookWithSummary(R.string.girl_on_train_title, R.string.girl_on_train_summary);
            addBookWithSummary(R.string.reversal_title, R.string.reversal_summary);
            addBookWithSummary(R.string.i_am_watching_you_title, R.string.i_am_watching_you_summary);
            addBookWithSummary(R.string.couple_next_door_title, R.string.couple_next_door_summary);
        }
        else if ("Fantasy".equals(selectedBookType)) {
            // Add Fantasy books and summaries
            addBookWithSummary(R.string.the_hobbit_title, R.string.the_hobbit_summary);
            addBookWithSummary(R.string.harry_potter_title, R.string.harry_potter_summary);
            addBookWithSummary(R.string.name_of_the_wind_title, R.string.name_of_the_wind_summary);
            addBookWithSummary(R.string.lies_of_locke_lamora_title, R.string.lies_of_locke_lamora_summary);
            addBookWithSummary(R.string.priory_of_orange_tree_title, R.string.priory_of_orange_tree_summary);
            addBookWithSummary(R.string.eragon_title, R.string.eragon_summary);
            addBookWithSummary(R.string.court_of_thorns_roses_title, R.string.court_of_thorns_roses_summary);
            addBookWithSummary(R.string.night_circus_title, R.string.night_circus_summary);
            addBookWithSummary(R.string.mistborn_final_empire_title, R.string.mistborn_final_empire_summary);
            addBookWithSummary(R.string.chronicles_of_narnia_title, R.string.chronicles_of_narnia_summary);
        }
        else if ("History".equals(selectedBookType)) {
            // Add History books and summaries
            addBookWithSummary(R.string.sapiens_title, R.string.sapiens_summary);
            addBookWithSummary(R.string.anne_frank_title, R.string.anne_frank_summary);
            addBookWithSummary(R.string.guns_of_august_title, R.string.guns_of_august_summary);
            addBookWithSummary(R.string.peoples_history_title, R.string.peoples_history_summary);
            addBookWithSummary(R.string.ancient_world_title, R.string.ancient_world_summary);
            addBookWithSummary(R.string.silk_roads_title, R.string.silk_roads_summary);
            addBookWithSummary(R.string.rise_fall_third_reich_title, R.string.rise_fall_third_reich_summary);
            addBookWithSummary(R.string.warmth_of_other_suns_title, R.string.warmth_of_other_suns_summary);
            addBookWithSummary(R.string.immortal_life_title, R.string.immortal_life_summary);
            addBookWithSummary(R.string.histories_title, R.string.histories_summary);
        }
        else if ("Biography".equals(selectedBookType)) {
            // Add Biography books and summaries
            addBookWithSummary(R.string.steve_jobs_title, R.string.steve_jobs_summary);
            addBookWithSummary(R.string.becoming_title, R.string.becoming_summary);
            addBookWithSummary(R.string.diary_of_young_girl_title, R.string.diary_of_young_girl_summary);
            addBookWithSummary(R.string.long_walk_to_freedom_title, R.string.long_walk_to_freedom_summary);
            addBookWithSummary(R.string.alexander_hamilton_title, R.string.alexander_hamilton_summary);
            addBookWithSummary(R.string.wright_brothers_title, R.string.wright_brothers_summary);
            addBookWithSummary(R.string.churchill_title, R.string.churchill_summary);
            addBookWithSummary(R.string.einstein_title, R.string.einstein_summary);
            addBookWithSummary(R.string.i_am_malala_title, R.string.i_am_malala_summary);
            addBookWithSummary(R.string.educated_title, R.string.educated_summary);
            addBookWithSummary(R.string.the_glass_castle_title, R.string.the_glass_castle_summary);
            addBookWithSummary(R.string.benjamin_franklin_title, R.string.benjamin_franklin_summary);
        }
        else if ("Philosophy".equals(selectedBookType)) {
            // Add Philosophy books and summaries
            addBookWithSummary(R.string.sophies_world_title, R.string.sophies_world_summary);
            addBookWithSummary(R.string.republic_title, R.string.republic_summary);
            addBookWithSummary(R.string.meditations_title, R.string.meditations_summary);
            addBookWithSummary(R.string.zen_art_motorcycle_title, R.string.zen_art_motorcycle_summary);
            addBookWithSummary(R.string.mans_search_meaning_title, R.string.mans_search_meaning_summary);
            addBookWithSummary(R.string.being_time_title, R.string.being_time_summary);
            addBookWithSummary(R.string.stranger_title, R.string.stranger_summary);
            addBookWithSummary(R.string.beyond_good_evil_title, R.string.beyond_good_evil_summary);
            addBookWithSummary(R.string.critique_pure_reason_title, R.string.critique_pure_reason_summary);
            addBookWithSummary(R.string.tao_te_ching_title, R.string.tao_te_ching_summary);
        }
        else if ("Art".equals(selectedBookType)) {
            // Add Art books and summaries
            addBookWithSummary(R.string.goldfinch_title, R.string.goldfinch_summary);
            addBookWithSummary(R.string.girl_with_pearl_earring_title, R.string.girl_with_pearl_earring_summary);
            addBookWithSummary(R.string.art_forger_title, R.string.art_forger_summary);
            addBookWithSummary(R.string.dorian_gray_title, R.string.dorian_gray_summary);
            addBookWithSummary(R.string.shadow_of_the_wind_title, R.string.shadow_of_the_wind_summary);
            addBookWithSummary(R.string.collector_title, R.string.collector_summary);
            addBookWithSummary(R.string.improbability_of_love_title, R.string.improbability_of_love_summary);
            addBookWithSummary(R.string.secret_lives_of_color_title, R.string.secret_lives_of_color_summary);
            addBookWithSummary(R.string.passion_of_artemisia_title, R.string.passion_of_artemisia_summary);
            addBookWithSummary(R.string.i_am_a_cat_title, R.string.i_am_a_cat_summary);
        }

        else  if ("Technology".equals(selectedBookType)) {
            // Add Technology books and summaries
            addBookWithSummary(R.string.the_circle_title, R.string.the_circle_summary);
            addBookWithSummary(R.string.neuromancer_title, R.string.neuromancer_summary);
            addBookWithSummary(R.string.ready_player_one_title, R.string.ready_player_one_summary);
            addBookWithSummary(R.string.daemon_title, R.string.daemon_summary);
            addBookWithSummary(R.string.autonomous_title, R.string.autonomous_summary);
            addBookWithSummary(R.string.hunger_games_title, R.string.hunger_games_summary);
            addBookWithSummary(R.string.windup_girl_title, R.string.windup_girl_summary);
            addBookWithSummary(R.string.super_sad_true_love_story_title, R.string.super_sad_true_love_story_summary);
            addBookWithSummary(R.string.singularity_is_near_title, R.string.singularity_is_near_summary);
        }
        else {
            // Add Self-Help books and summaries
            addBookWithSummary(R.string.the_power_of_now_title, R.string.the_power_of_now_summary);
            addBookWithSummary(R.string.atomic_habits_title, R.string.atomic_habits_summary);
            addBookWithSummary(R.string.the_7_habits_title, R.string.the_7_habits_summary);
            addBookWithSummary(R.string.you_are_a_badaass_title, R.string.you_are_a_badaass_summary);
            addBookWithSummary(R.string.dare_to_lead_title, R.string.dare_to_lead_summary);
            addBookWithSummary(R.string.the_four_agreements_title, R.string.the_four_agreements_summary);
            addBookWithSummary(R.string.the_miracle_morning_title, R.string.the_miracle_morning_summary);
            addBookWithSummary(R.string.mindset_title, R.string.mindset_summary);
            addBookWithSummary(R.string.grit_title, R.string.grit_summary);
        }


    }


    // Helper function to add books and summaries
    private void addBookWithSummary(int titleResId, int summaryResId) {
        String title = getString(titleResId);
        String summary = getString(summaryResId);
        bookTitlesList.add(title);

        List<String> summaryList = new ArrayList<>();
        summaryList.add(summary);
        bookDetailsMap.put(title, summaryList);
    }
}
