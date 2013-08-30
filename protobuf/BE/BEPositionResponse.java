// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/BE.PositionResponse.proto

package BE;

public final class BEPositionResponse {
  private BEPositionResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PositionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string exchange = 1;
    boolean hasExchange();
    String getExchange();
    
    // required string security = 2;
    boolean hasSecurity();
    String getSecurity();
  }
  public static final class Position extends
      com.google.protobuf.GeneratedMessage
      implements PositionOrBuilder {
    // Use Position.newBuilder() to construct.
    private Position(Builder builder) {
      super(builder);
    }
    private Position(boolean noInit) {}
    
    private static final Position defaultInstance;
    public static Position getDefaultInstance() {
      return defaultInstance;
    }
    
    public Position getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BE.BEPositionResponse.internal_static_BE_Position_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BE.BEPositionResponse.internal_static_BE_Position_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string exchange = 1;
    public static final int EXCHANGE_FIELD_NUMBER = 1;
    private java.lang.Object exchange_;
    public boolean hasExchange() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getExchange() {
      java.lang.Object ref = exchange_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          exchange_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getExchangeBytes() {
      java.lang.Object ref = exchange_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        exchange_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string security = 2;
    public static final int SECURITY_FIELD_NUMBER = 2;
    private java.lang.Object security_;
    public boolean hasSecurity() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getSecurity() {
      java.lang.Object ref = security_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          security_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getSecurityBytes() {
      java.lang.Object ref = security_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        security_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      exchange_ = "";
      security_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasExchange()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSecurity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getExchangeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getSecurityBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getExchangeBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getSecurityBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static BE.BEPositionResponse.Position parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BE.BEPositionResponse.Position parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEPositionResponse.Position parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BE.BEPositionResponse.Position parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEPositionResponse.Position parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BE.BEPositionResponse.Position parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEPositionResponse.Position parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BE.BEPositionResponse.Position parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BE.BEPositionResponse.Position parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BE.BEPositionResponse.Position parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BE.BEPositionResponse.Position prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements BE.BEPositionResponse.PositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BE.BEPositionResponse.internal_static_BE_Position_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BE.BEPositionResponse.internal_static_BE_Position_fieldAccessorTable;
      }
      
      // Construct using BE.BEPositionResponse.Position.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        exchange_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        security_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BE.BEPositionResponse.Position.getDescriptor();
      }
      
      public BE.BEPositionResponse.Position getDefaultInstanceForType() {
        return BE.BEPositionResponse.Position.getDefaultInstance();
      }
      
      public BE.BEPositionResponse.Position build() {
        BE.BEPositionResponse.Position result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private BE.BEPositionResponse.Position buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        BE.BEPositionResponse.Position result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public BE.BEPositionResponse.Position buildPartial() {
        BE.BEPositionResponse.Position result = new BE.BEPositionResponse.Position(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.exchange_ = exchange_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.security_ = security_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BE.BEPositionResponse.Position) {
          return mergeFrom((BE.BEPositionResponse.Position)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(BE.BEPositionResponse.Position other) {
        if (other == BE.BEPositionResponse.Position.getDefaultInstance()) return this;
        if (other.hasExchange()) {
          setExchange(other.getExchange());
        }
        if (other.hasSecurity()) {
          setSecurity(other.getSecurity());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasExchange()) {
          
          return false;
        }
        if (!hasSecurity()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              exchange_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              security_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string exchange = 1;
      private java.lang.Object exchange_ = "";
      public boolean hasExchange() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getExchange() {
        java.lang.Object ref = exchange_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          exchange_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setExchange(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        exchange_ = value;
        onChanged();
        return this;
      }
      public Builder clearExchange() {
        bitField0_ = (bitField0_ & ~0x00000001);
        exchange_ = getDefaultInstance().getExchange();
        onChanged();
        return this;
      }
      void setExchange(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        exchange_ = value;
        onChanged();
      }
      
      // required string security = 2;
      private java.lang.Object security_ = "";
      public boolean hasSecurity() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getSecurity() {
        java.lang.Object ref = security_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          security_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setSecurity(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        security_ = value;
        onChanged();
        return this;
      }
      public Builder clearSecurity() {
        bitField0_ = (bitField0_ & ~0x00000002);
        security_ = getDefaultInstance().getSecurity();
        onChanged();
        return this;
      }
      void setSecurity(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        security_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:BE.Position)
    }
    
    static {
      defaultInstance = new Position(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BE.Position)
  }
  
  public interface PositionResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .BE.Position position = 1;
    java.util.List<BE.BEPositionResponse.Position> 
        getPositionList();
    BE.BEPositionResponse.Position getPosition(int index);
    int getPositionCount();
    java.util.List<? extends BE.BEPositionResponse.PositionOrBuilder> 
        getPositionOrBuilderList();
    BE.BEPositionResponse.PositionOrBuilder getPositionOrBuilder(
        int index);
  }
  public static final class PositionResponse extends
      com.google.protobuf.GeneratedMessage
      implements PositionResponseOrBuilder {
    // Use PositionResponse.newBuilder() to construct.
    private PositionResponse(Builder builder) {
      super(builder);
    }
    private PositionResponse(boolean noInit) {}
    
    private static final PositionResponse defaultInstance;
    public static PositionResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public PositionResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BE.BEPositionResponse.internal_static_BE_PositionResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BE.BEPositionResponse.internal_static_BE_PositionResponse_fieldAccessorTable;
    }
    
    // repeated .BE.Position position = 1;
    public static final int POSITION_FIELD_NUMBER = 1;
    private java.util.List<BE.BEPositionResponse.Position> position_;
    public java.util.List<BE.BEPositionResponse.Position> getPositionList() {
      return position_;
    }
    public java.util.List<? extends BE.BEPositionResponse.PositionOrBuilder> 
        getPositionOrBuilderList() {
      return position_;
    }
    public int getPositionCount() {
      return position_.size();
    }
    public BE.BEPositionResponse.Position getPosition(int index) {
      return position_.get(index);
    }
    public BE.BEPositionResponse.PositionOrBuilder getPositionOrBuilder(
        int index) {
      return position_.get(index);
    }
    
    private void initFields() {
      position_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getPositionCount(); i++) {
        if (!getPosition(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < position_.size(); i++) {
        output.writeMessage(1, position_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < position_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, position_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static BE.BEPositionResponse.PositionResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BE.BEPositionResponse.PositionResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BE.BEPositionResponse.PositionResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BE.BEPositionResponse.PositionResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements BE.BEPositionResponse.PositionResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BE.BEPositionResponse.internal_static_BE_PositionResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BE.BEPositionResponse.internal_static_BE_PositionResponse_fieldAccessorTable;
      }
      
      // Construct using BE.BEPositionResponse.PositionResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPositionFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (positionBuilder_ == null) {
          position_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          positionBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BE.BEPositionResponse.PositionResponse.getDescriptor();
      }
      
      public BE.BEPositionResponse.PositionResponse getDefaultInstanceForType() {
        return BE.BEPositionResponse.PositionResponse.getDefaultInstance();
      }
      
      public BE.BEPositionResponse.PositionResponse build() {
        BE.BEPositionResponse.PositionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private BE.BEPositionResponse.PositionResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        BE.BEPositionResponse.PositionResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public BE.BEPositionResponse.PositionResponse buildPartial() {
        BE.BEPositionResponse.PositionResponse result = new BE.BEPositionResponse.PositionResponse(this);
        int from_bitField0_ = bitField0_;
        if (positionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            position_ = java.util.Collections.unmodifiableList(position_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BE.BEPositionResponse.PositionResponse) {
          return mergeFrom((BE.BEPositionResponse.PositionResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(BE.BEPositionResponse.PositionResponse other) {
        if (other == BE.BEPositionResponse.PositionResponse.getDefaultInstance()) return this;
        if (positionBuilder_ == null) {
          if (!other.position_.isEmpty()) {
            if (position_.isEmpty()) {
              position_ = other.position_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePositionIsMutable();
              position_.addAll(other.position_);
            }
            onChanged();
          }
        } else {
          if (!other.position_.isEmpty()) {
            if (positionBuilder_.isEmpty()) {
              positionBuilder_.dispose();
              positionBuilder_ = null;
              position_ = other.position_;
              bitField0_ = (bitField0_ & ~0x00000001);
              positionBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPositionFieldBuilder() : null;
            } else {
              positionBuilder_.addAllMessages(other.position_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getPositionCount(); i++) {
          if (!getPosition(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              BE.BEPositionResponse.Position.Builder subBuilder = BE.BEPositionResponse.Position.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addPosition(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .BE.Position position = 1;
      private java.util.List<BE.BEPositionResponse.Position> position_ =
        java.util.Collections.emptyList();
      private void ensurePositionIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          position_ = new java.util.ArrayList<BE.BEPositionResponse.Position>(position_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          BE.BEPositionResponse.Position, BE.BEPositionResponse.Position.Builder, BE.BEPositionResponse.PositionOrBuilder> positionBuilder_;
      
      public java.util.List<BE.BEPositionResponse.Position> getPositionList() {
        if (positionBuilder_ == null) {
          return java.util.Collections.unmodifiableList(position_);
        } else {
          return positionBuilder_.getMessageList();
        }
      }
      public int getPositionCount() {
        if (positionBuilder_ == null) {
          return position_.size();
        } else {
          return positionBuilder_.getCount();
        }
      }
      public BE.BEPositionResponse.Position getPosition(int index) {
        if (positionBuilder_ == null) {
          return position_.get(index);
        } else {
          return positionBuilder_.getMessage(index);
        }
      }
      public Builder setPosition(
          int index, BE.BEPositionResponse.Position value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionIsMutable();
          position_.set(index, value);
          onChanged();
        } else {
          positionBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setPosition(
          int index, BE.BEPositionResponse.Position.Builder builderForValue) {
        if (positionBuilder_ == null) {
          ensurePositionIsMutable();
          position_.set(index, builderForValue.build());
          onChanged();
        } else {
          positionBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addPosition(BE.BEPositionResponse.Position value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionIsMutable();
          position_.add(value);
          onChanged();
        } else {
          positionBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addPosition(
          int index, BE.BEPositionResponse.Position value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionIsMutable();
          position_.add(index, value);
          onChanged();
        } else {
          positionBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addPosition(
          BE.BEPositionResponse.Position.Builder builderForValue) {
        if (positionBuilder_ == null) {
          ensurePositionIsMutable();
          position_.add(builderForValue.build());
          onChanged();
        } else {
          positionBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addPosition(
          int index, BE.BEPositionResponse.Position.Builder builderForValue) {
        if (positionBuilder_ == null) {
          ensurePositionIsMutable();
          position_.add(index, builderForValue.build());
          onChanged();
        } else {
          positionBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllPosition(
          java.lang.Iterable<? extends BE.BEPositionResponse.Position> values) {
        if (positionBuilder_ == null) {
          ensurePositionIsMutable();
          super.addAll(values, position_);
          onChanged();
        } else {
          positionBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          positionBuilder_.clear();
        }
        return this;
      }
      public Builder removePosition(int index) {
        if (positionBuilder_ == null) {
          ensurePositionIsMutable();
          position_.remove(index);
          onChanged();
        } else {
          positionBuilder_.remove(index);
        }
        return this;
      }
      public BE.BEPositionResponse.Position.Builder getPositionBuilder(
          int index) {
        return getPositionFieldBuilder().getBuilder(index);
      }
      public BE.BEPositionResponse.PositionOrBuilder getPositionOrBuilder(
          int index) {
        if (positionBuilder_ == null) {
          return position_.get(index);  } else {
          return positionBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends BE.BEPositionResponse.PositionOrBuilder> 
           getPositionOrBuilderList() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(position_);
        }
      }
      public BE.BEPositionResponse.Position.Builder addPositionBuilder() {
        return getPositionFieldBuilder().addBuilder(
            BE.BEPositionResponse.Position.getDefaultInstance());
      }
      public BE.BEPositionResponse.Position.Builder addPositionBuilder(
          int index) {
        return getPositionFieldBuilder().addBuilder(
            index, BE.BEPositionResponse.Position.getDefaultInstance());
      }
      public java.util.List<BE.BEPositionResponse.Position.Builder> 
           getPositionBuilderList() {
        return getPositionFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          BE.BEPositionResponse.Position, BE.BEPositionResponse.Position.Builder, BE.BEPositionResponse.PositionOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              BE.BEPositionResponse.Position, BE.BEPositionResponse.Position.Builder, BE.BEPositionResponse.PositionOrBuilder>(
                  position_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:BE.PositionResponse)
    }
    
    static {
      defaultInstance = new PositionResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BE.PositionResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BE_Position_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BE_Position_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BE_PositionResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BE_PositionResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n protos/BE.PositionResponse.proto\022\002BE\"." +
      "\n\010Position\022\020\n\010exchange\030\001 \002(\t\022\020\n\010security" +
      "\030\002 \002(\t\"2\n\020PositionResponse\022\036\n\010position\030\001" +
      " \003(\0132\014.BE.Position"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_BE_Position_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_BE_Position_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BE_Position_descriptor,
              new java.lang.String[] { "Exchange", "Security", },
              BE.BEPositionResponse.Position.class,
              BE.BEPositionResponse.Position.Builder.class);
          internal_static_BE_PositionResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_BE_PositionResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BE_PositionResponse_descriptor,
              new java.lang.String[] { "Position", },
              BE.BEPositionResponse.PositionResponse.class,
              BE.BEPositionResponse.PositionResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}