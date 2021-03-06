package com.vk.api.sdk.queries.account;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.base.responses.OkResponse;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Account.setSilenceMode method
 */
public class AccountSetSilenceModeQuery extends AbstractQueryBuilder<AccountSetSilenceModeQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public AccountSetSilenceModeQuery(VkApiClient client, Actor actor) {
        super(client, "account.setSilenceMode", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set device id
     *
     * @param value value of "device id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetSilenceModeQuery deviceId(String value) {
        return unsafeParam("device_id", value);
    }

    /**
     * Set time
     *
     * @param value value of "time" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetSilenceModeQuery time(Integer value) {
        return unsafeParam("time", value);
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetSilenceModeQuery peerId(Integer value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set sound
     *
     * @param value value of "sound" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public AccountSetSilenceModeQuery sound(Integer value) {
        return unsafeParam("sound", value);
    }

    @Override
    protected AccountSetSilenceModeQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
