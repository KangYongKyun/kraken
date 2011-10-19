/*
 * Copyright 2011 Future Systems, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.krakenapps.confdb;

public interface ConfigCollection {
	String getName();

	ConfigIterator findAll();

	ConfigIterator find(Predicate pred);

	Config findOne(Predicate pred);

	Config add(Object doc);

	Config add(Object doc, String committer, String log);

	Config update(Config c);

	Config update(Config c, boolean ignoreConflict);

	Config update(Config c, boolean ignoreConflict, String committer, String log);

	Config remove(Config c);

	Config remove(Config c, boolean ignoreConflict);

	Config remove(Config c, boolean ignoreConflict, String committer, String log);

	void addHook(CommitOp op, ConfigListener listener);

	void removeHook(CommitOp op, ConfigListener listener);
}
