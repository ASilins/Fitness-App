// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MemberService.proto

package via.sep3.logicserver.protobuf;

public final class MemberServiceOuterClass {
  private MemberServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LoginCreateObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LoginCreateObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemberObj_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemberObj_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Members_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Members_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023MemberService.proto\032\021LogicServer.proto" +
      "\"E\n\021LoginCreateObject\022\020\n\010Username\030\001 \001(\t\022" +
      "\020\n\010Password\030\002 \001(\014\022\014\n\004Salt\030\003 \001(\014\"[\n\tMembe" +
      "rObj\022\n\n\002Id\030\001 \001(\005\022\020\n\010Username\030\002 \001(\t\022\020\n\010Pa" +
      "ssword\030\003 \001(\014\022\014\n\004Salt\030\004 \001(\014\022\020\n\010Position\030\005" +
      " \001(\t\"&\n\007Members\022\033\n\007members\030\001 \003(\0132\n.Membe" +
      "rObj2\270\001\n\rMemberService\022.\n\014createMember\022\022" +
      ".LoginCreateObject\032\n.MemberObj\022-\n\013loginM" +
      "ember\022\022.LoginCreateObject\032\n.MemberObj\022$\n" +
      "\neditMember\022\n.MemberObj\032\n.StringObj\022\"\n\ng" +
      "etMembers\022\n.StringObj\032\010.MembersB!\n\035via.s" +
      "ep3.logicserver.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          via.sep3.logicserver.protobuf.LogicServer.getDescriptor(),
        });
    internal_static_LoginCreateObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LoginCreateObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LoginCreateObject_descriptor,
        new java.lang.String[] { "Username", "Password", "Salt", });
    internal_static_MemberObj_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MemberObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemberObj_descriptor,
        new java.lang.String[] { "Id", "Username", "Password", "Salt", "Position", });
    internal_static_Members_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Members_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Members_descriptor,
        new java.lang.String[] { "Members", });
    via.sep3.logicserver.protobuf.LogicServer.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
