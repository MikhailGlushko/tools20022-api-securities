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
import com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Cash movements from or to a fund as a result of investment funds
 * transactions, eg, subscriptions or redemptions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmIdentification
 * EstimatedFundCashForecast6.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmTradeDateTime
 * EstimatedFundCashForecast6.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTradeDateTime
 * EstimatedFundCashForecast6.mmPreviousTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmFinancialInstrumentDetails
 * EstimatedFundCashForecast6.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalNAV
 * EstimatedFundCashForecast6.mmEstimatedTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalNAV
 * EstimatedFundCashForecast6.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalUnitsNumber
 * EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalUnitsNumber
 * EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalNAVChangeRate
 * EstimatedFundCashForecast6.mmEstimatedTotalNAVChangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmInvestmentCurrency
 * EstimatedFundCashForecast6.mmInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmCurrencyStatus
 * EstimatedFundCashForecast6.mmCurrencyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmExceptionalNetCashFlowIndicator
 * EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPrice
 * EstimatedFundCashForecast6.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmForeignExchangeRate
 * EstimatedFundCashForecast6.mmForeignExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedPercentageOfShareClassTotalNAV
 * EstimatedFundCashForecast6.mmEstimatedPercentageOfShareClassTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashInForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedCashOutForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.FundEstimatedCashForecastReportV04#mmEstimatedFundCashForecastDetails
 * FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forEstimatedFundCashForecast6
 * ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast6}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EstimatedFundCashForecast6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EstimatedFundCashForecast6", propOrder = {"identification", "tradeDateTime", "previousTradeDateTime", "financialInstrumentDetails", "estimatedTotalNAV", "previousTotalNAV", "estimatedTotalUnitsNumber",
		"previousTotalUnitsNumber", "estimatedTotalNAVChangeRate", "investmentCurrency", "currencyStatus", "exceptionalNetCashFlowIndicator", "price", "foreignExchangeRate", "estimatedPercentageOfShareClassTotalNAV",
		"estimatedCashInForecastDetails", "estimatedCashOutForecastDetails", "estimatedNetCashForecastDetails"})
