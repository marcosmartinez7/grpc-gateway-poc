// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/percent.proto

package io.grpc.xds.shaded.envoy.type;

/**
 * <pre>
 * A fractional percentage is used in cases in which for performance reasons performing floating
 * point to integer conversions during randomness calculations is undesirable. The message includes
 * both a numerator and denominator that together determine the final fractional value.
 * * **Example**: 1/100 = 1%.
 * * **Example**: 3/10000 = 0.03%.
 * </pre>
 *
 * Protobuf type {@code envoy.type.FractionalPercent}
 */
public  final class FractionalPercent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.FractionalPercent)
    FractionalPercentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FractionalPercent.newBuilder() to construct.
  private FractionalPercent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FractionalPercent() {
    numerator_ = 0;
    denominator_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FractionalPercent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            numerator_ = input.readUInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            denominator_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.xds.shaded.envoy.type.PercentOuterClass.internal_static_envoy_type_FractionalPercent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.xds.shaded.envoy.type.PercentOuterClass.internal_static_envoy_type_FractionalPercent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.xds.shaded.envoy.type.FractionalPercent.class, io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder.class);
  }

  /**
   * <pre>
   * Fraction percentages support several fixed denominator values.
   * </pre>
   *
   * Protobuf enum {@code envoy.type.FractionalPercent.DenominatorType}
   */
  public enum DenominatorType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 100.
     * **Example**: 1/100 = 1%.
     * </pre>
     *
     * <code>HUNDRED = 0;</code>
     */
    HUNDRED(0),
    /**
     * <pre>
     * 10,000.
     * **Example**: 1/10000 = 0.01%.
     * </pre>
     *
     * <code>TEN_THOUSAND = 1;</code>
     */
    TEN_THOUSAND(1),
    /**
     * <pre>
     * 1,000,000.
     * **Example**: 1/1000000 = 0.0001%.
     * </pre>
     *
     * <code>MILLION = 2;</code>
     */
    MILLION(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 100.
     * **Example**: 1/100 = 1%.
     * </pre>
     *
     * <code>HUNDRED = 0;</code>
     */
    public static final int HUNDRED_VALUE = 0;
    /**
     * <pre>
     * 10,000.
     * **Example**: 1/10000 = 0.01%.
     * </pre>
     *
     * <code>TEN_THOUSAND = 1;</code>
     */
    public static final int TEN_THOUSAND_VALUE = 1;
    /**
     * <pre>
     * 1,000,000.
     * **Example**: 1/1000000 = 0.0001%.
     * </pre>
     *
     * <code>MILLION = 2;</code>
     */
    public static final int MILLION_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DenominatorType valueOf(int value) {
      return forNumber(value);
    }

    public static DenominatorType forNumber(int value) {
      switch (value) {
        case 0: return HUNDRED;
        case 1: return TEN_THOUSAND;
        case 2: return MILLION;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DenominatorType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DenominatorType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DenominatorType>() {
            public DenominatorType findValueByNumber(int number) {
              return DenominatorType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.type.FractionalPercent.getDescriptor().getEnumTypes().get(0);
    }

    private static final DenominatorType[] VALUES = values();

    public static DenominatorType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DenominatorType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.type.FractionalPercent.DenominatorType)
  }

  public static final int NUMERATOR_FIELD_NUMBER = 1;
  private int numerator_;
  /**
   * <pre>
   * Specifies the numerator. Defaults to 0.
   * </pre>
   *
   * <code>uint32 numerator = 1;</code>
   */
  public int getNumerator() {
    return numerator_;
  }

  public static final int DENOMINATOR_FIELD_NUMBER = 2;
  private int denominator_;
  /**
   * <pre>
   * Specifies the denominator. If the denominator specified is less than the numerator, the final
   * fractional percentage is capped at 1 (100%).
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
   */
  public int getDenominatorValue() {
    return denominator_;
  }
  /**
   * <pre>
   * Specifies the denominator. If the denominator specified is less than the numerator, the final
   * fractional percentage is capped at 1 (100%).
   * </pre>
   *
   * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
   */
  public io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType getDenominator() {
    @SuppressWarnings("deprecation")
    io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType result = io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType.valueOf(denominator_);
    return result == null ? io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType.UNRECOGNIZED : result;
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
    if (numerator_ != 0) {
      output.writeUInt32(1, numerator_);
    }
    if (denominator_ != io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType.HUNDRED.getNumber()) {
      output.writeEnum(2, denominator_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numerator_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, numerator_);
    }
    if (denominator_ != io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType.HUNDRED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, denominator_);
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
    if (!(obj instanceof io.grpc.xds.shaded.envoy.type.FractionalPercent)) {
      return super.equals(obj);
    }
    io.grpc.xds.shaded.envoy.type.FractionalPercent other = (io.grpc.xds.shaded.envoy.type.FractionalPercent) obj;

    boolean result = true;
    result = result && (getNumerator()
        == other.getNumerator());
    result = result && denominator_ == other.denominator_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUMERATOR_FIELD_NUMBER;
    hash = (53 * hash) + getNumerator();
    hash = (37 * hash) + DENOMINATOR_FIELD_NUMBER;
    hash = (53 * hash) + denominator_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.xds.shaded.envoy.type.FractionalPercent parseFrom(
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
  public static Builder newBuilder(io.grpc.xds.shaded.envoy.type.FractionalPercent prototype) {
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
   * <pre>
   * A fractional percentage is used in cases in which for performance reasons performing floating
   * point to integer conversions during randomness calculations is undesirable. The message includes
   * both a numerator and denominator that together determine the final fractional value.
   * * **Example**: 1/100 = 1%.
   * * **Example**: 3/10000 = 0.03%.
   * </pre>
   *
   * Protobuf type {@code envoy.type.FractionalPercent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.FractionalPercent)
      io.grpc.xds.shaded.envoy.type.FractionalPercentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.xds.shaded.envoy.type.PercentOuterClass.internal_static_envoy_type_FractionalPercent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.xds.shaded.envoy.type.PercentOuterClass.internal_static_envoy_type_FractionalPercent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.xds.shaded.envoy.type.FractionalPercent.class, io.grpc.xds.shaded.envoy.type.FractionalPercent.Builder.class);
    }

    // Construct using io.grpc.xds.shaded.envoy.type.FractionalPercent.newBuilder()
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
      numerator_ = 0;

      denominator_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.xds.shaded.envoy.type.PercentOuterClass.internal_static_envoy_type_FractionalPercent_descriptor;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.type.FractionalPercent getDefaultInstanceForType() {
      return io.grpc.xds.shaded.envoy.type.FractionalPercent.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.type.FractionalPercent build() {
      io.grpc.xds.shaded.envoy.type.FractionalPercent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.xds.shaded.envoy.type.FractionalPercent buildPartial() {
      io.grpc.xds.shaded.envoy.type.FractionalPercent result = new io.grpc.xds.shaded.envoy.type.FractionalPercent(this);
      result.numerator_ = numerator_;
      result.denominator_ = denominator_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.xds.shaded.envoy.type.FractionalPercent) {
        return mergeFrom((io.grpc.xds.shaded.envoy.type.FractionalPercent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.xds.shaded.envoy.type.FractionalPercent other) {
      if (other == io.grpc.xds.shaded.envoy.type.FractionalPercent.getDefaultInstance()) return this;
      if (other.getNumerator() != 0) {
        setNumerator(other.getNumerator());
      }
      if (other.denominator_ != 0) {
        setDenominatorValue(other.getDenominatorValue());
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
      io.grpc.xds.shaded.envoy.type.FractionalPercent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.xds.shaded.envoy.type.FractionalPercent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int numerator_ ;
    /**
     * <pre>
     * Specifies the numerator. Defaults to 0.
     * </pre>
     *
     * <code>uint32 numerator = 1;</code>
     */
    public int getNumerator() {
      return numerator_;
    }
    /**
     * <pre>
     * Specifies the numerator. Defaults to 0.
     * </pre>
     *
     * <code>uint32 numerator = 1;</code>
     */
    public Builder setNumerator(int value) {
      
      numerator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the numerator. Defaults to 0.
     * </pre>
     *
     * <code>uint32 numerator = 1;</code>
     */
    public Builder clearNumerator() {
      
      numerator_ = 0;
      onChanged();
      return this;
    }

    private int denominator_ = 0;
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     */
    public int getDenominatorValue() {
      return denominator_;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setDenominatorValue(int value) {
      denominator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     */
    public io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType getDenominator() {
      @SuppressWarnings("deprecation")
      io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType result = io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType.valueOf(denominator_);
      return result == null ? io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setDenominator(io.grpc.xds.shaded.envoy.type.FractionalPercent.DenominatorType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      denominator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the denominator. If the denominator specified is less than the numerator, the final
     * fractional percentage is capped at 1 (100%).
     * </pre>
     *
     * <code>.envoy.type.FractionalPercent.DenominatorType denominator = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearDenominator() {
      
      denominator_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.type.FractionalPercent)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.FractionalPercent)
  private static final io.grpc.xds.shaded.envoy.type.FractionalPercent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.xds.shaded.envoy.type.FractionalPercent();
  }

  public static io.grpc.xds.shaded.envoy.type.FractionalPercent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FractionalPercent>
      PARSER = new com.google.protobuf.AbstractParser<FractionalPercent>() {
    @java.lang.Override
    public FractionalPercent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FractionalPercent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FractionalPercent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FractionalPercent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.xds.shaded.envoy.type.FractionalPercent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

