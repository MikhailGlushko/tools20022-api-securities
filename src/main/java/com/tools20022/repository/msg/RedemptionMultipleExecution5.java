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
import com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04;
import com.tools20022.repository.choice.CancellationRight1Choice;
import com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.IndividualPerson32;
import com.tools20022.repository.msg.InvestmentAccount58;
import com.tools20022.repository.msg.PaymentTransaction72;
import com.tools20022.repository.msg.RedemptionExecution15;
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
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmAmendmentIndicator
 * RedemptionMultipleExecution5.mmAmendmentIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmMasterReference
 * RedemptionMultipleExecution5.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmPlaceOfTrade
 * RedemptionMultipleExecution5.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmOrderDateTime
 * RedemptionMultipleExecution5.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmReceivedDateTime
 * RedemptionMultipleExecution5.mmReceivedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmRequestedFutureTradeDate
 * RedemptionMultipleExecution5.mmRequestedFutureTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmCancellationRight
 * RedemptionMultipleExecution5.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmInvestmentAccountDetails
 * RedemptionMultipleExecution5.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmBeneficiaryDetails
 * RedemptionMultipleExecution5.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmIndividualExecutionDetails
 * RedemptionMultipleExecution5.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmTotalSettlementAmount
 * RedemptionMultipleExecution5.mmTotalSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmBulkCashSettlementDetails
 * RedemptionMultipleExecution5.mmBulkCashSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmMultipleExecutionDetails
 * RedemptionOrderConfirmationV04.mmMultipleExecutionDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule#forRedemptionMultipleExecution5
 * ConstraintBulkCashSettlementDetailsRule.forRedemptionMultipleExecution5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule#forRedemptionMultipleExecution5
 * ConstraintSettlementCurrencyRule.forRedemptionMultipleExecution5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleExecution5
 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalSettlementCurrencyRule#forRedemptionMultipleExecution5
 * ConstraintTotalSettlementCurrencyRule.forRedemptionMultipleExecution5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionMultipleExecution5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionMultipleExecution5", propOrder = {"amendmentIndicator", "masterReference", "placeOfTrade", "orderDateTime", "receivedDateTime", "requestedFutureTradeDate", "cancellationRight", "investmentAccountDetails",
		"beneficiaryDetails", "individualExecutionDetails", "totalSettlementAmount", "bulkCashSettlementDetails"})
