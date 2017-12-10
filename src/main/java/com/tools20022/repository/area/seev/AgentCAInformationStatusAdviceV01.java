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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.choice.CorporateActionInformationStatus1Choice;
import com.tools20022.repository.msg.CorporateActionAdditionalInformation1;
import com.tools20022.repository.msg.DocumentIdentification8;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to a CSD to report the
 * status, or change in status, of an information advice.<br>
 * <b>Usage</b><br>
 * This message must be used in response to an Agent Corporate Action
 * Information Advice in the case of a rejection. However, it may also be used
 * to report other statuses.<br>
 * The information advice identification must be present to link this message to
 * the information advice for which the status is provided.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmIdentification
 * AgentCAInformationStatusAdviceV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmAgentCAInformationAdviceIdentification
 * AgentCAInformationStatusAdviceV01.mmAgentCAInformationAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmCorporateActionAdditionalInformation
 * AgentCAInformationStatusAdviceV01.mmCorporateActionAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmInformationStatusDetails
 * AgentCAInformationStatusAdviceV01.mmInformationStatusDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAInfStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.024.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAInformationStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to report the status, or change in status, of an information advice.\r\nUsage\r\nThis message must be used in response to an Agent Corporate Action Information Advice in the case of a rejection. However, it may also be used to report other statuses.\r\nThe information advice identification must be present to link this message to the information advice for which the status is provided."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AgentCAInformationStatusAdviceV01", propOrder = {"identification", "agentCAInformationAdviceIdentification", "corporateActionAdditionalInformation", "informationStatusDetails"})
public class AgentCAInformationStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected DocumentIdentification8 identification;
	/**
	 * Identification assigned by the Sender to unambiguously identify the
	 * status advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the status advice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the status advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationStatusAdviceV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DocumentIdentification8 agentCAInformationAdviceIdentification;
	/**
	 * Identification of the linked Agent CA Information Advice for which a
	 * status is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAInfAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAInformationAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the linked Agent CA Information Advice for which a status is given."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgentCAInformationAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgtCAInfAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAInformationAdviceIdentification";
			definition = "Identification of the linked Agent CA Information Advice for which a status is given.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationStatusAdviceV01.class.getMethod("getAgentCAInformationAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionAdditionalInformation1 corporateActionAdditionalInformation;
	/**
	 * Additional information about the corporate action such as the delivery
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the corporate action such as the delivery details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCorporateActionAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "CorpActnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionAdditionalInformation";
			definition = "Additional information about the corporate action such as the delivery details.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationStatusAdviceV01.class.getMethod("getCorporateActionAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionInformationStatus1Choice informationStatusDetails;
	/**
	 * Status of the information advice sent by the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionInformationStatus1Choice
	 * CorporateActionInformationStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfStsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationStatusDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the information advice sent by the CSD."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInformationStatusDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "InfStsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationStatusDetails";
			definition = "Status of the information advice sent by the CSD.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformationStatus1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AgentCAInformationStatusAdviceV01.class.getMethod("getInformationStatusDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAInformationStatusAdviceV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to report the status, or change in status, of an information advice.\r\nUsage\r\nThis message must be used in response to an Agent Corporate Action Information Advice in the case of a rejection. However, it may also be used to report other statuses.\r\nThe information advice identification must be present to link this message to the information advice for which the status is provided.";
				rootElement = "Document";
				xmlTag = "AgtCAInfStsAdvc";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmAgentCAInformationAdviceIdentification,
						com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmCorporateActionAdditionalInformation, com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01.mmInformationStatusDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "024";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAInformationStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "AgtCAInfAdvcId", required = true)
	public DocumentIdentification8 getAgentCAInformationAdviceIdentification() {
		return agentCAInformationAdviceIdentification;
	}

	public void setAgentCAInformationAdviceIdentification(DocumentIdentification8 agentCAInformationAdviceIdentification) {
		this.agentCAInformationAdviceIdentification = agentCAInformationAdviceIdentification;
	}

	@XmlElement(name = "CorpActnAddtlInf")
	public CorporateActionAdditionalInformation1 getCorporateActionAdditionalInformation() {
		return corporateActionAdditionalInformation;
	}

	public void setCorporateActionAdditionalInformation(CorporateActionAdditionalInformation1 corporateActionAdditionalInformation) {
		this.corporateActionAdditionalInformation = corporateActionAdditionalInformation;
	}

	@XmlElement(name = "InfStsDtls", required = true)
	public CorporateActionInformationStatus1Choice getInformationStatusDetails() {
		return informationStatusDetails;
	}

	public void setInformationStatusDetails(CorporateActionInformationStatus1Choice informationStatusDetails) {
		this.informationStatusDetails = informationStatusDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.024.01.01")
	static public class Document {
		@XmlElement(name = "AgtCAInfStsAdvc", required = true)
		public AgentCAInformationStatusAdviceV01 messageBody;
	}
}