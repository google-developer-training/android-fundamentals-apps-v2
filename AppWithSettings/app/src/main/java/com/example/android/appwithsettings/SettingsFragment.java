/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.appwithsettings;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * A subclass of PreferenceFragmentCompat to supply preferences in a
 * Fragment for the SettingsActivity to display.
 */
public class SettingsFragment extends PreferenceFragmentCompat {

    /**
     * Called during onCreate(Bundle) to supply the preferences for this
     * fragment. This calls setPreferenceFromResource to get the preferences
     * from the XML file.
     *
     * @param savedInstanceState If the fragment is being re-created from
     *                           a previous saved state, this is the state.
     * @param rootKey            If non-null, this preference fragment
     *                           should be rooted with this key.
     */
    @Override
    public void onCreatePreferences(Bundle savedInstanceState,
                                    String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }

}
