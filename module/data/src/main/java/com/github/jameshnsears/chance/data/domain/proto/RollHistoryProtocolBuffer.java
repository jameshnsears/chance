// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roll_history.proto

// Protobuf Java Version: 3.25.1
package com.github.jameshnsears.chance.data.domain.proto;

/**
 * Protobuf type {@code com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer}
 */
public final class RollHistoryProtocolBuffer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer)
    RollHistoryProtocolBufferOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RollHistoryProtocolBuffer.newBuilder() to construct.
  private RollHistoryProtocolBuffer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RollHistoryProtocolBuffer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RollHistoryProtocolBuffer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jameshnsears.chance.data.domain.proto.RollHistory.internal_static_com_github_jameshnsears_chance_data_domain_proto_RollHistoryProtocolBuffer_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetValues();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jameshnsears.chance.data.domain.proto.RollHistory.internal_static_com_github_jameshnsears_chance_data_domain_proto_RollHistoryProtocolBuffer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.class, com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.Builder.class);
  }

  public static final int VALUES_FIELD_NUMBER = 1;
  private static final class ValuesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer>newDefaultInstance(
                com.github.jameshnsears.chance.data.domain.proto.RollHistory.internal_static_com_github_jameshnsears_chance_data_domain_proto_RollHistoryProtocolBuffer_ValuesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> values_;
  private com.google.protobuf.MapField<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer>
  internalGetValues() {
    if (values_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ValuesDefaultEntryHolder.defaultEntry);
    }
    return values_;
  }
  public int getValuesCount() {
    return internalGetValues().getMap().size();
  }
  /**
   * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
   */
  @java.lang.Override
  public boolean containsValues(
      long key) {

    return internalGetValues().getMap().containsKey(key);
  }
  /**
   * Use {@link #getValuesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> getValues() {
    return getValuesMap();
  }
  /**
   * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> getValuesMap() {
    return internalGetValues().getMap();
  }
  /**
   * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer getValuesOrDefault(
      long key,
      /* nullable */
com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer defaultValue) {

    java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> map =
        internalGetValues().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
   */
  @java.lang.Override
  public com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer getValuesOrThrow(
      long key) {

    java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> map =
        internalGetValues().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeLongMapTo(
        output,
        internalGetValues(),
        ValuesDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> entry
         : internalGetValues().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer>
      values__ = ValuesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, values__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer)) {
      return super.equals(obj);
    }
    com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer other = (com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer) obj;

    if (!internalGetValues().equals(
        other.internalGetValues())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetValues().getMap().isEmpty()) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetValues().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer parseFrom(
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
  public static Builder newBuilder(com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer prototype) {
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
   * Protobuf type {@code com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer)
      com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBufferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jameshnsears.chance.data.domain.proto.RollHistory.internal_static_com_github_jameshnsears_chance_data_domain_proto_RollHistoryProtocolBuffer_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableValues();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jameshnsears.chance.data.domain.proto.RollHistory.internal_static_com_github_jameshnsears_chance_data_domain_proto_RollHistoryProtocolBuffer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.class, com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.Builder.class);
    }

    // Construct using com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableValues().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jameshnsears.chance.data.domain.proto.RollHistory.internal_static_com_github_jameshnsears_chance_data_domain_proto_RollHistoryProtocolBuffer_descriptor;
    }

    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer getDefaultInstanceForType() {
      return com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer build() {
      com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer buildPartial() {
      com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer result = new com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.values_ = internalGetValues().build(ValuesDefaultEntryHolder.defaultEntry);
      }
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
      if (other instanceof com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer) {
        return mergeFrom((com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer other) {
      if (other == com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer.getDefaultInstance()) return this;
      internalGetMutableValues().mergeFrom(
          other.internalGetValues());
      bitField0_ |= 0x00000001;
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer>
              values__ = input.readMessage(
                  ValuesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableValues().ensureBuilderMap().put(
                  values__.getKey(), values__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private static final class ValuesConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> {
      @java.lang.Override
      public com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer build(com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder val) {
        if (val instanceof com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer) { return (com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer) val; }
        return ((com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> defaultEntry() {
        return ValuesDefaultEntryHolder.defaultEntry;
      }
    };
    private static final ValuesConverter valuesConverter = new ValuesConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.Builder> values_;
    private com.google.protobuf.MapFieldBuilder<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.Builder>
        internalGetValues() {
      if (values_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(valuesConverter);
      }
      return values_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.Builder>
        internalGetMutableValues() {
      if (values_ == null) {
        values_ = new com.google.protobuf.MapFieldBuilder<>(valuesConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return values_;
    }
    public int getValuesCount() {
      return internalGetValues().ensureBuilderMap().size();
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    @java.lang.Override
    public boolean containsValues(
        long key) {

      return internalGetValues().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getValuesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> getValues() {
      return getValuesMap();
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> getValuesMap() {
      return internalGetValues().getImmutableMap();
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer getValuesOrDefault(
        long key,
        /* nullable */
com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer defaultValue) {

      java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder> map = internalGetMutableValues().ensureBuilderMap();
      return map.containsKey(key) ? valuesConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer getValuesOrThrow(
        long key) {

      java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder> map = internalGetMutableValues().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return valuesConverter.build(map.get(key));
    }
    public Builder clearValues() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableValues().clear();
      return this;
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    public Builder removeValues(
        long key) {

      internalGetMutableValues().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer>
        getMutableValues() {
      bitField0_ |= 0x00000001;
      return internalGetMutableValues().ensureMessageMap();
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    public Builder putValues(
        long key,
        com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableValues().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    public Builder putAllValues(
        java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> values) {
      for (java.util.Map.Entry<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableValues().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;int64, .com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer&gt; values = 1;</code>
     */
    public com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.Builder putValuesBuilderIfAbsent(
        long key) {
      java.util.Map<java.lang.Long, com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder> builderMap = internalGetMutableValues().ensureBuilderMap();
      com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBufferOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer) {
        entry = ((com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer.Builder) entry;
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


    // @@protoc_insertion_point(builder_scope:com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer)
  }

  // @@protoc_insertion_point(class_scope:com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer)
  private static final com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer();
  }

  public static com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RollHistoryProtocolBuffer>
      PARSER = new com.google.protobuf.AbstractParser<RollHistoryProtocolBuffer>() {
    @java.lang.Override
    public RollHistoryProtocolBuffer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<RollHistoryProtocolBuffer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RollHistoryProtocolBuffer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
