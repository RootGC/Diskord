package com.jessecorbett.diskord.api.rest.client.internal

import com.jessecorbett.diskord.api.exception.DiscordException
import com.jessecorbett.diskord.util.DiskordInternals
import io.ktor.http.content.PartData
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.SerializationStrategy

@DiskordInternals
interface RateLimitedRestClient : RestClient {
    /**
     * Make a GET request for this discord object.
     *
     * @param url The url of the request.
     * @param rateLimit the rate limit info used for waiting if rate limited.
     *
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <R> getRequest(
        url: String,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo
    ): R

    /**
     * Make a POST request for this discord object.
     *
     * @param url The url of the request.
     * @param rateLimit the rate limit info used for waiting if rate limited.
     *
     * @return the API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun postRequest(url: String, rateLimit: RateLimitInfo = rateLimitInfo)

    /**
     * Make a POST request for this discord object.
     *
     * @param url The url of the request.
     * @param body The data to send with the API request.
     * @param serializer The request serializer.
     * @param rateLimit the rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     *
     * @return the API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <T> postRequest(
        url: String,
        body: T,
        serializer: SerializationStrategy<T>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false
    )

    /**
     * Make a POST request for this discord object.
     *
     * @param url The url of the request.
     * @param deserializer The response deserializer.
     * @param rateLimit the rate limit info used for waiting if rate limited.
     *
     * @return the API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <R> postRequest(
        url: String,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo
    ): R

    /**
     * Make a POST request for this discord object.
     *
     * @param url The url of the request.
     * @param body The data to send with the API request.
     * @param serializer The request serializer.
     * @param deserializer The response deserializer.
     * @param rateLimit the rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     *
     * @return the API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <T, R> postRequest(
        url: String,
        body: T,
        serializer: SerializationStrategy<T>,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false
    ): R

    /**
     * Make a multipart POST request for this discord object.
     *
     * @param url The url of the request.
     * @param payload The data to send with the API request.
     * @param serializer The request serializer.
     * @param deserializer The response deserializer.
     * @param rateLimit the rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     * @param block the block to build the multipart data
     *
     * @return the API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <T, R> postMultipartRequest(
        url: String,
        payload: T,
        serializer: SerializationStrategy<T>,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false,
        block: () -> List<PartData>
    ): R

    /**
     * Make a PUT request for this discord object.
     *
     * @param url The url of the request.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     *
     * @return The API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun putRequest(url: String, rateLimit: RateLimitInfo = rateLimitInfo)

    /**
     * Make a PUT request for this discord object.
     *
     * @param url The url of the request.
     * @param body The data to send with the API request.
     * @param serializer The request serializer.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     *
     * @return The API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <T> putRequest(
        url: String,
        body: T,
        serializer: SerializationStrategy<T>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false
    )

    /**
     * Make a PUT request for this discord object.
     *
     * @param url The url of the request.
     * @param deserializer The response deserializer.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     *
     * @return The API response.
     * @throws DiscordException Representing an API error.
     */
    @DiskordInternals
    suspend fun <R> putRequest(
        url: String,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo
    ): R

    /**
     * Make a PUT request for this discord object.
     *
     * @param url The url of the request.
     * @param serializer The request serializer.
     * @param deserializer The response deserializer.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     *
     * @return The API response.
     * @throws DiscordException Representing an API error.
     */
    @DiskordInternals
    suspend fun <T, R> putRequest(
        url: String,
        body: T,
        serializer: SerializationStrategy<T>,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false
    ): R

    /**
     * Make a PATCH request for this discord object.
     *
     * @param url The url of the request.
     * @param body The data to send with the API request.
     * @param serializer The request serializer.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     *
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <T> patchRequest(
        url: String,
        body: T,
        serializer: SerializationStrategy<T>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false
    )

    /**
     * Make a PATCH request for this discord object.
     *
     * @param url The url of the request.
     * @param body The data to send with the API request.
     * @param serializer The request serializer.
     * @param deserializer The response deserializer.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     * @param omitNullProperties skip serialization of null properties.
     *
     * @return The API response.
     * @throws DiscordException representing an API error.
     */
    @DiskordInternals
    suspend fun <T, R> patchRequest(
        url: String,
        body: T,
        serializer: SerializationStrategy<T>,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo,
        omitNullProperties: Boolean = false
    ): R

    /**
     * Make a DELETE request for this discord object.
     *
     * @param url The url of the request.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     *
     * @throws DiscordException Representing an API error.
     */
    @DiskordInternals
    suspend fun deleteRequest(url: String, rateLimit: RateLimitInfo = rateLimitInfo)

    /**
     * Make a DELETE request for this discord object.
     *
     * @param url The url of the request.
     * @param deserializer The response deserializer.
     * @param rateLimit The rate limit info used for waiting if rate limited.
     *
     * @return The API response.
     * @throws DiscordException Representing an API error.
     */
    @DiskordInternals
    suspend fun <R> deleteRequest(
        url: String,
        deserializer: DeserializationStrategy<R>,
        rateLimit: RateLimitInfo = rateLimitInfo
    ): R
}