public class EstimatedFundCashForecast6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a fund cash forecast within a fund cash forecast report as assigned by the issuer of the report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Max35Text> mmIdentification = new MMMessageAttribute<EstimatedFundCashForecast6, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique technical identifier for an instance of a fund cash forecast within a fund cash forecast report as assigned by the issuer of the report.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(EstimatedFundCashForecast6 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Max35Text value) {
			obj.setIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
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
	 * "Date and, if required, the time, at which the price will be applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, DateAndDateTimeChoice> mmTradeDateTime = new MMMessageAttribute<EstimatedFundCashForecast6, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and, if required, the time, at which the price will be applied.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(EstimatedFundCashForecast6 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, DateAndDateTimeChoice value) {
			obj.setTradeDateTime(value);
		}
	};
	@XmlElement(name = "PrvsTradDtTm")
	protected DateAndDateTimeChoice previousTradeDateTime;
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Previous date and time at which the price was applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Optional<DateAndDateTimeChoice>> mmPreviousTradeDateTime = new MMMessageAttribute<EstimatedFundCashForecast6, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTradeDateTime";
			definition = "Previous date and time at which the price was applied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getPreviousTradeDateTime();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setPreviousTradeDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument9 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument9
	 * FinancialInstrument9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmInvestmentFund
	 * InvestmentFundClass.mmInvestmentFund}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
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
	 * definition} = "Investment fund class to which the cash flow is related."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast6, FinancialInstrument9> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<EstimatedFundCashForecast6, FinancialInstrument9>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which the cash flow is related.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument9.mmObject();
		}

		@Override
		public FinancialInstrument9 getValue(EstimatedFundCashForecast6 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, FinancialInstrument9 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "EstmtdTtlNAV")
	protected List<ActiveOrHistoricCurrencyAndAmount> estimatedTotalNAV;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmNetAssetValue
	 * NetAssetValueCalculation.mmNetAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, List<ActiveOrHistoricCurrencyAndAmount>> mmEstimatedTotalNAV = new MMMessageAttribute<EstimatedFundCashForecast6, List<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAV";
			definition = "Estimated total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyAndAmount> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedTotalNAV();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, List<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setEstimatedTotalNAV(value);
		}
	};
	@XmlElement(name = "PrvsTtlNAV")
	protected List<ActiveOrHistoricCurrencyAndAmount> previousTotalNAV;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmNetAssetValue
	 * NetAssetValueCalculation.mmNetAssetValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, List<ActiveOrHistoricCurrencyAndAmount>> mmPreviousTotalNAV = new MMMessageAttribute<EstimatedFundCashForecast6, List<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyAndAmount> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getPreviousTotalNAV();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, List<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setPreviousTotalNAV(value);
		}
	};
	@XmlElement(name = "EstmtdTtlUnitsNb")
	protected FinancialInstrumentQuantity1 estimatedTotalUnitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated total number of investment fund class units that have been issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Optional<FinancialInstrumentQuantity1>> mmEstimatedTotalUnitsNumber = new MMMessageAttribute<EstimatedFundCashForecast6, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalUnitsNumber";
			definition = "Estimated total number of investment fund class units that have been issued.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedTotalUnitsNumber();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setEstimatedTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsTtlUnitsNb")
	protected FinancialInstrumentQuantity1 previousTotalUnitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Optional<FinancialInstrumentQuantity1>> mmPreviousTotalUnitsNumber = new MMMessageAttribute<EstimatedFundCashForecast6, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getPreviousTotalUnitsNumber();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setPreviousTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdTtlNAVChngRate")
	protected PercentageRate estimatedTotalNAVChangeRate;
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
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueChangeRate
	 * ValuationStatistics.mmNetAssetValueChangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdTtlNAVChngRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedTotalNAVChangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of change of the net asset value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Optional<PercentageRate>> mmEstimatedTotalNAVChangeRate = new MMMessageAttribute<EstimatedFundCashForecast6, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmNetAssetValueChangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAVChngRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAVChangeRate";
			definition = "Rate of change of the net asset value.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedTotalNAVChangeRate();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<PercentageRate> value) {
			obj.setEstimatedTotalNAVChangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "InvstmtCcy")
	protected List<ActiveOrHistoricCurrencyCode> investmentCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmTradingCurrency
	 * InvestmentFundClass.mmTradingCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the investment fund class."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, List<ActiveOrHistoricCurrencyCode>> mmInvestmentCurrency = new MMMessageAttribute<EstimatedFundCashForecast6, List<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "InvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentCurrency";
			definition = "Currency of the investment fund class.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getInvestmentCurrency();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, List<ActiveOrHistoricCurrencyCode> value) {
			obj.setInvestmentCurrency(value);
		}
	};
	@XmlElement(name = "CcySts")
	protected CurrencyDesignation1 currencyStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyDesignation1
	 * CurrencyDesignation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the designation of the share class currency, that is, whether it is for onshore or offshore purposes and other information that may be required. This is typically only required for CNY funds."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast6, Optional<CurrencyDesignation1>> mmCurrencyStatus = new MMMessageAssociationEnd<EstimatedFundCashForecast6, Optional<CurrencyDesignation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "CcySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyStatus";
			definition = "Information about the designation of the share class currency, that is, whether it is for onshore or offshore purposes and other information that may be required. This is typically only required for CNY funds.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyDesignation1.mmObject();
		}

		@Override
		public Optional<CurrencyDesignation1> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getCurrencyStatus();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<CurrencyDesignation1> value) {
			obj.setCurrencyStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "XcptnlNetCshFlowInd", required = true)
	protected YesNoIndicator exceptionalNetCashFlowIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmExceptionalCashFlowIndicator
	 * FundsCashFlow.mmExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlNetCshFlowInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalNetCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the estimated net cash flow is exceptional."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, YesNoIndicator> mmExceptionalNetCashFlowIndicator = new MMMessageAttribute<EstimatedFundCashForecast6, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "XcptnlNetCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalNetCashFlowIndicator";
			definition = "Indicates whether the estimated net cash flow is exceptional.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(EstimatedFundCashForecast6 obj) {
			return obj.getExceptionalNetCashFlowIndicator();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, YesNoIndicator value) {
			obj.setExceptionalNetCashFlowIndicator(value);
		}
	};
	@XmlElement(name = "Pric")
	protected UnitPrice19 price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice19
	 * UnitPrice19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price per unit of the previous trade date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast6, Optional<UnitPrice19>> mmPrice = new MMMessageAssociationEnd<EstimatedFundCashForecast6, Optional<UnitPrice19>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "Pric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Price";
			definition = "Price per unit of the previous trade date.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice19.mmObject();
		}

		@Override
		public Optional<UnitPrice19> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<UnitPrice19> value) {
			obj.setPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "FXRate")
	protected ForeignExchangeTerms19 foreignExchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms19
	 * ForeignExchangeTerms19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign exchange rate."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Optional<ForeignExchangeTerms19>> mmForeignExchangeRate = new MMMessageAttribute<EstimatedFundCashForecast6, Optional<ForeignExchangeTerms19>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "FXRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeRate";
			definition = "Foreign exchange rate.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ForeignExchangeTerms19.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms19> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getForeignExchangeRate();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<ForeignExchangeTerms19> value) {
			obj.setForeignExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdPctgOfShrClssTtlNAV")
	protected PercentageRate estimatedPercentageOfShareClassTotalNAV;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdPctgOfShrClssTtlNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPercentageOfShareClassTotalNAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated net cash flow expressed as a percentage of the previous total NAV for the share class."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast6, Optional<PercentageRate>> mmEstimatedPercentageOfShareClassTotalNAV = new MMMessageAttribute<EstimatedFundCashForecast6, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdPctgOfShrClssTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedPercentageOfShareClassTotalNAV";
			definition = "Estimated net cash flow expressed as a percentage of the previous total NAV for the share class.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedPercentageOfShareClassTotalNAV();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, Optional<PercentageRate> value) {
			obj.setEstimatedPercentageOfShareClassTotalNAV(value.orElse(null));
		}
	};
	@XmlElement(name = "EstmtdCshInFcstDtls")
	protected List<CashInForecast6> estimatedCashInForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashInForecast6
	 * CashInForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdCshInFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedCashInForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated cash movements into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast6, List<CashInForecast6>> mmEstimatedCashInForecastDetails = new MMMessageAssociationEnd<EstimatedFundCashForecast6, List<CashInForecast6>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshInFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashInForecastDetails";
			definition = "Estimated cash movements into the fund as a result of transactions in shares in an investment fund, for example, subscriptions or switch-ins.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashInForecast6.mmObject();
		}

		@Override
		public List<CashInForecast6> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedCashInForecastDetails();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, List<CashInForecast6> value) {
			obj.setEstimatedCashInForecastDetails(value);
		}
	};
	@XmlElement(name = "EstmtdCshOutFcstDtls")
	protected List<CashOutForecast6> estimatedCashOutForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdCshOutFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedCashOutForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Estimated cash movements out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast6, List<CashOutForecast6>> mmEstimatedCashOutForecastDetails = new MMMessageAssociationEnd<EstimatedFundCashForecast6, List<CashOutForecast6>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdCshOutFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedCashOutForecastDetails";
			definition = "Estimated cash movements out of the fund as a result of transactions in shares in an investment fund, for example, redemptions or switch-outs.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashOutForecast6.mmObject();
		}

		@Override
		public List<CashOutForecast6> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedCashOutForecastDetails();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, List<CashOutForecast6> value) {
			obj.setEstimatedCashOutForecastDetails(value);
		}
	};
	@XmlElement(name = "EstmtdNetCshFcstDtls")
	protected List<NetCashForecast4> estimatedNetCashForecastDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NetCashForecast4
	 * NetCashForecast4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6
	 * EstimatedFundCashForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EstmtdNetCshFcstDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedNetCashForecastDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Net cash as a result of the cash-in and cash-out flows."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast6, List<NetCashForecast4>> mmEstimatedNetCashForecastDetails = new MMMessageAssociationEnd<EstimatedFundCashForecast6, List<NetCashForecast4>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast6.mmObject();
			isDerived = false;
			xmlTag = "EstmtdNetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedNetCashForecastDetails";
			definition = "Net cash as a result of the cash-in and cash-out flows.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast4.mmObject();
		}

		@Override
		public List<NetCashForecast4> getValue(EstimatedFundCashForecast6 obj) {
			return obj.getEstimatedNetCashForecastDetails();
		}

		@Override
		public void setValue(EstimatedFundCashForecast6 obj, List<NetCashForecast4> value) {
			obj.setEstimatedNetCashForecastDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EstimatedFundCashForecast6.mmIdentification, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmTradeDateTime,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedTotalNAV, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPreviousTotalNAV,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPreviousTotalUnitsNumber,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedTotalNAVChangeRate, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmInvestmentCurrency,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmCurrencyStatus, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmExceptionalNetCashFlowIndicator,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmPrice, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmForeignExchangeRate,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedPercentageOfShareClassTotalNAV, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedCashInForecastDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedCashOutForecastDetails, com.tools20022.repository.msg.EstimatedFundCashForecast6.mmEstimatedNetCashForecastDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast6);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EstimatedFundCashForecast6";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public EstimatedFundCashForecast6 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public EstimatedFundCashForecast6 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPreviousTradeDateTime() {
		return previousTradeDateTime == null ? Optional.empty() : Optional.of(previousTradeDateTime);
	}

	public EstimatedFundCashForecast6 setPreviousTradeDateTime(DateAndDateTimeChoice previousTradeDateTime) {
		this.previousTradeDateTime = previousTradeDateTime;
		return this;
	}

	public FinancialInstrument9 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public EstimatedFundCashForecast6 setFinancialInstrumentDetails(FinancialInstrument9 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getEstimatedTotalNAV() {
		return estimatedTotalNAV == null ? estimatedTotalNAV = new ArrayList<>() : estimatedTotalNAV;
	}

	public EstimatedFundCashForecast6 setEstimatedTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> estimatedTotalNAV) {
		this.estimatedTotalNAV = Objects.requireNonNull(estimatedTotalNAV);
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getPreviousTotalNAV() {
		return previousTotalNAV == null ? previousTotalNAV = new ArrayList<>() : previousTotalNAV;
	}

	public EstimatedFundCashForecast6 setPreviousTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> previousTotalNAV) {
		this.previousTotalNAV = Objects.requireNonNull(previousTotalNAV);
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getEstimatedTotalUnitsNumber() {
		return estimatedTotalUnitsNumber == null ? Optional.empty() : Optional.of(estimatedTotalUnitsNumber);
	}

	public EstimatedFundCashForecast6 setEstimatedTotalUnitsNumber(FinancialInstrumentQuantity1 estimatedTotalUnitsNumber) {
		this.estimatedTotalUnitsNumber = estimatedTotalUnitsNumber;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getPreviousTotalUnitsNumber() {
		return previousTotalUnitsNumber == null ? Optional.empty() : Optional.of(previousTotalUnitsNumber);
	}

	public EstimatedFundCashForecast6 setPreviousTotalUnitsNumber(FinancialInstrumentQuantity1 previousTotalUnitsNumber) {
		this.previousTotalUnitsNumber = previousTotalUnitsNumber;
		return this;
	}

	public Optional<PercentageRate> getEstimatedTotalNAVChangeRate() {
		return estimatedTotalNAVChangeRate == null ? Optional.empty() : Optional.of(estimatedTotalNAVChangeRate);
	}

	public EstimatedFundCashForecast6 setEstimatedTotalNAVChangeRate(PercentageRate estimatedTotalNAVChangeRate) {
		this.estimatedTotalNAVChangeRate = estimatedTotalNAVChangeRate;
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getInvestmentCurrency() {
		return investmentCurrency == null ? investmentCurrency = new ArrayList<>() : investmentCurrency;
	}

	public EstimatedFundCashForecast6 setInvestmentCurrency(List<ActiveOrHistoricCurrencyCode> investmentCurrency) {
		this.investmentCurrency = Objects.requireNonNull(investmentCurrency);
		return this;
	}

	public Optional<CurrencyDesignation1> getCurrencyStatus() {
		return currencyStatus == null ? Optional.empty() : Optional.of(currencyStatus);
	}

	public EstimatedFundCashForecast6 setCurrencyStatus(CurrencyDesignation1 currencyStatus) {
		this.currencyStatus = currencyStatus;
		return this;
	}

	public YesNoIndicator getExceptionalNetCashFlowIndicator() {
		return exceptionalNetCashFlowIndicator;
	}

	public EstimatedFundCashForecast6 setExceptionalNetCashFlowIndicator(YesNoIndicator exceptionalNetCashFlowIndicator) {
		this.exceptionalNetCashFlowIndicator = Objects.requireNonNull(exceptionalNetCashFlowIndicator);
		return this;
	}

	public Optional<UnitPrice19> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public EstimatedFundCashForecast6 setPrice(UnitPrice19 price) {
		this.price = price;
		return this;
	}

	public Optional<ForeignExchangeTerms19> getForeignExchangeRate() {
		return foreignExchangeRate == null ? Optional.empty() : Optional.of(foreignExchangeRate);
	}

	public EstimatedFundCashForecast6 setForeignExchangeRate(ForeignExchangeTerms19 foreignExchangeRate) {
		this.foreignExchangeRate = foreignExchangeRate;
		return this;
	}

	public Optional<PercentageRate> getEstimatedPercentageOfShareClassTotalNAV() {
		return estimatedPercentageOfShareClassTotalNAV == null ? Optional.empty() : Optional.of(estimatedPercentageOfShareClassTotalNAV);
	}

	public EstimatedFundCashForecast6 setEstimatedPercentageOfShareClassTotalNAV(PercentageRate estimatedPercentageOfShareClassTotalNAV) {
		this.estimatedPercentageOfShareClassTotalNAV = estimatedPercentageOfShareClassTotalNAV;
		return this;
	}

	public List<CashInForecast6> getEstimatedCashInForecastDetails() {
		return estimatedCashInForecastDetails == null ? estimatedCashInForecastDetails = new ArrayList<>() : estimatedCashInForecastDetails;
	}

	public EstimatedFundCashForecast6 setEstimatedCashInForecastDetails(List<CashInForecast6> estimatedCashInForecastDetails) {
		this.estimatedCashInForecastDetails = Objects.requireNonNull(estimatedCashInForecastDetails);
		return this;
	}

	public List<CashOutForecast6> getEstimatedCashOutForecastDetails() {
		return estimatedCashOutForecastDetails == null ? estimatedCashOutForecastDetails = new ArrayList<>() : estimatedCashOutForecastDetails;
	}

	public EstimatedFundCashForecast6 setEstimatedCashOutForecastDetails(List<CashOutForecast6> estimatedCashOutForecastDetails) {
		this.estimatedCashOutForecastDetails = Objects.requireNonNull(estimatedCashOutForecastDetails);
		return this;
	}

	public List<NetCashForecast4> getEstimatedNetCashForecastDetails() {
		return estimatedNetCashForecastDetails == null ? estimatedNetCashForecastDetails = new ArrayList<>() : estimatedNetCashForecastDetails;
	}

	public EstimatedFundCashForecast6 setEstimatedNetCashForecastDetails(List<NetCashForecast4> estimatedNetCashForecastDetails) {
		this.estimatedNetCashForecastDetails = Objects.requireNonNull(estimatedNetCashForecastDetails);
		return this;
	}
}