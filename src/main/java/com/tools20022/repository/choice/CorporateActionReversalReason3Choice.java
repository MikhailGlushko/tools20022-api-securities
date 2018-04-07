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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionReversalReason1Code;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a standard code or proprietary code to specify the reason for
 * the reversal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#mmCode
 * CorporateActionReversalReason3Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice#mmProprietary
 * CorporateActionReversalReason3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason
 * CorporateActionStatusReason}</li>
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
 * "CorporateActionReversalReason3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a standard code or proprietary code to specify the reason for the reversal."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionReversalReason3Choice", propOrder = {"code", "proprietary"})
public class CorporateActionReversalReason3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected CorporateActionReversalReason1Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmReversalReason
	 * CorporateActionStatusReason.mmReversalReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice
	 * CorporateActionReversalReason3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standard code to specify the reason for the reversal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionReversalReason3Choice, CorporateActionReversalReason1Code> mmCode = new MMMessageAttribute<CorporateActionReversalReason3Choice, CorporateActionReversalReason1Code>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmReversalReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionReversalReason3Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Standard code to specify the reason for the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionReversalReason1Code.mmObject();
		}

		@Override
		public CorporateActionReversalReason1Code getValue(CorporateActionReversalReason3Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(CorporateActionReversalReason3Choice obj, CorporateActionReversalReason1Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification30 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmReversalReason
	 * CorporateActionStatusReason.mmReversalReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionReversalReason3Choice
	 * CorporateActionReversalReason3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proprietary identification for the reason of the reversal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionReversalReason3Choice, GenericIdentification30> mmProprietary = new MMMessageAttribute<CorporateActionReversalReason3Choice, GenericIdentification30>() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmReversalReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.CorporateActionReversalReason3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary identification for the reason of the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public GenericIdentification30 getValue(CorporateActionReversalReason3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(CorporateActionReversalReason3Choice obj, GenericIdentification30 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.CorporateActionReversalReason3Choice.mmCode, com.tools20022.repository.choice.CorporateActionReversalReason3Choice.mmProprietary);
				trace_lazy = () -> CorporateActionStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReversalReason3Choice";
				definition = "Choice between a standard code or proprietary code to specify the reason for the reversal.";
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionReversalReason1Code getCode() {
		return code;
	}

	public CorporateActionReversalReason3Choice setCode(CorporateActionReversalReason1Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification30 getProprietary() {
		return proprietary;
	}

	public CorporateActionReversalReason3Choice setProprietary(GenericIdentification30 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}