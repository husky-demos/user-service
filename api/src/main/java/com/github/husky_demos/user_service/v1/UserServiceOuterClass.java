// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.service.proto

package com.github.husky_demos.user_service.v1;

public final class UserServiceOuterClass {
  private UserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user.service.proto\022\033husky_demos.user_s" +
      "ervice.v1\032\020user.model.proto2m\n\013UserServi" +
      "ce\022^\n\005login\022).husky_demos.user_service.v" +
      "1.LoginRequest\032(.husky_demos.user_servic" +
      "e.v1.LoginResult\"\000BP\n&com.github.husky_d" +
      "emos.user_service.v1Z&github.com/husky-d" +
      "emos/user-service/v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.github.husky_demos.user_service.v1.UserModel.getDescriptor(),
        });
    com.github.husky_demos.user_service.v1.UserModel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
