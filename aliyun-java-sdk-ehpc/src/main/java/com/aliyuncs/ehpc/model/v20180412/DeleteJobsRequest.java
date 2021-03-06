/*
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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteJobsRequest extends RpcAcsRequest<DeleteJobsResponse> {
	   

	private String jobs;

	private String clusterId;
	public DeleteJobsRequest() {
		super("EHPC", "2018-04-12", "DeleteJobs", "ehs");
		setMethod(MethodType.GET);
	}

	public String getJobs() {
		return this.jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
		if(jobs != null){
			putQueryParameter("Jobs", jobs);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<DeleteJobsResponse> getResponseClass() {
		return DeleteJobsResponse.class;
	}

}
