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
import com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03;
import com.tools20022.repository.area.secl.TradeLegNotificationV03;
import com.tools20022.repository.choice.DateFormat15Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the trade leg details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeLegIdentification
 * TradeLeg8.mmTradeLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeIdentification
 * TradeLeg8.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeExecutionIdentification
 * TradeLeg8.mmTradeExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmOrderIdentification
 * TradeLeg8.mmOrderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAllocationIdentification
 * TradeLeg8.mmAllocationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmStatus
 * TradeLeg8.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeDate
 * TradeLeg8.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTransactionDateTime
 * TradeLeg8.mmTransactionDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSettlementDate
 * TradeLeg8.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmFinancialInstrumentIdentification
 * TradeLeg8.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCurrency
 * TradeLeg8.mmTradingCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmBuySellIndicator
 * TradeLeg8.mmBuySellIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeQuantity
 * TradeLeg8.mmTradeQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmDealPrice
 * TradeLeg8.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmGrossAmount
 * TradeLeg8.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAccruedInterestAmount
 * TradeLeg8.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfTrade
 * TradeLeg8.mmPlaceOfTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmPlaceOfListing
 * TradeLeg8.mmPlaceOfListing}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeType
 * TradeLeg8.mmTradeType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmDerivativeRelatedTrade
 * TradeLeg8.mmDerivativeRelatedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmBroker
 * TradeLeg8.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingParty
 * TradeLeg8.mmTradingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradeRegistrationOrigin
 * TradeLeg8.mmTradeRegistrationOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingPartyAccount
 * TradeLeg8.mmTradingPartyAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradingCapacity
 * TradeLeg8.mmTradingCapacity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmTradePostingCode
 * TradeLeg8.mmTradePostingCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingPlace
 * TradeLeg8.mmSafekeepingPlace}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmSafekeepingAccount
 * TradeLeg8.mmSafekeepingAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmTradeLegDetails
 * TradeLegNotificationV03.mmTradeLegDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmTradeLegDetails
 * TradeLegNotificationCancellationV03.mmTradeLegDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeLeg8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the trade leg details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeLeg8", propOrder = {"tradeLegIdentification", "tradeIdentification", "tradeExecutionIdentification", "orderIdentification", "allocationIdentification", "status", "tradeDate", "transactionDateTime", "settlementDate",
		"financialInstrumentIdentification", "tradingCurrency", "buySellIndicator", "tradeQuantity", "dealPrice", "grossAmount", "accruedInterestAmount", "placeOfTrade", "placeOfListing", "tradeType", "derivativeRelatedTrade", "broker",
		"tradingParty", "tradeRegistrationOrigin", "tradingPartyAccount", "tradingCapacity", "tradePostingCode", "safekeepingPlace", "safekeepingAccount"})
