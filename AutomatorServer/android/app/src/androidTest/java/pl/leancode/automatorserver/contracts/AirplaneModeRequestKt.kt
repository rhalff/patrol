//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.automatorserver.contracts;

@kotlin.jvm.JvmName("-initializeairplaneModeRequest")
inline fun airplaneModeRequest(block: pl.leancode.automatorserver.contracts.AirplaneModeRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest =
  pl.leancode.automatorserver.contracts.AirplaneModeRequestKt.Dsl._create(pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest.newBuilder()).apply { block() }._build()
object AirplaneModeRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest = _builder.build()

    /**
     * <code>string appId = 1;</code>
     */
    var appId: kotlin.String
      @JvmName("getAppId")
      get() = _builder.getAppId()
      @JvmName("setAppId")
      set(value) {
        _builder.setAppId(value)
      }
    /**
     * <code>string appId = 1;</code>
     */
    fun clearAppId() {
      _builder.clearAppId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest.copy(block: pl.leancode.automatorserver.contracts.AirplaneModeRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.automatorserver.contracts.Contracts.AirplaneModeRequest =
  pl.leancode.automatorserver.contracts.AirplaneModeRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
