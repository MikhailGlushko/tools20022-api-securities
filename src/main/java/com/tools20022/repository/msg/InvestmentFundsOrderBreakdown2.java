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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.OrderBreakdownType1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.InvestmentFundOrder;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * An investor's instruction to either subscribe or redeem an amount of money or
 * its equivalent, for example, other assets, into or out of an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmOrderBreakdownType
 * InvestmentFundsOrderBreakdown2.mmOrderBreakdownType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2#mmAmount
 * InvestmentFundsOrderBreakdown2.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
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
 * "InvestmentFundsOrderBreakdown2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example, other assets, into or out of an investment fund."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundsOrderBreakdown2", propOrder = {"orderBreakdownType", "amount"})
public class InvestmentFundsOrderBreakdown2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrBrkdwnTp", required = true)
	protected OrderBreakdownType1Choice orderBreakdownType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OrderBreakdownType1Choice
	 * OrderBreakdownType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
	 * InvestmentFundsOrderBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrBrkdwnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderBreakdownType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of order breakdown."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundsOrderBreakdown2, OrderBreakdownType1Choice> mmOrderBreakdownType = new MMMessageAttribute<InvestmentFundsOrderBreakdown2, OrderBreakdownType1Choice>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "OrdrBrkdwnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderBreakdownType";
			definition = "Type of order breakdown.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrderBreakdownType1Choice.mmObject();
		}

		@Override
		public OrderBreakdownType1Choice getValue(InvestmentFundsOrderBreakdown2 obj) {
			return obj.getOrderBreakdownType();
		}

		@Override
		public void setValue(InvestmentFundsOrderBreakdown2 obj, OrderBreakdownType1Choice value) {
			obj.setOrderBreakdownType(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderedAmount
	 * SecuritiesOrder.mmOrderedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2
	 * InvestmentFundsOrderBreakdown2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the net amount that is attributed to an order type."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentFundsOrderBreakdown2, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<InvestmentFundsOrderBreakdown2, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmOrderedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Portion of the net amount that is attributed to an order type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(InvestmentFundsOrderBreakdown2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(InvestmentFundsOrderBreakdown2 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.mmOrderBreakdownType, com.tools20022.repository.msg.InvestmentFundsOrderBreakdown2.mmAmount);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentFundsOrderBreakdown2";
				definition = "An investor's instruction to either subscribe or redeem an amount of money or its equivalent, for example, other assets, into or out of an investment fund.";
			}
		});
		return mmObject_lazy.get();
	}

	public OrderBreakdownType1Choice getOrderBreakdownType() {
		return orderBreakdownType;
	}

	public InvestmentFundsOrderBreakdown2 setOrderBreakdownType(OrderBreakdownType1Choice orderBreakdownType) {
		this.orderBreakdownType = Objects.requireNonNull(orderBreakdownType);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public InvestmentFundsOrderBreakdown2 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}
}