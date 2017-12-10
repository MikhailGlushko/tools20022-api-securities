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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ThresholdTypeCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Margin1;
import com.tools20022.repository.msg.MarginCall1;
import com.tools20022.repository.msg.SummaryAmounts1;
import com.tools20022.repository.msg.VariationMargin1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the specific terms used to calculate a variation margin.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="VariationMarginTerm" src="doc-files/VariationMarginTerm.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.ExposureTerm
 * ExposureTerm}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm#mmThresholdAmount
 * VariationMarginTerm.mmThresholdAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm#mmThresholdType
 * VariationMarginTerm.mmThresholdType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Margin1#mmVariationMargin
 * Margin1.mmVariationMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MarginCall1#mmMarginTerms
 * MarginCall1.mmMarginTerms}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.VariationMargin1
 * VariationMargin1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "VariationMarginTerm"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the specific terms used to calculate a variation margin."</li>
 * </ul>
 */
public class VariationMarginTerm extends ExposureTerm {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount thresholdAmount;
	/**
	 * Amount of unsecured exposure a counterparty will accept before issuing a
	 * margin call in the base currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmThresholdAmount
	 * VariationMargin1.mmThresholdAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmThresholdAmount
	 * SummaryAmounts1.mmThresholdAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm
	 * VariationMarginTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of unsecured exposure a counterparty will accept before issuing a margin call in the base currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmThresholdAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmThresholdAmount, SummaryAmounts1.mmThresholdAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariationMarginTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdAmount";
			definition = "Amount of unsecured exposure a counterparty will accept before issuing a margin call in the base currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariationMarginTerm.class.getMethod("getThresholdAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ThresholdTypeCode thresholdType;
	/**
	 * Defines whetherthe threshold is applied on an unsecured or security
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ThresholdTypeCode
	 * ThresholdTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.VariationMargin1#mmThresholdType
	 * VariationMargin1.mmThresholdType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SummaryAmounts1#mmThresholdType
	 * SummaryAmounts1.mmThresholdType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.VariationMarginTerm
	 * VariationMarginTerm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThresholdType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Defines whetherthe threshold is applied on an unsecured or security basis."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmThresholdType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(VariationMargin1.mmThresholdType, SummaryAmounts1.mmThresholdType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.VariationMarginTerm.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThresholdType";
			definition = "Defines whetherthe threshold is applied on an unsecured or security basis.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ThresholdTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return VariationMarginTerm.class.getMethod("getThresholdType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "VariationMarginTerm";
				definition = "Defines the specific terms used to calculate a variation margin.";
				derivationElement_lazy = () -> Arrays.asList(Margin1.mmVariationMargin, MarginCall1.mmMarginTerms);
				superType_lazy = () -> ExposureTerm.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.VariationMarginTerm.mmThresholdAmount, com.tools20022.repository.entity.VariationMarginTerm.mmThresholdType);
				derivationComponent_lazy = () -> Arrays.asList(VariationMargin1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return VariationMarginTerm.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getThresholdAmount() {
		return thresholdAmount;
	}

	public void setThresholdAmount(ActiveCurrencyAndAmount thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public ThresholdTypeCode getThresholdType() {
		return thresholdType;
	}

	public void setThresholdType(ThresholdTypeCode thresholdType) {
		this.thresholdType = thresholdType;
	}
}