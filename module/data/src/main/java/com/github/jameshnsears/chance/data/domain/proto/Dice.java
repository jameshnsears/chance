// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dice.proto

// Protobuf Java Version: 3.25.3
package com.github.jameshnsears.chance.data.domain.proto;

public final class Dice {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_github_jameshnsears_chance_data_domain_proto_DiceProtocolBuffer_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_github_jameshnsears_chance_data_domain_proto_DiceProtocolBuffer_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\ndice.proto\0220com.github.jameshnsears.ch" +
                        "ance.data.domain.proto\032\nside.proto\"\272\002\n\022D" +
                        "iceProtocolBuffer\022\r\n\005epoch\030\001 \001(\003\022\014\n\004uuid" +
                        "\030\002 \001(\t\022R\n\004side\030\003 \003(\0132D.com.github.jamesh" +
                        "nsears.chance.data.domain.proto.SideProt" +
                        "ocolBuffer\022\r\n\005title\030\004 \001(\t\022\016\n\006colour\030\005 \001(" +
                        "\t\022\020\n\010selected\030\006 \001(\010\022\027\n\017multiplierValue\030\007" +
                        " \001(\005\022\017\n\007explode\030\010 \001(\010\022\023\n\013explodeWhen\030\t \001" +
                        "(\t\022\024\n\014explodeValue\030\n \001(\005\022\023\n\013modifyScore\030" +
                        "\013 \001(\010\022\030\n\020modifyScoreValue\030\014 \001(\005B\002P\001b\006pro" +
                        "to3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.github.jameshnsears.chance.data.domain.proto.Side.getDescriptor(),
                        });
        internal_static_com_github_jameshnsears_chance_data_domain_proto_DiceProtocolBuffer_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_github_jameshnsears_chance_data_domain_proto_DiceProtocolBuffer_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_github_jameshnsears_chance_data_domain_proto_DiceProtocolBuffer_descriptor,
                new java.lang.String[]{"Epoch", "Uuid", "Side", "Title", "Colour", "Selected", "MultiplierValue", "Explode", "ExplodeWhen", "ExplodeValue", "ModifyScore", "ModifyScoreValue",});
        com.github.jameshnsears.chance.data.domain.proto.Side.getDescriptor();
    }

    private Dice() {
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
