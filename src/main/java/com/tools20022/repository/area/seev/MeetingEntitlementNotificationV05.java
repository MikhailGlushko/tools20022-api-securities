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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the MeetingEntitlementNotification to an issuer,
 * its agent, an intermediary or an account owner to advise the entitlement in
 * relation to a shareholders meeting.<br>
 * <b>Usage</b><br>
 * This message is sent to advise the quantity of securities held by an account
 * owner. The balance is specified for the securities for which the meeting is
 * taking place.<br>
 * This entitlement message is sent by the account servicer or the registrar to
 * an intermediary, the issuer's agent or the issuer. It is also sent between
 * the account servicer and the account owner or the party holding the right to
 * vote.<br>
 * The message is also used to amend a previously sent
 * MeetingEntitlementNotification. To notify an update, the RelatedReference
 * must be included in the message.<br>
 * This message definition is intended for use with the Business Application
 * Header (head.001.001.01).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmRelatedReference
 * MeetingEntitlementNotificationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmMeetingReference
 * MeetingEntitlementNotificationV05.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmSecurity
 * MeetingEntitlementNotificationV05.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmEligibility
 * MeetingEntitlementNotificationV05.mmEligibility}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05#mmSupplementaryData
 * MeetingEntitlementNotificationV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgEntitlmntNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.003.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingEntitlementNotificationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.\r\nUsage\r\nThis message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.\r\nThis entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.\r\nThe message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingEntitlementNotificationV05", propOrder = {"relatedReference", "meetingReference", "security", "eligibility", "supplementaryData"})
public class MeetingEntitlementNotificationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RltdRef")
	protected MessageIdentification relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
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
	 * "Identifies the meeting entitlement message to be modified."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV05, Optional<MessageIdentification>> mmRelatedReference = new MMMessageBuildingBlock<MeetingEntitlementNotificationV05, Optional<MessageIdentification>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Identifies the meeting entitlement message to be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public Optional<MessageIdentification> getValue(MeetingEntitlementNotificationV05 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV05 obj, Optional<MessageIdentification> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference7 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference7
	 * MeetingReference7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV05, MeetingReference7> mmMeetingReference = new MMMessageBuildingBlock<MeetingEntitlementNotificationV05, MeetingReference7>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference7.mmObject();
		}

		@Override
		public MeetingReference7 getValue(MeetingEntitlementNotificationV05 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV05 obj, MeetingReference7 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition9> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition9
	 * SecurityPosition9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the security for which the meeting is organised, the account and the positions of the security holder."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV05, List<SecurityPosition9>> mmSecurity = new MMMessageBuildingBlock<MeetingEntitlementNotificationV05, List<SecurityPosition9>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the security for which the meeting is organised, the account and the positions of the security holder.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition9.mmObject();
		}

		@Override
		public List<SecurityPosition9> getValue(MeetingEntitlementNotificationV05 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV05 obj, List<SecurityPosition9> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Elgblty", required = true)
	protected EligibilityDates1 eligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates1
	 * EligibilityDates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Elgblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the dates determining eligibility."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV05, EligibilityDates1> mmEligibility = new MMMessageBuildingBlock<MeetingEntitlementNotificationV05, EligibilityDates1>() {
		{
			xmlTag = "Elgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligibility";
			definition = "Defines the dates determining eligibility.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EligibilityDates1.mmObject();
		}

		@Override
		public EligibilityDates1 getValue(MeetingEntitlementNotificationV05 obj) {
			return obj.getEligibility();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV05 obj, EligibilityDates1 value) {
			obj.setEligibility(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MeetingEntitlementNotificationV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MeetingEntitlementNotificationV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingEntitlementNotificationV05";
				definition = "Scope\r\nAn account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.\r\nUsage\r\nThis message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.\r\nThis entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.\r\nThe message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01).";
				rootElement = "Document";
				xmlTag = "MtgEntitlmntNtfctn";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmRelatedReference,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmMeetingReference, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmSecurity,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmEligibility, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "003";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingEntitlementNotificationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<MessageIdentification> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public MeetingEntitlementNotificationV05 setRelatedReference(MessageIdentification relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public MeetingReference7 getMeetingReference() {
		return meetingReference;
	}

	public MeetingEntitlementNotificationV05 setMeetingReference(MeetingReference7 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public List<SecurityPosition9> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingEntitlementNotificationV05 setSecurity(List<SecurityPosition9> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public EligibilityDates1 getEligibility() {
		return eligibility;
	}

	public MeetingEntitlementNotificationV05 setEligibility(EligibilityDates1 eligibility) {
		this.eligibility = Objects.requireNonNull(eligibility);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MeetingEntitlementNotificationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.003.001.05")
	static public class Document {
		@XmlElement(name = "MtgEntitlmntNtfctn", required = true)
		public MeetingEntitlementNotificationV05 messageBody;
	}
}