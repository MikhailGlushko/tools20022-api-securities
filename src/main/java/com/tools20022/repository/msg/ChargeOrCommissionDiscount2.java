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
import com.tools20022.repository.choice.WaivingInstruction2Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Adjustment;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Discounts or waivers to charges and commissions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2#mmAmount
 * ChargeOrCommissionDiscount2.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2#mmRate
 * ChargeOrCommissionDiscount2.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2#mmBasis
 * ChargeOrCommissionDiscount2.mmBasis}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commission Commission}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDiscountElementRule#forChargeOrCommissionDiscount2
 * ConstraintDiscountElementRule.forChargeOrCommissionDiscount2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeOrCommissionDiscount2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Discounts or waivers to charges and commissions."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1
 * ChargeOrCommissionDiscount1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ChargeOrCommissionDiscount2", propOrder = {"amount", "rate", "basis"})
public class ChargeOrCommissionDiscount2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amt")
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
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionAmount
	 * Commission.mmCommissionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2
	 * ChargeOrCommissionDiscount2}</li>
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
	 * definition} = "Amount of discount or waiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmAmount
	 * ChargeOrCommissionDiscount1.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargeOrCommissionDiscount2, Optional<ActiveCurrencyAndAmount>> mmAmount = new MMMessageAttribute<ChargeOrCommissionDiscount2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ChargeOrCommissionDiscount2.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of discount or waiver.";
			previousVersion_lazy = () -> ChargeOrCommissionDiscount1.mmAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(ChargeOrCommissionDiscount2 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(ChargeOrCommissionDiscount2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "Rate")
	protected PercentageRate rate;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmChargeRate
	 * Adjustment.mmChargeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2
	 * ChargeOrCommissionDiscount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of discount or waiver."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmRate
	 * ChargeOrCommissionDiscount1.mmRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ChargeOrCommissionDiscount2, Optional<PercentageRate>> mmRate = new MMMessageAttribute<ChargeOrCommissionDiscount2, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmChargeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.ChargeOrCommissionDiscount2.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Rate of discount or waiver.";
			previousVersion_lazy = () -> ChargeOrCommissionDiscount1.mmRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(ChargeOrCommissionDiscount2 obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(ChargeOrCommissionDiscount2 obj, Optional<PercentageRate> value) {
			obj.setRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Bsis")
	protected WaivingInstruction2Choice basis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.WaivingInstruction2Choice
	 * WaivingInstruction2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmCommissionWaiving
	 * Commission.mmCommissionWaiving}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount2
	 * ChargeOrCommissionDiscount2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of the discount or rebate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ChargeOrCommissionDiscount1#mmBasis
	 * ChargeOrCommissionDiscount1.mmBasis}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ChargeOrCommissionDiscount2, Optional<WaivingInstruction2Choice>> mmBasis = new MMMessageAssociationEnd<ChargeOrCommissionDiscount2, Optional<WaivingInstruction2Choice>>() {
		{
			businessElementTrace_lazy = () -> Commission.mmCommissionWaiving;
			componentContext_lazy = () -> com.tools20022.repository.msg.ChargeOrCommissionDiscount2.mmObject();
			isDerived = false;
			xmlTag = "Bsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basis";
			definition = "Form of the discount or rebate.";
			previousVersion_lazy = () -> ChargeOrCommissionDiscount1.mmBasis;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> WaivingInstruction2Choice.mmObject();
		}

		@Override
		public Optional<WaivingInstruction2Choice> getValue(ChargeOrCommissionDiscount2 obj) {
			return obj.getBasis();
		}

		@Override
		public void setValue(ChargeOrCommissionDiscount2 obj, Optional<WaivingInstruction2Choice> value) {
			obj.setBasis(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ChargeOrCommissionDiscount2.mmAmount, com.tools20022.repository.msg.ChargeOrCommissionDiscount2.mmRate,
						com.tools20022.repository.msg.ChargeOrCommissionDiscount2.mmBasis);
				trace_lazy = () -> Commission.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDiscountElementRule.forChargeOrCommissionDiscount2);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeOrCommissionDiscount2";
				definition = "Discounts or waivers to charges and commissions.";
				previousVersion_lazy = () -> ChargeOrCommissionDiscount1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ActiveCurrencyAndAmount> getAmount() {
		return amount == null ? Optional.empty() : Optional.of(amount);
	}

	public ChargeOrCommissionDiscount2 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
		return this;
	}

	public Optional<PercentageRate> getRate() {
		return rate == null ? Optional.empty() : Optional.of(rate);
	}

	public ChargeOrCommissionDiscount2 setRate(PercentageRate rate) {
		this.rate = rate;
		return this;
	}

	public Optional<WaivingInstruction2Choice> getBasis() {
		return basis == null ? Optional.empty() : Optional.of(basis);
	}

	public ChargeOrCommissionDiscount2 setBasis(WaivingInstruction2Choice basis) {
		this.basis = basis;
		return this;
	}
}