/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grafeas/v1/grafeas.proto

package io.grafeas.v1;

public interface NoteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Note)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the note in the form of
   * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A one sentence description of this note.
   * </pre>
   *
   * <code>string short_description = 2;</code>
   *
   * @return The shortDescription.
   */
  java.lang.String getShortDescription();
  /**
   *
   *
   * <pre>
   * A one sentence description of this note.
   * </pre>
   *
   * <code>string short_description = 2;</code>
   *
   * @return The bytes for shortDescription.
   */
  com.google.protobuf.ByteString getShortDescriptionBytes();

  /**
   *
   *
   * <pre>
   * A detailed description of this note.
   * </pre>
   *
   * <code>string long_description = 3;</code>
   *
   * @return The longDescription.
   */
  java.lang.String getLongDescription();
  /**
   *
   *
   * <pre>
   * A detailed description of this note.
   * </pre>
   *
   * <code>string long_description = 3;</code>
   *
   * @return The bytes for longDescription.
   */
  com.google.protobuf.ByteString getLongDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The type of analysis. This field can be used as a filter in
   * list requests.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind kind = 4;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of analysis. This field can be used as a filter in
   * list requests.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind kind = 4;</code>
   *
   * @return The kind.
   */
  io.grafeas.v1.NoteKind getKind();

  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  java.util.List<io.grafeas.v1.RelatedUrl> getRelatedUrlList();
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  io.grafeas.v1.RelatedUrl getRelatedUrl(int index);
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  int getRelatedUrlCount();
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  java.util.List<? extends io.grafeas.v1.RelatedUrlOrBuilder> getRelatedUrlOrBuilderList();
  /**
   *
   *
   * <pre>
   * URLs associated with this note.
   * </pre>
   *
   * <code>repeated .grafeas.v1.RelatedUrl related_url = 5;</code>
   */
  io.grafeas.v1.RelatedUrlOrBuilder getRelatedUrlOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   *
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   *
   *
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   *
   * @return The expirationTime.
   */
  com.google.protobuf.Timestamp getExpirationTime();
  /**
   *
   *
   * <pre>
   * Time of expiration for this note. Empty if note does not expire.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expiration_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was created. This field can be used as a
   * filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time this note was last updated. This field can be used as
   * a filter in list requests.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   *
   * @return A list containing the relatedNoteNames.
   */
  java.util.List<java.lang.String> getRelatedNoteNamesList();
  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   *
   * @return The count of relatedNoteNames.
   */
  int getRelatedNoteNamesCount();
  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   *
   * @param index The index of the element to return.
   * @return The relatedNoteNames at the given index.
   */
  java.lang.String getRelatedNoteNames(int index);
  /**
   *
   *
   * <pre>
   * Other notes related to this note.
   * </pre>
   *
   * <code>repeated string related_note_names = 9;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the relatedNoteNames at the given index.
   */
  com.google.protobuf.ByteString getRelatedNoteNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityNote vulnerability = 10;</code>
   *
   * @return Whether the vulnerability field is set.
   */
  boolean hasVulnerability();
  /**
   *
   *
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityNote vulnerability = 10;</code>
   *
   * @return The vulnerability.
   */
  io.grafeas.v1.VulnerabilityNote getVulnerability();
  /**
   *
   *
   * <pre>
   * A note describing a package vulnerability.
   * </pre>
   *
   * <code>.grafeas.v1.VulnerabilityNote vulnerability = 10;</code>
   */
  io.grafeas.v1.VulnerabilityNoteOrBuilder getVulnerabilityOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildNote build = 11;</code>
   *
   * @return Whether the build field is set.
   */
  boolean hasBuild();
  /**
   *
   *
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildNote build = 11;</code>
   *
   * @return The build.
   */
  io.grafeas.v1.BuildNote getBuild();
  /**
   *
   *
   * <pre>
   * A note describing build provenance for a verifiable build.
   * </pre>
   *
   * <code>.grafeas.v1.BuildNote build = 11;</code>
   */
  io.grafeas.v1.BuildNoteOrBuilder getBuildOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1.ImageNote image = 12;</code>
   *
   * @return Whether the image field is set.
   */
  boolean hasImage();
  /**
   *
   *
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1.ImageNote image = 12;</code>
   *
   * @return The image.
   */
  io.grafeas.v1.ImageNote getImage();
  /**
   *
   *
   * <pre>
   * A note describing a base image.
   * </pre>
   *
   * <code>.grafeas.v1.ImageNote image = 12;</code>
   */
  io.grafeas.v1.ImageNoteOrBuilder getImageOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1.PackageNote package = 13;</code>
   *
   * @return Whether the package field is set.
   */
  boolean hasPackage();
  /**
   *
   *
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1.PackageNote package = 13;</code>
   *
   * @return The package.
   */
  io.grafeas.v1.PackageNote getPackage();
  /**
   *
   *
   * <pre>
   * A note describing a package hosted by various package managers.
   * </pre>
   *
   * <code>.grafeas.v1.PackageNote package = 13;</code>
   */
  io.grafeas.v1.PackageNoteOrBuilder getPackageOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentNote deployment = 14;</code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentNote deployment = 14;</code>
   *
   * @return The deployment.
   */
  io.grafeas.v1.DeploymentNote getDeployment();
  /**
   *
   *
   * <pre>
   * A note describing something that can be deployed.
   * </pre>
   *
   * <code>.grafeas.v1.DeploymentNote deployment = 14;</code>
   */
  io.grafeas.v1.DeploymentNoteOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryNote discovery = 15;</code>
   *
   * @return Whether the discovery field is set.
   */
  boolean hasDiscovery();
  /**
   *
   *
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryNote discovery = 15;</code>
   *
   * @return The discovery.
   */
  io.grafeas.v1.DiscoveryNote getDiscovery();
  /**
   *
   *
   * <pre>
   * A note describing the initial analysis of a resource.
   * </pre>
   *
   * <code>.grafeas.v1.DiscoveryNote discovery = 15;</code>
   */
  io.grafeas.v1.DiscoveryNoteOrBuilder getDiscoveryOrBuilder();

  /**
   *
   *
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote attestation = 16;</code>
   *
   * @return Whether the attestation field is set.
   */
  boolean hasAttestation();
  /**
   *
   *
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote attestation = 16;</code>
   *
   * @return The attestation.
   */
  io.grafeas.v1.AttestationNote getAttestation();
  /**
   *
   *
   * <pre>
   * A note describing an attestation role.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote attestation = 16;</code>
   */
  io.grafeas.v1.AttestationNoteOrBuilder getAttestationOrBuilder();

  public io.grafeas.v1.Note.TypeCase getTypeCase();
}
