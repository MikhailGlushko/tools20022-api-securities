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
import com.tools20022.repository.area.sese.TransferOutInstructionV07;
import com.tools20022.repository.choice.ChargePaymentMethod1Choice;
import com.tools20022.repository.choice.Quantity13Choice;
import com.tools20022.repository.choice.TransferReason1;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.BusinessFlowType1Code;
import com.tools20022.repository.codeset.HoldingsPlanType1Code;
import com.tools20022.repository.codeset.RoundingDirection2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReference
 * Transfer30.mmTransferReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmClientReference
 * Transfer30.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmCounterpartyReference
 * Transfer30.mmCounterpartyReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmBusinessFlowType
 * Transfer30.mmBusinessFlowType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmRequestedSettlementDate
 * Transfer30.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferOrderDateForm
 * Transfer30.mmTransferOrderDateForm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReason
 * Transfer30.mmTransferReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmHoldingsPlanType
 * Transfer30.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmFinancialInstrumentDetails
 * Transfer30.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmQuantity
 * Transfer30.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmUnitsDetails
 * Transfer30.mmUnitsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmRounding
 * Transfer30.mmRounding}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmAveragePrice
 * Transfer30.mmAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer30#mmTransferCurrency
 * Transfer30.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmOwnAccountTransferIndicator
 * Transfer30.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmNonStandardSettlementInformation
 * Transfer30.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmReceivingAgentDetails
 * Transfer30.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmDeliveringAgentDetails
 * Transfer30.mmDeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferExpensesPaymentType
 * Transfer30.mmTransferExpensesPaymentType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmTransferDetails
 * TransferOutInstructionV07.mmTransferDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transfer30"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Transfer30", propOrder = {"transferReference", "clientReference", "counterpartyReference", "businessFlowType", "requestedSettlementDate", "transferOrderDateForm", "transferReason", "holdingsPlanType",
		"financialInstrumentDetails", "quantity", "unitsDetails", "rounding", "averagePrice", "transferCurrency", "ownAccountTransferIndicator", "nonStandardSettlementInformation", "receivingAgentDetails", "deliveringAgentDetails",
		"transferExpensesPaymentType"})
