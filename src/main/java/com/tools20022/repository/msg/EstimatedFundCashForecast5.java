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
import com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04;
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
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmIdentification
 * EstimatedFundCashForecast5.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmTradeDateTime
 * EstimatedFundCashForecast5.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTradeDateTime
 * EstimatedFundCashForecast5.mmPreviousTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmFinancialInstrumentDetails
 * EstimatedFundCashForecast5.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalNAV
 * EstimatedFundCashForecast5.mmEstimatedTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalNAV
 * EstimatedFundCashForecast5.mmPreviousTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalUnitsNumber
 * EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalUnitsNumber
 * EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalNAVChangeRate
 * EstimatedFundCashForecast5.mmEstimatedTotalNAVChangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmInvestmentCurrency
 * EstimatedFundCashForecast5.mmInvestmentCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmCurrencyStatus
 * EstimatedFundCashForecast5.mmCurrencyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmExceptionalNetCashFlowIndicator
 * EstimatedFundCashForecast5.mmExceptionalNetCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPrice
 * EstimatedFundCashForecast5.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmForeignExchangeRate
 * EstimatedFundCashForecast5.mmForeignExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedPercentageOfShareClassTotalNAV
 * EstimatedFundCashForecast5.mmEstimatedPercentageOfShareClassTotalNAV}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmBreakdownByParty
 * EstimatedFundCashForecast5.mmBreakdownByParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmBreakdownByCountry
 * EstimatedFundCashForecast5.mmBreakdownByCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmBreakdownByCurrency
 * EstimatedFundCashForecast5.mmBreakdownByCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmBreakdownByUserDefinedParameter
 * EstimatedFundCashForecast5.mmBreakdownByUserDefinedParameter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedNetCashForecastDetails
 * EstimatedFundCashForecast5.mmEstimatedNetCashForecastDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.camt.FundDetailedEstimatedCashForecastReportV04#mmEstimatedFundCashForecastDetails
 * FundDetailedEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails
 * }</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule#forEstimatedFundCashForecast5
 * ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EstimatedFundCashForecast5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Fund1 Fund1}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EstimatedFundCashForecast5", propOrder = {"identification", "tradeDateTime", "previousTradeDateTime", "financialInstrumentDetails", "estimatedTotalNAV", "previousTotalNAV", "estimatedTotalUnitsNumber",
		"previousTotalUnitsNumber", "estimatedTotalNAVChangeRate", "investmentCurrency", "currencyStatus", "exceptionalNetCashFlowIndicator", "price", "foreignExchangeRate", "estimatedPercentageOfShareClassTotalNAV", "breakdownByParty",
		"breakdownByCountry", "breakdownByCurrency", "breakdownByUserDefinedParameter", "estimatedNetCashForecastDetails"})
