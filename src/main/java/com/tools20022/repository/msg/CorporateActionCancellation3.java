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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07;
import com.tools20022.repository.codeset.CorporateActionCancellationReason1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.CorporateActionNotification;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.entity.CorporateActionStatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Corporate action event cancellation status and reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReasonCode
 * CorporateActionCancellation3.mmCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmCancellationReason
 * CorporateActionCancellation3.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3#mmProcessingStatus
 * CorporateActionCancellation3.mmProcessingStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
 * CorporateActionNotification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionCancellationAdviceV07#mmCancellationAdviceGeneralInformation
 * CorporateActionCancellationAdviceV07.mmCancellationAdviceGeneralInformation}</li>
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
 * "CorporateActionCancellation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Corporate action event cancellation status and reason."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionCancellation3", propOrder = {"cancellationReasonCode", "cancellationReason", "processingStatus"})
public class CorporateActionCancellation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionCancellationReason1Code cancellationReasonCode;
	/**
	 * Specifies reasons for cancellation of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionCancellationReason1Code
	 * CorporateActionCancellationReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
	 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
	 * CorporateActionCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies reasons for cancellation of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReasonCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmCorporateActionCancellationReason;
			componentContext_lazy = () -> CorporateActionCancellation3.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonCode";
			definition = "Specifies reasons for cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionCancellationReason1Code.mmObject();
		}
	};
	protected Max140Text cancellationReason;
	/**
	 * Additional information about cancellation of a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatusReason#mmCorporateActionCancellationReason
	 * CorporateActionStatusReason.mmCorporateActionCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
	 * CorporateActionCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about cancellation of a corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatusReason.mmCorporateActionCancellationReason;
			componentContext_lazy = () -> CorporateActionCancellation3.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Additional information about cancellation of a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected CorporateActionEventStatus1 processingStatus;
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1
	 * CorporateActionEventStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus
	 * CorporateActionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionCancellation3
	 * CorporateActionCancellation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionStatus.mmObject();
			componentContext_lazy = () -> CorporateActionCancellation3.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionEventStatus1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionCancellation3.mmCancellationReasonCode, CorporateActionCancellation3.mmCancellationReason, CorporateActionCancellation3.mmProcessingStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionCancellationAdviceV07.mmCancellationAdviceGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionCancellation3";
				definition = "Corporate action event cancellation status and reason.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlRsnCd", required = true)
	public CorporateActionCancellationReason1Code getCancellationReasonCode() {
		return cancellationReasonCode;
	}

	public void setCancellationReasonCode(CorporateActionCancellationReason1Code cancellationReasonCode) {
		this.cancellationReasonCode = cancellationReasonCode;
	}

	@XmlElement(name = "CxlRsn")
	public Max140Text getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(Max140Text cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

	@XmlElement(name = "PrcgSts", required = true)
	public CorporateActionEventStatus1 getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(com.tools20022.repository.msg.CorporateActionEventStatus1 processingStatus) {
		this.processingStatus = processingStatus;
	}
}