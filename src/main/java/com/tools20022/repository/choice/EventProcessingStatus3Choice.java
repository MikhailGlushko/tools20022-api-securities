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
import com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NoSpecifiedReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the status of a corporate action or the status of
 * a payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmComplete
 * EventProcessingStatus3Choice.mmComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmReconciled
 * EventProcessingStatus3Choice.mmReconciled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmPending
 * EventProcessingStatus3Choice.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice#mmProprietaryStatus
 * EventProcessingStatus3Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionEventProcessingStatusAdviceV06#mmEventProcessingStatus
 * CorporateActionEventProcessingStatusAdviceV06.mmEventProcessingStatus}</li>
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
 * "EventProcessingStatus3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the status of a corporate action or the status of a payment."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "EventProcessingStatus3Choice", propOrder = {"complete", "reconciled", "pending", "proprietaryStatus"})
public class EventProcessingStatus3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected NoSpecifiedReason1 complete;
	/**
	 * Specifies that a corporate action event processing has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice
	 * EventProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmplt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a corporate action event processing has been completed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmComplete = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> EventProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Cmplt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Specifies that a corporate action event processing has been completed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}
	};
	protected NoSpecifiedReason1 reconciled;
	/**
	 * Corporate action event processing specifying that the funds paid have
	 * been reconciled with the funds received from the agent (meaning that
	 * there is no more risk of payment to be reversed).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NoSpecifiedReason1
	 * NoSpecifiedReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice
	 * EventProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rcncld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event processing specifying that the funds paid have been reconciled with the funds received from the agent (meaning that there is no more risk of payment to be reversed)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciled = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> EventProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rcncld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciled";
			definition = "Corporate action event processing specifying that the funds paid have been reconciled with the funds received from the agent (meaning that there is no more risk of payment to be reversed).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NoSpecifiedReason1.mmObject();
		}
	};
	protected PendingStatus41Choice pending;
	/**
	 * Specifies that a corporate action event processing has not been fully
	 * completed and is therefore pending.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PendingStatus41Choice
	 * PendingStatus41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice
	 * EventProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a corporate action event processing has not been fully completed and is therefore pending."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPending = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> EventProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Specifies that a corporate action event processing has not been fully completed and is therefore pending.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.choice.PendingStatus41Choice.mmObject();
		}
	};
	protected ProprietaryStatusAndReason6 proprietaryStatus;
	/**
	 * Proprietary status related to the event processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason6
	 * ProprietaryStatusAndReason6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.EventProcessingStatus3Choice
	 * EventProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proprietary status related to the event processing."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProprietaryStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> EventProcessingStatus3Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Proprietary status related to the event processing.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason6.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(EventProcessingStatus3Choice.mmComplete, EventProcessingStatus3Choice.mmReconciled, EventProcessingStatus3Choice.mmPending, EventProcessingStatus3Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionEventProcessingStatusAdviceV06.mmEventProcessingStatus);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventProcessingStatus3Choice";
				definition = "Provides information about the status of a corporate action or the status of a payment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Cmplt", required = true)
	public NoSpecifiedReason1 getComplete() {
		return complete;
	}

	public void setComplete(NoSpecifiedReason1 complete) {
		this.complete = complete;
	}

	@XmlElement(name = "Rcncld", required = true)
	public NoSpecifiedReason1 getReconciled() {
		return reconciled;
	}

	public void setReconciled(NoSpecifiedReason1 reconciled) {
		this.reconciled = reconciled;
	}

	@XmlElement(name = "Pdg", required = true)
	public PendingStatus41Choice getPending() {
		return pending;
	}

	public void setPending(com.tools20022.repository.choice.PendingStatus41Choice pending) {
		this.pending = pending;
	}

	@XmlElement(name = "PrtrySts", required = true)
	public ProprietaryStatusAndReason6 getProprietaryStatus() {
		return proprietaryStatus;
	}

	public void setProprietaryStatus(ProprietaryStatusAndReason6 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
	}
}