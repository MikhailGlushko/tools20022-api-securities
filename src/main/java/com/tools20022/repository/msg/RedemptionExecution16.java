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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Execution of a redemption order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderReference
 * RedemptionExecution16.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmClientReference
 * RedemptionExecution16.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealReference
 * RedemptionExecution16.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderType
 * RedemptionExecution16.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmBeneficiaryDetails
 * RedemptionExecution16.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmUnitsNumber
 * RedemptionExecution16.mmUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmRounding
 * RedemptionExecution16.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNetAmount
 * RedemptionExecution16.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInvestmentAccountDetails
 * RedemptionExecution16.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmHoldingsRedemptionRate
 * RedemptionExecution16.mmHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGrossAmount
 * RedemptionExecution16.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTradeDateTime
 * RedemptionExecution16.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementAmount
 * RedemptionExecution16.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCashSettlementDate
 * RedemptionExecution16.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementMethod
 * RedemptionExecution16.mmSettlementMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmDealingPriceDetails
 * RedemptionExecution16.mmDealingPriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativePriceDetails
 * RedemptionExecution16.mmInformativePriceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartiallyExecutedIndicator
 * RedemptionExecution16.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmBestExecution
 * RedemptionExecution16.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCumDividendIndicator
 * RedemptionExecution16.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInterimProfitAmount
 * RedemptionExecution16.mmInterimProfitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmForeignExchangeDetails
 * RedemptionExecution16.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmIncomePreference
 * RedemptionExecution16.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGroup1Or2Units
 * RedemptionExecution16.mmGroup1Or2Units}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTransactionOverhead
 * RedemptionExecution16.mmTransactionOverhead}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmInformativeTaxDetails
 * RedemptionExecution16.mmInformativeTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmStaffClientBreakdown
 * RedemptionExecution16.mmStaffClientBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSettlementAndCustodyDetails
 * RedemptionExecution16.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPhysicalDeliveryIndicator
 * RedemptionExecution16.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPhysicalDeliveryDetails
 * RedemptionExecution16.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCashSettlementDetails
 * RedemptionExecution16.mmCashSettlementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNonStandardSettlementInformation
 * RedemptionExecution16.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfUnits
 * RedemptionExecution16.mmPartialSettlementOfUnits}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialSettlementOfCash
 * RedemptionExecution16.mmPartialSettlementOfCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmPartialRedemptionWithholdingAmount
 * RedemptionExecution16.mmPartialRedemptionWithholdingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmFinancialAdvice
 * RedemptionExecution16.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmNegotiatedTrade
 * RedemptionExecution16.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmLateReport
 * RedemptionExecution16.mmLateReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmRelatedPartyDetails
 * RedemptionExecution16.mmRelatedPartyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmEqualisation
 * RedemptionExecution16.mmEqualisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCustomerConductClassification
 * RedemptionExecution16.mmCustomerConductClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmTransactionChannelType
 * RedemptionExecution16.mmTransactionChannelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmSignatureType
 * RedemptionExecution16.mmSignatureType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmOrderWaiverDetails
 * RedemptionExecution16.mmOrderWaiverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmGatingOrHoldBackDetails
 * RedemptionExecution16.mmGatingOrHoldBackDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionExecution16
 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionExecution16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule#forRedemptionExecution16
 * ConstraintPriceDifferenceReasonRule.forRedemptionExecution16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule#forRedemptionExecution16
 * ConstraintPhysicalDeliveryDetails1Rule.forRedemptionExecution16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule#forRedemptionExecution16
 * ConstraintPhysicalDeliveryDetails2Rule.forRedemptionExecution16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionExecution16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionExecution16", propOrder = {"orderReference", "clientReference", "dealReference", "orderType", "beneficiaryDetails", "unitsNumber", "rounding", "netAmount", "investmentAccountDetails", "holdingsRedemptionRate",
		"grossAmount", "tradeDateTime", "settlementAmount", "cashSettlementDate", "settlementMethod", "dealingPriceDetails", "informativePriceDetails", "partiallyExecutedIndicator", "bestExecution", "cumDividendIndicator",
		"interimProfitAmount", "foreignExchangeDetails", "incomePreference", "group1Or2Units", "transactionOverhead", "informativeTaxDetails", "staffClientBreakdown", "settlementAndCustodyDetails", "physicalDeliveryIndicator",
		"physicalDeliveryDetails", "cashSettlementDetails", "nonStandardSettlementInformation", "partialSettlementOfUnits", "partialSettlementOfCash", "partialRedemptionWithholdingAmount", "financialAdvice", "negotiatedTrade",
		"lateReport", "relatedPartyDetails", "equalisation", "customerConductClassification", "transactionChannelType", "signatureType", "orderWaiverDetails", "gatingOrHoldBackDetails"})
