/*
 * Copyright 2012 Future Systems
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
package org.krakenapps.logdb;

public abstract class EmptyLogQueryCallback implements LogQueryCallback {

	@Override
	public int offset() {
		return 0;
	}

	@Override
	public int limit() {
		return 0;
	}

	@Override
	public void onQueryStatusChange() {
	}

	@Override
	public void onPageLoaded() {
	}

	@Override
	public void onEof() {
	}

}