public class RedemptionMultipleExecution5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmdmntInd")
	protected YesNoIndicator amendmentIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the confirmation is an amendment of a previous confirmation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<YesNoIndicator>> mmAmendmentIndicator = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "AmdmntInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIndicator";
			definition = "Indicates whether the confirmation is an amendment of a previous confirmation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getAmendmentIndicator();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<YesNoIndicator> value) {
			obj.setAmendmentIndicator(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
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
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<Max35Text>> mmMasterReference = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getMasterReference();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<Max35Text> value) {
			obj.setMasterReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected PlaceOfTradeIdentification1Choice placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice
	 * PlaceOfTradeIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market in which the advised trade transaction was executed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<PlaceOfTradeIdentification1Choice>> mmPlaceOfTrade = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<PlaceOfTradeIdentification1Choice>>() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which the advised trade transaction was executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlaceOfTradeIdentification1Choice.mmObject();
		}

		@Override
		public Optional<PlaceOfTradeIdentification1Choice> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<PlaceOfTradeIdentification1Choice> value) {
			obj.setPlaceOfTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor or its agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<ISODateTime>> mmOrderDateTime = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor or its agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getOrderDateTime();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<ISODateTime> value) {
			obj.setOrderDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvdDtTm")
	protected ISODateTime receivedDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvdDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time the order was received by the executing party, for example, the transfer agent."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<ISODateTime>> mmReceivedDateTime = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "RcvdDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivedDateTime";
			definition = "Date and time the order was received by the executing party, for example, the transfer agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getReceivedDateTime();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<ISODateTime> value) {
			obj.setReceivedDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdFutrTradDt")
	protected ISODate requestedFutureTradeDate;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
	 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdFutrTradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedFutureTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<ISODate>> mmRequestedFutureTradeDate = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedExecutionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "ReqdFutrTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedFutureTradeDate";
			definition = "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getRequestedFutureTradeDate();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<ISODate> value) {
			obj.setRequestedFutureTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRght")
	protected CancellationRight1Choice cancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationRight1Choice
	 * CancellationRight1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
	 * InvestmentFundOrder.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of the investor with respect to the investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<CancellationRight1Choice>> mmCancellationRight = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<CancellationRight1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmCancellationRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "CxlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of the investor with respect to the investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CancellationRight1Choice.mmObject();
		}

		@Override
		public Optional<CancellationRight1Choice> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getCancellationRight();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<CancellationRight1Choice> value) {
			obj.setCancellationRight(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
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
	public static final MMMessageAssociationEnd<RedemptionMultipleExecution5, InvestmentAccount58> mmInvestmentAccountDetails = new MMMessageAssociationEnd<RedemptionMultipleExecution5, InvestmentAccount58>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
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
		public InvestmentAccount58 getValue(RedemptionMultipleExecution5 obj) {
			return obj.getInvestmentAccountDetails();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, InvestmentAccount58 value) {
			obj.setInvestmentAccountDetails(value);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
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
	public static final MMMessageAssociationEnd<RedemptionMultipleExecution5, List<IndividualPerson32>> mmBeneficiaryDetails = new MMMessageAssociationEnd<RedemptionMultipleExecution5, List<IndividualPerson32>>() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
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
		public List<IndividualPerson32> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getBeneficiaryDetails();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, List<IndividualPerson32> value) {
			obj.setBeneficiaryDetails(value);
		}
	};
	@XmlElement(name = "IndvExctnDtls", required = true)
	protected List<RedemptionExecution15> individualExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RedemptionExecution15
	 * RedemptionExecution15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of a redemption order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleExecution5, List<RedemptionExecution15>> mmIndividualExecutionDetails = new MMMessageAssociationEnd<RedemptionMultipleExecution5, List<RedemptionExecution15>>() {
		{
			businessComponentTrace_lazy = () -> RedemptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "IndvExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualExecutionDetails";
			definition = "Execution of a redemption order.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RedemptionExecution15.mmObject();
		}

		@Override
		public List<RedemptionExecution15> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getIndividualExecutionDetails();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, List<RedemptionExecution15> value) {
			obj.setIndividualExecutionDetails(value);
		}
	};
	@XmlElement(name = "TtlSttlmAmt")
	protected ActiveCurrencyAndAmount totalSettlementAmount;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RedemptionMultipleExecution5, Optional<ActiveCurrencyAndAmount>> mmTotalSettlementAmount = new MMMessageAttribute<RedemptionMultipleExecution5, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "TtlSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getTotalSettlementAmount();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setTotalSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "BlkCshSttlmDtls")
	protected PaymentTransaction72 bulkCashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction72
	 * PaymentTransaction72}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
	 * RedemptionMultipleExecution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlkCshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment process for the transfer of cash from the debtor to the creditor."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RedemptionMultipleExecution5, Optional<PaymentTransaction72>> mmBulkCashSettlementDetails = new MMMessageAssociationEnd<RedemptionMultipleExecution5, Optional<PaymentTransaction72>>() {
		{
			businessComponentTrace_lazy = () -> BulkPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution5.mmObject();
			isDerived = false;
			xmlTag = "BlkCshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails";
			definition = "Payment process for the transfer of cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentTransaction72.mmObject();
		}

		@Override
		public Optional<PaymentTransaction72> getValue(RedemptionMultipleExecution5 obj) {
			return obj.getBulkCashSettlementDetails();
		}

		@Override
		public void setValue(RedemptionMultipleExecution5 obj, Optional<PaymentTransaction72> value) {
			obj.setBulkCashSettlementDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleExecution5.mmAmendmentIndicator, com.tools20022.repository.msg.RedemptionMultipleExecution5.mmMasterReference,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.mmPlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleExecution5.mmOrderDateTime,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.mmReceivedDateTime, com.tools20022.repository.msg.RedemptionMultipleExecution5.mmRequestedFutureTradeDate,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.mmCancellationRight, com.tools20022.repository.msg.RedemptionMultipleExecution5.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.mmBeneficiaryDetails, com.tools20022.repository.msg.RedemptionMultipleExecution5.mmIndividualExecutionDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution5.mmTotalSettlementAmount, com.tools20022.repository.msg.RedemptionMultipleExecution5.mmBulkCashSettlementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionOrderConfirmationV04.mmMultipleExecutionDetails);
				trace_lazy = () -> RedemptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetailsRule.forRedemptionMultipleExecution5,
						com.tools20022.repository.constraints.ConstraintSettlementCurrencyRule.forRedemptionMultipleExecution5,
						com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution5,
						com.tools20022.repository.constraints.ConstraintTotalSettlementCurrencyRule.forRedemptionMultipleExecution5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RedemptionMultipleExecution5";
				definition = "Execution of a redemption order.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<YesNoIndicator> getAmendmentIndicator() {
		return amendmentIndicator == null ? Optional.empty() : Optional.of(amendmentIndicator);
	}

	public RedemptionMultipleExecution5 setAmendmentIndicator(YesNoIndicator amendmentIndicator) {
		this.amendmentIndicator = amendmentIndicator;
		return this;
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public RedemptionMultipleExecution5 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<PlaceOfTradeIdentification1Choice> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public RedemptionMultipleExecution5 setPlaceOfTrade(PlaceOfTradeIdentification1Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public RedemptionMultipleExecution5 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public Optional<ISODateTime> getReceivedDateTime() {
		return receivedDateTime == null ? Optional.empty() : Optional.of(receivedDateTime);
	}

	public RedemptionMultipleExecution5 setReceivedDateTime(ISODateTime receivedDateTime) {
		this.receivedDateTime = receivedDateTime;
		return this;
	}

	public Optional<ISODate> getRequestedFutureTradeDate() {
		return requestedFutureTradeDate == null ? Optional.empty() : Optional.of(requestedFutureTradeDate);
	}

	public RedemptionMultipleExecution5 setRequestedFutureTradeDate(ISODate requestedFutureTradeDate) {
		this.requestedFutureTradeDate = requestedFutureTradeDate;
		return this;
	}

	public Optional<CancellationRight1Choice> getCancellationRight() {
		return cancellationRight == null ? Optional.empty() : Optional.of(cancellationRight);
	}

	public RedemptionMultipleExecution5 setCancellationRight(CancellationRight1Choice cancellationRight) {
		this.cancellationRight = cancellationRight;
		return this;
	}

	public InvestmentAccount58 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public RedemptionMultipleExecution5 setInvestmentAccountDetails(InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public List<IndividualPerson32> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? beneficiaryDetails = new ArrayList<>() : beneficiaryDetails;
	}

	public RedemptionMultipleExecution5 setBeneficiaryDetails(List<IndividualPerson32> beneficiaryDetails) {
		this.beneficiaryDetails = Objects.requireNonNull(beneficiaryDetails);
		return this;
	}

	public List<RedemptionExecution15> getIndividualExecutionDetails() {
		return individualExecutionDetails == null ? individualExecutionDetails = new ArrayList<>() : individualExecutionDetails;
	}

	public RedemptionMultipleExecution5 setIndividualExecutionDetails(List<RedemptionExecution15> individualExecutionDetails) {
		this.individualExecutionDetails = Objects.requireNonNull(individualExecutionDetails);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalSettlementAmount() {
		return totalSettlementAmount == null ? Optional.empty() : Optional.of(totalSettlementAmount);
	}

	public RedemptionMultipleExecution5 setTotalSettlementAmount(ActiveCurrencyAndAmount totalSettlementAmount) {
		this.totalSettlementAmount = totalSettlementAmount;
		return this;
	}

	public Optional<PaymentTransaction72> getBulkCashSettlementDetails() {
		return bulkCashSettlementDetails == null ? Optional.empty() : Optional.of(bulkCashSettlementDetails);
	}

	public RedemptionMultipleExecution5 setBulkCashSettlementDetails(PaymentTransaction72 bulkCashSettlementDetails) {
		this.bulkCashSettlementDetails = bulkCashSettlementDetails;
		return this;
	}
}