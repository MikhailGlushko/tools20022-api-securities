/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to a linked transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Linkages37#mmProcessingPosition
 * Linkages37.mmProcessingPosition}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#mmMessageNumber
 * Linkages37.mmMessageNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#mmReference
 * Linkages37.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#mmLinkedQuantity
 * Linkages37.mmLinkedQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#mmReferenceOwner
 * Linkages37.mmReferenceOwner}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotificationV08#mmLinkages
 * SecuritiesSettlementTransactionGenerationNotificationV08.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstructionV08#mmLinkages
 * SecuritiesFinancingInstructionV08.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstructionV08#mmLinkages
 * SecuritiesSettlementTransactionInstructionV08.mmLinkages}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedQuantityRule#forLinkages37
 * ConstraintLinkedQuantityRule.forLinkages37}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Linkages37"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to a linked transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Linkages37", propOrder = {"processingPosition", "messageNumber", "reference", "linkedQuantity", "referenceOwner"})
public class Linkages37 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgPos")
	protected ProcessingPosition7Choice processingPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingPosition7Choice
	 * ProcessingPosition7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages37
	 * Linkages37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgPos"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When the transaction is to be executed relative to a linked transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages37, Optional<ProcessingPosition7Choice>> mmProcessingPosition = new MMMessageAssociationEnd<Linkages37, Optional<ProcessingPosition7Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages37.mmObject();
			isDerived = false;
			xmlTag = "PrcgPos";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingPosition";
			definition = "When the transaction is to be executed relative to a linked transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingPosition7Choice.mmObject();
		}

		@Override
		public Optional<ProcessingPosition7Choice> getValue(Linkages37 obj) {
			return obj.getProcessingPosition();
		}

		@Override
		public void setValue(Linkages37 obj, Optional<ProcessingPosition7Choice> value) {
			obj.setProcessingPosition(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgNb")
	protected DocumentNumber5Choice messageNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DocumentNumber5Choice
	 * DocumentNumber5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages37
	 * Linkages37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :13a::LINK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message type number/message identifier of the message referenced in the linkage sequence."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages37, Optional<DocumentNumber5Choice>> mmMessageNumber = new MMMessageAssociationEnd<Linkages37, Optional<DocumentNumber5Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages37.mmObject();
			isDerived = false;
			xmlTag = "MsgNb";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":13a::LINK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageNumber";
			definition = "Message type number/message identifier of the message referenced in the linkage sequence.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DocumentNumber5Choice.mmObject();
		}

		@Override
		public Optional<DocumentNumber5Choice> getValue(Linkages37 obj) {
			return obj.getMessageNumber();
		}

		@Override
		public void setValue(Linkages37 obj, Optional<DocumentNumber5Choice> value) {
			obj.setMessageNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "Ref", required = true)
	protected References41Choice reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.References41Choice
	 * References41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages37
	 * Linkages37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to the linked transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages37, References41Choice> mmReference = new MMMessageAssociationEnd<Linkages37, References41Choice>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages37.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference to the linked transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> References41Choice.mmObject();
		}

		@Override
		public References41Choice getValue(Linkages37 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(Linkages37 obj, References41Choice value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "LkdQty")
	protected PairedOrTurnedQuantity3Choice linkedQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PairedOrTurnedQuantity3Choice
	 * PairedOrTurnedQuantity3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages37
	 * Linkages37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::PAIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of financial instruments of the linked transaction to be paired-off or turned."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages37, Optional<PairedOrTurnedQuantity3Choice>> mmLinkedQuantity = new MMMessageAssociationEnd<Linkages37, Optional<PairedOrTurnedQuantity3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages37.mmObject();
			isDerived = false;
			xmlTag = "LkdQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::PAIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedQuantity";
			definition = "Quantity of financial instruments of the linked transaction to be paired-off or turned.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PairedOrTurnedQuantity3Choice.mmObject();
		}

		@Override
		public Optional<PairedOrTurnedQuantity3Choice> getValue(Linkages37 obj) {
			return obj.getLinkedQuantity();
		}

		@Override
		public void setValue(Linkages37 obj, Optional<PairedOrTurnedQuantity3Choice> value) {
			obj.setLinkedQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RefOwnr")
	protected PartyIdentification92Choice referenceOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification92Choice
	 * PartyIdentification92Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Linkages37
	 * Linkages37}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that generates the reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Linkages37, Optional<PartyIdentification92Choice>> mmReferenceOwner = new MMMessageAssociationEnd<Linkages37, Optional<PartyIdentification92Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Linkages37.mmObject();
			isDerived = false;
			xmlTag = "RefOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceOwner";
			definition = "Party that generates the reference.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification92Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification92Choice> getValue(Linkages37 obj) {
			return obj.getReferenceOwner();
		}

		@Override
		public void setValue(Linkages37 obj, Optional<PartyIdentification92Choice> value) {
			obj.setReferenceOwner(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Linkages37.mmProcessingPosition, com.tools20022.repository.msg.Linkages37.mmMessageNumber, com.tools20022.repository.msg.Linkages37.mmReference,
						com.tools20022.repository.msg.Linkages37.mmLinkedQuantity, com.tools20022.repository.msg.Linkages37.mmReferenceOwner);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionGenerationNotificationV08.mmLinkages, SecuritiesFinancingInstructionV08.mmLinkages, SecuritiesSettlementTransactionInstructionV08.mmLinkages);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedQuantityRule.forLinkages37);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Linkages37";
				definition = "Information related to a linked transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ProcessingPosition7Choice> getProcessingPosition() {
		return processingPosition == null ? Optional.empty() : Optional.of(processingPosition);
	}

	public Linkages37 setProcessingPosition(ProcessingPosition7Choice processingPosition) {
		this.processingPosition = processingPosition;
		return this;
	}

	public Optional<DocumentNumber5Choice> getMessageNumber() {
		return messageNumber == null ? Optional.empty() : Optional.of(messageNumber);
	}

	public Linkages37 setMessageNumber(DocumentNumber5Choice messageNumber) {
		this.messageNumber = messageNumber;
		return this;
	}

	public References41Choice getReference() {
		return reference;
	}

	public Linkages37 setReference(References41Choice reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PairedOrTurnedQuantity3Choice> getLinkedQuantity() {
		return linkedQuantity == null ? Optional.empty() : Optional.of(linkedQuantity);
	}

	public Linkages37 setLinkedQuantity(PairedOrTurnedQuantity3Choice linkedQuantity) {
		this.linkedQuantity = linkedQuantity;
		return this;
	}

	public Optional<PartyIdentification92Choice> getReferenceOwner() {
		return referenceOwner == null ? Optional.empty() : Optional.of(referenceOwner);
	}

	public Linkages37 setReferenceOwner(PartyIdentification92Choice referenceOwner) {
		this.referenceOwner = referenceOwner;
		return this;
	}
}