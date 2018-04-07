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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.entity.SecuritiesSettlementSystem;
import com.tools20022.repository.entity.SettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentAccount65;
import com.tools20022.repository.msg.PartyIdentification123;
import com.tools20022.repository.msg.PartyIdentificationAndAccount157;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmDelivererDetails
 * DeliveringPartiesAndAccount17.mmDelivererDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmDeliverersCustodianDetails
 * DeliveringPartiesAndAccount17.mmDeliverersCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmDeliverersIntermediary1Details
 * DeliveringPartiesAndAccount17.mmDeliverersIntermediary1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmDeliverersIntermediary2Details
 * DeliveringPartiesAndAccount17.mmDeliverersIntermediary2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmDeliveringAgentDetails
 * DeliveringPartiesAndAccount17.mmDeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmSecuritiesSettlementSystem
 * DeliveringPartiesAndAccount17.mmSecuritiesSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17#mmPlaceOfSettlementDetails
 * DeliveringPartiesAndAccount17.mmPlaceOfSettlementDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule#forDeliveringPartiesAndAccount17
 * ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount17}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliverersIntermediary1Details#forDeliveringPartiesAndAccount17
 * ConstraintDeliverersIntermediary1Details.forDeliveringPartiesAndAccount17}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeliveringPartiesAndAccount17"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeliveringPartiesAndAccount17", propOrder = {"delivererDetails", "deliverersCustodianDetails", "deliverersIntermediary1Details", "deliverersIntermediary2Details", "deliveringAgentDetails", "securitiesSettlementSystem",
		"placeOfSettlementDetails"})
