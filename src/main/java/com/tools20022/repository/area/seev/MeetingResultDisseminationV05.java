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
 * An issuer, its agent or an intermediary sends the MeetingResultDissemination
 * message to another intermediary, to a party holding the right to vote, to a
 * registered security holder or to a beneficial holder to provide information
 * on the voting results of a shareholders meeting.<br>
 * <b>Usage</b><br>
 * The MeetingResultDissemination message is used to provide the vote results
 * per resolution. It may also provide information on the level of
 * participation.<br>
 * This message is also used to notify an update or amendment to a previously
 * sent MeetingResultDissemination message.<br>
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
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmAmendment
 * MeetingResultDisseminationV05.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmMeetingReference
 * MeetingResultDisseminationV05.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmSecurity
 * MeetingResultDisseminationV05.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmVoteResult
 * MeetingResultDisseminationV05.mmVoteResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmParticipation
 * MeetingResultDisseminationV05.mmParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmAdditionalInformation
 * MeetingResultDisseminationV05.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmSupplementaryData
 * MeetingResultDisseminationV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgRsltDssmntn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.008.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingResultDisseminationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.\r\nUsage\r\nThe MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.\r\nThis message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingResultDisseminationV05", propOrder = {"amendment", "meetingReference", "security", "voteResult", "participation", "additionalInformation", "supplementaryData"})
public class MeetingResultDisseminationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Amdmnt")
	protected AmendInformation3 amendment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmendInformation3
	 * AmendInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amdmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to an amendment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, Optional<AmendInformation3>> mmAmendment = new MMMessageBuildingBlock<MeetingResultDisseminationV05, Optional<AmendInformation3>>() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation3.mmObject();
		}

		@Override
		public Optional<AmendInformation3> getValue(MeetingResultDisseminationV05 obj) {
			return obj.getAmendment();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, Optional<AmendInformation3> value) {
			obj.setAmendment(value.orElse(null));
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
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, MeetingReference7> mmMeetingReference = new MMMessageBuildingBlock<MeetingResultDisseminationV05, MeetingReference7>() {
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
		public MeetingReference7 getValue(MeetingResultDisseminationV05 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, MeetingReference7 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition8> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition8
	 * SecurityPosition8}</li>
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
	 * "Identifies the securities for which the meeting is organised."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, List<SecurityPosition8>> mmSecurity = new MMMessageBuildingBlock<MeetingResultDisseminationV05, List<SecurityPosition8>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the securities for which the meeting is organised.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition8.mmObject();
		}

		@Override
		public List<SecurityPosition8> getValue(MeetingResultDisseminationV05 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, List<SecurityPosition8> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "VoteRslt", required = true)
	protected List<Vote7> voteResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Vote7 Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Results per resolution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, List<Vote7>> mmVoteResult = new MMMessageBuildingBlock<MeetingResultDisseminationV05, List<Vote7>>() {
		{
			xmlTag = "VoteRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteResult";
			definition = "Results per resolution.";
			maxOccurs = 1000;
			minOccurs = 1;
			complexType_lazy = () -> Vote7.mmObject();
		}

		@Override
		public List<Vote7> getValue(MeetingResultDisseminationV05 obj) {
			return obj.getVoteResult();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, List<Vote7> value) {
			obj.setVoteResult(value);
		}
	};
	@XmlElement(name = "Prtcptn")
	protected Participation4 participation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Participation4
	 * Participation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtcptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Participation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the participation to the voting process."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, Optional<Participation4>> mmParticipation = new MMMessageBuildingBlock<MeetingResultDisseminationV05, Optional<Participation4>>() {
		{
			xmlTag = "Prtcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Participation";
			definition = "Information about the participation to the voting process.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Participation4.mmObject();
		}

		@Override
		public Optional<Participation4> getValue(MeetingResultDisseminationV05 obj) {
			return obj.getParticipation();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, Optional<Participation4> value) {
			obj.setParticipation(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CommunicationAddress4 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress4
	 * CommunicationAddress4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on where additional information can be received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, Optional<CommunicationAddress4>> mmAdditionalInformation = new MMMessageBuildingBlock<MeetingResultDisseminationV05, Optional<CommunicationAddress4>>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Information on where additional information can be received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationAddress4.mmObject();
		}

		@Override
		public Optional<CommunicationAddress4> getValue(MeetingResultDisseminationV05 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, Optional<CommunicationAddress4> value) {
			obj.setAdditionalInformation(value.orElse(null));
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
	public static final MMMessageBuildingBlock<MeetingResultDisseminationV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MeetingResultDisseminationV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MeetingResultDisseminationV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MeetingResultDisseminationV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingResultDisseminationV05";
				definition = "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.\r\nUsage\r\nThe MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.\r\nThis message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01).";
				rootElement = "Document";
				xmlTag = "MtgRsltDssmntn";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmAmendment, com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmSecurity, com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmVoteResult,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmParticipation, com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmAdditionalInformation,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "008";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingResultDisseminationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AmendInformation3> getAmendment() {
		return amendment == null ? Optional.empty() : Optional.of(amendment);
	}

	public MeetingResultDisseminationV05 setAmendment(AmendInformation3 amendment) {
		this.amendment = amendment;
		return this;
	}

	public MeetingReference7 getMeetingReference() {
		return meetingReference;
	}

	public MeetingResultDisseminationV05 setMeetingReference(MeetingReference7 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public List<SecurityPosition8> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingResultDisseminationV05 setSecurity(List<SecurityPosition8> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<Vote7> getVoteResult() {
		return voteResult == null ? voteResult = new ArrayList<>() : voteResult;
	}

	public MeetingResultDisseminationV05 setVoteResult(List<Vote7> voteResult) {
		this.voteResult = Objects.requireNonNull(voteResult);
		return this;
	}

	public Optional<Participation4> getParticipation() {
		return participation == null ? Optional.empty() : Optional.of(participation);
	}

	public MeetingResultDisseminationV05 setParticipation(Participation4 participation) {
		this.participation = participation;
		return this;
	}

	public Optional<CommunicationAddress4> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public MeetingResultDisseminationV05 setAdditionalInformation(CommunicationAddress4 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MeetingResultDisseminationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.05")
	static public class Document {
		@XmlElement(name = "MtgRsltDssmntn", required = true)
		public MeetingResultDisseminationV05 messageBody;
	}
}