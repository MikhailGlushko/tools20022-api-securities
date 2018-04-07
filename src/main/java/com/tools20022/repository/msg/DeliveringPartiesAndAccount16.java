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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount147;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliverersCustodianDetails
 * DeliveringPartiesAndAccount16.mmDeliverersCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliverersIntermediary1Details
 * DeliveringPartiesAndAccount16.mmDeliverersIntermediary1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliverersIntermediary2Details
 * DeliveringPartiesAndAccount16.mmDeliverersIntermediary2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16#mmDeliveringAgentDetails
 * DeliveringPartiesAndAccount16.mmDeliveringAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianRule#forDeliveringPartiesAndAccount16
 * ConstraintDeliverersCustodianRule.forDeliveringPartiesAndAccount16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediary1DetailsRule#forDeliveringPartiesAndAccount16
 * ConstraintDeliverersIntermediary1DetailsRule.forDeliveringPartiesAndAccount16
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveringPartiesAndAccount16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeliveringPartiesAndAccount16", propOrder = {"deliverersCustodianDetails", "deliverersIntermediary1Details", "deliverersIntermediary2Details", "deliveringAgentDetails"})
public class DeliveringPartiesAndAccount16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvrrsCtdnDtls")
	protected PartyIdentificationAndAccount147 deliverersCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>> mmDeliverersCustodianDetails = new MMMessageAssociationEnd<DeliveringPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetails";
			definition = "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount147> getValue(DeliveringPartiesAndAccount16 obj) {
			return obj.getDeliverersCustodianDetails();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount16 obj, Optional<PartyIdentificationAndAccount147> value) {
			obj.setDeliverersCustodianDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrrsIntrmy1Dtls")
	protected PartyIdentificationAndAccount147 deliverersIntermediary1Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmy1Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary1Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>> mmDeliverersIntermediary1Details = new MMMessageAssociationEnd<DeliveringPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmy1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary1Details";
			definition = "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount147> getValue(DeliveringPartiesAndAccount16 obj) {
			return obj.getDeliverersIntermediary1Details();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount16 obj, Optional<PartyIdentificationAndAccount147> value) {
			obj.setDeliverersIntermediary1Details(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrrsIntrmy2Dtls")
	protected PartyIdentificationAndAccount147 deliverersIntermediary2Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrsIntrmy2Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverersIntermediary2Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the deliverer's intermediary 1."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>> mmDeliverersIntermediary2Details = new MMMessageAssociationEnd<DeliveringPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmy2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary2Details";
			definition = "Party that interacts with the deliverer's intermediary 1.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount147> getValue(DeliveringPartiesAndAccount16 obj) {
			return obj.getDeliverersIntermediary2Details();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount16 obj, Optional<PartyIdentificationAndAccount147> value) {
			obj.setDeliverersIntermediary2Details(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgtDtls", required = true)
	protected PartyIdentificationAndAccount147 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount16
	 * DeliveringPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount16, PartyIdentificationAndAccount147> mmDeliveringAgentDetails = new MMMessageAssociationEnd<DeliveringPartiesAndAccount16, PartyIdentificationAndAccount147>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, central securities depository.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount147 getValue(DeliveringPartiesAndAccount16 obj) {
			return obj.getDeliveringAgentDetails();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount16 obj, PartyIdentificationAndAccount147 value) {
			obj.setDeliveringAgentDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmDeliverersCustodianDetails,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmDeliverersIntermediary1Details, com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmDeliverersIntermediary2Details,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount16.mmDeliveringAgentDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianRule.forDeliveringPartiesAndAccount16,
						com.tools20022.repository.constraints.ConstraintDeliverersIntermediary1DetailsRule.forDeliveringPartiesAndAccount16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount16";
				definition = "Parameters applied to the settlement of a security transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentificationAndAccount147> getDeliverersCustodianDetails() {
		return deliverersCustodianDetails == null ? Optional.empty() : Optional.of(deliverersCustodianDetails);
	}

	public DeliveringPartiesAndAccount16 setDeliverersCustodianDetails(PartyIdentificationAndAccount147 deliverersCustodianDetails) {
		this.deliverersCustodianDetails = deliverersCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount147> getDeliverersIntermediary1Details() {
		return deliverersIntermediary1Details == null ? Optional.empty() : Optional.of(deliverersIntermediary1Details);
	}

	public DeliveringPartiesAndAccount16 setDeliverersIntermediary1Details(PartyIdentificationAndAccount147 deliverersIntermediary1Details) {
		this.deliverersIntermediary1Details = deliverersIntermediary1Details;
		return this;
	}

	public Optional<PartyIdentificationAndAccount147> getDeliverersIntermediary2Details() {
		return deliverersIntermediary2Details == null ? Optional.empty() : Optional.of(deliverersIntermediary2Details);
	}

	public DeliveringPartiesAndAccount16 setDeliverersIntermediary2Details(PartyIdentificationAndAccount147 deliverersIntermediary2Details) {
		this.deliverersIntermediary2Details = deliverersIntermediary2Details;
		return this;
	}

	public PartyIdentificationAndAccount147 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public DeliveringPartiesAndAccount16 setDeliveringAgentDetails(PartyIdentificationAndAccount147 deliveringAgentDetails) {
		this.deliveringAgentDetails = Objects.requireNonNull(deliveringAgentDetails);
		return this;
	}
}