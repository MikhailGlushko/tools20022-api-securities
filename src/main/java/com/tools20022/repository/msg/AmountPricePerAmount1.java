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
import com.tools20022.repository.choice.AmountPriceType1FormatChoice;
import com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies a ratio: Amount price per amount.
 * 
 * Example: ISIN US629377AS17. Repurchase USD1087.17 cash for every USD1000
 * stock (NRG Energy Inc 8% Senior Notes 15/12/13).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmAmountPriceType
 * AmountPricePerAmount1.mmAmountPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmPriceValue
 * AmountPricePerAmount1.mmPriceValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmAmount
 * AmountPricePerAmount1.mmAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "AmountPricePerAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a ratio: Amount price per amount.\n\nExample:\nISIN US629377AS17. Repurchase USD1087.17 cash for every USD1000 stock (NRG Energy Inc 8% Senior Notes 15/12/13)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountPricePerAmount1", propOrder = {"amountPriceType", "priceValue", "amount"})
public class AmountPricePerAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AmtPricTp", required = true)
	protected AmountPriceType1FormatChoice amountPriceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice
	 * AmountPriceType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfAmount
	 * SecuritiesPricing.mmTypeOfAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1
	 * AmountPricePerAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of amount price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountPricePerAmount1, AmountPriceType1FormatChoice> mmAmountPriceType = new MMMessageAttribute<AmountPricePerAmount1, AmountPriceType1FormatChoice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmTypeOfAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerAmount1.mmObject();
			isDerived = false;
			xmlTag = "AmtPricTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPriceType";
			definition = "Type of amount price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountPriceType1FormatChoice.mmObject();
		}

		@Override
		public AmountPriceType1FormatChoice getValue(AmountPricePerAmount1 obj) {
			return obj.getAmountPriceType();
		}

		@Override
		public void setValue(AmountPricePerAmount1 obj, AmountPriceType1FormatChoice value) {
			obj.setAmountPriceType(value);
		}
	};
	@XmlElement(name = "PricVal", required = true)
	protected ActiveCurrencyAnd13DecimalAmount priceValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1
	 * AmountPricePerAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountPricePerAmount1, ActiveCurrencyAnd13DecimalAmount> mmPriceValue = new MMMessageAttribute<AmountPricePerAmount1, ActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerAmount1.mmObject();
			isDerived = false;
			xmlTag = "PricVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceValue";
			definition = "Value of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(AmountPricePerAmount1 obj) {
			return obj.getPriceValue();
		}

		@Override
		public void setValue(AmountPricePerAmount1 obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setPriceValue(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAnd13DecimalAmount
	 * ActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
	 * SecuritiesPricing.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1
	 * AmountPricePerAmount1}</li>
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
	 * definition} = "The amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountPricePerAmount1, ActiveCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<AmountPricePerAmount1, ActiveCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountPricePerAmount1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "The amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAnd13DecimalAmount getValue(AmountPricePerAmount1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(AmountPricePerAmount1 obj, ActiveCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountPricePerAmount1.mmAmountPriceType, com.tools20022.repository.msg.AmountPricePerAmount1.mmPriceValue,
						com.tools20022.repository.msg.AmountPricePerAmount1.mmAmount);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountPricePerAmount1";
				definition = "Specifies a ratio: Amount price per amount.\n\nExample:\nISIN US629377AS17. Repurchase USD1087.17 cash for every USD1000 stock (NRG Energy Inc 8% Senior Notes 15/12/13).";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountPriceType1FormatChoice getAmountPriceType() {
		return amountPriceType;
	}

	public AmountPricePerAmount1 setAmountPriceType(AmountPriceType1FormatChoice amountPriceType) {
		this.amountPriceType = Objects.requireNonNull(amountPriceType);
		return this;
	}

	public ActiveCurrencyAnd13DecimalAmount getPriceValue() {
		return priceValue;
	}

	public AmountPricePerAmount1 setPriceValue(ActiveCurrencyAnd13DecimalAmount priceValue) {
		this.priceValue = Objects.requireNonNull(priceValue);
		return this;
	}

	public ActiveCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public AmountPricePerAmount1 setAmount(ActiveCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}
}