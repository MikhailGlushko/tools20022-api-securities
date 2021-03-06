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
import com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NotificationProcessingStatus1;
import com.tools20022.repository.msg.NotificationRejectionReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the status of a notification advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NotificationAdviceStatus1Choice#mmProcessedStatus
 * NotificationAdviceStatus1Choice.mmProcessedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NotificationAdviceStatus1Choice#mmRejectedStatus
 * NotificationAdviceStatus1Choice.mmRejectedStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationStatusAdviceV01#mmNotificationAdviceStatus
 * AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus}</li>
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
 * "NotificationAdviceStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the status of a notification advice."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NotificationAdviceStatus1Choice", propOrder = {"processedStatus", "rejectedStatus"})
public class NotificationAdviceStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcdSts", required = true)
	protected NotificationProcessingStatus1 processedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NotificationProcessingStatus1
	 * NotificationProcessingStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NotificationAdviceStatus1Choice
	 * NotificationAdviceStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the processing status of advice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationAdviceStatus1Choice, NotificationProcessingStatus1> mmProcessedStatus = new MMMessageAssociationEnd<NotificationAdviceStatus1Choice, NotificationProcessingStatus1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NotificationAdviceStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "PrcdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessedStatus";
			definition = "Provides information about the processing status of advice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NotificationProcessingStatus1.mmObject();
		}

		@Override
		public NotificationProcessingStatus1 getValue(NotificationAdviceStatus1Choice obj) {
			return obj.getProcessedStatus();
		}

		@Override
		public void setValue(NotificationAdviceStatus1Choice obj, NotificationProcessingStatus1 value) {
			obj.setProcessedStatus(value);
		}
	};
	@XmlElement(name = "RjctdSts", required = true)
	protected NotificationRejectionReason1 rejectedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.NotificationRejectionReason1
	 * NotificationRejectionReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.NotificationAdviceStatus1Choice
	 * NotificationAdviceStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the rejection status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NotificationAdviceStatus1Choice, NotificationRejectionReason1> mmRejectedStatus = new MMMessageAssociationEnd<NotificationAdviceStatus1Choice, NotificationRejectionReason1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.NotificationAdviceStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedStatus";
			definition = "Provides information about the rejection status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NotificationRejectionReason1.mmObject();
		}

		@Override
		public NotificationRejectionReason1 getValue(NotificationAdviceStatus1Choice obj) {
			return obj.getRejectedStatus();
		}

		@Override
		public void setValue(NotificationAdviceStatus1Choice obj, NotificationRejectionReason1 value) {
			obj.setRejectedStatus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.NotificationAdviceStatus1Choice.mmProcessedStatus, com.tools20022.repository.choice.NotificationAdviceStatus1Choice.mmRejectedStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationStatusAdviceV01.mmNotificationAdviceStatus);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NotificationAdviceStatus1Choice";
				definition = "Provides the status of a notification advice.";
			}
		});
		return mmObject_lazy.get();
	}

	public NotificationProcessingStatus1 getProcessedStatus() {
		return processedStatus;
	}

	public NotificationAdviceStatus1Choice setProcessedStatus(NotificationProcessingStatus1 processedStatus) {
		this.processedStatus = Objects.requireNonNull(processedStatus);
		return this;
	}

	public NotificationRejectionReason1 getRejectedStatus() {
		return rejectedStatus;
	}

	public NotificationAdviceStatus1Choice setRejectedStatus(NotificationRejectionReason1 rejectedStatus) {
		this.rejectedStatus = Objects.requireNonNull(rejectedStatus);
		return this;
	}
}