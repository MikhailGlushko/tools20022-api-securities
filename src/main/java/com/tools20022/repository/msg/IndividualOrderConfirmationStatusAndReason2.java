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
import com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02;
import com.tools20022.repository.choice.ConfirmationStatus1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument57;
import com.tools20022.repository.msg.InvestmentAccount58;
import com.tools20022.repository.msg.PartyIdentification113;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status report of the individual orders confirmation that was previously
 * received.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmMasterReference
 * IndividualOrderConfirmationStatusAndReason2.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmOrderReference
 * IndividualOrderConfirmationStatusAndReason2.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmConfirmation
 * IndividualOrderConfirmationStatusAndReason2.mmConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmClientReference
 * IndividualOrderConfirmationStatusAndReason2.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmDealReference
 * IndividualOrderConfirmationStatusAndReason2.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmStatusInitiator
 * IndividualOrderConfirmationStatusAndReason2.mmStatusInitiator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmInvestmentAccountDetails
 * IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2#mmFinancialInstrumentDetails
 * IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmIndividualOrderConfirmationDetailsReport
 * OrderConfirmationStatusReportV02.mmIndividualOrderConfirmationDetailsReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualOrderConfirmationStatusAndReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status report of the individual orders confirmation that was previously received."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualOrderConfirmationStatusAndReason2", propOrder = {"masterReference", "orderReference", "confirmation", "clientReference", "dealReference", "statusInitiator", "investmentAccountDetails",
		"financialInstrumentDetails"})
public class IndividualOrderConfirmationStatusAndReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to a set of orders or trades in order to link them together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Reference assigned to a set of orders or trades in order to link them together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrRef", required = true)
	protected Max35Text orderReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Max35Text> mmOrderReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for the order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Max35Text value) {
			obj.setOrderReference(value);
		}
	};
	@XmlElement(name = "Conf", required = true)
	protected ConfirmationStatus1Choice confirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ConfirmationStatus1Choice
	 * ConfirmationStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStatus
	 * SecuritiesOrder.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Conf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Confirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the order confirmation cancellation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, ConfirmationStatus1Choice> mmConfirmation = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, ConfirmationStatus1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "Conf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Confirmation";
			definition = "Status of the order confirmation cancellation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ConfirmationStatus1Choice.mmObject();
		}

		@Override
		public ConfirmationStatus1Choice getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getConfirmation();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, ConfirmationStatus1Choice value) {
			obj.setConfirmation(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmClientOrderIdentification
	 * SecuritiesOrder.mmClientOrderIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmClientOrderIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef")
	protected Max35Text dealReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the order execution, as assigned by the confirming party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Optional<Max35Text>> mmDealReference = new MMMessageAttribute<IndividualOrderConfirmationStatusAndReason2, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for the order execution, as assigned by the confirming party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Optional<Max35Text> value) {
			obj.setDealReference(value.orElse(null));
		}
	};
	@XmlElement(name = "StsInitr")
	protected PartyIdentification113 statusInitiator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsInitr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusInitiator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that initiates the status of the order confirmation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, Optional<PartyIdentification113>> mmStatusInitiator = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "StsInitr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusInitiator";
			definition = "Party that initiates the status of the order confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getStatusInitiator();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Optional<PartyIdentification113> value) {
			obj.setStatusInitiator(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount58 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account information of the individual order confirmation for which the status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, Optional<InvestmentAccount58>> mmInvestmentAccountDetails = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, Optional<InvestmentAccount58>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the individual order confirmation for which the status is given.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccount58.mmObject();
		}

		@Override
		public Optional<InvestmentAccount58> getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Optional<InvestmentAccount58> value) {
			obj.setInvestmentAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected FinancialInstrument57 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2
	 * IndividualOrderConfirmationStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument information of the individual order confirmation for which the status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, Optional<FinancialInstrument57>> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<IndividualOrderConfirmationStatusAndReason2, Optional<FinancialInstrument57>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument information of the individual order confirmation for which the status is given.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument57.mmObject();
		}

		@Override
		public Optional<FinancialInstrument57> getValue(IndividualOrderConfirmationStatusAndReason2 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(IndividualOrderConfirmationStatusAndReason2 obj, Optional<FinancialInstrument57> value) {
			obj.setFinancialInstrumentDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmMasterReference,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmOrderReference, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmConfirmation,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmClientReference, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmDealReference,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmStatusInitiator, com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.IndividualOrderConfirmationStatusAndReason2.mmFinancialInstrumentDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderConfirmationStatusReportV02.mmIndividualOrderConfirmationDetailsReport);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualOrderConfirmationStatusAndReason2";
				definition = "Status report of the individual orders confirmation that was previously received.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public IndividualOrderConfirmationStatusAndReason2 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public IndividualOrderConfirmationStatusAndReason2 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public ConfirmationStatus1Choice getConfirmation() {
		return confirmation;
	}

	public IndividualOrderConfirmationStatusAndReason2 setConfirmation(ConfirmationStatus1Choice confirmation) {
		this.confirmation = Objects.requireNonNull(confirmation);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public IndividualOrderConfirmationStatusAndReason2 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public IndividualOrderConfirmationStatusAndReason2 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public Optional<PartyIdentification113> getStatusInitiator() {
		return statusInitiator == null ? Optional.empty() : Optional.of(statusInitiator);
	}

	public IndividualOrderConfirmationStatusAndReason2 setStatusInitiator(PartyIdentification113 statusInitiator) {
		this.statusInitiator = statusInitiator;
		return this;
	}

	public Optional<InvestmentAccount58> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public IndividualOrderConfirmationStatusAndReason2 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<FinancialInstrument57> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? Optional.empty() : Optional.of(financialInstrumentDetails);
	}

	public IndividualOrderConfirmationStatusAndReason2 setFinancialInstrumentDetails(FinancialInstrument57 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
		return this;
	}
}