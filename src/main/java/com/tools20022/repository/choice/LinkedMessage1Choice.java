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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalReference3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference to a message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LinkedMessage1Choice#mmPreviousReference
 * LinkedMessage1Choice.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LinkedMessage1Choice#mmOtherReference
 * LinkedMessage1Choice.mmOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.LinkedMessage1Choice#mmRelatedReference
 * LinkedMessage1Choice.mmRelatedReference}</li>
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
 * "LinkedMessage1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reference to a message."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LinkedMessage1Choice", propOrder = {"previousReference", "otherReference", "relatedReference"})
public class LinkedMessage1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrvsRef", required = true)
	protected AdditionalReference3 previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage1Choice
	 * LinkedMessage1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Linked previous reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LinkedMessage1Choice, AdditionalReference3> mmPreviousReference = new MMMessageAssociationEnd<LinkedMessage1Choice, AdditionalReference3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LinkedMessage1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Linked previous reference.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public AdditionalReference3 getValue(LinkedMessage1Choice obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(LinkedMessage1Choice obj, AdditionalReference3 value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "OthrRef", required = true)
	protected AdditionalReference3 otherReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage1Choice
	 * LinkedMessage1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Linked other reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LinkedMessage1Choice, AdditionalReference3> mmOtherReference = new MMMessageAssociationEnd<LinkedMessage1Choice, AdditionalReference3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LinkedMessage1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Linked other reference.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public AdditionalReference3 getValue(LinkedMessage1Choice obj) {
			return obj.getOtherReference();
		}

		@Override
		public void setValue(LinkedMessage1Choice obj, AdditionalReference3 value) {
			obj.setOtherReference(value);
		}
	};
	@XmlElement(name = "RltdRef", required = true)
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.LinkedMessage1Choice
	 * LinkedMessage1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Linked related reference."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LinkedMessage1Choice, AdditionalReference3> mmRelatedReference = new MMMessageAssociationEnd<LinkedMessage1Choice, AdditionalReference3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.LinkedMessage1Choice.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Linked related reference.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public AdditionalReference3 getValue(LinkedMessage1Choice obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(LinkedMessage1Choice obj, AdditionalReference3 value) {
			obj.setRelatedReference(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.LinkedMessage1Choice.mmPreviousReference, com.tools20022.repository.choice.LinkedMessage1Choice.mmOtherReference,
						com.tools20022.repository.choice.LinkedMessage1Choice.mmRelatedReference);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LinkedMessage1Choice";
				definition = "Reference to a message.";
			}
		});
		return mmObject_lazy.get();
	}

	public AdditionalReference3 getPreviousReference() {
		return previousReference;
	}

	public LinkedMessage1Choice setPreviousReference(AdditionalReference3 previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public AdditionalReference3 getOtherReference() {
		return otherReference;
	}

	public LinkedMessage1Choice setOtherReference(AdditionalReference3 otherReference) {
		this.otherReference = Objects.requireNonNull(otherReference);
		return this;
	}

	public AdditionalReference3 getRelatedReference() {
		return relatedReference;
	}

	public LinkedMessage1Choice setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}
}