public class EstimatedFundCashForecast5 {

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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Max35Text> mmIdentification = new MMMessageAttribute<EstimatedFundCashForecast5, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Max35Text getValue(EstimatedFundCashForecast5 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, DateAndDateTimeChoice> mmTradeDateTime = new MMMessageAttribute<EstimatedFundCashForecast5, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public DateAndDateTimeChoice getValue(EstimatedFundCashForecast5 obj) {
			return obj.getTradeDateTime();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, DateAndDateTimeChoice value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Optional<DateAndDateTimeChoice>> mmPreviousTradeDateTime = new MMMessageAttribute<EstimatedFundCashForecast5, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Optional<DateAndDateTimeChoice> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getPreviousTradeDateTime();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<DateAndDateTimeChoice> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, FinancialInstrument9> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<EstimatedFundCashForecast5, FinancialInstrument9>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmInvestmentFund;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public FinancialInstrument9 getValue(EstimatedFundCashForecast5 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, FinancialInstrument9 value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalNAV
	 * Fund1.mmEstimatedTotalNAV}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast5, List<ActiveOrHistoricCurrencyAndAmount>> mmEstimatedTotalNAV = new MMMessageAttribute<EstimatedFundCashForecast5, List<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalNAV";
			definition = "Estimated total value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			nextVersions_lazy = () -> Arrays.asList(Fund1.mmEstimatedTotalNAV);
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyAndAmount> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getEstimatedTotalNAV();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<ActiveOrHistoricCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalNAV
	 * Fund1.mmPreviousTotalNAV}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast5, List<ActiveOrHistoricCurrencyAndAmount>> mmPreviousTotalNAV = new MMMessageAttribute<EstimatedFundCashForecast5, List<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> NetAssetValueCalculation.mmNetAssetValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlNAV";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalNAV";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			nextVersions_lazy = () -> Arrays.asList(Fund1.mmPreviousTotalNAV);
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyAndAmount> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getPreviousTotalNAV();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<ActiveOrHistoricCurrencyAndAmount> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalUnitsNumber
	 * Fund1.mmEstimatedTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Optional<FinancialInstrumentQuantity1>> mmEstimatedTotalUnitsNumber = new MMMessageAttribute<EstimatedFundCashForecast5, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "EstmtdTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedTotalUnitsNumber";
			definition = "Estimated total number of investment fund class units that have been issued.";
			nextVersions_lazy = () -> Arrays.asList(Fund1.mmEstimatedTotalUnitsNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getEstimatedTotalUnitsNumber();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<FinancialInstrumentQuantity1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalUnitsNumber
	 * Fund1.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Optional<FinancialInstrumentQuantity1>> mmPreviousTotalUnitsNumber = new MMMessageAttribute<EstimatedFundCashForecast5, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "PrvsTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousTotalUnitsNumber";
			definition = "Previous value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			nextVersions_lazy = () -> Arrays.asList(Fund1.mmPreviousTotalUnitsNumber);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getPreviousTotalUnitsNumber();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<FinancialInstrumentQuantity1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Optional<PercentageRate>> mmEstimatedTotalNAVChangeRate = new MMMessageAttribute<EstimatedFundCashForecast5, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmNetAssetValueChangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Optional<PercentageRate> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getEstimatedTotalNAVChangeRate();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<PercentageRate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmCurrency
	 * Fund1.mmCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EstimatedFundCashForecast5, List<ActiveOrHistoricCurrencyCode>> mmInvestmentCurrency = new MMMessageAttribute<EstimatedFundCashForecast5, List<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmTradingCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "InvstmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentCurrency";
			definition = "Currency of the investment fund class.";
			nextVersions_lazy = () -> Arrays.asList(Fund1.mmCurrency);
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public List<ActiveOrHistoricCurrencyCode> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getInvestmentCurrency();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<ActiveOrHistoricCurrencyCode> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, Optional<CurrencyDesignation1>> mmCurrencyStatus = new MMMessageAssociationEnd<EstimatedFundCashForecast5, Optional<CurrencyDesignation1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Optional<CurrencyDesignation1> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getCurrencyStatus();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<CurrencyDesignation1> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, YesNoIndicator> mmExceptionalNetCashFlowIndicator = new MMMessageAttribute<EstimatedFundCashForecast5, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public YesNoIndicator getValue(EstimatedFundCashForecast5 obj) {
			return obj.getExceptionalNetCashFlowIndicator();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, YesNoIndicator value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, Optional<UnitPrice19>> mmPrice = new MMMessageAssociationEnd<EstimatedFundCashForecast5, Optional<UnitPrice19>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Optional<UnitPrice19> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getPrice();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<UnitPrice19> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Optional<ForeignExchangeTerms19>> mmForeignExchangeRate = new MMMessageAttribute<EstimatedFundCashForecast5, Optional<ForeignExchangeTerms19>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Optional<ForeignExchangeTerms19> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getForeignExchangeRate();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<ForeignExchangeTerms19> value) {
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	public static final MMMessageAttribute<EstimatedFundCashForecast5, Optional<PercentageRate>> mmEstimatedPercentageOfShareClassTotalNAV = new MMMessageAttribute<EstimatedFundCashForecast5, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
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
		public Optional<PercentageRate> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getEstimatedPercentageOfShareClassTotalNAV();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, Optional<PercentageRate> value) {
			obj.setEstimatedPercentageOfShareClassTotalNAV(value.orElse(null));
		}
	};
	@XmlElement(name = "BrkdwnByPty")
	protected List<BreakdownByParty3> breakdownByParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByParty3
	 * BreakdownByParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimated cash flow by party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByParty3>> mmBreakdownByParty = new MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByParty3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByParty";
			definition = "Estimated cash flow by party.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BreakdownByParty3.mmObject();
		}

