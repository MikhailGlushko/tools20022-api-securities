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
import com.tools20022.repository.area.seev.MeetingInstructionStatusV05;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MessageIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Type of instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice#mmInstructionIdentification
 * InstructionType1Choice.mmInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice#mmInstructionCancellationIdentification
 * InstructionType1Choice.mmInstructionCancellationIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingInstructionStatusV05#mmInstructionType
 * MeetingInstructionStatusV05.mmInstructionType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionType1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InstructionType1Choice", propOrder = {"instructionIdentification", "instructionCancellationIdentification"})
public class InstructionType1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification instructionIdentification;
	/**
	 * Identifies the meeting instruction message for which the status is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice
	 * InstructionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting instruction message for which the status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InstructionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIdentification";
			definition = "Identifies the meeting instruction message for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification.mmObject();
		}
	};
	protected MessageIdentification instructionCancellationIdentification;
	/**
	 * Identifies the meeting instruction cancellation request message for which
	 * the status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.InstructionType1Choice
	 * InstructionType1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrCxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting instruction cancellation request message for which the status is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstructionCancellationIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InstructionType1Choice.mmObject();
			isDerived = false;
			xmlTag = "InstrCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionCancellationIdentification";
			definition = "Identifies the meeting instruction cancellation request message for which the status is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MessageIdentification.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InstructionType1Choice.mmInstructionIdentification, InstructionType1Choice.mmInstructionCancellationIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingInstructionStatusV05.mmInstructionType);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionType1Choice";
				definition = "Type of instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstrId", required = true)
	public MessageIdentification getInstructionIdentification() {
		return instructionIdentification;
	}

	public void setInstructionIdentification(MessageIdentification instructionIdentification) {
		this.instructionIdentification = instructionIdentification;
	}

	@XmlElement(name = "InstrCxlId", required = true)
	public MessageIdentification getInstructionCancellationIdentification() {
		return instructionCancellationIdentification;
	}

	public void setInstructionCancellationIdentification(MessageIdentification instructionCancellationIdentification) {
		this.instructionCancellationIdentification = instructionCancellationIdentification;
	}
}