public class Transfer30 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transferReference;
	/**
	 * Unique and unambiguous identifier for a transfer instruction, as assigned
	 * by the instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AdditionalReference7 clientReference;
	/**
	 * Unique and unambiguous investor's identification of a transfer. This
	 * reference can typically be used in a hub scenario to give the reference
	 * of the transfer as assigned by the underlying client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
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
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	protected AdditionalReference7 counterpartyReference;
	/**
	 * Unambiguous identification of the transfer allocated by the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	protected BusinessFlowType1Code businessFlowType;
	/**
	 * Identifies the business process in which the actors are involved. This is
	 * important to trigger the right business process, according to the market
	 * business model, which may require matching instructions in a CSD
	 * environment (double leg process) or not (single leg process).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowType1Code
	 * BusinessFlowType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFlowTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFlowType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessFlowType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "BizFlowTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFlowType";
			definition = "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessFlowType1Code.mmObject();
		}
	};
	protected ISODate requestedSettlementDate;
	/**
	 * Date and time at which the securities are to be exchanged at the
	 * International Central Securities Depository (ICSD) or Central Securities
	 * Depository (CSD).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate transferOrderDateForm;
	/**
	 * Identifies in which date the investor signed the transfer order form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOrdrDtForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOrderDateForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in which date the investor signed the transfer order form."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferOrderDateForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "TrfOrdrDtForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOrderDateForm";
			definition = "Identifies in which date the investor signed the transfer order form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected TransferReason1 transferReason;
	/**
	 * Identifies the transfer reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TransferReason1
	 * TransferReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferReason
	 * SecuritiesTransfer.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transfer reason."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferReason;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "TrfRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferReason1.mmObject();
		}
	};
	protected List<HoldingsPlanType1Code> holdingsPlanType;
	/**
	 * Identifies whether or not saving plan or withdrawal or switch plan are
	 * included in the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
	 * SecuritiesSettlement.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsPlanTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingsPlanType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldingsPlanType;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "HldgsPlanTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> HoldingsPlanType1Code.mmObject();
		}
	};
	protected FinancialInstrument49 financialInstrumentDetails;
	/**
	 * Information related to the financial instrument to be withdrawn.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument49
	 * FinancialInstrument49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
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
	 * "Information related to the financial instrument to be withdrawn."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Information related to the financial instrument to be withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument49.mmObject();
		}
	};
	protected Quantity13Choice quantity;
	/**
	 * Total quantity of securities to be transferred, expressed in a number of
	 * units or a percentage rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity13Choice
	 * Quantity13Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of securities to be transferred, expressed in a number of units or a percentage rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Total quantity of securities to be transferred, expressed in a number of units or a percentage rate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity13Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Unit6> unitsDetails;
	/**
	 * Information about the units to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Unit6 Unit6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the units to be transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnitsDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "UnitsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsDetails";
			definition = "Information about the units to be transferred.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Unit6.mmObject();
		}
	};
	protected RoundingDirection2Code rounding;
	/**
	 * Indicates the rounding direction applied to nearest unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
	 * RoundingParameters.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rndg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the rounding direction applied to nearest unit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRounding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice;
	/**
	 * Value of a security, as booked in an account. Book value is often
	 * different from the current market value of the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of a security, as booked in an account. Book value is often different from the current market value of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAveragePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Value of a security, as booked in an account. Book value is often different from the current market value of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyCode transferCurrency;
	/**
	 * Identifies the currency to be used to transfer the holdings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
	 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferCurrency;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "TrfCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected YesNoIndicator ownAccountTransferIndicator;
	/**
	 * Indicates whether the transfer results in a change of beneficial owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
	 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnAcctTrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnAccountTransferIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmOwnAccountTransferIndicator;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "OwnAcctTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * Additional specific settlement information for non-regulated traded
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected PartyIdentificationAndAccount125 receivingAgentDetails;
	/**
	 * Party that receives securities from the delivering agent via the place of
	 * settlement, for example, securities central depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
	 * PartyIdentificationAndAccount125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivingAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount125.mmObject();
		}
	};
	protected PartyIdentificationAndAccount125 deliveringAgentDetails;
	/**
	 * Party that delivers securities to the receiving agent at the place of
	 * settlement, for example, a central securities depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
	 * PartyIdentificationAndAccount125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
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
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveringAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount125.mmObject();
		}
	};
	protected ChargePaymentMethod1Choice transferExpensesPaymentType;
	/**
	 * Specifies how the payment of charges, taxes and commissions as a result
	 * of the transfer is covered, that is, whether by cash or the redemption of
	 * units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice
	 * ChargePaymentMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargePaymentMethod
	 * Charges.mmChargePaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer30
	 * Transfer30}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfExpnssPmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferExpensesPaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment of charges, taxes and commissions as a result of the transfer is covered, that is, whether by cash or the redemption of units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferExpensesPaymentType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargePaymentMethod;
			componentContext_lazy = () -> Transfer30.mmObject();
			isDerived = false;
			xmlTag = "TrfExpnssPmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferExpensesPaymentType";
			definition = "Specifies how the payment of charges, taxes and commissions as a result of the transfer is covered, that is, whether by cash or the redemption of units.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargePaymentMethod1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Transfer30.mmTransferReference, Transfer30.mmClientReference, Transfer30.mmCounterpartyReference, Transfer30.mmBusinessFlowType, Transfer30.mmRequestedSettlementDate,
						Transfer30.mmTransferOrderDateForm, Transfer30.mmTransferReason, Transfer30.mmHoldingsPlanType, Transfer30.mmFinancialInstrumentDetails, Transfer30.mmQuantity, Transfer30.mmUnitsDetails, Transfer30.mmRounding,
						Transfer30.mmAveragePrice, Transfer30.mmTransferCurrency, Transfer30.mmOwnAccountTransferIndicator, Transfer30.mmNonStandardSettlementInformation, Transfer30.mmReceivingAgentDetails,
						Transfer30.mmDeliveringAgentDetails, Transfer30.mmTransferExpensesPaymentType);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferOutInstructionV07.mmTransferDetails);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transfer30";
				definition = "Parameters applied to the settlement of a security transfer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TrfRef", required = true)
	public Max35Text getTransferReference() {
		return transferReference;
	}

	public void setTransferReference(Max35Text transferReference) {
		this.transferReference = transferReference;
	}

	@XmlElement(name = "ClntRef")
	public AdditionalReference7 getClientReference() {
		return clientReference;
	}

	public void setClientReference(com.tools20022.repository.msg.AdditionalReference7 clientReference) {
		this.clientReference = clientReference;
	}

	@XmlElement(name = "CtrPtyRef")
	public AdditionalReference7 getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference7 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	@XmlElement(name = "BizFlowTp")
	public BusinessFlowType1Code getBusinessFlowType() {
		return businessFlowType;
	}

	public void setBusinessFlowType(BusinessFlowType1Code businessFlowType) {
		this.businessFlowType = businessFlowType;
	}

	@XmlElement(name = "ReqdSttlmDt")
	public ISODate getRequestedSettlementDate() {
		return requestedSettlementDate;
	}

	public void setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
	}

	@XmlElement(name = "TrfOrdrDtForm")
	public ISODate getTransferOrderDateForm() {
		return transferOrderDateForm;
	}

	public void setTransferOrderDateForm(ISODate transferOrderDateForm) {
		this.transferOrderDateForm = transferOrderDateForm;
	}

	@XmlElement(name = "TrfRsn")
	public TransferReason1 getTransferReason() {
		return transferReason;
	}

	public void setTransferReason(TransferReason1 transferReason) {
		this.transferReason = transferReason;
	}

	@XmlElement(name = "HldgsPlanTp")
	public List<HoldingsPlanType1Code> getHoldingsPlanType() {
		return holdingsPlanType;
	}

	public void setHoldingsPlanType(List<HoldingsPlanType1Code> holdingsPlanType) {
		this.holdingsPlanType = holdingsPlanType;
	}

	@XmlElement(name = "FinInstrmDtls", required = true)
	public FinancialInstrument49 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public void setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument49 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
	}

	@XmlElement(name = "Qty", required = true)
	public Quantity13Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(Quantity13Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "UnitsDtls")
	public List<Unit6> getUnitsDetails() {
		return unitsDetails;
	}

	public void setUnitsDetails(List<com.tools20022.repository.msg.Unit6> unitsDetails) {
		this.unitsDetails = unitsDetails;
	}

	@XmlElement(name = "Rndg")
	public RoundingDirection2Code getRounding() {
		return rounding;
	}

	public void setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
	}

	@XmlElement(name = "AvrgPric")
	public ActiveOrHistoricCurrencyAnd13DecimalAmount getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice) {
		this.averagePrice = averagePrice;
	}

	@XmlElement(name = "TrfCcy")
	public ActiveOrHistoricCurrencyCode getTransferCurrency() {
		return transferCurrency;
	}

	public void setTransferCurrency(ActiveOrHistoricCurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
	}

	@XmlElement(name = "OwnAcctTrfInd")
	public YesNoIndicator getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator;
	}

	public void setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
	}

	@XmlElement(name = "NonStdSttlmInf")
	public Max350Text getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation;
	}

	public void setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
	}

	@XmlElement(name = "RcvgAgtDtls")
	public PartyIdentificationAndAccount125 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public void setReceivingAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount125 receivingAgentDetails) {
		this.receivingAgentDetails = receivingAgentDetails;
	}

	@XmlElement(name = "DlvrgAgtDtls")
	public PartyIdentificationAndAccount125 getDeliveringAgentDetails() {
		return deliveringAgentDetails;
	}

	public void setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount125 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
	}

	@XmlElement(name = "TrfExpnssPmtTp")
	public ChargePaymentMethod1Choice getTransferExpensesPaymentType() {
		return transferExpensesPaymentType;
	}

	public void setTransferExpensesPaymentType(ChargePaymentMethod1Choice transferExpensesPaymentType) {
		this.transferExpensesPaymentType = transferExpensesPaymentType;
	}
}