		@Override
		public List<BreakdownByParty3> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getBreakdownByParty();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<BreakdownByParty3> value) {
			obj.setBreakdownByParty(value);
		}
	};
	@XmlElement(name = "BrkdwnByCtry")
	protected List<BreakdownByCountry2> breakdownByCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByCountry2
	 * BreakdownByCountry2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimated cash flow by country."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByCountry2>> mmBreakdownByCountry = new MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByCountry2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByCountry";
			definition = "Estimated cash flow by country.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BreakdownByCountry2.mmObject();
		}

		@Override
		public List<BreakdownByCountry2> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getBreakdownByCountry();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<BreakdownByCountry2> value) {
			obj.setBreakdownByCountry(value);
		}
	};
	@XmlElement(name = "BrkdwnByCcy")
	protected List<BreakdownByCurrency2> breakdownByCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BreakdownByCurrency2
	 * BreakdownByCurrency2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimated cash flow by currency."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByCurrency2>> mmBreakdownByCurrency = new MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByCurrency2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByCurrency";
			definition = "Estimated cash flow by currency.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BreakdownByCurrency2.mmObject();
		}

		@Override
		public List<BreakdownByCurrency2> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getBreakdownByCurrency();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<BreakdownByCurrency2> value) {
			obj.setBreakdownByCurrency(value);
		}
	};
	@XmlElement(name = "BrkdwnByUsrDfndParam")
	protected List<BreakdownByUserDefinedParameter3> breakdownByUserDefinedParameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.BreakdownByUserDefinedParameter3
	 * BreakdownByUserDefinedParameter3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrkdwnByUsrDfndParam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BreakdownByUserDefinedParameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Estimated cash flow by a user defined parameter/s."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByUserDefinedParameter3>> mmBreakdownByUserDefinedParameter = new MMMessageAssociationEnd<EstimatedFundCashForecast5, List<BreakdownByUserDefinedParameter3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "BrkdwnByUsrDfndParam";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BreakdownByUserDefinedParameter";
			definition = "Estimated cash flow by a user defined parameter/s.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BreakdownByUserDefinedParameter3.mmObject();
		}

		@Override
		public List<BreakdownByUserDefinedParameter3> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getBreakdownByUserDefinedParameter();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<BreakdownByUserDefinedParameter3> value) {
			obj.setBreakdownByUserDefinedParameter(value);
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
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5
	 * EstimatedFundCashForecast5}</li>
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
	 * definition} = "Estimated net cash movements per financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EstimatedFundCashForecast5, List<NetCashForecast4>> mmEstimatedNetCashForecastDetails = new MMMessageAssociationEnd<EstimatedFundCashForecast5, List<NetCashForecast4>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.EstimatedFundCashForecast5.mmObject();
			isDerived = false;
			xmlTag = "EstmtdNetCshFcstDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EstimatedNetCashForecastDetails";
			definition = "Estimated net cash movements per financial instrument.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NetCashForecast4.mmObject();
		}

		@Override
		public List<NetCashForecast4> getValue(EstimatedFundCashForecast5 obj) {
			return obj.getEstimatedNetCashForecastDetails();
		}

		@Override
		public void setValue(EstimatedFundCashForecast5 obj, List<NetCashForecast4> value) {
			obj.setEstimatedNetCashForecastDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EstimatedFundCashForecast5.mmIdentification, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmTradeDateTime,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPreviousTradeDateTime, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmEstimatedTotalNAV, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPreviousTotalNAV,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmEstimatedTotalUnitsNumber, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPreviousTotalUnitsNumber,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmEstimatedTotalNAVChangeRate, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmInvestmentCurrency,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmCurrencyStatus, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmExceptionalNetCashFlowIndicator,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmPrice, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmForeignExchangeRate,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmEstimatedPercentageOfShareClassTotalNAV, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmBreakdownByParty,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmBreakdownByCountry, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmBreakdownByCurrency,
						com.tools20022.repository.msg.EstimatedFundCashForecast5.mmBreakdownByUserDefinedParameter, com.tools20022.repository.msg.EstimatedFundCashForecast5.mmEstimatedNetCashForecastDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(FundDetailedEstimatedCashForecastReportV04.mmEstimatedFundCashForecastDetails);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintExceptionalCashFlowIndicatorRule.forEstimatedFundCashForecast5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EstimatedFundCashForecast5";
				definition = "Cash movements from or to a fund as a result of investment funds transactions, eg, subscriptions or redemptions.";
				nextVersions_lazy = () -> Arrays.asList(Fund1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public EstimatedFundCashForecast5 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public EstimatedFundCashForecast5 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getPreviousTradeDateTime() {
		return previousTradeDateTime == null ? Optional.empty() : Optional.of(previousTradeDateTime);
	}

	public EstimatedFundCashForecast5 setPreviousTradeDateTime(DateAndDateTimeChoice previousTradeDateTime) {
		this.previousTradeDateTime = previousTradeDateTime;
		return this;
	}

	public FinancialInstrument9 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public EstimatedFundCashForecast5 setFinancialInstrumentDetails(FinancialInstrument9 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getEstimatedTotalNAV() {
		return estimatedTotalNAV == null ? estimatedTotalNAV = new ArrayList<>() : estimatedTotalNAV;
	}

	public EstimatedFundCashForecast5 setEstimatedTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> estimatedTotalNAV) {
		this.estimatedTotalNAV = Objects.requireNonNull(estimatedTotalNAV);
		return this;
	}

	public List<ActiveOrHistoricCurrencyAndAmount> getPreviousTotalNAV() {
		return previousTotalNAV == null ? previousTotalNAV = new ArrayList<>() : previousTotalNAV;
	}

	public EstimatedFundCashForecast5 setPreviousTotalNAV(List<ActiveOrHistoricCurrencyAndAmount> previousTotalNAV) {
		this.previousTotalNAV = Objects.requireNonNull(previousTotalNAV);
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getEstimatedTotalUnitsNumber() {
		return estimatedTotalUnitsNumber == null ? Optional.empty() : Optional.of(estimatedTotalUnitsNumber);
	}

	public EstimatedFundCashForecast5 setEstimatedTotalUnitsNumber(FinancialInstrumentQuantity1 estimatedTotalUnitsNumber) {
		this.estimatedTotalUnitsNumber = estimatedTotalUnitsNumber;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getPreviousTotalUnitsNumber() {
		return previousTotalUnitsNumber == null ? Optional.empty() : Optional.of(previousTotalUnitsNumber);
	}

	public EstimatedFundCashForecast5 setPreviousTotalUnitsNumber(FinancialInstrumentQuantity1 previousTotalUnitsNumber) {
		this.previousTotalUnitsNumber = previousTotalUnitsNumber;
		return this;
	}

	public Optional<PercentageRate> getEstimatedTotalNAVChangeRate() {
		return estimatedTotalNAVChangeRate == null ? Optional.empty() : Optional.of(estimatedTotalNAVChangeRate);
	}

	public EstimatedFundCashForecast5 setEstimatedTotalNAVChangeRate(PercentageRate estimatedTotalNAVChangeRate) {
		this.estimatedTotalNAVChangeRate = estimatedTotalNAVChangeRate;
		return this;
	}

	public List<ActiveOrHistoricCurrencyCode> getInvestmentCurrency() {
		return investmentCurrency == null ? investmentCurrency = new ArrayList<>() : investmentCurrency;
	}

	public EstimatedFundCashForecast5 setInvestmentCurrency(List<ActiveOrHistoricCurrencyCode> investmentCurrency) {
		this.investmentCurrency = Objects.requireNonNull(investmentCurrency);
		return this;
	}

	public Optional<CurrencyDesignation1> getCurrencyStatus() {
		return currencyStatus == null ? Optional.empty() : Optional.of(currencyStatus);
	}

	public EstimatedFundCashForecast5 setCurrencyStatus(CurrencyDesignation1 currencyStatus) {
		this.currencyStatus = currencyStatus;
		return this;
	}

	public YesNoIndicator getExceptionalNetCashFlowIndicator() {
		return exceptionalNetCashFlowIndicator;
	}

	public EstimatedFundCashForecast5 setExceptionalNetCashFlowIndicator(YesNoIndicator exceptionalNetCashFlowIndicator) {
		this.exceptionalNetCashFlowIndicator = Objects.requireNonNull(exceptionalNetCashFlowIndicator);
		return this;
	}

	public Optional<UnitPrice19> getPrice() {
		return price == null ? Optional.empty() : Optional.of(price);
	}

	public EstimatedFundCashForecast5 setPrice(UnitPrice19 price) {
		this.price = price;
		return this;
	}

	public Optional<ForeignExchangeTerms19> getForeignExchangeRate() {
		return foreignExchangeRate == null ? Optional.empty() : Optional.of(foreignExchangeRate);
	}

	public EstimatedFundCashForecast5 setForeignExchangeRate(ForeignExchangeTerms19 foreignExchangeRate) {
		this.foreignExchangeRate = foreignExchangeRate;
		return this;
	}

	public Optional<PercentageRate> getEstimatedPercentageOfShareClassTotalNAV() {
		return estimatedPercentageOfShareClassTotalNAV == null ? Optional.empty() : Optional.of(estimatedPercentageOfShareClassTotalNAV);
	}

	public EstimatedFundCashForecast5 setEstimatedPercentageOfShareClassTotalNAV(PercentageRate estimatedPercentageOfShareClassTotalNAV) {
		this.estimatedPercentageOfShareClassTotalNAV = estimatedPercentageOfShareClassTotalNAV;
		return this;
	}

	public List<BreakdownByParty3> getBreakdownByParty() {
		return breakdownByParty == null ? breakdownByParty = new ArrayList<>() : breakdownByParty;
	}

	public EstimatedFundCashForecast5 setBreakdownByParty(List<BreakdownByParty3> breakdownByParty) {
		this.breakdownByParty = Objects.requireNonNull(breakdownByParty);
		return this;
	}

	public List<BreakdownByCountry2> getBreakdownByCountry() {
		return breakdownByCountry == null ? breakdownByCountry = new ArrayList<>() : breakdownByCountry;
	}

	public EstimatedFundCashForecast5 setBreakdownByCountry(List<BreakdownByCountry2> breakdownByCountry) {
		this.breakdownByCountry = Objects.requireNonNull(breakdownByCountry);
		return this;
	}

	public List<BreakdownByCurrency2> getBreakdownByCurrency() {
		return breakdownByCurrency == null ? breakdownByCurrency = new ArrayList<>() : breakdownByCurrency;
	}

	public EstimatedFundCashForecast5 setBreakdownByCurrency(List<BreakdownByCurrency2> breakdownByCurrency) {
		this.breakdownByCurrency = Objects.requireNonNull(breakdownByCurrency);
		return this;
	}

	public List<BreakdownByUserDefinedParameter3> getBreakdownByUserDefinedParameter() {
		return breakdownByUserDefinedParameter == null ? breakdownByUserDefinedParameter = new ArrayList<>() : breakdownByUserDefinedParameter;
	}

	public EstimatedFundCashForecast5 setBreakdownByUserDefinedParameter(List<BreakdownByUserDefinedParameter3> breakdownByUserDefinedParameter) {
		this.breakdownByUserDefinedParameter = Objects.requireNonNull(breakdownByUserDefinedParameter);
		return this;
	}

	public List<NetCashForecast4> getEstimatedNetCashForecastDetails() {
		return estimatedNetCashForecastDetails == null ? estimatedNetCashForecastDetails = new ArrayList<>() : estimatedNetCashForecastDetails;
	}

	public EstimatedFundCashForecast5 setEstimatedNetCashForecastDetails(List<NetCashForecast4> estimatedNetCashForecastDetails) {
		this.estimatedNetCashForecastDetails = Objects.requireNonNull(estimatedNetCashForecastDetails);
		return this;
	}
}