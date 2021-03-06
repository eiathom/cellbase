/*
 * Copyright 2015 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencb.cellbase.core.common.variation;

// Generated Jun 5, 2012 6:41:13 PM by Hibernate Tools 3.4.0.CR1


/**
 * StructuralVariation generated by hbm2java.
 */
public class StructuralVariation implements java.io.Serializable {

    private int structuralVariationId;
    private String displayId;
    private String chromosome;
    private int start;
    private int end;
    private String strand;
    private String soTerm;
    private String studyName;
    private String studyUrl;
    private String studyDescription;
    private String source;
    private String sourceDescription;

    public StructuralVariation() {
    }

    public StructuralVariation(int structuralVariationId, String displayId,
                               String chromosome, int start, int end, String strand,
                               String soTerm, String studyName, String studyUrl,
                               String studyDescription, String source, String sourceDescription) {
        this.structuralVariationId = structuralVariationId;
        this.displayId = displayId;
        this.chromosome = chromosome;
        this.start = start;
        this.end = end;
        this.strand = strand;
        this.soTerm = soTerm;
        this.studyName = studyName;
        this.studyUrl = studyUrl;
        this.studyDescription = studyDescription;
        this.source = source;
        this.sourceDescription = sourceDescription;
    }

    public int getStructuralVariationId() {
        return this.structuralVariationId;
    }

    public void setStructuralVariationId(int structuralVariationId) {
        this.structuralVariationId = structuralVariationId;
    }

    public String getDisplayId() {
        return this.displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getChromosome() {
        return this.chromosome;
    }

    public void setChromosome(String chromosome) {
        this.chromosome = chromosome;
    }

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return this.end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getStrand() {
        return this.strand;
    }

    public void setStrand(String strand) {
        this.strand = strand;
    }

    public String getSoTerm() {
        return this.soTerm;
    }

    public void setSoTerm(String soTerm) {
        this.soTerm = soTerm;
    }

    public String getStudyName() {
        return this.studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getStudyUrl() {
        return this.studyUrl;
    }

    public void setStudyUrl(String studyUrl) {
        this.studyUrl = studyUrl;
    }

    public String getStudyDescription() {
        return this.studyDescription;
    }

    public void setStudyDescription(String studyDescription) {
        this.studyDescription = studyDescription;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceDescription() {
        return this.sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

}
