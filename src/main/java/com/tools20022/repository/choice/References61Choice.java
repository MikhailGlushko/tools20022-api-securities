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
import com.tools20022.repository.area.sese.TransferCancellationStatusReportV06;
import com.tools20022.repository.area.sese.TransferInstructionStatusReportV06;
import com.tools20022.repository.area.setr.OrderCancellationStatusReportV04;
import com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02;
import com.tools20022.repository.area.setr.OrderInstructionStatusReportV04;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalReference8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of references used to reference a previous transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References61Choice#mmRelatedReference
 * References61Choice.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References61Choice#mmOtherReference
 * References61Choice.mmOtherReference}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderCancellationStatusReportV04#mmReference
 * OrderCancellationStatusReportV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderInstructionStatusReportV04#mmReference
 * OrderInstructionStatusReportV04.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.OrderConfirmationStatusReportV02#mmReference
 * OrderConfirmationStatusReportV02.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmReference
 * TransferCancellationStatusReportV06.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInstructionStatusReportV06#mmReference
 * TransferInstructionStatusReportV06.mmReference}</li>
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
 * "References61Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of references used to reference a previous transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.References62Choice
 * References62Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References61Choice", propOrder = {"relatedReference", "otherReference"})
public class References61Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdRef", required = true)
	protected List<AdditionalReference8> relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References61Choice
	 * References61Choice}</li>
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
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References62Choice#mmPreviousReference
	 * References62Choice.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References61Choice, List<AdditionalReference8>> mmRelatedReference = new MMMessageAssociationEnd<References61Choice, List<AdditionalReference8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References61Choice.mmObject();
			isDerived = false;
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(References62Choice.mmPreviousReference);
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public List<AdditionalReference8> getValue(References61Choice obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(References61Choice obj, List<AdditionalReference8> value) {
			obj.setRelatedReference(value);
		}
	};
	@XmlElement(name = "OthrRef", required = true)
	protected List<AdditionalReference8> otherReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References61Choice
	 * References61Choice}</li>
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
	 * definition} =
	 * "Reference to a linked proprietary message or reference of a system that was previously received."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References62Choice#mmOtherReference
	 * References62Choice.mmOtherReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References61Choice, List<AdditionalReference8>> mmOtherReference = new MMMessageAssociationEnd<References61Choice, List<AdditionalReference8>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References61Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherReference";
			definition = "Reference to a linked proprietary message or reference of a system that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(References62Choice.mmOtherReference);
			maxOccurs = 2;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public List<AdditionalReference8> getValue(References61Choice obj) {
			return obj.getOtherReference();
		}

		@Override
		public void setValue(References61Choice obj, List<AdditionalReference8> value) {
			obj.setOtherReference(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References61Choice.mmRelatedReference, com.tools20022.repository.choice.References61Choice.mmOtherReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(OrderCancellationStatusReportV04.mmReference, OrderInstructionStatusReportV04.mmReference, OrderConfirmationStatusReportV02.mmReference,
						TransferCancellationStatusReportV06.mmReference, TransferInstructionStatusReportV06.mmReference);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "References61Choice";
				definition = "Choice of references used to reference a previous transaction.";
				nextVersions_lazy = () -> Arrays.asList(References62Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<AdditionalReference8> getRelatedReference() {
		return relatedReference == null ? relatedReference = new ArrayList<>() : relatedReference;
	}

	public References61Choice setRelatedReference(List<AdditionalReference8> relatedReference) {
		this.relatedReference = Objects.requireNonNull(relatedReference);
		return this;
	}

	public List<AdditionalReference8> getOtherReference() {
		return otherReference == null ? otherReference = new ArrayList<>() : otherReference;
	}

	public References61Choice setOtherReference(List<AdditionalReference8> otherReference) {
		this.otherReference = Objects.requireNonNull(otherReference);
		return this;
	}
}