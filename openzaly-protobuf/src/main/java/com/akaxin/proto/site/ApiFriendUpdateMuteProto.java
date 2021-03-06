// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_friend_updateMute.proto

package com.akaxin.proto.site;

public final class ApiFriendUpdateMuteProto {
  private ApiFriendUpdateMuteProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ApiFriendUpdateMuteRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendUpdateMuteRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    java.lang.String getSiteFriendId();
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteFriendIdBytes();

    /**
     * <pre>
     *消息免打扰状态
     * </pre>
     *
     * <code>optional bool mute = 2;</code>
     */
    boolean getMute();
  }
  /**
   * Protobuf type {@code site.ApiFriendUpdateMuteRequest}
   */
  public  static final class ApiFriendUpdateMuteRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendUpdateMuteRequest)
      ApiFriendUpdateMuteRequestOrBuilder {
    // Use ApiFriendUpdateMuteRequest.newBuilder() to construct.
    private ApiFriendUpdateMuteRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiFriendUpdateMuteRequest() {
      siteFriendId_ = "";
      mute_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiFriendUpdateMuteRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              siteFriendId_ = s;
              break;
            }
            case 16: {

              mute_ = input.readBool();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.class, com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.Builder.class);
    }

    public static final int SITE_FRIEND_ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object siteFriendId_;
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    public java.lang.String getSiteFriendId() {
      java.lang.Object ref = siteFriendId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        siteFriendId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *好友用户ID
     * </pre>
     *
     * <code>optional string site_friend_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteFriendIdBytes() {
      java.lang.Object ref = siteFriendId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        siteFriendId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MUTE_FIELD_NUMBER = 2;
    private boolean mute_;
    /**
     * <pre>
     *消息免打扰状态
     * </pre>
     *
     * <code>optional bool mute = 2;</code>
     */
    public boolean getMute() {
      return mute_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getSiteFriendIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, siteFriendId_);
      }
      if (mute_ != false) {
        output.writeBool(2, mute_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getSiteFriendIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, siteFriendId_);
      }
      if (mute_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, mute_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest other = (com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest) obj;

      boolean result = true;
      result = result && getSiteFriendId()
          .equals(other.getSiteFriendId());
      result = result && (getMute()
          == other.getMute());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + SITE_FRIEND_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSiteFriendId().hashCode();
      hash = (37 * hash) + MUTE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMute());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code site.ApiFriendUpdateMuteRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendUpdateMuteRequest)
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteRequest_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.class, com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        siteFriendId_ = "";

        mute_ = false;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteRequest_descriptor;
      }

      public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest build() {
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest buildPartial() {
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest result = new com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest(this);
        result.siteFriendId_ = siteFriendId_;
        result.mute_ = mute_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest) {
          return mergeFrom((com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest other) {
        if (other == com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest.getDefaultInstance()) return this;
        if (!other.getSiteFriendId().isEmpty()) {
          siteFriendId_ = other.siteFriendId_;
          onChanged();
        }
        if (other.getMute() != false) {
          setMute(other.getMute());
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object siteFriendId_ = "";
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public java.lang.String getSiteFriendId() {
        java.lang.Object ref = siteFriendId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          siteFriendId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteFriendIdBytes() {
        java.lang.Object ref = siteFriendId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          siteFriendId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public Builder setSiteFriendId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        siteFriendId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public Builder clearSiteFriendId() {
        
        siteFriendId_ = getDefaultInstance().getSiteFriendId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *好友用户ID
       * </pre>
       *
       * <code>optional string site_friend_id = 1;</code>
       */
      public Builder setSiteFriendIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        siteFriendId_ = value;
        onChanged();
        return this;
      }

      private boolean mute_ ;
      /**
       * <pre>
       *消息免打扰状态
       * </pre>
       *
       * <code>optional bool mute = 2;</code>
       */
      public boolean getMute() {
        return mute_;
      }
      /**
       * <pre>
       *消息免打扰状态
       * </pre>
       *
       * <code>optional bool mute = 2;</code>
       */
      public Builder setMute(boolean value) {
        
        mute_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *消息免打扰状态
       * </pre>
       *
       * <code>optional bool mute = 2;</code>
       */
      public Builder clearMute() {
        
        mute_ = false;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:site.ApiFriendUpdateMuteRequest)
    }

    // @@protoc_insertion_point(class_scope:site.ApiFriendUpdateMuteRequest)
    private static final com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest();
    }

    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiFriendUpdateMuteRequest>
        PARSER = new com.google.protobuf.AbstractParser<ApiFriendUpdateMuteRequest>() {
      public ApiFriendUpdateMuteRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiFriendUpdateMuteRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiFriendUpdateMuteRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiFriendUpdateMuteRequest> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ApiFriendUpdateMuteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiFriendUpdateMuteResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiFriendUpdateMuteResponse}
   */
  public  static final class ApiFriendUpdateMuteResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:site.ApiFriendUpdateMuteResponse)
      ApiFriendUpdateMuteResponseOrBuilder {
    // Use ApiFriendUpdateMuteResponse.newBuilder() to construct.
    private ApiFriendUpdateMuteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ApiFriendUpdateMuteResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ApiFriendUpdateMuteResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.class, com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse)) {
        return super.equals(obj);
      }
      com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse other = (com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse) obj;

      boolean result = true;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code site.ApiFriendUpdateMuteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiFriendUpdateMuteResponse)
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.class, com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.Builder.class);
      }

      // Construct using com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.internal_static_site_ApiFriendUpdateMuteResponse_descriptor;
      }

      public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse getDefaultInstanceForType() {
        return com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.getDefaultInstance();
      }

      public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse build() {
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse buildPartial() {
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse result = new com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse) {
          return mergeFrom((com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse other) {
        if (other == com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse.getDefaultInstance()) return this;
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:site.ApiFriendUpdateMuteResponse)
    }

    // @@protoc_insertion_point(class_scope:site.ApiFriendUpdateMuteResponse)
    private static final com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse();
    }

    public static com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ApiFriendUpdateMuteResponse>
        PARSER = new com.google.protobuf.AbstractParser<ApiFriendUpdateMuteResponse>() {
      public ApiFriendUpdateMuteResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApiFriendUpdateMuteResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ApiFriendUpdateMuteResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ApiFriendUpdateMuteResponse> getParserForType() {
      return PARSER;
    }

    public com.akaxin.proto.site.ApiFriendUpdateMuteProto.ApiFriendUpdateMuteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiFriendUpdateMuteRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiFriendUpdateMuteRequest_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_site_ApiFriendUpdateMuteResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_site_ApiFriendUpdateMuteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n site/api_friend_updateMute.proto\022\004site" +
      "\"B\n\032ApiFriendUpdateMuteRequest\022\026\n\016site_f" +
      "riend_id\030\001 \001(\t\022\014\n\004mute\030\002 \001(\010\"\035\n\033ApiFrien" +
      "dUpdateMuteResponse2o\n\032ApiFriendUpdateMu" +
      "teService\022Q\n\nupdateMute\022 .site.ApiFriend" +
      "UpdateMuteRequest\032!.site.ApiFriendUpdate" +
      "MuteResponseB1\n\025com.akaxin.proto.siteB\030A" +
      "piFriendUpdateMuteProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_site_ApiFriendUpdateMuteRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_site_ApiFriendUpdateMuteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiFriendUpdateMuteRequest_descriptor,
        new java.lang.String[] { "SiteFriendId", "Mute", });
    internal_static_site_ApiFriendUpdateMuteResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_site_ApiFriendUpdateMuteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_site_ApiFriendUpdateMuteResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
