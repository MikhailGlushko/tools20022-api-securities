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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.RateValueType7Code;
import com.tools20022.repository.entity.AmountRatio;
import com.tools20022.repository.entity.QuantityRatio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountToAmountRatio2;
import com.tools20022.repository.msg.QuantityToQuantityRatio1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format to express a ratio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#mmQuantityToQuantity
 * RatioFormat17Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#mmNotSpecifiedRate
 * RatioFormat17Choice.mmNotSpecifiedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice#mmAmountToAmount
 * RatioFormat17Choice.mmAmountToAmount}</li>
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
 * "RatioFormat17Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format to express a ratio."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RatioFormat17Choice", propOrder = {"quantityToQuantity", "notSpecifiedRate", "amountToAmount"})
public class RatioFormat17Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QtyToQty", required = true)
	protected QuantityToQuantityRatio1 quantityToQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
	 * QuantityToQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice
	 * RatioFormat17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92D::</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RatioFormat17Choice, QuantityToQuantityRatio1> mmQuantityToQuantity = new MMMessageAssociationEnd<RatioFormat17Choice, QuantityToQuantityRatio1>() {
		{
			businessComponentTrace_lazy = () -> QuantityRatio.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat17Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92D::"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToQuantity";
			definition = "Ratio expressed as a quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityToQuantityRatio1.mmObject();
		}

		@Override
		public QuantityToQuantityRatio1 getValue(RatioFormat17Choice obj) {
			return obj.getQuantityToQuantity();
		}

		@Override
		public void setValue(RatioFormat17Choice obj, QuantityToQuantityRatio1 value) {
			obj.setQuantityToQuantity(value);
		}
	};
	@XmlElement(name = "NotSpcfdRate", required = true)
	protected RateValueType7Code notSpecifiedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateValueType7Code
	 * RateValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice
	 * RatioFormat17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the ratio not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RatioFormat17Choice, RateValueType7Code> mmNotSpecifiedRate = new MMMessageAttribute<RatioFormat17Choice, RateValueType7Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat17Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the ratio not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateValueType7Code.mmObject();
		}

		@Override
		public RateValueType7Code getValue(RatioFormat17Choice obj) {
			return obj.getNotSpecifiedRate();
		}

		@Override
		public void setValue(RatioFormat17Choice obj, RateValueType7Code value) {
			obj.setNotSpecifiedRate(value);
		}
	};
	@XmlElement(name = "AmtToAmt", required = true)
	protected AmountToAmountRatio2 amountToAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2
	 * AmountToAmountRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat17Choice
	 * RatioFormat17Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92L:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quotient of amounts."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RatioFormat17Choice, AmountToAmountRatio2> mmAmountToAmount = new MMMessageAssociationEnd<RatioFormat17Choice, AmountToAmountRatio2>() {
		{
			businessComponentTrace_lazy = () -> AmountRatio.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat17Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92L:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToAmount";
			definition = "Ratio expressed as a quotient of amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountToAmountRatio2.mmObject();
		}

		@Override
		public AmountToAmountRatio2 getValue(RatioFormat17Choice obj) {
			return obj.getAmountToAmount();
		}

		@Override
		public void setValue(RatioFormat17Choice obj, AmountToAmountRatio2 value) {
			obj.setAmountToAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RatioFormat17Choice.mmQuantityToQuantity, com.tools20022.repository.choice.RatioFormat17Choice.mmNotSpecifiedRate,
						com.tools20022.repository.choice.RatioFormat17Choice.mmAmountToAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RatioFormat17Choice";
				definition = "Choice of format to express a ratio.";
			}
		});
		return mmObject_lazy.get();
	}

	public QuantityToQuantityRatio1 getQuantityToQuantity() {
		return quantityToQuantity;
	}

	public RatioFormat17Choice setQuantityToQuantity(QuantityToQuantityRatio1 quantityToQuantity) {
		this.quantityToQuantity = Objects.requireNonNull(quantityToQuantity);
		return this;
	}

	public RateValueType7Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public RatioFormat17Choice setNotSpecifiedRate(RateValueType7Code notSpecifiedRate) {
		this.notSpecifiedRate = Objects.requireNonNull(notSpecifiedRate);
		return this;
	}

	public AmountToAmountRatio2 getAmountToAmount() {
		return amountToAmount;
	}

	public RatioFormat17Choice setAmountToAmount(AmountToAmountRatio2 amountToAmount) {
		this.amountToAmount = Objects.requireNonNull(amountToAmount);
		return this;
	}
}