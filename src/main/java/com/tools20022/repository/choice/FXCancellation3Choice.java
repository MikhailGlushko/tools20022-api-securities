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
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05;
import com.tools20022.repository.datatype.YesNoIndicator;
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
 * Choice of format for the forex cancellation information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXCancellation3Choice#mmIndicator
 * FXCancellation3Choice.mmIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FXCancellation3Choice#mmProprietary
 * FXCancellation3Choice.mmProprietary}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestV05#mmFXCancellation
 * SecuritiesTransactionCancellationRequestV05.mmFXCancellation}</li>
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
 * "FXCancellation3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for the forex cancellation information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FXCancellation3Choice", propOrder = {"indicator", "proprietary"})
public class FXCancellation3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ind", required = true)
	protected YesNoIndicator indicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FXCancellation3Choice
	 * FXCancellation3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::FXCX//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Indicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the underlying forex transaction should also be cancelled. Yes means forex is to be cancelled. No means forex is to be retained."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FXCancellation3Choice, YesNoIndicator> mmIndicator = new MMMessageAttribute<FXCancellation3Choice, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FXCancellation3Choice.mmObject();
			isDerived = false;
			xmlTag = "Ind";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FXCX//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Indicator";
			definition = "Specifies whether the underlying forex transaction should also be cancelled. Yes means forex is to be cancelled. No means forex is to be retained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(FXCancellation3Choice obj) {
			return obj.getIndicator();
		}

		@Override
		public void setValue(FXCancellation3Choice obj, YesNoIndicator value) {
			obj.setIndicator(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FXCancellation3Choice
	 * FXCancellation3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::FXCX/4!c[4c]/4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Forex cancellation information expressed as a proprietary code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FXCancellation3Choice, GenericIdentification30> mmProprietary = new MMMessageAttribute<FXCancellation3Choice, GenericIdentification30>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.FXCancellation3Choice.mmObject();
			isDerived = false;
			xmlTag = "Prtry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FXCX/4!c[4c]/4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proprietary";
			definition = "Forex cancellation information expressed as a proprietary code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GenericIdentification30.mmObject();
		}

		@Override
		public GenericIdentification30 getValue(FXCancellation3Choice obj) {
			return obj.getProprietary();
		}

		@Override
		public void setValue(FXCancellation3Choice obj, GenericIdentification30 value) {
			obj.setProprietary(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.FXCancellation3Choice.mmIndicator, com.tools20022.repository.choice.FXCancellation3Choice.mmProprietary);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTransactionCancellationRequestV05.mmFXCancellation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FXCancellation3Choice";
				definition = "Choice of format for the forex cancellation information.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getIndicator() {
		return indicator;
	}

	public FXCancellation3Choice setIndicator(YesNoIndicator indicator) {
		this.indicator = Objects.requireNonNull(indicator);
		return this;
	}

	public GenericIdentification30 getProprietary() {
		return proprietary;
	}

	public FXCancellation3Choice setProprietary(GenericIdentification30 proprietary) {
		this.proprietary = Objects.requireNonNull(proprietary);
		return this;
	}
}