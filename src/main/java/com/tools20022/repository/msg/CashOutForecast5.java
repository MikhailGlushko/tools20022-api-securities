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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.entity.FundsCashFlow;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.FundBalance1;
import com.tools20022.repository.msg.FundCashOutBreakdown3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cash movements out of a fund as a result of investment funds transactions,
 * eg, redemptions or switch-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashSettlementDate
 * CashOutForecast5.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmSubTotalAmount
 * CashOutForecast5.mmSubTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmSubTotalUnitsNumber
 * CashOutForecast5.mmSubTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmExceptionalCashFlowIndicator
 * CashOutForecast5.mmExceptionalCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmCashOutBreakdownDetails
 * CashOutForecast5.mmCashOutBreakdownDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast5#mmAdditionalBalance
 * CashOutForecast5.mmAdditionalBalance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalBalanceRule#forCashOutForecast5
 * ConstraintAdditionalBalanceRule.forCashOutForecast5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashOutForecast5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CashOutForecast5", propOrder = {"cashSettlementDate", "subTotalAmount", "subTotalUnitsNumber", "exceptionalCashFlowIndicator", "cashOutBreakdownDetails", "additionalBalance"})
public class CashOutForecast5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshSttlmDt", required = true)
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
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
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
	public static final MMMessageAttribute<CashOutForecast5, ISODate> mmCashSettlementDate = new MMMessageAttribute<CashOutForecast5, ISODate>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CashOutForecast5 obj) {
			return obj.getCashSettlementDate();
		}

		@Override
		public void setValue(CashOutForecast5 obj, ISODate value) {
			obj.setCashSettlementDate(value);
		}
	};
	@XmlElement(name = "SubTtlAmt")
	protected ActiveOrHistoricCurrencyAndAmount subTotalAmount;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmAmount
	 * SecuritiesQuantity.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as an amount of money."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast5, Optional<ActiveOrHistoricCurrencyAndAmount>> mmSubTotalAmount = new MMMessageAttribute<CashOutForecast5, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "SubTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalAmount";
			definition = "Sub-total amount of the cash flow out, expressed as an amount of money.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(CashOutForecast5 obj) {
			return obj.getSubTotalAmount();
		}

		@Override
		public void setValue(CashOutForecast5 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setSubTotalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SubTtlUnitsNb")
	protected FinancialInstrumentQuantity1 subTotalUnitsNumber;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as a number of units."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast5, Optional<FinancialInstrumentQuantity1>> mmSubTotalUnitsNumber = new MMMessageAttribute<CashOutForecast5, Optional<FinancialInstrumentQuantity1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "SubTtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalUnitsNumber";
			definition = "Sub-total amount of the cash flow out, expressed as a number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1> getValue(CashOutForecast5 obj) {
			return obj.getSubTotalUnitsNumber();
		}

		@Override
		public void setValue(CashOutForecast5 obj, Optional<FinancialInstrumentQuantity1> value) {
			obj.setSubTotalUnitsNumber(value.orElse(null));
		}
	};
	@XmlElement(name = "XcptnlCshFlowInd")
	protected YesNoIndicator exceptionalCashFlowIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlCshFlowInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the estimated cash flow out is exceptional."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CashOutForecast5, Optional<YesNoIndicator>> mmExceptionalCashFlowIndicator = new MMMessageAttribute<CashOutForecast5, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> FundsCashFlow.mmExceptionalCashFlowIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "XcptnlCshFlowInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the estimated cash flow out is exceptional.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(CashOutForecast5 obj) {
			return obj.getExceptionalCashFlowIndicator();
		}

		@Override
		public void setValue(CashOutForecast5 obj, Optional<YesNoIndicator> value) {
			obj.setExceptionalCashFlowIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CshOutBrkdwnDtls")
	protected List<FundCashOutBreakdown3> cashOutBreakdownDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundCashOutBreakdown3
	 * FundCashOutBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow FundsCashFlow}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshOutBrkdwnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOutBreakdownDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of cash out amounts by transaction and order type."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOutForecast5, List<FundCashOutBreakdown3>> mmCashOutBreakdownDetails = new MMMessageAssociationEnd<CashOutForecast5, List<FundCashOutBreakdown3>>() {
		{
			businessComponentTrace_lazy = () -> FundsCashFlow.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "CshOutBrkdwnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOutBreakdownDetails";
			definition = "Breakdown of cash out amounts by transaction and order type.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundCashOutBreakdown3.mmObject();
		}

		@Override
		public List<FundCashOutBreakdown3> getValue(CashOutForecast5 obj) {
			return obj.getCashOutBreakdownDetails();
		}

		@Override
		public void setValue(CashOutForecast5 obj, List<FundCashOutBreakdown3> value) {
			obj.setCashOutBreakdownDetails(value);
		}
	};
	@XmlElement(name = "AddtlBal")
	protected FundBalance1 additionalBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundBalance1
	 * FundBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast5
	 * CashOutForecast5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CashOutForecast5, Optional<FundBalance1>> mmAdditionalBalance = new MMMessageAssociationEnd<CashOutForecast5, Optional<FundBalance1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CashOutForecast5.mmObject();
			isDerived = false;
			xmlTag = "AddtlBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalance";
			definition = "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FundBalance1.mmObject();
		}

		@Override
		public Optional<FundBalance1> getValue(CashOutForecast5 obj) {
			return obj.getAdditionalBalance();
		}

		@Override
		public void setValue(CashOutForecast5 obj, Optional<FundBalance1> value) {
			obj.setAdditionalBalance(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOutForecast5.mmCashSettlementDate, com.tools20022.repository.msg.CashOutForecast5.mmSubTotalAmount,
						com.tools20022.repository.msg.CashOutForecast5.mmSubTotalUnitsNumber, com.tools20022.repository.msg.CashOutForecast5.mmExceptionalCashFlowIndicator,
						com.tools20022.repository.msg.CashOutForecast5.mmCashOutBreakdownDetails, com.tools20022.repository.msg.CashOutForecast5.mmAdditionalBalance);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalBalanceRule.forCashOutForecast5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashOutForecast5";
				definition = "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
			}
		});
		return mmObject_lazy.get();
	}

	public ISODate getCashSettlementDate() {
		return cashSettlementDate;
	}

	public CashOutForecast5 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = Objects.requireNonNull(cashSettlementDate);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getSubTotalAmount() {
		return subTotalAmount == null ? Optional.empty() : Optional.of(subTotalAmount);
	}

	public CashOutForecast5 setSubTotalAmount(ActiveOrHistoricCurrencyAndAmount subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1> getSubTotalUnitsNumber() {
		return subTotalUnitsNumber == null ? Optional.empty() : Optional.of(subTotalUnitsNumber);
	}

	public CashOutForecast5 setSubTotalUnitsNumber(FinancialInstrumentQuantity1 subTotalUnitsNumber) {
		this.subTotalUnitsNumber = subTotalUnitsNumber;
		return this;
	}

	public Optional<YesNoIndicator> getExceptionalCashFlowIndicator() {
		return exceptionalCashFlowIndicator == null ? Optional.empty() : Optional.of(exceptionalCashFlowIndicator);
	}

	public CashOutForecast5 setExceptionalCashFlowIndicator(YesNoIndicator exceptionalCashFlowIndicator) {
		this.exceptionalCashFlowIndicator = exceptionalCashFlowIndicator;
		return this;
	}

	public List<FundCashOutBreakdown3> getCashOutBreakdownDetails() {
		return cashOutBreakdownDetails == null ? cashOutBreakdownDetails = new ArrayList<>() : cashOutBreakdownDetails;
	}

	public CashOutForecast5 setCashOutBreakdownDetails(List<FundCashOutBreakdown3> cashOutBreakdownDetails) {
		this.cashOutBreakdownDetails = Objects.requireNonNull(cashOutBreakdownDetails);
		return this;
	}

	public Optional<FundBalance1> getAdditionalBalance() {
		return additionalBalance == null ? Optional.empty() : Optional.of(additionalBalance);
	}

	public CashOutForecast5 setAdditionalBalance(FundBalance1 additionalBalance) {
		this.additionalBalance = additionalBalance;
		return this;
	}
}