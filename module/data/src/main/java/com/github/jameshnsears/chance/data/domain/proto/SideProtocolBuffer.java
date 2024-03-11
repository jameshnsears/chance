// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: side.proto

// Protobuf Java Version: 3.25.1
package com.github.jameshnsears.chance.data.domain.proto;

/**
 * Protobuf type {@code com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer}
 */
public final class SideProtocolBuffer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer)
    SideProtocolBufferOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SideProtocolBuffer.newBuilder() to construct.
  private SideProtocolBuffer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SideProtocolBuffer() {
    numberColour_ = "";
    imageBase64_ = "";
    description_ = "";
    descriptionColour_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SideProtocolBuffer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jameshnsears.chance.data.domain.proto.Side.internal_static_com_github_jameshnsears_chance_data_domain_proto_SideProtocolBuffer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jameshnsears.chance.data.domain.proto.Side.internal_static_com_github_jameshnsears_chance_data_domain_proto_SideProtocolBuffer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.class, com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private int number_ = 0;
  /**
   * <code>int32 number = 1;</code>
   * @return The number.
   */
  @java.lang.Override
  public int getNumber() {
    return number_;
  }

  public static final int NUMBERCOLOUR_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object numberColour_ = "";
  /**
   * <code>string numberColour = 2;</code>
   * @return The numberColour.
   */
  @java.lang.Override
  public java.lang.String getNumberColour() {
    java.lang.Object ref = numberColour_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      numberColour_ = s;
      return s;
    }
  }
  /**
   * <code>string numberColour = 2;</code>
   * @return The bytes for numberColour.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNumberColourBytes() {
    java.lang.Object ref = numberColour_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      numberColour_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGEBASE64_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object imageBase64_ = "";
  /**
   * <code>string imageBase64 = 3;</code>
   * @return The imageBase64.
   */
  @java.lang.Override
  public java.lang.String getImageBase64() {
    java.lang.Object ref = imageBase64_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageBase64_ = s;
      return s;
    }
  }
  /**
   * <code>string imageBase64 = 3;</code>
   * @return The bytes for imageBase64.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageBase64Bytes() {
    java.lang.Object ref = imageBase64_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageBase64_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGEDRAWABLEID_FIELD_NUMBER = 4;
  private int imageDrawableId_ = 0;
  /**
   * <code>int32 imageDrawableId = 4;</code>
   * @return The imageDrawableId.
   */
  @java.lang.Override
  public int getImageDrawableId() {
    return imageDrawableId_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTIONSTRINGSID_FIELD_NUMBER = 6;
  private int descriptionStringsId_ = 0;
  /**
   * <code>int32 descriptionStringsId = 6;</code>
   * @return The descriptionStringsId.
   */
  @java.lang.Override
  public int getDescriptionStringsId() {
    return descriptionStringsId_;
  }

  public static final int DESCRIPTIONCOLOUR_FIELD_NUMBER = 7;
  @SuppressWarnings("serial")
  private volatile java.lang.Object descriptionColour_ = "";
  /**
   * <code>string descriptionColour = 7;</code>
   * @return The descriptionColour.
   */
  @java.lang.Override
  public java.lang.String getDescriptionColour() {
    java.lang.Object ref = descriptionColour_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descriptionColour_ = s;
      return s;
    }
  }
  /**
   * <code>string descriptionColour = 7;</code>
   * @return The bytes for descriptionColour.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionColourBytes() {
    java.lang.Object ref = descriptionColour_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descriptionColour_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (number_ != 0) {
      output.writeInt32(1, number_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(numberColour_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, numberColour_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageBase64_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, imageBase64_);
    }
    if (imageDrawableId_ != 0) {
      output.writeInt32(4, imageDrawableId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, description_);
    }
    if (descriptionStringsId_ != 0) {
      output.writeInt32(6, descriptionStringsId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descriptionColour_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, descriptionColour_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, number_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(numberColour_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, numberColour_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageBase64_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, imageBase64_);
    }
    if (imageDrawableId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, imageDrawableId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, description_);
    }
    if (descriptionStringsId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, descriptionStringsId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(descriptionColour_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, descriptionColour_);
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
    if (!(obj instanceof com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer)) {
      return super.equals(obj);
    }
    com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer other = (com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer) obj;

    if (getNumber()
        != other.getNumber()) return false;
    if (!getNumberColour()
        .equals(other.getNumberColour())) return false;
    if (!getImageBase64()
        .equals(other.getImageBase64())) return false;
    if (getImageDrawableId()
        != other.getImageDrawableId()) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (getDescriptionStringsId()
        != other.getDescriptionStringsId()) return false;
    if (!getDescriptionColour()
        .equals(other.getDescriptionColour())) return false;
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
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber();
    hash = (37 * hash) + NUMBERCOLOUR_FIELD_NUMBER;
    hash = (53 * hash) + getNumberColour().hashCode();
    hash = (37 * hash) + IMAGEBASE64_FIELD_NUMBER;
    hash = (53 * hash) + getImageBase64().hashCode();
    hash = (37 * hash) + IMAGEDRAWABLEID_FIELD_NUMBER;
    hash = (53 * hash) + getImageDrawableId();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + DESCRIPTIONSTRINGSID_FIELD_NUMBER;
    hash = (53 * hash) + getDescriptionStringsId();
    hash = (37 * hash) + DESCRIPTIONCOLOUR_FIELD_NUMBER;
    hash = (53 * hash) + getDescriptionColour().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer parseFrom(
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
  public static Builder newBuilder(com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer prototype) {
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
   * Protobuf type {@code com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer)
      com.github.jameshnsears.chance.data.domain.proto.SideProtocolBufferOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jameshnsears.chance.data.domain.proto.Side.internal_static_com_github_jameshnsears_chance_data_domain_proto_SideProtocolBuffer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jameshnsears.chance.data.domain.proto.Side.internal_static_com_github_jameshnsears_chance_data_domain_proto_SideProtocolBuffer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.class, com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.Builder.class);
    }

    // Construct using com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.newBuilder()
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
      number_ = 0;
      numberColour_ = "";
      imageBase64_ = "";
      imageDrawableId_ = 0;
      description_ = "";
      descriptionStringsId_ = 0;
      descriptionColour_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jameshnsears.chance.data.domain.proto.Side.internal_static_com_github_jameshnsears_chance_data_domain_proto_SideProtocolBuffer_descriptor;
    }

    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer getDefaultInstanceForType() {
      return com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer build() {
      com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer buildPartial() {
      com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer result = new com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.number_ = number_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numberColour_ = numberColour_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.imageBase64_ = imageBase64_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.imageDrawableId_ = imageDrawableId_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.descriptionStringsId_ = descriptionStringsId_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.descriptionColour_ = descriptionColour_;
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
      if (other instanceof com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer) {
        return mergeFrom((com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer other) {
      if (other == com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer.getDefaultInstance()) return this;
      if (other.getNumber() != 0) {
        setNumber(other.getNumber());
      }
      if (!other.getNumberColour().isEmpty()) {
        numberColour_ = other.numberColour_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getImageBase64().isEmpty()) {
        imageBase64_ = other.imageBase64_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getImageDrawableId() != 0) {
        setImageDrawableId(other.getImageDrawableId());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getDescriptionStringsId() != 0) {
        setDescriptionStringsId(other.getDescriptionStringsId());
      }
      if (!other.getDescriptionColour().isEmpty()) {
        descriptionColour_ = other.descriptionColour_;
        bitField0_ |= 0x00000040;
        onChanged();
      }
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
            case 8: {
              number_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              numberColour_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              imageBase64_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              imageDrawableId_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              descriptionStringsId_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 58: {
              descriptionColour_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
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

    private int number_ ;
    /**
     * <code>int32 number = 1;</code>
     * @return The number.
     */
    @java.lang.Override
    public int getNumber() {
      return number_;
    }
    /**
     * <code>int32 number = 1;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(int value) {

      number_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      number_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object numberColour_ = "";
    /**
     * <code>string numberColour = 2;</code>
     * @return The numberColour.
     */
    public java.lang.String getNumberColour() {
      java.lang.Object ref = numberColour_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        numberColour_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string numberColour = 2;</code>
     * @return The bytes for numberColour.
     */
    public com.google.protobuf.ByteString
        getNumberColourBytes() {
      java.lang.Object ref = numberColour_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        numberColour_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string numberColour = 2;</code>
     * @param value The numberColour to set.
     * @return This builder for chaining.
     */
    public Builder setNumberColour(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      numberColour_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string numberColour = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberColour() {
      numberColour_ = getDefaultInstance().getNumberColour();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string numberColour = 2;</code>
     * @param value The bytes for numberColour to set.
     * @return This builder for chaining.
     */
    public Builder setNumberColourBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      numberColour_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object imageBase64_ = "";
    /**
     * <code>string imageBase64 = 3;</code>
     * @return The imageBase64.
     */
    public java.lang.String getImageBase64() {
      java.lang.Object ref = imageBase64_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageBase64_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string imageBase64 = 3;</code>
     * @return The bytes for imageBase64.
     */
    public com.google.protobuf.ByteString
        getImageBase64Bytes() {
      java.lang.Object ref = imageBase64_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageBase64_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string imageBase64 = 3;</code>
     * @param value The imageBase64 to set.
     * @return This builder for chaining.
     */
    public Builder setImageBase64(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      imageBase64_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string imageBase64 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageBase64() {
      imageBase64_ = getDefaultInstance().getImageBase64();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string imageBase64 = 3;</code>
     * @param value The bytes for imageBase64 to set.
     * @return This builder for chaining.
     */
    public Builder setImageBase64Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      imageBase64_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int imageDrawableId_ ;
    /**
     * <code>int32 imageDrawableId = 4;</code>
     * @return The imageDrawableId.
     */
    @java.lang.Override
    public int getImageDrawableId() {
      return imageDrawableId_;
    }
    /**
     * <code>int32 imageDrawableId = 4;</code>
     * @param value The imageDrawableId to set.
     * @return This builder for chaining.
     */
    public Builder setImageDrawableId(int value) {

      imageDrawableId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 imageDrawableId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageDrawableId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      imageDrawableId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 5;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 5;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 5;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 5;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private int descriptionStringsId_ ;
    /**
     * <code>int32 descriptionStringsId = 6;</code>
     * @return The descriptionStringsId.
     */
    @java.lang.Override
    public int getDescriptionStringsId() {
      return descriptionStringsId_;
    }
    /**
     * <code>int32 descriptionStringsId = 6;</code>
     * @param value The descriptionStringsId to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionStringsId(int value) {

      descriptionStringsId_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int32 descriptionStringsId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescriptionStringsId() {
      bitField0_ = (bitField0_ & ~0x00000020);
      descriptionStringsId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object descriptionColour_ = "";
    /**
     * <code>string descriptionColour = 7;</code>
     * @return The descriptionColour.
     */
    public java.lang.String getDescriptionColour() {
      java.lang.Object ref = descriptionColour_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descriptionColour_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string descriptionColour = 7;</code>
     * @return The bytes for descriptionColour.
     */
    public com.google.protobuf.ByteString
        getDescriptionColourBytes() {
      java.lang.Object ref = descriptionColour_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descriptionColour_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string descriptionColour = 7;</code>
     * @param value The descriptionColour to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionColour(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      descriptionColour_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>string descriptionColour = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescriptionColour() {
      descriptionColour_ = getDefaultInstance().getDescriptionColour();
      bitField0_ = (bitField0_ & ~0x00000040);
      onChanged();
      return this;
    }
    /**
     * <code>string descriptionColour = 7;</code>
     * @param value The bytes for descriptionColour to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionColourBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      descriptionColour_ = value;
      bitField0_ |= 0x00000040;
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


    // @@protoc_insertion_point(builder_scope:com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer)
  }

  // @@protoc_insertion_point(class_scope:com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer)
  private static final com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer();
  }

  public static com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SideProtocolBuffer>
      PARSER = new com.google.protobuf.AbstractParser<SideProtocolBuffer>() {
    @java.lang.Override
    public SideProtocolBuffer parsePartialFrom(
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

  public static com.google.protobuf.Parser<SideProtocolBuffer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SideProtocolBuffer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
