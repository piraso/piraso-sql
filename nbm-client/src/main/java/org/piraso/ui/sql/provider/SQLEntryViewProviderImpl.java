/*
 * Copyright (c) 2012 Alvin R. de Leon. All Rights Reserved.
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

package org.piraso.ui.sql.provider;

import org.openide.util.lookup.ServiceProvider;
import org.openide.windows.TopComponent;
import org.piraso.api.entry.Entry;
import org.piraso.api.sql.SQLDataViewEntry;
import org.piraso.api.sql.SQLViewEntry;
import org.piraso.ui.api.EntryViewProvider;
import org.piraso.ui.sql.SQLDataViewTopComponent;
import org.piraso.ui.sql.SQLViewTopComponent;

/**
 * Provides the view for {@link SQLDataViewEntry} and {@link SQLViewEntry} entry types.
 */
@ServiceProvider(service=EntryViewProvider.class)
public class SQLEntryViewProviderImpl implements EntryViewProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends TopComponent> getViewClass(Entry entry) {
        if(SQLDataViewEntry.class.isInstance(entry)) {
            return SQLDataViewTopComponent.class;
        } else if(SQLViewEntry.class.isInstance(entry)) {
            return SQLViewTopComponent.class;
        }

        return null;
    }
}
