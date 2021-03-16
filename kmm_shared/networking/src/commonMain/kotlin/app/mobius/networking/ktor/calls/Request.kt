package app.mobius.networking.ktor.calls

import app.mobius.networking.ktor.engine.KtorHttpClient
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.util.*

/**
 *  When handling routes (Routing feature), or directly intercepting the pipeline (requests),
 *  you get a context with an
 *  ApplicationCall. That call contains a property called request.
 *  The main function for creating HTTP requests is request. All the request settings are generated
 *  using the HttpRequestBuilder.
 *  The request function has the suspend modifier, so requests can be executed in coroutines.
 */
@KtorExperimentalAPI
class Request {

    private val client = KtorHttpClient().client

//    TODO: Clean default headers
    suspend fun getHtmlContent() = client.request<String> {
        url("http://www.google.com")
        method = HttpMethod.Get
    }

}