public class DeliveringPartiesAndAccount17 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvrrDtls")
	protected InvestmentAccount65 delivererDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount65
	 * InvestmentAccount65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SettlementPartyRole#mmSettlementAccount
	 * SettlementPartyRole.mmSettlementAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelivererDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that sells goods or services, or a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<InvestmentAccount65>> mmDelivererDetails = new MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<InvestmentAccount65>>() {
		{
			businessElementTrace_lazy = () -> SettlementPartyRole.mmSettlementAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "DlvrrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelivererDetails";
			definition = "Party that sells goods or services, or a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount65.mmObject();
		}

		@Override
		public Optional<InvestmentAccount65> getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getDelivererDetails();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, Optional<InvestmentAccount65> value) {
			obj.setDelivererDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrrsCtdnDtls")
	protected PartyIdentificationAndAccount157 deliverersCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
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
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>> mmDeliverersCustodianDetails = new MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersCustodianDetails";
			definition = "Party that acts on behalf of the seller of securities when the seller does not have a direct relationship with the delivering agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount157> getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getDeliverersCustodianDetails();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, Optional<PartyIdentificationAndAccount157> value) {
			obj.setDeliverersCustodianDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrrsIntrmy1Dtls")
	protected PartyIdentificationAndAccount157 deliverersIntermediary1Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
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
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>> mmDeliverersIntermediary1Details = new MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmy1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary1Details";
			definition = "Party that the deliverer's custodian uses to effect the delivery of a security, when the deliverer's custodian does not have a direct relationship with the delivering agent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount157> getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getDeliverersIntermediary1Details();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, Optional<PartyIdentificationAndAccount157> value) {
			obj.setDeliverersIntermediary1Details(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrrsIntrmy2Dtls")
	protected PartyIdentificationAndAccount157 deliverersIntermediary2Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
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
	 * definition} = "Party that interacts with the deliverer's intermediary."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>> mmDeliverersIntermediary2Details = new MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentificationAndAccount157>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "DlvrrsIntrmy2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverersIntermediary2Details";
			definition = "Party that interacts with the deliverer's intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount157> getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getDeliverersIntermediary2Details();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, Optional<PartyIdentificationAndAccount157> value) {
			obj.setDeliverersIntermediary2Details(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgtDtls", required = true)
	protected PartyIdentificationAndAccount157 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount157
	 * PartyIdentificationAndAccount157}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
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
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount17, PartyIdentificationAndAccount157> mmDeliveringAgentDetails = new MMMessageAssociationEnd<DeliveringPartiesAndAccount17, PartyIdentificationAndAccount157>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, central securities depository.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount157.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount157 getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getDeliveringAgentDetails();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, PartyIdentificationAndAccount157 value) {
			obj.setDeliveringAgentDetails(value);
		}
	};
	@XmlElement(name = "SctiesSttlmSys")
	protected Max35Text securitiesSettlementSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
	 * SecuritiesSettlementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmSys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the securities settlement system to be used."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DeliveringPartiesAndAccount17, Optional<Max35Text>> mmSecuritiesSettlementSystem = new MMMessageAttribute<DeliveringPartiesAndAccount17, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlementSystem.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmSys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementSystem";
			definition = "Identifies the securities settlement system to be used.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getSecuritiesSettlementSystem();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, Optional<Max35Text> value) {
			obj.setSecuritiesSettlementSystem(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfSttlmDtls")
	protected PartyIdentification123 placeOfSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification123
	 * PartyIdentification123}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount17
	 * DeliveringPartiesAndAccount17}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place where settlement of the securities takes place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentification123>> mmPlaceOfSettlementDetails = new MMMessageAssociationEnd<DeliveringPartiesAndAccount17, Optional<PartyIdentification123>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmObject();
			isDerived = false;
			xmlTag = "PlcOfSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSettlementDetails";
			definition = "Place where settlement of the securities takes place.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification123.mmObject();
		}

		@Override
		public Optional<PartyIdentification123> getValue(DeliveringPartiesAndAccount17 obj) {
			return obj.getPlaceOfSettlementDetails();
		}

		@Override
		public void setValue(DeliveringPartiesAndAccount17 obj, Optional<PartyIdentification123> value) {
			obj.setPlaceOfSettlementDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmDelivererDetails, com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmDeliverersCustodianDetails,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmDeliverersIntermediary1Details, com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmDeliverersIntermediary2Details,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmDeliveringAgentDetails, com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmSecuritiesSettlementSystem,
						com.tools20022.repository.msg.DeliveringPartiesAndAccount17.mmPlaceOfSettlementDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDeliverersCustodianDetailsRule.forDeliveringPartiesAndAccount17,
						com.tools20022.repository.constraints.ConstraintDeliverersIntermediary1Details.forDeliveringPartiesAndAccount17);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringPartiesAndAccount17";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount65> getDelivererDetails() {
		return delivererDetails == null ? Optional.empty() : Optional.of(delivererDetails);
	}

	public DeliveringPartiesAndAccount17 setDelivererDetails(InvestmentAccount65 delivererDetails) {
		this.delivererDetails = delivererDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount157> getDeliverersCustodianDetails() {
		return deliverersCustodianDetails == null ? Optional.empty() : Optional.of(deliverersCustodianDetails);
	}

	public DeliveringPartiesAndAccount17 setDeliverersCustodianDetails(PartyIdentificationAndAccount157 deliverersCustodianDetails) {
		this.deliverersCustodianDetails = deliverersCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount157> getDeliverersIntermediary1Details() {
		return deliverersIntermediary1Details == null ? Optional.empty() : Optional.of(deliverersIntermediary1Details);
	}

	public DeliveringPartiesAndAccount17 setDeliverersIntermediary1Details(PartyIdentificationAndAccount157 deliverersIntermediary1Details) {
		this.deliverersIntermediary1Details = deliverersIntermediary1Details;
		return this;
	}

	public Optional<PartyIdentificationAndAccount157> getDeliverersIntermediary2Details() {
		return deliverersIntermediary2Details == null ? Optional.empty() : Optional.of(deliverersIntermediary2Details);
	}

	public DeliveringPartiesAndAccount17 setDeliverersIntermediary2Details(PartyIdentificationAndAccount157 deliverersIntermediary2Details) {
		this.deliverersIntermediary2Details = deliverersIntermediary2Details;
		return this;
	}

	public PartyIdentificationAndAccount157 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public DeliveringPartiesAndAccount17 setDeliveringAgentDetails(PartyIdentificationAndAccount157 deliveringAgentDetails) {
		this.deliveringAgentDetails = Objects.requireNonNull(deliveringAgentDetails);
		return this;
	}

	public Optional<Max35Text> getSecuritiesSettlementSystem() {
		return securitiesSettlementSystem == null ? Optional.empty() : Optional.of(securitiesSettlementSystem);
	}

	public DeliveringPartiesAndAccount17 setSecuritiesSettlementSystem(Max35Text securitiesSettlementSystem) {
		this.securitiesSettlementSystem = securitiesSettlementSystem;
		return this;
	}

	public Optional<PartyIdentification123> getPlaceOfSettlementDetails() {
		return placeOfSettlementDetails == null ? Optional.empty() : Optional.of(placeOfSettlementDetails);
	}

	public DeliveringPartiesAndAccount17 setPlaceOfSettlementDetails(PartyIdentification123 placeOfSettlementDetails) {
		this.placeOfSettlementDetails = placeOfSettlementDetails;
		return this;
	}
}