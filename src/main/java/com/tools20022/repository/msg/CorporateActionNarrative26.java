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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information such as the taxation conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#mmOfferor
 * CorporateActionNarrative26.mmOfferor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#mmNewCompanyName
 * CorporateActionNarrative26.mmNewCompanyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26#mmURLAddress
 * CorporateActionNarrative26.mmURLAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionNarrative26"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information such as the taxation conditions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionNarrative26", propOrder = {"offeror", "newCompanyName", "URLAddress"})
public class CorporateActionNarrative26 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.UpdatedAdditionalInformation3> offeror;
	/**
	 * Provides the entity making the offer and is different from the issuing
	 * company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation3
	 * UpdatedAdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Offerr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offeror"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the entity making the offer and is different from the issuing company."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOfferor = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CorporateActionNarrative26.mmObject();
			isDerived = false;
			xmlTag = "Offerr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offeror";
			definition = "Provides the entity making the offer and is different from the issuing company.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation3.mmObject();
		}
	};
	protected UpdatedAdditionalInformation3 newCompanyName;
	/**
	 * Provides the new name of a company following a name change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation3
	 * UpdatedAdditionalInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewCpnyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewCompanyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the new name of a company following a name change."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewCompanyName = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionNarrative26.mmObject();
			isDerived = false;
			xmlTag = "NewCpnyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewCompanyName";
			definition = "Provides the new name of a company following a name change.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation3.mmObject();
		}
	};
	protected UpdatedURLlnformation2 uRLAddress;
	/**
	 * Provides the web address published for the event, that is, the address
	 * for the Universal Resource Locator (URL), for example, used over the www
	 * (HTTP) service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UpdatedURLlnformation2
	 * UpdatedURLlnformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmDocumentationLocation
	 * CorporateActionEvent.mmDocumentationLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNarrative26
	 * CorporateActionNarrative26}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URLAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URLAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the web address published for the event, that is, the address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmURLAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmDocumentationLocation;
			componentContext_lazy = () -> CorporateActionNarrative26.mmObject();
			isDerived = false;
			xmlTag = "URLAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URLAddress";
			definition = "Provides the web address published for the event, that is, the address for the Universal Resource Locator (URL), for example, used over the www (HTTP) service.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UpdatedURLlnformation2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNarrative26.mmOfferor, CorporateActionNarrative26.mmNewCompanyName, CorporateActionNarrative26.mmURLAddress);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrative26";
				definition = "Provides additional information such as the taxation conditions.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Offerr")
	public List<UpdatedAdditionalInformation3> getOfferor() {
		return offeror;
	}

	public void setOfferor(List<com.tools20022.repository.msg.UpdatedAdditionalInformation3> offeror) {
		this.offeror = offeror;
	}

	@XmlElement(name = "NewCpnyNm")
	public UpdatedAdditionalInformation3 getNewCompanyName() {
		return newCompanyName;
	}

	public void setNewCompanyName(com.tools20022.repository.msg.UpdatedAdditionalInformation3 newCompanyName) {
		this.newCompanyName = newCompanyName;
	}

	@XmlElement(name = "URLAdr")
	public UpdatedURLlnformation2 getURLAddress() {
		return uRLAddress;
	}

	public void setURLAddress(com.tools20022.repository.msg.UpdatedURLlnformation2 uRLAddress) {
		this.uRLAddress = uRLAddress;
	}
}