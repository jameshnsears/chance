// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roll_history.proto

// Protobuf Java Version: 3.25.1
package com.github.jameshnsears.chance.data.protocolbuffer;

public final class RollHistory {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_ValuesEntry_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_ValuesEntry_fieldAccessorTable;
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollListProtocolBuffer_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollListProtocolBuffer_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\022roll_history.proto\0222com.github.jameshn" +
                        "sears.chance.data.protocolbuffer\032\nroll.p" +
                        "roto\"\201\002\n\031RollHistoryProtocolBuffer\022i\n\006va" +
                        "lues\030\001 \003(\0132Y.com.github.jameshnsears.cha" +
                        "nce.data.protocolbuffer.RollHistoryProto" +
                        "colBuffer.ValuesEntry\032y\n\013ValuesEntry\022\013\n\003" +
                        "key\030\001 \001(\003\022Y\n\005value\030\002 \001(\0132J.com.github.ja" +
                        "meshnsears.chance.data.protocolbuffer.Ro" +
                        "llListProtocolBuffer:\0028\001\"n\n\026RollListProt" +
                        "ocolBuffer\022T\n\004roll\030\001 \003(\0132F.com.github.ja" +
                        "meshnsears.chance.data.protocolbuffer.Ro" +
                        "llProtocolBufferB\002P\001b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.github.jameshnsears.chance.data.protocolbuffer.Roll.getDescriptor(),
                        });
        internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_descriptor,
                new java.lang.String[]{"Values",});
        internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_ValuesEntry_descriptor =
                internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_descriptor.getNestedTypes().get(0);
        internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_ValuesEntry_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollHistoryProtocolBuffer_ValuesEntry_descriptor,
                new java.lang.String[]{"Key", "Value",});
        internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollListProtocolBuffer_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollListProtocolBuffer_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_github_jameshnsears_chance_data_protocolbuffer_RollListProtocolBuffer_descriptor,
                new java.lang.String[]{"Roll",});
        com.github.jameshnsears.chance.data.protocolbuffer.Roll.getDescriptor();
    }

    private RollHistory() {
    }

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

    // @@protoc_insertion_point(outer_class_scope)
}
