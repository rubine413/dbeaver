/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
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
package org.jkiss.dbeaver.model.exec;

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.rdb.DBSCatalog;
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;

/**
 * Execution context defaults.
 * Provides access to default context catalog/schema.
 * Note: metadata context defaults are datasource defaults.
 */
public interface DBCExecutionContextDefaults<CATALOG extends DBSCatalog, SCHEMA extends DBSSchema> {

    CATALOG getDefaultCatalog();

    SCHEMA getDefaultSchema();

    boolean supportsCatalogChange();

    boolean supportsSchemaChange();

    void setDefaultCatalog(DBRProgressMonitor monitor, CATALOG catalog, SCHEMA schema) throws DBCException;

    void setDefaultSchema(DBRProgressMonitor monitor, SCHEMA schema) throws DBCException;

    boolean refreshDefaults(DBRProgressMonitor monitor) throws DBException;

}