public class RedemptionExecution16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
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
	public static final MMMessageAttribute<RedemptionExecution16, Max35Text> mmOrderReference = new MMMessageAttribute<RedemptionExecution16, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
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
		public Max35Text getValue(RedemptionExecution16 obj) {
			return obj.getOrderReference();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Max35Text value) {
			obj.setOrderReference(value);
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
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
	 * "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<Max35Text>> mmClientReference = new MMMessageAttribute<RedemptionExecution16, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RedemptionExecution16 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<Max35Text> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "DealRef", required = true)
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
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
	public static final MMMessageAttribute<RedemptionExecution16, Max35Text> mmDealReference = new MMMessageAttribute<RedemptionExecution16, Max35Text>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for the order execution, as assigned by the confirming party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(RedemptionExecution16 obj) {
			return obj.getDealReference();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Max35Text value) {
			obj.setDealReference(value);
		}
	};
	@XmlElement(name = "OrdrTp")
	protected List<FundOrderType4Choice> orderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FundOrderType4Choice
	 * FundOrderType4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, List<FundOrderType4Choice>> mmOrderType = new MMMessageAssociationEnd<RedemptionExecution16, List<FundOrderType4Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Category of the investment fund order.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundOrderType4Choice.mmObject();
		}

		@Override
		public List<FundOrderType4Choice> getValue(RedemptionExecution16 obj) {
			return obj.getOrderType();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, List<FundOrderType4Choice> value) {
			obj.setOrderType(value);
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected List<IndividualPerson32> beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson32
	 * IndividualPerson32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the investor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, List<IndividualPerson32>> mmBeneficiaryDetails = new MMMessageAssociationEnd<RedemptionExecution16, List<IndividualPerson32>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the investor.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPerson32.mmObject();
		}

		@Override
		public List<IndividualPerson32> getValue(RedemptionExecution16 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, List<IndividualPerson32> value) {
			obj.setBeneficiaryDetails(value);
		}
	};
	@XmlElement(name = "UnitsNb", required = true)
	protected DecimalNumber unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment funds units redeemed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, DecimalNumber> mmUnitsNumber = new MMMessageAttribute<RedemptionExecution16, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment funds units redeemed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(RedemptionExecution16 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, DecimalNumber value) {
			obj.setUnitsNumber(value);
		}
	};
	@XmlElement(name = "Rndg")
	protected RoundingDirection2Code rounding;
	/**
	 * 
	 <p>
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
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
	public static final MMMessageAttribute<RedemptionExecution16, Optional<RoundingDirection2Code>> mmRounding = new MMMessageAttribute<RedemptionExecution16, Optional<RoundingDirection2Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection2Code> getValue(RedemptionExecution16 obj) {
			return obj.getRounding();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<RoundingDirection2Code> value) {
			obj.setRounding(value.orElse(null));
		}
	};
	@XmlElement(name = "NetAmt")
	protected ActiveCurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmRedeemedNetAmount
	 * RedemptionExecution.mmRedeemedNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to the investor when redeeming fund units. \r\nNet amount = (Quantity * Price) – (Fees + Taxes)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<ActiveCurrencyAndAmount>> mmNetAmount = new MMMessageAttribute<RedemptionExecution16, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> RedemptionExecution.mmRedeemedNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money paid to the investor when redeeming fund units. \r\nNet amount = (Quantity * Price) – (Fees + Taxes).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(RedemptionExecution16 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNetAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
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
	 * definition} = "Account impacted by the investment fund order execution."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, InvestmentAccount58> mmInvestmentAccountDetails = new MMMessageAssociationEnd<RedemptionExecution16, InvestmentAccount58>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by the investment fund order execution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccount58.mmObject();
		}

		@Override
		public InvestmentAccount58 getValue(RedemptionExecution16 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, InvestmentAccount58 value) {
			obj.setInvestmentAccountDetails(value);
		}
	};
	@XmlElement(name = "HldgsRedRate")
	protected PercentageRate holdingsRedemptionRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#mmHoldingsRedemptionRate
	 * RedemptionOrder.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsRedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Portion of the investor's holdings redeemed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<PercentageRate>> mmHoldingsRedemptionRate = new MMMessageAttribute<RedemptionExecution16, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> RedemptionOrder.mmHoldingsRedemptionRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "HldgsRedRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings redeemed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RedemptionExecution16 obj) {
			return obj.getHoldingsRedemptionRate();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<PercentageRate> value) {
			obj.setHoldingsRedemptionRate(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssAmt")
	protected ActiveCurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money redeemed from the fund. \r\nGross Amount = Quantity * Price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<ActiveCurrencyAndAmount>> mmGrossAmount = new MMMessageAttribute<RedemptionExecution16, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money redeemed from the fund. \r\nGross Amount = Quantity * Price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(RedemptionExecution16 obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setGrossAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDtTm", required = true)
	protected DateAndDateTimeChoice tradeDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a price is applied, according to the terms stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, DateAndDateTimeChoice> mmTradeDateTime = new MMMessageAttribute<RedemptionExecution16, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(RedemptionExecution16 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, DateAndDateTimeChoice value) {
			obj.setTradeDateTime(value);
		}
	};
	@XmlElement(name = "SttlmAmt", required = true)
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, ActiveCurrencyAndAmount> mmSettlementAmount = new MMMessageAttribute<RedemptionExecution16, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(RedemptionExecution16 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, ActiveCurrencyAndAmount value) {
			obj.setSettlementAmount(value);
		}
	};
	@XmlElement(name = "CshSttlmDt")
	protected ISODate cashSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<ISODate>> mmCashSettlementDate = new MMMessageAttribute<RedemptionExecution16, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(RedemptionExecution16 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<ISODate> value) {
			obj.setCashSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmMtd")
	protected DeliveryReceiptType2Code settlementMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method by which the transaction is settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<DeliveryReceiptType2Code>> mmSettlementMethod = new MMMessageAttribute<RedemptionExecution16, Optional<DeliveryReceiptType2Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "SttlmMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMethod";
			definition = "Method by which the transaction is settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public Optional<DeliveryReceiptType2Code> getValue(RedemptionExecution16 obj) {
			return obj.getSettlementMethod();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<DeliveryReceiptType2Code> value) {
			obj.setSettlementMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "DealgPricDtls", required = true)
	protected UnitPrice22 dealingPriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice22
	 * UnitPrice22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealgPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealingPriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, UnitPrice22> mmDealingPriceDetails = new MMMessageAssociationEnd<RedemptionExecution16, UnitPrice22>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "DealgPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealingPriceDetails";
			definition = "Price at which the order was executed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UnitPrice22.mmObject();
		}

		@Override
		public UnitPrice22 getValue(RedemptionExecution16 obj) {
			return obj.getDealingPriceDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, UnitPrice22 value) {
			obj.setDealingPriceDetails(value);
		}
	};
	@XmlElement(name = "InftvPricDtls")
	protected List<UnitPrice22> informativePriceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice22
	 * UnitPrice22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InftvPricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativePriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other quoted price than the one at which the order was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, List<UnitPrice22>> mmInformativePriceDetails = new MMMessageAssociationEnd<RedemptionExecution16, List<UnitPrice22>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInformativePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "InftvPricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativePriceDetails";
			definition = "Other quoted price than the one at which the order was executed.";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice22.mmObject();
		}

		@Override
		public List<UnitPrice22> getValue(RedemptionExecution16 obj) {
			return obj.getInformativePriceDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, List<UnitPrice22> value) {
			obj.setInformativePriceDetails(value);
		}
	};
	@XmlElement(name = "PrtlyExctdInd", required = true)
	protected YesNoIndicator partiallyExecutedIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
	 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlyExctdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, that is, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, YesNoIndicator> mmPartiallyExecutedIndicator = new MMMessageAttribute<RedemptionExecution16, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartiallyExecutedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "PrtlyExctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, that is, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RedemptionExecution16 obj) {
			return obj.getPartiallyExecutedIndicator();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, YesNoIndicator value) {
			obj.setPartiallyExecutedIndicator(value);
		}
	};
	@XmlElement(name = "BestExctn")
	protected BestExecution1Code bestExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BestExecution1Code
	 * BestExecution1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmBestExecution
	 * InvestmentFundOrderExecution.mmBestExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BestExctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that the execution was subject to best execution rules as defined by MiFID."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<BestExecution1Code>> mmBestExecution = new MMMessageAttribute<RedemptionExecution16, Optional<BestExecution1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmBestExecution;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "BestExctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestExecution";
			definition = "Specifies that the execution was subject to best execution rules as defined by MiFID.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BestExecution1Code.mmObject();
		}

		@Override
		public Optional<BestExecution1Code> getValue(RedemptionExecution16 obj) {
			return obj.getBestExecution();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<BestExecution1Code> value) {
			obj.setBestExecution(value.orElse(null));
		}
	};
	@XmlElement(name = "CumDvddInd", required = true)
	protected YesNoIndicator cumDividendIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
	 * SecuritiesPricing.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CumDvddInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, that is, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, YesNoIndicator> mmCumDividendIndicator = new MMMessageAttribute<RedemptionExecution16, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "CumDvddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, that is, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RedemptionExecution16 obj) {
			return obj.getCumDividendIndicator();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, YesNoIndicator value) {
			obj.setCumDividendIndicator(value);
		}
	};
	@XmlElement(name = "IntrmPrftAmt")
	protected ProfitAndLoss2Choice interimProfitAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProfitAndLoss2Choice
	 * ProfitAndLoss2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInterimProfitAmount
	 * InvestmentFundOrderExecution.mmInterimProfitAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmPrftAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimProfitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<ProfitAndLoss2Choice>> mmInterimProfitAmount = new MMMessageAttribute<RedemptionExecution16, Optional<ProfitAndLoss2Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmInterimProfitAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "IntrmPrftAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimProfitAmount";
			definition = "Part of the price deemed as accrued income or profit rather than capital. The interim profit amount is used for tax purposes.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProfitAndLoss2Choice.mmObject();
		}

		@Override
		public Optional<ProfitAndLoss2Choice> getValue(RedemptionExecution16 obj) {
			return obj.getInterimProfitAmount();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<ProfitAndLoss2Choice> value) {
			obj.setInterimProfitAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FXDtls")
	protected List<ForeignExchangeTerms33> foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms33
	 * ForeignExchangeTerms33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, List<ForeignExchangeTerms33>> mmForeignExchangeDetails = new MMMessageAssociationEnd<RedemptionExecution16, List<ForeignExchangeTerms33>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.\r\nHow the exchange rate is expressed determines which currency is the Unit Currency and Quoted Currency. If the amounts concerned are EUR 1000 and USD 1300, the exchange rate may be expressed as per either of the following examples:\r\nEXAMPLE 1 \r\nUnitCurrency EUR\r\nQuotedCurrency USD\r\nExchangeRate 1.300\r\nEXAMPLE 2\r\nUnitCurrency USD\r\nQuotedCurrency EUR\r\nExchangeRate 0.769.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms33.mmObject();
		}

		@Override
		public List<ForeignExchangeTerms33> getValue(RedemptionExecution16 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, List<ForeignExchangeTerms33> value) {
			obj.setForeignExchangeDetails(value);
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<RedemptionExecution16, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(RedemptionExecution16 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "Grp1Or2Units")
	protected UKTaxGroupUnit1Code group1Or2Units;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnit1Code
	 * UKTaxGroupUnit1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
	 * SecuritiesQuantity.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<UKTaxGroupUnit1Code>> mmGroup1Or2Units = new MMMessageAttribute<RedemptionExecution16, Optional<UKTaxGroupUnit1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmGroup1Or2Units;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "Grp1Or2Units";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UKTaxGroupUnit1Code.mmObject();
		}

		@Override
		public Optional<UKTaxGroupUnit1Code> getValue(RedemptionExecution16 obj) {
			return obj.getGroup1Or2Units();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<UKTaxGroupUnit1Code> value) {
			obj.setGroup1Or2Units(value.orElse(null));
		}
	};
	@XmlElement(name = "TxOvrhd")
	protected TotalFeesAndTaxes40 transactionOverhead;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TotalFeesAndTaxes40
	 * TotalFeesAndTaxes40}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxOvrhd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionOverhead"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees (charges/commission) and taxes that are taken into consideration for the transaction, so that the total difference between the net amount and gross amount is known, without taking into account equalisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<TotalFeesAndTaxes40>> mmTransactionOverhead = new MMMessageAssociationEnd<RedemptionExecution16, Optional<TotalFeesAndTaxes40>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "TxOvrhd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionOverhead";
			definition = "Fees (charges/commission) and taxes that are taken into consideration for the transaction, so that the total difference between the net amount and gross amount is known, without taking into account equalisation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TotalFeesAndTaxes40.mmObject();
		}

		@Override
		public Optional<TotalFeesAndTaxes40> getValue(RedemptionExecution16 obj) {
			return obj.getTransactionOverhead();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<TotalFeesAndTaxes40> value) {
			obj.setTransactionOverhead(value.orElse(null));
		}
	};
	@XmlElement(name = "InftvTaxDtls")
	protected InformativeTax1 informativeTaxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InformativeTax1
	 * InformativeTax1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax SecuritiesTax}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InftvTaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformativeTaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about tax that does not have an impact on the transaction overhead."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<InformativeTax1>> mmInformativeTaxDetails = new MMMessageAssociationEnd<RedemptionExecution16, Optional<InformativeTax1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "InftvTaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformativeTaxDetails";
			definition = "Additional information about tax that does not have an impact on the transaction overhead.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InformativeTax1.mmObject();
		}

		@Override
		public Optional<InformativeTax1> getValue(RedemptionExecution16 obj) {
			return obj.getInformativeTaxDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<InformativeTax1> value) {
			obj.setInformativeTaxDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "StffClntBrkdwn")
	protected List<InvestmentFundsOrderBreakdown2> staffClientBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
	 * InvestmentFundsOrderBreakdown2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder
	 * RedemptionOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StffClntBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StaffClientBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Breakdown of the net amount per type of order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, List<InvestmentFundsOrderBreakdown2>> mmStaffClientBreakdown = new MMMessageAssociationEnd<RedemptionExecution16, List<InvestmentFundsOrderBreakdown2>>() {
		{
			businessComponentTrace_lazy = () -> RedemptionOrder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "StffClntBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StaffClientBreakdown";
			definition = "Breakdown of the net amount per type of order.";
			maxOccurs = 4;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundsOrderBreakdown2.mmObject();
		}

		@Override
		public List<InvestmentFundsOrderBreakdown2> getValue(RedemptionExecution16 obj) {
			return obj.getStaffClientBreakdown();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, List<InvestmentFundsOrderBreakdown2> value) {
			obj.setStaffClientBreakdown(value);
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters11 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters11
	 * FundSettlementParameters11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<FundSettlementParameters11>> mmSettlementAndCustodyDetails = new MMMessageAssociationEnd<RedemptionExecution16, Optional<FundSettlementParameters11>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundSettlementParameters11.mmObject();
		}

		@Override
		public Optional<FundSettlementParameters11> getValue(RedemptionExecution16 obj) {
			return obj.getSettlementAndCustodyDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<FundSettlementParameters11> value) {
			obj.setSettlementAndCustodyDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, YesNoIndicator> mmPhysicalDeliveryIndicator = new MMMessageAttribute<RedemptionExecution16, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(RedemptionExecution16 obj) {
			return obj.getPhysicalDeliveryIndicator();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, YesNoIndicator value) {
			obj.setPhysicalDeliveryIndicator(value);
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected DeliveryParameters3 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DeliveryParameters3
	 * DeliveryParameters3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmPhysicalDelivery
	 * SecuritiesTransfer.mmPhysicalDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<DeliveryParameters3>> mmPhysicalDeliveryDetails = new MMMessageAssociationEnd<RedemptionExecution16, Optional<DeliveryParameters3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmPhysicalDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to the physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DeliveryParameters3.mmObject();
		}

		@Override
		public Optional<DeliveryParameters3> getValue(RedemptionExecution16 obj) {
			return obj.getPhysicalDeliveryDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<DeliveryParameters3> value) {
			obj.setPhysicalDeliveryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CshSttlmDtls")
	protected PaymentTransaction72 cashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction72
	 * PaymentTransaction72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment process for the transfer of cash from the debtor to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<PaymentTransaction72>> mmCashSettlementDetails = new MMMessageAssociationEnd<RedemptionExecution16, Optional<PaymentTransaction72>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment process for the transfer of cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction72.mmObject();
		}

		@Override
		public Optional<PaymentTransaction72> getValue(RedemptionExecution16 obj) {
			return obj.getCashSettlementDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<PaymentTransaction72> value) {
			obj.setCashSettlementDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
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
	public static final MMMessageAttribute<RedemptionExecution16, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<RedemptionExecution16, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(RedemptionExecution16 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlSttlmOfUnits")
	protected PercentageRate partialSettlementOfUnits;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfUnits
	 * InvestmentFundOrderExecution.mmPartialSettlementOfUnits}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfUnits"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of units partially settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<PercentageRate>> mmPartialSettlementOfUnits = new MMMessageAttribute<RedemptionExecution16, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfUnits;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfUnits";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfUnits";
			definition = "Percentage of units partially settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RedemptionExecution16 obj) {
			return obj.getPartialSettlementOfUnits();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<PercentageRate> value) {
			obj.setPartialSettlementOfUnits(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlSttlmOfCsh")
	protected PercentageRate partialSettlementOfCash;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartialSettlementOfCash
	 * InvestmentFundOrderExecution.mmPartialSettlementOfCash}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlSttlmOfCsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlementOfCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of cash partially settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<PercentageRate>> mmPartialSettlementOfCash = new MMMessageAttribute<RedemptionExecution16, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartialSettlementOfCash;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "PrtlSttlmOfCsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlementOfCash";
			definition = "Percentage of cash partially settled.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(RedemptionExecution16 obj) {
			return obj.getPartialSettlementOfCash();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<PercentageRate> value) {
			obj.setPartialSettlementOfCash(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtlRedWhldgAmt")
	protected ActiveCurrencyAndAmount partialRedemptionWithholdingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution#mmPartialRedemptionWithholdingAmount
	 * RedemptionExecution.mmPartialRedemptionWithholdingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlRedWhldgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithholdingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount retained by the fund and paid out later at a time decided by the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<ActiveCurrencyAndAmount>> mmPartialRedemptionWithholdingAmount = new MMMessageAttribute<RedemptionExecution16, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> RedemptionExecution.mmPartialRedemptionWithholdingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "PrtlRedWhldgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithholdingAmount";
			definition = "Amount retained by the fund and paid out later at a time decided by the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(RedemptionExecution16 obj) {
			return obj.getPartialRedemptionWithholdingAmount();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setPartialRedemptionWithholdingAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FinAdvc")
	protected FinancialAdvice1Code financialAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialAdvice1Code
	 * FinancialAdvice1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmFinancialAdvice
	 * InvestmentFundOrder.mmFinancialAdvice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if advice has been received from an independent financial advisor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<FinancialAdvice1Code>> mmFinancialAdvice = new MMMessageAttribute<RedemptionExecution16, Optional<FinancialAdvice1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmFinancialAdvice;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "FinAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Specifies if advice has been received from an independent financial advisor.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FinancialAdvice1Code.mmObject();
		}

		@Override
		public Optional<FinancialAdvice1Code> getValue(RedemptionExecution16 obj) {
			return obj.getFinancialAdvice();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<FinancialAdvice1Code> value) {
			obj.setFinancialAdvice(value.orElse(null));
		}
	};
	@XmlElement(name = "NgtdTrad")
	protected NegotiatedTrade1Code negotiatedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NegotiatedTrade1Code
	 * NegotiatedTrade1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNegotiatedTrade
	 * InvestmentFundOrder.mmNegotiatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NgtdTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the trade is negotiated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<NegotiatedTrade1Code>> mmNegotiatedTrade = new MMMessageAttribute<RedemptionExecution16, Optional<NegotiatedTrade1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNegotiatedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "NgtdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			definition = "Specifies whether the trade is negotiated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> NegotiatedTrade1Code.mmObject();
		}

		@Override
		public Optional<NegotiatedTrade1Code> getValue(RedemptionExecution16 obj) {
			return obj.getNegotiatedTrade();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<NegotiatedTrade1Code> value) {
			obj.setNegotiatedTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "LateRpt")
	protected LateReport1Code lateReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LateReport1Code
	 * LateReport1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmLateReport
	 * InvestmentFundOrderExecution.mmLateReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LateRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the order execution confirmation is late."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<LateReport1Code>> mmLateReport = new MMMessageAttribute<RedemptionExecution16, Optional<LateReport1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmLateReport;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "LateRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateReport";
			definition = "Specifies whether the order execution confirmation is late.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LateReport1Code.mmObject();
		}

		@Override
		public Optional<LateReport1Code> getValue(RedemptionExecution16 obj) {
			return obj.getLateReport();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<LateReport1Code> value) {
			obj.setLateReport(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdPtyDtls")
	protected List<Intermediary39> relatedPartyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary39
	 * Intermediary39}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdPtyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPartyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party related to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, List<Intermediary39>> mmRelatedPartyDetails = new MMMessageAssociationEnd<RedemptionExecution16, List<Intermediary39>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "RltdPtyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedPartyDetails";
			definition = "Party related to the transaction.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary39.mmObject();
		}

		@Override
		public List<Intermediary39> getValue(RedemptionExecution16 obj) {
			return obj.getRelatedPartyDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, List<Intermediary39> value) {
			obj.setRelatedPartyDetails(value);
		}
	};
	@XmlElement(name = "Equlstn")
	protected Equalisation1 equalisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Equalisation1
	 * Equalisation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmEqualisation
	 * InvestmentFundClass.mmEqualisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Equlstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Part of an investor's subscription amount that was held by the fund in order to pay incentive/performance fees at the end of the fiscal year, and is returned due to the redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<Equalisation1>> mmEqualisation = new MMMessageAssociationEnd<RedemptionExecution16, Optional<Equalisation1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmEqualisation;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "Equlstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equalisation";
			definition = "Part of an investor's subscription amount that was held by the fund in order to pay incentive/performance fees at the end of the fiscal year, and is returned due to the redemption.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Equalisation1.mmObject();
		}

		@Override
		public Optional<Equalisation1> getValue(RedemptionExecution16 obj) {
			return obj.getEqualisation();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<Equalisation1> value) {
			obj.setEqualisation(value.orElse(null));
		}
	};
	@XmlElement(name = "CstmrCndctClssfctn")
	protected CustomerConductClassification1Choice customerConductClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerConductClassification1Choice
	 * CustomerConductClassification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrCndctClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerConductClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Assessment of the customer’s behaviour at the time of the account opening application."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<CustomerConductClassification1Choice>> mmCustomerConductClassification = new MMMessageAttribute<RedemptionExecution16, Optional<CustomerConductClassification1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "CstmrCndctClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerConductClassification";
			definition = "Assessment of the customer’s behaviour at the time of the account opening application.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerConductClassification1Choice.mmObject();
		}

		@Override
		public Optional<CustomerConductClassification1Choice> getValue(RedemptionExecution16 obj) {
			return obj.getCustomerConductClassification();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<CustomerConductClassification1Choice> value) {
			obj.setCustomerConductClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "TxChanlTp")
	protected TransactionChannelType1Choice transactionChannelType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionChannelType1Choice
	 * TransactionChannelType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTransactionChannel
	 * AccountContract.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannelType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means by which the investor or account owner submits the open account form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<TransactionChannelType1Choice>> mmTransactionChannelType = new MMMessageAssociationEnd<RedemptionExecution16, Optional<TransactionChannelType1Choice>>() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "TxChanlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannelType";
			definition = "Means by which the investor or account owner submits the open account form.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionChannelType1Choice.mmObject();
		}

		@Override
		public Optional<TransactionChannelType1Choice> getValue(RedemptionExecution16 obj) {
			return obj.getTransactionChannelType();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<TransactionChannelType1Choice> value) {
			obj.setTransactionChannelType(value.orElse(null));
		}
	};
	@XmlElement(name = "SgntrTp")
	protected SignatureType1Choice signatureType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SignatureType1Choice
	 * SignatureType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClassProcessingCharacteristics#mmSignatureRequired
	 * InvestmentFundClassProcessingCharacteristics.mmSignatureRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of signature."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionExecution16, Optional<SignatureType1Choice>> mmSignatureType = new MMMessageAttribute<RedemptionExecution16, Optional<SignatureType1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClassProcessingCharacteristics.mmSignatureRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "SgntrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureType";
			definition = "Type of signature.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SignatureType1Choice.mmObject();
		}

		@Override
		public Optional<SignatureType1Choice> getValue(RedemptionExecution16 obj) {
			return obj.getSignatureType();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<SignatureType1Choice> value) {
			obj.setSignatureType(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrWvrDtls")
	protected OrderWaiver1 orderWaiverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OrderWaiver1
	 * OrderWaiver1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderWaiverReason
	 * InvestmentFundOrder.mmOrderWaiverReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrWvrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderWaiverDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about a non-standard order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<OrderWaiver1>> mmOrderWaiverDetails = new MMMessageAssociationEnd<RedemptionExecution16, Optional<OrderWaiver1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderWaiverReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "OrdrWvrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderWaiverDetails";
			definition = "Information about a non-standard order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrderWaiver1.mmObject();
		}

		@Override
		public Optional<OrderWaiver1> getValue(RedemptionExecution16 obj) {
			return obj.getOrderWaiverDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<OrderWaiver1> value) {
			obj.setOrderWaiverDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "GtgOrHldBckDtls")
	protected HoldBackInformation2 gatingOrHoldBackDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.HoldBackInformation2
	 * HoldBackInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16
	 * RedemptionExecution16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GtgOrHldBckDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GatingOrHoldBackDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about gating and hold back of redemption proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionExecution16, Optional<HoldBackInformation2>> mmGatingOrHoldBackDetails = new MMMessageAssociationEnd<RedemptionExecution16, Optional<HoldBackInformation2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionExecution16.mmObject();
			isDerived = false;
			xmlTag = "GtgOrHldBckDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GatingOrHoldBackDetails";
			definition = "Information about gating and hold back of redemption proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> HoldBackInformation2.mmObject();
		}

		@Override
		public Optional<HoldBackInformation2> getValue(RedemptionExecution16 obj) {
			return obj.getGatingOrHoldBackDetails();
		}

		@Override
		public void setValue(RedemptionExecution16 obj, Optional<HoldBackInformation2> value) {
			obj.setGatingOrHoldBackDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionExecution16.mmOrderReference, com.tools20022.repository.msg.RedemptionExecution16.mmClientReference,
						com.tools20022.repository.msg.RedemptionExecution16.mmDealReference, com.tools20022.repository.msg.RedemptionExecution16.mmOrderType, com.tools20022.repository.msg.RedemptionExecution16.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionExecution16.mmUnitsNumber, com.tools20022.repository.msg.RedemptionExecution16.mmRounding, com.tools20022.repository.msg.RedemptionExecution16.mmNetAmount,
						com.tools20022.repository.msg.RedemptionExecution16.mmInvestmentAccountDetails, com.tools20022.repository.msg.RedemptionExecution16.mmHoldingsRedemptionRate,
						com.tools20022.repository.msg.RedemptionExecution16.mmGrossAmount, com.tools20022.repository.msg.RedemptionExecution16.mmTradeDateTime, com.tools20022.repository.msg.RedemptionExecution16.mmSettlementAmount,
						com.tools20022.repository.msg.RedemptionExecution16.mmCashSettlementDate, com.tools20022.repository.msg.RedemptionExecution16.mmSettlementMethod,
						com.tools20022.repository.msg.RedemptionExecution16.mmDealingPriceDetails, com.tools20022.repository.msg.RedemptionExecution16.mmInformativePriceDetails,
						com.tools20022.repository.msg.RedemptionExecution16.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.RedemptionExecution16.mmBestExecution,
						com.tools20022.repository.msg.RedemptionExecution16.mmCumDividendIndicator, com.tools20022.repository.msg.RedemptionExecution16.mmInterimProfitAmount,
						com.tools20022.repository.msg.RedemptionExecution16.mmForeignExchangeDetails, com.tools20022.repository.msg.RedemptionExecution16.mmIncomePreference,
						com.tools20022.repository.msg.RedemptionExecution16.mmGroup1Or2Units, com.tools20022.repository.msg.RedemptionExecution16.mmTransactionOverhead,
						com.tools20022.repository.msg.RedemptionExecution16.mmInformativeTaxDetails, com.tools20022.repository.msg.RedemptionExecution16.mmStaffClientBreakdown,
						com.tools20022.repository.msg.RedemptionExecution16.mmSettlementAndCustodyDetails, com.tools20022.repository.msg.RedemptionExecution16.mmPhysicalDeliveryIndicator,
						com.tools20022.repository.msg.RedemptionExecution16.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.RedemptionExecution16.mmCashSettlementDetails,
						com.tools20022.repository.msg.RedemptionExecution16.mmNonStandardSettlementInformation, com.tools20022.repository.msg.RedemptionExecution16.mmPartialSettlementOfUnits,
						com.tools20022.repository.msg.RedemptionExecution16.mmPartialSettlementOfCash, com.tools20022.repository.msg.RedemptionExecution16.mmPartialRedemptionWithholdingAmount,
						com.tools20022.repository.msg.RedemptionExecution16.mmFinancialAdvice, com.tools20022.repository.msg.RedemptionExecution16.mmNegotiatedTrade, com.tools20022.repository.msg.RedemptionExecution16.mmLateReport,
						com.tools20022.repository.msg.RedemptionExecution16.mmRelatedPartyDetails, com.tools20022.repository.msg.RedemptionExecution16.mmEqualisation,
						com.tools20022.repository.msg.RedemptionExecution16.mmCustomerConductClassification, com.tools20022.repository.msg.RedemptionExecution16.mmTransactionChannelType,
						com.tools20022.repository.msg.RedemptionExecution16.mmSignatureType, com.tools20022.repository.msg.RedemptionExecution16.mmOrderWaiverDetails,
						com.tools20022.repository.msg.RedemptionExecution16.mmGatingOrHoldBackDetails);
				trace_lazy = () -> RedemptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionExecution16,
						com.tools20022.repository.constraints.ConstraintPriceDifferenceReasonRule.forRedemptionExecution16, com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails1Rule.forRedemptionExecution16,
						com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetails2Rule.forRedemptionExecution16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionExecution16";
				definition = "Execution of a redemption order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public RedemptionExecution16 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public RedemptionExecution16 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Max35Text getDealReference() {
		return dealReference;
	}

	public RedemptionExecution16 setDealReference(Max35Text dealReference) {
		this.dealReference = Objects.requireNonNull(dealReference);
		return this;
	}

	public List<FundOrderType4Choice> getOrderType() {
		return orderType == null ? orderType = new ArrayList<>() : orderType;
	}

	public RedemptionExecution16 setOrderType(List<FundOrderType4Choice> orderType) {
		this.orderType = Objects.requireNonNull(orderType);
		return this;
	}

	public List<IndividualPerson32> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? beneficiaryDetails = new ArrayList<>() : beneficiaryDetails;
	}

	public RedemptionExecution16 setBeneficiaryDetails(List<IndividualPerson32> beneficiaryDetails) {
		this.beneficiaryDetails = Objects.requireNonNull(beneficiaryDetails);
		return this;
	}

	public DecimalNumber getUnitsNumber() {
		return unitsNumber;
	}

	public RedemptionExecution16 setUnitsNumber(DecimalNumber unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public RedemptionExecution16 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public RedemptionExecution16 setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public InvestmentAccount58 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public RedemptionExecution16 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public Optional<PercentageRate> getHoldingsRedemptionRate() {
		return holdingsRedemptionRate == null ? Optional.empty() : Optional.of(holdingsRedemptionRate);
	}

	public RedemptionExecution16 setHoldingsRedemptionRate(PercentageRate holdingsRedemptionRate) {
		this.holdingsRedemptionRate = holdingsRedemptionRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public RedemptionExecution16 setGrossAmount(ActiveCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public RedemptionExecution16 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public ActiveCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public RedemptionExecution16 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = Objects.requireNonNull(settlementAmount);
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public RedemptionExecution16 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<DeliveryReceiptType2Code> getSettlementMethod() {
		return settlementMethod == null ? Optional.empty() : Optional.of(settlementMethod);
	}

	public RedemptionExecution16 setSettlementMethod(DeliveryReceiptType2Code settlementMethod) {
		this.settlementMethod = settlementMethod;
		return this;
	}

	public UnitPrice22 getDealingPriceDetails() {
		return dealingPriceDetails;
	}

	public RedemptionExecution16 setDealingPriceDetails(UnitPrice22 dealingPriceDetails) {
		this.dealingPriceDetails = Objects.requireNonNull(dealingPriceDetails);
		return this;
	}

	public List<UnitPrice22> getInformativePriceDetails() {
		return informativePriceDetails == null ? informativePriceDetails = new ArrayList<>() : informativePriceDetails;
	}

	public RedemptionExecution16 setInformativePriceDetails(List<UnitPrice22> informativePriceDetails) {
		this.informativePriceDetails = Objects.requireNonNull(informativePriceDetails);
		return this;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public RedemptionExecution16 setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = Objects.requireNonNull(partiallyExecutedIndicator);
		return this;
	}

	public Optional<BestExecution1Code> getBestExecution() {
		return bestExecution == null ? Optional.empty() : Optional.of(bestExecution);
	}

	public RedemptionExecution16 setBestExecution(BestExecution1Code bestExecution) {
		this.bestExecution = bestExecution;
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public RedemptionExecution16 setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public Optional<ProfitAndLoss2Choice> getInterimProfitAmount() {
		return interimProfitAmount == null ? Optional.empty() : Optional.of(interimProfitAmount);
	}

	public RedemptionExecution16 setInterimProfitAmount(ProfitAndLoss2Choice interimProfitAmount) {
		this.interimProfitAmount = interimProfitAmount;
		return this;
	}

	public List<ForeignExchangeTerms33> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? foreignExchangeDetails = new ArrayList<>() : foreignExchangeDetails;
	}

	public RedemptionExecution16 setForeignExchangeDetails(List<ForeignExchangeTerms33> foreignExchangeDetails) {
		this.foreignExchangeDetails = Objects.requireNonNull(foreignExchangeDetails);
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public RedemptionExecution16 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<UKTaxGroupUnit1Code> getGroup1Or2Units() {
		return group1Or2Units == null ? Optional.empty() : Optional.of(group1Or2Units);
	}

	public RedemptionExecution16 setGroup1Or2Units(UKTaxGroupUnit1Code group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
		return this;
	}

	public Optional<TotalFeesAndTaxes40> getTransactionOverhead() {
		return transactionOverhead == null ? Optional.empty() : Optional.of(transactionOverhead);
	}

	public RedemptionExecution16 setTransactionOverhead(TotalFeesAndTaxes40 transactionOverhead) {
		this.transactionOverhead = transactionOverhead;
		return this;
	}

	public Optional<InformativeTax1> getInformativeTaxDetails() {
		return informativeTaxDetails == null ? Optional.empty() : Optional.of(informativeTaxDetails);
	}

	public RedemptionExecution16 setInformativeTaxDetails(InformativeTax1 informativeTaxDetails) {
		this.informativeTaxDetails = informativeTaxDetails;
		return this;
	}

	public List<InvestmentFundsOrderBreakdown2> getStaffClientBreakdown() {
		return staffClientBreakdown == null ? staffClientBreakdown = new ArrayList<>() : staffClientBreakdown;
	}

	public RedemptionExecution16 setStaffClientBreakdown(List<InvestmentFundsOrderBreakdown2> staffClientBreakdown) {
		this.staffClientBreakdown = Objects.requireNonNull(staffClientBreakdown);
		return this;
	}

	public Optional<FundSettlementParameters11> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public RedemptionExecution16 setSettlementAndCustodyDetails(FundSettlementParameters11 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public RedemptionExecution16 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<DeliveryParameters3> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public RedemptionExecution16 setPhysicalDeliveryDetails(DeliveryParameters3 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<PaymentTransaction72> getCashSettlementDetails() {
		return cashSettlementDetails == null ? Optional.empty() : Optional.of(cashSettlementDetails);
	}

	public RedemptionExecution16 setCashSettlementDetails(PaymentTransaction72 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public RedemptionExecution16 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public Optional<PercentageRate> getPartialSettlementOfUnits() {
		return partialSettlementOfUnits == null ? Optional.empty() : Optional.of(partialSettlementOfUnits);
	}

	public RedemptionExecution16 setPartialSettlementOfUnits(PercentageRate partialSettlementOfUnits) {
		this.partialSettlementOfUnits = partialSettlementOfUnits;
		return this;
	}

	public Optional<PercentageRate> getPartialSettlementOfCash() {
		return partialSettlementOfCash == null ? Optional.empty() : Optional.of(partialSettlementOfCash);
	}

	public RedemptionExecution16 setPartialSettlementOfCash(PercentageRate partialSettlementOfCash) {
		this.partialSettlementOfCash = partialSettlementOfCash;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getPartialRedemptionWithholdingAmount() {
		return partialRedemptionWithholdingAmount == null ? Optional.empty() : Optional.of(partialRedemptionWithholdingAmount);
	}

	public RedemptionExecution16 setPartialRedemptionWithholdingAmount(ActiveCurrencyAndAmount partialRedemptionWithholdingAmount) {
		this.partialRedemptionWithholdingAmount = partialRedemptionWithholdingAmount;
		return this;
	}

	public Optional<FinancialAdvice1Code> getFinancialAdvice() {
		return financialAdvice == null ? Optional.empty() : Optional.of(financialAdvice);
	}

	public RedemptionExecution16 setFinancialAdvice(FinancialAdvice1Code financialAdvice) {
		this.financialAdvice = financialAdvice;
		return this;
	}

	public Optional<NegotiatedTrade1Code> getNegotiatedTrade() {
		return negotiatedTrade == null ? Optional.empty() : Optional.of(negotiatedTrade);
	}

	public RedemptionExecution16 setNegotiatedTrade(NegotiatedTrade1Code negotiatedTrade) {
		this.negotiatedTrade = negotiatedTrade;
		return this;
	}

	public Optional<LateReport1Code> getLateReport() {
		return lateReport == null ? Optional.empty() : Optional.of(lateReport);
	}

	public RedemptionExecution16 setLateReport(LateReport1Code lateReport) {
		this.lateReport = lateReport;
		return this;
	}

	public List<Intermediary39> getRelatedPartyDetails() {
		return relatedPartyDetails == null ? relatedPartyDetails = new ArrayList<>() : relatedPartyDetails;
	}

	public RedemptionExecution16 setRelatedPartyDetails(List<Intermediary39> relatedPartyDetails) {
		this.relatedPartyDetails = Objects.requireNonNull(relatedPartyDetails);
		return this;
	}

	public Optional<Equalisation1> getEqualisation() {
		return equalisation == null ? Optional.empty() : Optional.of(equalisation);
	}

	public RedemptionExecution16 setEqualisation(Equalisation1 equalisation) {
		this.equalisation = equalisation;
		return this;
	}

	public Optional<CustomerConductClassification1Choice> getCustomerConductClassification() {
		return customerConductClassification == null ? Optional.empty() : Optional.of(customerConductClassification);
	}

	public RedemptionExecution16 setCustomerConductClassification(CustomerConductClassification1Choice customerConductClassification) {
		this.customerConductClassification = customerConductClassification;
		return this;
	}

	public Optional<TransactionChannelType1Choice> getTransactionChannelType() {
		return transactionChannelType == null ? Optional.empty() : Optional.of(transactionChannelType);
	}

	public RedemptionExecution16 setTransactionChannelType(TransactionChannelType1Choice transactionChannelType) {
		this.transactionChannelType = transactionChannelType;
		return this;
	}

	public Optional<SignatureType1Choice> getSignatureType() {
		return signatureType == null ? Optional.empty() : Optional.of(signatureType);
	}

	public RedemptionExecution16 setSignatureType(SignatureType1Choice signatureType) {
		this.signatureType = signatureType;
		return this;
	}

	public Optional<OrderWaiver1> getOrderWaiverDetails() {
		return orderWaiverDetails == null ? Optional.empty() : Optional.of(orderWaiverDetails);
	}

	public RedemptionExecution16 setOrderWaiverDetails(OrderWaiver1 orderWaiverDetails) {
		this.orderWaiverDetails = orderWaiverDetails;
		return this;
	}

	public Optional<HoldBackInformation2> getGatingOrHoldBackDetails() {
		return gatingOrHoldBackDetails == null ? Optional.empty() : Optional.of(gatingOrHoldBackDetails);
	}

	public RedemptionExecution16 setGatingOrHoldBackDetails(HoldBackInformation2 gatingOrHoldBackDetails) {
		this.gatingOrHoldBackDetails = gatingOrHoldBackDetails;
		return this;
	}
}