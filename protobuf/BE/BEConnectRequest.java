// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/BE.ConnectRequest.proto

package BE;

public final class BEConnectRequest {
  private BEConnectRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ConnectRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string client = 1;
    boolean hasClient();
    String getClient();
    
    // required int32 admin = 2;
    boolean hasAdmin();
    int getAdmin();
  }
  public static final class ConnectRequest extends
      com.google.protobuf.GeneratedMessage
      implements ConnectRequestOrBuilder {
    // Use ConnectRequest.newBuilder() to construct.
    private ConnectRequest(Builder builder) {
      super(builder);
    }
    private ConnectRequest(boolean noInit) {}
    
    private static final ConnectRequest defaultInstance;
    public static ConnectRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public ConnectRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BE.BEConnectRequest.internal_static_BE_ConnectRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BE.BEConnectRequest.internal_static_BE_ConnectRequest_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string client = 1;
    public static final int CLIENT_FIELD_NUMBER = 1;
    private java.lang.Object client_;
    public boolean hasClient() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getClient() {
      java.lang.Object ref = client_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          client_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getClientBytes() {
      java.lang.Object ref = client_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        client_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 admin = 2;
    public static final int ADMIN_FIELD_NUMBER = 2;
    private int admin_;
    public boolean hasAdmin() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getAdmin() {
      return admin_;
    }
    
    private void initFields() {
      client_ = "";
      admin_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasClient()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAdmin()) {
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
        output.writeBytes(1, getClientBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, admin_);
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
          .computeBytesSize(1, getClientBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, admin_);
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
    
    public static BE.BEConnectRequest.ConnectRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static BE.BEConnectRequest.ConnectRequest parseDelimitedFrom(
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
    public static BE.BEConnectRequest.ConnectRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static BE.BEConnectRequest.ConnectRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(BE.BEConnectRequest.ConnectRequest prototype) {
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
       implements BE.BEConnectRequest.ConnectRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return BE.BEConnectRequest.internal_static_BE_ConnectRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return BE.BEConnectRequest.internal_static_BE_ConnectRequest_fieldAccessorTable;
      }
      
      // Construct using BE.BEConnectRequest.ConnectRequest.newBuilder()
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
        client_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        admin_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return BE.BEConnectRequest.ConnectRequest.getDescriptor();
      }
      
      public BE.BEConnectRequest.ConnectRequest getDefaultInstanceForType() {
        return BE.BEConnectRequest.ConnectRequest.getDefaultInstance();
      }
      
      public BE.BEConnectRequest.ConnectRequest build() {
        BE.BEConnectRequest.ConnectRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private BE.BEConnectRequest.ConnectRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        BE.BEConnectRequest.ConnectRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public BE.BEConnectRequest.ConnectRequest buildPartial() {
        BE.BEConnectRequest.ConnectRequest result = new BE.BEConnectRequest.ConnectRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.client_ = client_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.admin_ = admin_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof BE.BEConnectRequest.ConnectRequest) {
          return mergeFrom((BE.BEConnectRequest.ConnectRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(BE.BEConnectRequest.ConnectRequest other) {
        if (other == BE.BEConnectRequest.ConnectRequest.getDefaultInstance()) return this;
        if (other.hasClient()) {
          setClient(other.getClient());
        }
        if (other.hasAdmin()) {
          setAdmin(other.getAdmin());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasClient()) {
          
          return false;
        }
        if (!hasAdmin()) {
          
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
              client_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              admin_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string client = 1;
      private java.lang.Object client_ = "";
      public boolean hasClient() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getClient() {
        java.lang.Object ref = client_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          client_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setClient(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        client_ = value;
        onChanged();
        return this;
      }
      public Builder clearClient() {
        bitField0_ = (bitField0_ & ~0x00000001);
        client_ = getDefaultInstance().getClient();
        onChanged();
        return this;
      }
      void setClient(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        client_ = value;
        onChanged();
      }
      
      // required int32 admin = 2;
      private int admin_ ;
      public boolean hasAdmin() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getAdmin() {
        return admin_;
      }
      public Builder setAdmin(int value) {
        bitField0_ |= 0x00000002;
        admin_ = value;
        onChanged();
        return this;
      }
      public Builder clearAdmin() {
        bitField0_ = (bitField0_ & ~0x00000002);
        admin_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:BE.ConnectRequest)
    }
    
    static {
      defaultInstance = new ConnectRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:BE.ConnectRequest)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_BE_ConnectRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BE_ConnectRequest_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036protos/BE.ConnectRequest.proto\022\002BE\"/\n\016" +
      "ConnectRequest\022\016\n\006client\030\001 \002(\t\022\r\n\005admin\030" +
      "\002 \002(\005"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_BE_ConnectRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_BE_ConnectRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_BE_ConnectRequest_descriptor,
              new java.lang.String[] { "Client", "Admin", },
              BE.BEConnectRequest.ConnectRequest.class,
              BE.BEConnectRequest.ConnectRequest.Builder.class);
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