public class TradeLeg8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradLegId", required = true)
	protected Max35Text tradeLegIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction (that is the trade leg) as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Max35Text> mmTradeLegIdentification = new MMMessageAttribute<TradeLeg8, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradLegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeLegIdentification";
			definition = "Unambiguous identification of the transaction (that is the trade leg) as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeLeg8 obj) {
			return obj.getTradeLegIdentification();
		}

		@Override
		public void setValue(TradeLeg8 obj, Max35Text value) {
			obj.setTradeLegIdentification(value);
		}
	};
	@XmlElement(name = "TradId")
	protected Max35Text tradeIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference allocated by the broker dealer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<Max35Text>> mmTradeIdentification = new MMMessageAttribute<TradeLeg8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference allocated by the broker dealer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeLeg8 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<Max35Text> value) {
			obj.setTradeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradExctnId", required = true)
	protected Max35Text tradeExecutionIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradExctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference assigned by the trading venue when the trade is executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Max35Text> mmTradeExecutionIdentification = new MMMessageAttribute<TradeLeg8, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradExctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeExecutionIdentification";
			definition = "Unique reference assigned by the trading venue when the trade is executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeLeg8 obj) {
			return obj.getTradeExecutionIdentification();
		}

		@Override
		public void setValue(TradeLeg8 obj, Max35Text value) {
			obj.setTradeExecutionIdentification(value);
		}
	};
	@XmlElement(name = "OrdrId")
	protected Max35Text orderIdentification;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the order sent by the final investor to an intermediary in order to initiate a trade in the former's name. This identification is then matched with the equivalent trade by the clearing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<Max35Text>> mmOrderIdentification = new MMMessageAttribute<TradeLeg8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "OrdrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderIdentification";
			definition = "Identifies the order sent by the final investor to an intermediary in order to initiate a trade in the former's name. This identification is then matched with the equivalent trade by the clearing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeLeg8 obj) {
			return obj.getOrderIdentification();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<Max35Text> value) {
			obj.setOrderIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "AllcnId")
	protected Max35Text allocationIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
	 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the portion of assets within a determined trade that shall be allocated to different clients."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<Max35Text>> mmAllocationIdentification = new MMMessageAttribute<TradeLeg8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "AllcnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIdentification";
			definition = "Identifies the portion of assets within a determined trade that shall be allocated to different clients.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeLeg8 obj) {
			return obj.getAllocationIdentification();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<Max35Text> value) {
			obj.setAllocationIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts")
	protected Status5Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status5Code
	 * Status5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of the trade leg."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<Status5Code>> mmStatus = new MMMessageAttribute<TradeLeg8, Optional<Status5Code>>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status of the trade leg.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Status5Code.mmObject();
		}

		@Override
		public Optional<Status5Code> getValue(TradeLeg8 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<Status5Code> value) {
			obj.setStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "TradDt", required = true)
	protected ISODateTime tradeDate;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the date and time of trade transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, ISODateTime> mmTradeDate = new MMMessageAttribute<TradeLeg8, ISODateTime>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Provides the date and time of trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(TradeLeg8 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(TradeLeg8 obj, ISODateTime value) {
			obj.setTradeDate(value);
		}
	};
	@XmlElement(name = "TxDtTm")
	protected ISODateTime transactionDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time used to determine the price applicable to a trade. If the trade is registered \"after market\" hours, the trading price will the price of the day but the actual trade date will be the next working day."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<ISODateTime>> mmTransactionDateTime = new MMMessageAttribute<TradeLeg8, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TxDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDateTime";
			definition = "Date and time used to determine the price applicable to a trade. If the trade is registered \"after market\" hours, the trading price will the price of the day but the actual trade date will be the next working day.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeLeg8 obj) {
			return obj.getTransactionDateTime();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<ISODateTime> value) {
			obj.setTransactionDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt")
	protected DateFormat15Choice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat15Choice
	 * DateFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the contractual settlement date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<DateFormat15Choice>> mmSettlementDate = new MMMessageAttribute<TradeLeg8, Optional<DateFormat15Choice>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Provides the contractual settlement date.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateFormat15Choice.mmObject();
		}

		@Override
		public Optional<DateFormat15Choice> getValue(TradeLeg8 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<DateFormat15Choice> value) {
			obj.setSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the security identification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<TradeLeg8, SecurityIdentification14>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(TradeLeg8 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(TradeLeg8 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "TradgCcy")
	protected CurrencyCode tradingCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket#mmTradingCurrency
	 * TradingMarket.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the ISO code of the trade currency."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<CurrencyCode>> mmTradingCurrency = new MMMessageAttribute<TradeLeg8, Optional<CurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> TradingMarket.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCurrency";
			definition = "Specifies the ISO code of the trade currency.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public Optional<CurrencyCode> getValue(TradeLeg8 obj) {
			return obj.getTradingCurrency();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<CurrencyCode> value) {
			obj.setTradingCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "BuySellInd", required = true)
	protected Side1Code buySellIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Side1Code
	 * Side1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmSide
	 * SecuritiesOrder.mmSide}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuySellInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the trade leg indicator which gives the trade side (buy or sell)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Side1Code> mmBuySellIndicator = new MMMessageAttribute<TradeLeg8, Side1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmSide;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "BuySellInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellIndicator";
			definition = "Identifies the trade leg indicator which gives the trade side (buy or sell).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Side1Code.mmObject();
		}

		@Override
		public Side1Code getValue(TradeLeg8 obj) {
			return obj.getBuySellIndicator();
		}

		@Override
		public void setValue(TradeLeg8 obj, Side1Code value) {
			obj.setBuySellIndicator(value);
		}
	};
	@XmlElement(name = "TradQty", required = true)
	protected FinancialInstrumentQuantity1Choice tradeQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradeQuantity
	 * SecuritiesTrade.mmTradeQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the quantity of the trade leg."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, FinancialInstrumentQuantity1Choice> mmTradeQuantity = new MMMessageAssociationEnd<TradeLeg8, FinancialInstrumentQuantity1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTradeQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeQuantity";
			definition = "Identifies the quantity of the trade leg.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(TradeLeg8 obj) {
			return obj.getTradeQuantity();
		}

		@Override
		public void setValue(TradeLeg8 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setTradeQuantity(value);
		}
	};
	@XmlElement(name = "DealPric", required = true)
	protected Price4 dealPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the price of the traded financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Price4> mmDealPrice = new MMMessageAssociationEnd<TradeLeg8, Price4>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmDealPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "DealPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Specifies the price of the traded financial instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Price4.mmObject();
		}

		@Override
		public Price4 getValue(TradeLeg8 obj) {
			return obj.getDealPrice();
		}

		@Override
		public void setValue(TradeLeg8 obj, Price4 value) {
			obj.setDealPrice(value);
		}
	};
	@XmlElement(name = "GrssAmt")
	protected AmountAndDirection21 grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
	 * SecuritiesOrder.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
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
	 * "Principal amount of a trade (price multiplied by quantity)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Optional<AmountAndDirection21>> mmGrossAmount = new MMMessageAssociationEnd<TradeLeg8, Optional<AmountAndDirection21>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Principal amount of a trade (price multiplied by quantity).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection21.mmObject();
		}

		@Override
		public Optional<AmountAndDirection21> getValue(TradeLeg8 obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<AmountAndDirection21> value) {
			obj.setGrossAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection21 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection21
	 * AmountAndDirection21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Optional<AmountAndDirection21>> mmAccruedInterestAmount = new MMMessageAssociationEnd<TradeLeg8, Optional<AmountAndDirection21>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest that has accumulated on a bond since the last interest payment up to, but not including, the settlement date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection21.mmObject();
		}

		@Override
		public Optional<AmountAndDirection21> getValue(TradeLeg8 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<AmountAndDirection21> value) {
			obj.setAccruedInterestAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PlcOfTrad", required = true)
	protected MarketIdentification84 placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification84
	 * MarketIdentification84}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
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
	 * definition} = "Place at which the security is traded."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, MarketIdentification84> mmPlaceOfTrade = new MMMessageAssociationEnd<TradeLeg8, MarketIdentification84>() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Place at which the security is traded.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MarketIdentification84.mmObject();
		}

		@Override
		public MarketIdentification84 getValue(TradeLeg8 obj) {
			return obj.getPlaceOfTrade();
		}

		@Override
		public void setValue(TradeLeg8 obj, MarketIdentification84 value) {
			obj.setPlaceOfTrade(value);
		}
	};
	@XmlElement(name = "PlcOfListg")
	protected MarketIdentification85 placeOfListing;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification85
	 * MarketIdentification85}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPlaceOfListing
	 * Security.mmPlaceOfListing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfListg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place at which the security is listed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Optional<MarketIdentification85>> mmPlaceOfListing = new MMMessageAssociationEnd<TradeLeg8, Optional<MarketIdentification85>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPlaceOfListing;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "PlcOfListg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Place at which the security is listed.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification85.mmObject();
		}

		@Override
		public Optional<MarketIdentification85> getValue(TradeLeg8 obj) {
			return obj.getPlaceOfListing();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<MarketIdentification85> value) {
			obj.setPlaceOfListing(value.orElse(null));
		}
	};
	@XmlElement(name = "TradTp", required = true)
	protected TradeType1Code tradeType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradeType1Code
	 * TradeType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTransactionType
	 * SecuritiesTrade.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of trade transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, TradeType1Code> mmTradeType = new MMMessageAttribute<TradeLeg8, TradeType1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmTransactionType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeType";
			definition = "Identifies the type of trade transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradeType1Code.mmObject();
		}

		@Override
		public TradeType1Code getValue(TradeLeg8 obj) {
			return obj.getTradeType();
		}

		@Override
		public void setValue(TradeLeg8 obj, TradeType1Code value) {
			obj.setTradeType(value);
		}
	};
	@XmlElement(name = "DerivRltdTrad")
	protected YesNoIndicator derivativeRelatedTrade;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DerivRltdTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DerivativeRelatedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the trade is for settlement of an exercised derivatives contract."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<YesNoIndicator>> mmDerivativeRelatedTrade = new MMMessageAttribute<TradeLeg8, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "DerivRltdTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DerivativeRelatedTrade";
			definition = "Indicates that the trade is for settlement of an exercised derivatives contract.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(TradeLeg8 obj) {
			return obj.getDerivativeRelatedTrade();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<YesNoIndicator> value) {
			obj.setDerivativeRelatedTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "Brkr")
	protected PartyIdentificationAndAccount100 broker;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount100
	 * PartyIdentificationAndAccount100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Broker Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Brkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Broker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that identifies a broker when required (for example, authorised broker or prime broker)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Optional<PartyIdentificationAndAccount100>> mmBroker = new MMMessageAssociationEnd<TradeLeg8, Optional<PartyIdentificationAndAccount100>>() {
		{
			businessComponentTrace_lazy = () -> Broker.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "Brkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Broker";
			definition = "Party that identifies a broker when required (for example, authorised broker or prime broker).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount100.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount100> getValue(TradeLeg8 obj) {
			return obj.getBroker();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<PartyIdentificationAndAccount100> value) {
			obj.setBroker(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPty", required = true)
	protected PartyIdentification35Choice tradingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the identification of the trading party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, PartyIdentification35Choice> mmTradingParty = new MMMessageAssociationEnd<TradeLeg8, PartyIdentification35Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParty";
			definition = "Provides the identification of the trading party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		@Override
		public PartyIdentification35Choice getValue(TradeLeg8 obj) {
			return obj.getTradingParty();
		}

		@Override
		public void setValue(TradeLeg8 obj, PartyIdentification35Choice value) {
			obj.setTradingParty(value);
		}
	};
	@XmlElement(name = "TradRegnOrgn")
	protected Max35Text tradeRegistrationOrigin;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRegnOrgn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegistrationOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates in which session the transaction/operation was executed by the final investor or an intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<Max35Text>> mmTradeRegistrationOrigin = new MMMessageAttribute<TradeLeg8, Optional<Max35Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradRegnOrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegistrationOrigin";
			definition = "Indicates in which session the transaction/operation was executed by the final investor or an intermediary.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeLeg8 obj) {
			return obj.getTradeRegistrationOrigin();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<Max35Text> value) {
			obj.setTradeRegistrationOrigin(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgPtyAcct")
	protected SecuritiesAccount19 tradingPartyAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmAccount
	 * TradePartyRole.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPtyAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingPartyAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the trading participant's account at the trading venue using the venue's coding system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<SecuritiesAccount19>> mmTradingPartyAccount = new MMMessageAttribute<TradeLeg8, Optional<SecuritiesAccount19>>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgPtyAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingPartyAccount";
			definition = "Identifier of the trading participant's account at the trading venue using the venue's coding system.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(TradeLeg8 obj) {
			return obj.getTradingPartyAccount();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<SecuritiesAccount19> value) {
			obj.setTradingPartyAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "TradgCpcty", required = true)
	protected TradingCapacity5Code tradingCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradingCapacity5Code
	 * TradingCapacity5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradePartyRole#mmTradingPartyCapacity
	 * TradePartyRole.mmTradingPartyCapacity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the role of the trading party in the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, TradingCapacity5Code> mmTradingCapacity = new MMMessageAttribute<TradeLeg8, TradingCapacity5Code>() {
		{
			businessElementTrace_lazy = () -> TradePartyRole.mmTradingPartyCapacity;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradgCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingCapacity";
			definition = "Specifies the role of the trading party in the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TradingCapacity5Code.mmObject();
		}

		@Override
		public TradingCapacity5Code getValue(TradeLeg8 obj) {
			return obj.getTradingCapacity();
		}

		@Override
		public void setValue(TradeLeg8 obj, TradingCapacity5Code value) {
			obj.setTradingCapacity(value);
		}
	};
	@XmlElement(name = "TradPstngCd")
	protected TradePosting1Code tradePostingCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TradePosting1Code
	 * TradePosting1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmTradePostingType
	 * Clearing.mmTradePostingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradPstngCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePostingCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how a trade is maintained in the clearing account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeLeg8, Optional<TradePosting1Code>> mmTradePostingCode = new MMMessageAttribute<TradeLeg8, Optional<TradePosting1Code>>() {
		{
			businessElementTrace_lazy = () -> Clearing.mmTradePostingType;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "TradPstngCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePostingCode";
			definition = "Indicates how a trade is maintained in the clearing account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TradePosting1Code.mmObject();
		}

		@Override
		public Optional<TradePosting1Code> getValue(TradeLeg8 obj) {
			return obj.getTradePostingCode();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<TradePosting1Code> value) {
			obj.setTradePostingCode(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat7Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
	 * SafekeepingPlaceFormat7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
	 * SecuritiesAccount.mmSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Optional<SafekeepingPlaceFormat7Choice>> mmSafekeepingPlace = new MMMessageAssociationEnd<TradeLeg8, Optional<SafekeepingPlaceFormat7Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSafekeepingPlace;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafekeepingPlaceFormat7Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat7Choice> getValue(TradeLeg8 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<SafekeepingPlaceFormat7Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct")
	protected SecuritiesAccount19 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole#mmClearingAccount
	 * ClearingMemberRole.mmClearingAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TradeLeg8
	 * TradeLeg8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TradeLeg8, Optional<SecuritiesAccount19>> mmSafekeepingAccount = new MMMessageAssociationEnd<TradeLeg8, Optional<SecuritiesAccount19>>() {
		{
			businessElementTrace_lazy = () -> ClearingMemberRole.mmClearingAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeLeg8.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public Optional<SecuritiesAccount19> getValue(TradeLeg8 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(TradeLeg8 obj, Optional<SecuritiesAccount19> value) {
			obj.setSafekeepingAccount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeLeg8.mmTradeLegIdentification, com.tools20022.repository.msg.TradeLeg8.mmTradeIdentification,
						com.tools20022.repository.msg.TradeLeg8.mmTradeExecutionIdentification, com.tools20022.repository.msg.TradeLeg8.mmOrderIdentification, com.tools20022.repository.msg.TradeLeg8.mmAllocationIdentification,
						com.tools20022.repository.msg.TradeLeg8.mmStatus, com.tools20022.repository.msg.TradeLeg8.mmTradeDate, com.tools20022.repository.msg.TradeLeg8.mmTransactionDateTime,
						com.tools20022.repository.msg.TradeLeg8.mmSettlementDate, com.tools20022.repository.msg.TradeLeg8.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.TradeLeg8.mmTradingCurrency,
						com.tools20022.repository.msg.TradeLeg8.mmBuySellIndicator, com.tools20022.repository.msg.TradeLeg8.mmTradeQuantity, com.tools20022.repository.msg.TradeLeg8.mmDealPrice,
						com.tools20022.repository.msg.TradeLeg8.mmGrossAmount, com.tools20022.repository.msg.TradeLeg8.mmAccruedInterestAmount, com.tools20022.repository.msg.TradeLeg8.mmPlaceOfTrade,
						com.tools20022.repository.msg.TradeLeg8.mmPlaceOfListing, com.tools20022.repository.msg.TradeLeg8.mmTradeType, com.tools20022.repository.msg.TradeLeg8.mmDerivativeRelatedTrade,
						com.tools20022.repository.msg.TradeLeg8.mmBroker, com.tools20022.repository.msg.TradeLeg8.mmTradingParty, com.tools20022.repository.msg.TradeLeg8.mmTradeRegistrationOrigin,
						com.tools20022.repository.msg.TradeLeg8.mmTradingPartyAccount, com.tools20022.repository.msg.TradeLeg8.mmTradingCapacity, com.tools20022.repository.msg.TradeLeg8.mmTradePostingCode,
						com.tools20022.repository.msg.TradeLeg8.mmSafekeepingPlace, com.tools20022.repository.msg.TradeLeg8.mmSafekeepingAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(TradeLegNotificationV03.mmTradeLegDetails, TradeLegNotificationCancellationV03.mmTradeLegDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeLeg8";
				definition = "Provides the trade leg details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTradeLegIdentification() {
		return tradeLegIdentification;
	}

	public TradeLeg8 setTradeLegIdentification(Max35Text tradeLegIdentification) {
		this.tradeLegIdentification = Objects.requireNonNull(tradeLegIdentification);
		return this;
	}

	public Optional<Max35Text> getTradeIdentification() {
		return tradeIdentification == null ? Optional.empty() : Optional.of(tradeIdentification);
	}

	public TradeLeg8 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
		return this;
	}

	public Max35Text getTradeExecutionIdentification() {
		return tradeExecutionIdentification;
	}

	public TradeLeg8 setTradeExecutionIdentification(Max35Text tradeExecutionIdentification) {
		this.tradeExecutionIdentification = Objects.requireNonNull(tradeExecutionIdentification);
		return this;
	}

	public Optional<Max35Text> getOrderIdentification() {
		return orderIdentification == null ? Optional.empty() : Optional.of(orderIdentification);
	}

	public TradeLeg8 setOrderIdentification(Max35Text orderIdentification) {
		this.orderIdentification = orderIdentification;
		return this;
	}

	public Optional<Max35Text> getAllocationIdentification() {
		return allocationIdentification == null ? Optional.empty() : Optional.of(allocationIdentification);
	}

	public TradeLeg8 setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
		return this;
	}

	public Optional<Status5Code> getStatus() {
		return status == null ? Optional.empty() : Optional.of(status);
	}

	public TradeLeg8 setStatus(Status5Code status) {
		this.status = status;
		return this;
	}

	public ISODateTime getTradeDate() {
		return tradeDate;
	}

	public TradeLeg8 setTradeDate(ISODateTime tradeDate) {
		this.tradeDate = Objects.requireNonNull(tradeDate);
		return this;
	}

	public Optional<ISODateTime> getTransactionDateTime() {
		return transactionDateTime == null ? Optional.empty() : Optional.of(transactionDateTime);
	}

	public TradeLeg8 setTransactionDateTime(ISODateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
		return this;
	}

	public Optional<DateFormat15Choice> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public TradeLeg8 setSettlementDate(DateFormat15Choice settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public TradeLeg8 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<CurrencyCode> getTradingCurrency() {
		return tradingCurrency == null ? Optional.empty() : Optional.of(tradingCurrency);
	}

	public TradeLeg8 setTradingCurrency(CurrencyCode tradingCurrency) {
		this.tradingCurrency = tradingCurrency;
		return this;
	}

	public Side1Code getBuySellIndicator() {
		return buySellIndicator;
	}

	public TradeLeg8 setBuySellIndicator(Side1Code buySellIndicator) {
		this.buySellIndicator = Objects.requireNonNull(buySellIndicator);
		return this;
	}

	public FinancialInstrumentQuantity1Choice getTradeQuantity() {
		return tradeQuantity;
	}

	public TradeLeg8 setTradeQuantity(FinancialInstrumentQuantity1Choice tradeQuantity) {
		this.tradeQuantity = Objects.requireNonNull(tradeQuantity);
		return this;
	}

	public Price4 getDealPrice() {
		return dealPrice;
	}

	public TradeLeg8 setDealPrice(Price4 dealPrice) {
		this.dealPrice = Objects.requireNonNull(dealPrice);
		return this;
	}

	public Optional<AmountAndDirection21> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public TradeLeg8 setGrossAmount(AmountAndDirection21 grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	public Optional<AmountAndDirection21> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public TradeLeg8 setAccruedInterestAmount(AmountAndDirection21 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public MarketIdentification84 getPlaceOfTrade() {
		return placeOfTrade;
	}

	public TradeLeg8 setPlaceOfTrade(MarketIdentification84 placeOfTrade) {
		this.placeOfTrade = Objects.requireNonNull(placeOfTrade);
		return this;
	}

	public Optional<MarketIdentification85> getPlaceOfListing() {
		return placeOfListing == null ? Optional.empty() : Optional.of(placeOfListing);
	}

	public TradeLeg8 setPlaceOfListing(MarketIdentification85 placeOfListing) {
		this.placeOfListing = placeOfListing;
		return this;
	}

	public TradeType1Code getTradeType() {
		return tradeType;
	}

	public TradeLeg8 setTradeType(TradeType1Code tradeType) {
		this.tradeType = Objects.requireNonNull(tradeType);
		return this;
	}

	public Optional<YesNoIndicator> getDerivativeRelatedTrade() {
		return derivativeRelatedTrade == null ? Optional.empty() : Optional.of(derivativeRelatedTrade);
	}

	public TradeLeg8 setDerivativeRelatedTrade(YesNoIndicator derivativeRelatedTrade) {
		this.derivativeRelatedTrade = derivativeRelatedTrade;
		return this;
	}

	public Optional<PartyIdentificationAndAccount100> getBroker() {
		return broker == null ? Optional.empty() : Optional.of(broker);
	}

	public TradeLeg8 setBroker(PartyIdentificationAndAccount100 broker) {
		this.broker = broker;
		return this;
	}

	public PartyIdentification35Choice getTradingParty() {
		return tradingParty;
	}

	public TradeLeg8 setTradingParty(PartyIdentification35Choice tradingParty) {
		this.tradingParty = Objects.requireNonNull(tradingParty);
		return this;
	}

	public Optional<Max35Text> getTradeRegistrationOrigin() {
		return tradeRegistrationOrigin == null ? Optional.empty() : Optional.of(tradeRegistrationOrigin);
	}

	public TradeLeg8 setTradeRegistrationOrigin(Max35Text tradeRegistrationOrigin) {
		this.tradeRegistrationOrigin = tradeRegistrationOrigin;
		return this;
	}

	public Optional<SecuritiesAccount19> getTradingPartyAccount() {
		return tradingPartyAccount == null ? Optional.empty() : Optional.of(tradingPartyAccount);
	}

	public TradeLeg8 setTradingPartyAccount(SecuritiesAccount19 tradingPartyAccount) {
		this.tradingPartyAccount = tradingPartyAccount;
		return this;
	}

	public TradingCapacity5Code getTradingCapacity() {
		return tradingCapacity;
	}

	public TradeLeg8 setTradingCapacity(TradingCapacity5Code tradingCapacity) {
		this.tradingCapacity = Objects.requireNonNull(tradingCapacity);
		return this;
	}

	public Optional<TradePosting1Code> getTradePostingCode() {
		return tradePostingCode == null ? Optional.empty() : Optional.of(tradePostingCode);
	}

	public TradeLeg8 setTradePostingCode(TradePosting1Code tradePostingCode) {
		this.tradePostingCode = tradePostingCode;
		return this;
	}

	public Optional<SafekeepingPlaceFormat7Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public TradeLeg8 setSafekeepingPlace(SafekeepingPlaceFormat7Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<SecuritiesAccount19> getSafekeepingAccount() {
		return safekeepingAccount == null ? Optional.empty() : Optional.of(safekeepingAccount);
	}

	public TradeLeg8 setSafekeepingAccount(SecuritiesAccount19 safekeepingAccount) {
		this.safekeepingAccount = safekeepingAccount;
		return this;
	}
}