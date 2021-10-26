/*
 * Copyright 2020-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.oauth2.core.oidc;

import org.springframework.security.oauth2.jose.jws.JwsAlgorithm;

/**
 * The names of the "claims" defined by OpenID Connect Dynamic Client Registration 1.0
 * that are contained in the OpenID Client Registration Request and Response.
 *
 * @author Ovidiu Popa
 * @author Joe Grandja
 * @since 0.1.1
 * @see <a target="_blank" href="https://openid.net/specs/openid-connect-registration-1_0.html#ClientMetadata">2. Client Metadata</a>
 */
public interface OidcClientMetadataClaimNames {

	/**
	 * {@code client_id} - the Client Identifier
	 */
	String CLIENT_ID = "client_id";

	/**
	 * {@code client_id_issued_at} - the time at which the Client Identifier was issued
	 */
	String CLIENT_ID_ISSUED_AT = "client_id_issued_at";

	/**
	 * {@code client_secret} - the Client Secret
	 */
	String CLIENT_SECRET = "client_secret";

	/**
	 * {@code client_secret_expires_at} - the time at which the {@code client_secret} will expire or 0 if it will not expire
	 */
	String CLIENT_SECRET_EXPIRES_AT = "client_secret_expires_at";

	/**
	 * {@code client_name} - the name of the Client to be presented to the End-User
	 */
	String CLIENT_NAME = "client_name";

	/**
	 * {@code redirect_uris} - the redirection {@code URI} values used by the Client
	 */
	String REDIRECT_URIS = "redirect_uris";

	/**
	 * {@code token_endpoint_auth_method} - the authentication method used by the Client for the Token Endpoint
	 */
	String TOKEN_ENDPOINT_AUTH_METHOD = "token_endpoint_auth_method";

	/**
	 * {@code grant_types} - the OAuth 2.0 {@code grant_type} values that the Client will restrict itself to using
	 */
	String GRANT_TYPES = "grant_types";

	/**
	 * {@code response_types} - the OAuth 2.0 {@code response_type} values that the Client will restrict itself to using
	 */
	String RESPONSE_TYPES = "response_types";

	/**
	 * {@code scope} - a space-separated list of OAuth 2.0 {@code scope} values that the Client will restrict itself to using
	 */
	String SCOPE = "scope";

	/**
	 * {@code id_token_signed_response_alg} - the {@link JwsAlgorithm JWS} algorithm required for signing the {@link OidcIdToken ID Token} issued to the Client
	 */
	String ID_TOKEN_SIGNED_RESPONSE_ALG = "id_token_signed_response_alg";

	/**
	 * {@code registration_access_token} - the Registration Access Token that can be used at the Client Configuration Endpoint
	 * @since 0.2.1
	 */
	String REGISTRATION_ACCESS_TOKEN = "registration_access_token";

	/**
	 * {@code registration_client_uri} - the {@code URL} of the Client Configuration Endpoint where the Registration Access Token can be used
	 * @since 0.2.1
	 */
	String REGISTRATION_CLIENT_URI = "registration_client_uri";

}
