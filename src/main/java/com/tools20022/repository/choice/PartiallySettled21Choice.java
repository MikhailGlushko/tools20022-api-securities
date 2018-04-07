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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SettledStatusReason2Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for a partially settled reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartiallySettled21Choice#mmCode
 * PartiallySettled21Choice.mmCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PartiallySettled21Choice#mmProprietary
 * PartiallySettled21Choice.mmProprietary}</li>
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
 * "PartiallySettled21Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice between formats for a partially settled reason."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartiallySettled21Choice", propOrder = {"code", "proprietary"})
public class PartiallySettled21Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cd", required = true)
	protected SettledStatusReason2Code code;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettledStatusReason2Code
	 * SettledStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartiallySettled21Choice
	 * PartiallySettled21Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Code"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partially settled reason expressed as a code."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RejectedReason20Choice#mmCode
	 * RejectedReason20Choice.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartiallySettled21Choice, SettledStatusReason2Code> mmCode = new MMMessageAttribute<PartiallySettled21Choice, SettledStatusReason2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PartiallySettled21Choice.mmObject();
			isDerived = false;
			xmlTag = "Cd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Code";
			definition = "Partially settled reason expressed as a code.";
			previousVersion_lazy = () -> RejectedReason20Choice.mmCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettledStatusReason2Code.mmObject();
		}

		@Override
		public SettledStatusReason2Code getValue(PartiallySettled21Choice obj) {
			return obj.getCode();
		}

		@Override
		public void setValue(PartiallySettled21Choice obj, SettledStatusReason2Code value) {
			obj.setCode(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification1 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification1
	 * GenericIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PartiallySettled21Choice
	 * PartiallySettled21Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND/[8c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partially settled reason expressed as a proprietary code."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.RejectedReason20Choice#mmProprietary
	 * RejectedReason20Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartiallySettled21Choice, GenericIdentification1> mmProprietary = new MMMessageAttribute<PartiallySettled21Choice, GenericIdentification1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PartiallySettled21Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND/[8c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Partially settled reason expressed as a proprietary code.";
			previousVersion_lazy = () -> RejectedReason20Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification1.mmObject();
		}

		@Override
		public GenericIdentification1 getValue(PartiallySettled21Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(PartiallySettled21Choice obj, GenericIdentification1 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PartiallySettled21Choice.mmCode, com.tools20022.repository.choice.PartiallySettled21Choice.mmProprietary);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PartiallySettled21Choice";
				definition = "Choice between formats for a partially settled reason.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettledStatusReason2Code getCode() {
		return code;
	}

	public PartiallySettled21Choice setCode(SettledStatusReason2Code code) {
		this.code = Objects.requireNonNull(code);
		return this;
	}

	public GenericIdentification1 getProprietary() {
		return proprietary;
	}

	public PartiallySettled21Choice setProprietary(GenericIdentification1 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}