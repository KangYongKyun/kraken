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

public enum CommitOp {
	CreateDoc(1), UpdateDoc(2), DeleteDoc(3), CreateCol(4), DropCol(5);

	private int code;

	CommitOp(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static CommitOp parse(int code) {
		for (CommitOp op : values())
			if (op.getCode() == code)
				return op;
		
		return null;
	}
}
