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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Security;
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
 * Choice between an indicator or a proprietary code to specify whether the
 * security is a temporary security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#mmTemporaryIndicator
 * TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice#mmProprietary
 * TemporaryFinancialInstrumentIndicator3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
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
 * "TemporaryFinancialInstrumentIndicator3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between an indicator or a proprietary code to specify whether the security is a temporary security."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TemporaryFinancialInstrumentIndicator3Choice", propOrder = {"temporaryIndicator", "proprietary"})
public class TemporaryFinancialInstrumentIndicator3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TempInd", required = true)
	protected YesNoIndicator temporaryIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
	 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice
	 * TemporaryFinancialInstrumentIndicator3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TempInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TEMP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TemporaryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Temporary financial instrument identification used for processing reasons."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TemporaryFinancialInstrumentIndicator3Choice, YesNoIndicator> mmTemporaryIndicator = new MMMessageAttribute<TemporaryFinancialInstrumentIndicator3Choice, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Security.mmTemporaryFinancialInstrumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice.mmObject();
			isDerived = false;
			xmlTag = "TempInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TEMP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TemporaryIndicator";
			definition = "Temporary financial instrument identification used for processing reasons.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(TemporaryFinancialInstrumentIndicator3Choice obj) {
			return obj.getTemporaryIndicator();
		}

		@Override
		public void setValue(TemporaryFinancialInstrumentIndicator3Choice obj, YesNoIndicator value) {
			obj.setTemporaryIndicator(value);
		}
	};
	@XmlElement(name = "Prtry", required = true)
	protected GenericIdentification30 proprietary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification30
	 * GenericIdentification30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmTemporaryFinancialInstrumentIndicator
	 * Security.mmTemporaryFinancialInstrumentIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice
	 * TemporaryFinancialInstrumentIndicator3Choice}</li>
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
	 * "Proprietary code to specify whether the security is a temporary security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TemporaryFinancialInstrumentIndicator3Choice, GenericIdentification30> mmProprietary = new MMMessageAssociationEnd<TemporaryFinancialInstrumentIndicator3Choice, GenericIdentification30>() {
		{
			businessElementTrace_lazy = () -> Security.mmTemporaryFinancialInstrumentIndicator;
			componentContext_lazy = () -> com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Proprietary code to specify whether the security is a temporary security.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public GenericIdentification30 getValue(TemporaryFinancialInstrumentIndicator3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(TemporaryFinancialInstrumentIndicator3Choice obj, GenericIdentification30 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice.mmTemporaryIndicator,
						com.tools20022.repository.choice.TemporaryFinancialInstrumentIndicator3Choice.mmProprietary);
				trace_lazy = () -> Security.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TemporaryFinancialInstrumentIndicator3Choice";
				definition = "Choice between an indicator or a proprietary code to specify whether the security is a temporary security.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getTemporaryIndicator() {
		return temporaryIndicator;
	}

	public TemporaryFinancialInstrumentIndicator3Choice setTemporaryIndicator(YesNoIndicator temporaryIndicator) {
		this.temporaryIndicator = Objects.requireNonNull(temporaryIndicator);
		return this;
	}

	public GenericIdentification30 getProprietary() {
		return proprietary;
	}

	public TemporaryFinancialInstrumentIndicator3Choice setProprietary(GenericIdentification30 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}