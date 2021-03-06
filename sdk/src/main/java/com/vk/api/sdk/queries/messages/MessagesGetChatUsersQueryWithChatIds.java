package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.messages.responses.GetChatUsersChatIdsResponse;
import com.vk.api.sdk.queries.users.UsersNameCase;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getChatUsers method
 */
public class MessagesGetChatUsersQueryWithChatIds extends AbstractQueryBuilder<MessagesGetChatUsersQueryWithChatIds, GetChatUsersChatIdsResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     */
    public MessagesGetChatUsersQueryWithChatIds(VkApiClient client, Actor actor, Integer[] chatIds) {
        super(client, "messages.getChatUsers", GetChatUsersChatIdsResponse.class);
        accessToken(actor.getAccessToken());
        chatIds(chatIds);
    }

    /**
     * Chat IDs.
     *
     * @param value value of "chat ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MessagesGetChatUsersQueryWithChatIds chatIds(Integer... value) {
        return unsafeParam("chat_ids", value);
    }

    /**
     * Case for declension of user name and surname:
     * "nom" - nominative (default)
     * "gen" - genitive
     * "dat" - dative
     * "acc" - accusative
     * "ins" - instrumental
     * "abl" - prepositional
     *
     * @param value value of "name case" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MessagesGetChatUsersQueryWithChatIds nameCase(UsersNameCase value) {
        return unsafeParam("name_case", value);
    }

    @Override
    protected MessagesGetChatUsersQueryWithChatIds getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
