package io.TdaTelcosSimulacion.client.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import org.threeten.bp.OffsetDateTime;

import io.TdaTelcosSimulacion.client.ApiCallback;
import io.TdaTelcosSimulacion.client.ApiClient;
import io.TdaTelcosSimulacion.client.ApiException;
import io.TdaTelcosSimulacion.client.ApiResponse;
import io.TdaTelcosSimulacion.client.Configuration;
import io.TdaTelcosSimulacion.client.Pair;
import io.TdaTelcosSimulacion.client.ProgressRequestBody;
import io.TdaTelcosSimulacion.client.ProgressResponseBody;
import io.TdaTelcosSimulacion.client.model.AckSuccessTDAConsumption;
import io.TdaTelcosSimulacion.client.model.AckTDARequest;
import io.TdaTelcosSimulacion.client.model.AckTelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregation;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregationConfiguration;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregationConfigurationResponse;
import io.TdaTelcosSimulacion.client.model.TelcosDataAggregationMetadata;

import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TdaApiForTelcosDataAggregationApi {
    private ApiClient apiClient;
    public TdaApiForTelcosDataAggregationApi() {
        this(Configuration.getDefaultApiClient());
    }
    public TdaApiForTelcosDataAggregationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getConfTelcosDataAggregationCall(String xApiKey, UUID subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/configurations/{subscriptionId}"
            .replaceAll("\\{" + "subscriptionId" + "\\}", apiClient.escapeString(subscriptionId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call getConfTelcosDataAggregationValidateBeforeCall(String xApiKey, UUID subscriptionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getConfTelcosDataAggregation(Async)");
        }
        
        if (subscriptionId == null) {
            throw new ApiException("Missing the required parameter 'subscriptionId' when calling getConfTelcosDataAggregation(Async)");
        }
        
        okhttp3.Call call = getConfTelcosDataAggregationCall(xApiKey, subscriptionId, progressListener, progressRequestListener);
        return call;
    }
    
    public TelcosDataAggregationConfigurationResponse getConfTelcosDataAggregation(String xApiKey, UUID subscriptionId) throws ApiException {
        ApiResponse<TelcosDataAggregationConfigurationResponse> resp = getConfTelcosDataAggregationWithHttpInfo(xApiKey, subscriptionId);
        return resp.getData();
    }
    
    public ApiResponse<TelcosDataAggregationConfigurationResponse> getConfTelcosDataAggregationWithHttpInfo(String xApiKey, UUID subscriptionId) throws ApiException {
        okhttp3.Call call = getConfTelcosDataAggregationValidateBeforeCall(xApiKey,subscriptionId, null, null);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationConfigurationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    /*public okhttp3.Call getConfTelcosDataAggregationAsync(String xApiKey, String username, String password, String xSignature, UUID subscriptionId, final ApiCallback<TelcosDataAggregationConfigurationResponse> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = getConfTelcosDataAggregationValidateBeforeCall(xApiKey, subscriptionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationConfigurationResponse>(){}.getType();
        //apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }*/
    
    public okhttp3.Call getInquiryCall(String xApiKey, String xPublicKey, String inquiryId, 
    		final ProgressResponseBody.ProgressListener progressListener, 
    		final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/telcosdataaggregations/{inquiryId}"
            .replaceAll("\\{" + "inquiryId" + "\\}", apiClient.escapeString(inquiryId.toString()));
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (xPublicKey != null)
        localVarHeaderParams.put("x-public-key", apiClient.parameterToString(xPublicKey));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call getInquiryValidateBeforeCall(String xApiKey,String xPublicKey, String inquiryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getInquiry(Async)");
        }
        
        if (inquiryId == null) {
            throw new ApiException("Missing the required parameter 'inquiryId' when calling getInquiry(Async)");
        }
        
        if (xPublicKey == null) {
            throw new ApiException("Missing the required parameter 'xPublicKey' when calling getInquiry(Async)");
        }
        
        okhttp3.Call call = getInquiryCall(xApiKey,xPublicKey, inquiryId, progressListener, progressRequestListener);
        return call;
    }
    
    public ApiResponse<AckSuccessTDAConsumption> getInquiry(String xApiKey, String xPublicKey, String inquiryId) throws ApiException {
        ApiResponse<AckSuccessTDAConsumption> resp = getInquiryWithHttpInfo(xApiKey, xPublicKey, inquiryId);
        return resp;
    }
    
    public ApiResponse<AckSuccessTDAConsumption> getInquiryWithHttpInfo(String xApiKey, String  xPublicKey,
    		String inquiryId) throws ApiException {
        okhttp3.Call call = getInquiryValidateBeforeCall(xApiKey, xPublicKey, inquiryId, null, null);
        Type localVarReturnType = new TypeToken<AckSuccessTDAConsumption>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    
    public okhttp3.Call getTelcosDataAggregationsCall(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        String localVarPath = "/telcosdataaggregations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("perPage", perPage));
        if (startAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("startAt", startAt));
        if (endAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("endAt", endAt));
        if (inquiryStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("inquiryStatus", inquiryStatus));
        if (successCheck != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("successCheck", successCheck));
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call getTelcosDataAggregationsValidateBeforeCall(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getTelcosDataAggregations(Async)");
        }
        
        okhttp3.Call call = getTelcosDataAggregationsCall(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck, progressListener, progressRequestListener);
        return call;
    }
    
    public TelcosDataAggregationMetadata getTelcosDataAggregations(String xApiKey,  String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        ApiResponse<TelcosDataAggregationMetadata> resp = getTelcosDataAggregationsWithHttpInfo(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck);
        return resp.getData();
    }
    
    public ApiResponse<TelcosDataAggregationMetadata> getTelcosDataAggregationsWithHttpInfo(String xApiKey, String page, String perPage, OffsetDateTime startAt, OffsetDateTime endAt, String inquiryStatus, String successCheck) throws ApiException {
        okhttp3.Call call = getTelcosDataAggregationsValidateBeforeCall(xApiKey, page, perPage, startAt, endAt, inquiryStatus, successCheck, null, null);
        Type localVarReturnType = new TypeToken<TelcosDataAggregationMetadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
 
    
    public okhttp3.Call postConfTelcosDataAggregationCall(String xApiKey,  TelcosDataAggregationConfiguration request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/configurations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call postConfTelcosDataAggregationValidateBeforeCall(String xApiKey, TelcosDataAggregationConfiguration request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postConfTelcosDataAggregation(Async)");
        }
        
        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postConfTelcosDataAggregation(Async)");
        }
        
        okhttp3.Call call = postConfTelcosDataAggregationCall(xApiKey, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckTelcosDataAggregation postConfTelcosDataAggregation(String xApiKey,  TelcosDataAggregationConfiguration request) throws ApiException {
        ApiResponse<AckTelcosDataAggregation> resp = postConfTelcosDataAggregationWithHttpInfo(xApiKey, request);
        return resp.getData();
    }
    
    public ApiResponse<AckTelcosDataAggregation> postConfTelcosDataAggregationWithHttpInfo(String xApiKey, TelcosDataAggregationConfiguration request) throws ApiException {
        okhttp3.Call call = postConfTelcosDataAggregationValidateBeforeCall(xApiKey, request, null, null);
        Type localVarReturnType = new TypeToken<AckTelcosDataAggregation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    
    public okhttp3.Call postTelcosDataAggregationCall(String xApiKey, TelcosDataAggregation request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/telcosdataaggregations";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    private okhttp3.Call postTelcosDataAggregationValidateBeforeCall(String xApiKey,  TelcosDataAggregation request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling postTelcosDataAggregation(Async)");
        }

        if (request == null) {
            throw new ApiException("Missing the required parameter 'request' when calling postTelcosDataAggregation(Async)");
        }
        
        okhttp3.Call call = postTelcosDataAggregationCall(xApiKey, request, progressListener, progressRequestListener);
        return call;
    }
    
    public AckTDARequest postTelcosDataAggregation(String xApiKey,  TelcosDataAggregation request) throws ApiException {
        ApiResponse<AckTDARequest> resp = postTelcosDataAggregationWithHttpInfo(xApiKey, request);
        
        return resp.getData();
    }
    
    public ApiResponse<AckTDARequest> postTelcosDataAggregationWithHttpInfo(String xApiKey,  TelcosDataAggregation request) throws ApiException {
        okhttp3.Call call = postTelcosDataAggregationValidateBeforeCall(xApiKey, request, null, null);
        Type localVarReturnType = new TypeToken<AckTDARequest>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call postTelcosDataAggregationAsync(String xApiKey, String xSignature, String username, String password, TelcosDataAggregation request, final ApiCallback<AckTDARequest> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = postTelcosDataAggregationValidateBeforeCall(xApiKey, request, progressListener, progressRequestListener);
        return call;
    }
}
