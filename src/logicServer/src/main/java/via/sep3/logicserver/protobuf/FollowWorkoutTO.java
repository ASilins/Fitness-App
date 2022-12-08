// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LogicServer.proto

package via.sep3.logicserver.protobuf;

/**
 * Protobuf type {@code FollowWorkoutTO}
 */
public final class FollowWorkoutTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FollowWorkoutTO)
    FollowWorkoutTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FollowWorkoutTO.newBuilder() to construct.
  private FollowWorkoutTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FollowWorkoutTO() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FollowWorkoutTO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FollowWorkoutTO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            userID_ = input.readInt32();
            break;
          }
          case 16: {

            workoutID_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sep3.logicserver.protobuf.LogicServerOuterClass.internal_static_FollowWorkoutTO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.logicserver.protobuf.LogicServerOuterClass.internal_static_FollowWorkoutTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.logicserver.protobuf.FollowWorkoutTO.class, via.sep3.logicserver.protobuf.FollowWorkoutTO.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private int userID_;
  /**
   * <code>int32 userID = 1;</code>
   * @return The userID.
   */
  @java.lang.Override
  public int getUserID() {
    return userID_;
  }

  public static final int WORKOUTID_FIELD_NUMBER = 2;
  private int workoutID_;
  /**
   * <code>int32 workoutID = 2;</code>
   * @return The workoutID.
   */
  @java.lang.Override
  public int getWorkoutID() {
    return workoutID_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userID_ != 0) {
      output.writeInt32(1, userID_);
    }
    if (workoutID_ != 0) {
      output.writeInt32(2, workoutID_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userID_);
    }
    if (workoutID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, workoutID_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sep3.logicserver.protobuf.FollowWorkoutTO)) {
      return super.equals(obj);
    }
    via.sep3.logicserver.protobuf.FollowWorkoutTO other = (via.sep3.logicserver.protobuf.FollowWorkoutTO) obj;

    if (getUserID()
        != other.getUserID()) return false;
    if (getWorkoutID()
        != other.getWorkoutID()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserID();
    hash = (37 * hash) + WORKOUTID_FIELD_NUMBER;
    hash = (53 * hash) + getWorkoutID();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.logicserver.protobuf.FollowWorkoutTO parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sep3.logicserver.protobuf.FollowWorkoutTO prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code FollowWorkoutTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FollowWorkoutTO)
      via.sep3.logicserver.protobuf.FollowWorkoutTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.logicserver.protobuf.LogicServerOuterClass.internal_static_FollowWorkoutTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.logicserver.protobuf.LogicServerOuterClass.internal_static_FollowWorkoutTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.logicserver.protobuf.FollowWorkoutTO.class, via.sep3.logicserver.protobuf.FollowWorkoutTO.Builder.class);
    }

    // Construct using via.sep3.logicserver.protobuf.FollowWorkoutTO.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userID_ = 0;

      workoutID_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.logicserver.protobuf.LogicServerOuterClass.internal_static_FollowWorkoutTO_descriptor;
    }

    @java.lang.Override
    public via.sep3.logicserver.protobuf.FollowWorkoutTO getDefaultInstanceForType() {
      return via.sep3.logicserver.protobuf.FollowWorkoutTO.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.logicserver.protobuf.FollowWorkoutTO build() {
      via.sep3.logicserver.protobuf.FollowWorkoutTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.logicserver.protobuf.FollowWorkoutTO buildPartial() {
      via.sep3.logicserver.protobuf.FollowWorkoutTO result = new via.sep3.logicserver.protobuf.FollowWorkoutTO(this);
      result.userID_ = userID_;
      result.workoutID_ = workoutID_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sep3.logicserver.protobuf.FollowWorkoutTO) {
        return mergeFrom((via.sep3.logicserver.protobuf.FollowWorkoutTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.logicserver.protobuf.FollowWorkoutTO other) {
      if (other == via.sep3.logicserver.protobuf.FollowWorkoutTO.getDefaultInstance()) return this;
      if (other.getUserID() != 0) {
        setUserID(other.getUserID());
      }
      if (other.getWorkoutID() != 0) {
        setWorkoutID(other.getWorkoutID());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sep3.logicserver.protobuf.FollowWorkoutTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.logicserver.protobuf.FollowWorkoutTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int userID_ ;
    /**
     * <code>int32 userID = 1;</code>
     * @return The userID.
     */
    @java.lang.Override
    public int getUserID() {
      return userID_;
    }
    /**
     * <code>int32 userID = 1;</code>
     * @param value The userID to set.
     * @return This builder for chaining.
     */
    public Builder setUserID(int value) {
      
      userID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserID() {
      
      userID_ = 0;
      onChanged();
      return this;
    }

    private int workoutID_ ;
    /**
     * <code>int32 workoutID = 2;</code>
     * @return The workoutID.
     */
    @java.lang.Override
    public int getWorkoutID() {
      return workoutID_;
    }
    /**
     * <code>int32 workoutID = 2;</code>
     * @param value The workoutID to set.
     * @return This builder for chaining.
     */
    public Builder setWorkoutID(int value) {
      
      workoutID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 workoutID = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWorkoutID() {
      
      workoutID_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FollowWorkoutTO)
  }

  // @@protoc_insertion_point(class_scope:FollowWorkoutTO)
  private static final via.sep3.logicserver.protobuf.FollowWorkoutTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.logicserver.protobuf.FollowWorkoutTO();
  }

  public static via.sep3.logicserver.protobuf.FollowWorkoutTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FollowWorkoutTO>
      PARSER = new com.google.protobuf.AbstractParser<FollowWorkoutTO>() {
    @java.lang.Override
    public FollowWorkoutTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FollowWorkoutTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FollowWorkoutTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FollowWorkoutTO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.logicserver.protobuf.FollowWorkoutTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
