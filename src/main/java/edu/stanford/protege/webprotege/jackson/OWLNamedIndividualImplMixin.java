package edu.stanford.protege.webprotege.jackson;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.semanticweb.owlapi.model.EntityType;
import org.semanticweb.owlapi.model.IRI;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 2021-09-02
 */
@JsonTypeName("NamedIndividual")
public abstract class OWLNamedIndividualImplMixin {

    @JsonCreator
    public OWLNamedIndividualImplMixin(@JsonProperty("iri") IRI iri) {
    }
}
