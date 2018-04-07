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
import com.tools20022.repository.choice.AccountIdentification33Choice;
import com.tools20022.repository.msg.CorporateActionGeneralInformation92;
import com.tools20022.repository.msg.SecurityIdentification19;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.UpdatedAdditionalInformation8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CorporateActionNarrative message is sent between an account servicer and
 * an account owner or its designated agent to cater for tax reclaims,
 * restrictions, documentation requirements. This message is bi-directional.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent (the sub-function of the message is
 * Duplicate),<br>
 * - provide a third party with a copy of a message for information (the
 * sub-function of the message is Copy),<br>
 * - re-send to a third party a copy of a message for information (the
 * sub-function of the message is Copy Duplicate),<br>
 * using the relevant elements in the business application header (BAH).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmAccountDetails
 * CorporateActionNarrativeV04.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmUnderlyingSecurity
 * CorporateActionNarrativeV04.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmCorporateActionGeneralInformation
 * CorporateActionNarrativeV04.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmAdditionalInformation
 * CorporateActionNarrativeV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmSupplementaryData
 * CorporateActionNarrativeV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CorpActnNrrtv"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.038.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionNarrativeV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CorporateActionNarrative message is sent between an account servicer and an account owner or its designated agent to cater for tax reclaims, restrictions, documentation requirements. This message is bi-directional.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH)."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionNarrativeV04", propOrder = {"accountDetails", "underlyingSecurity", "corporateActionGeneralInformation", "additionalInformation", "supplementaryData"})
public class CorporateActionNarrativeV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctDtls")
	protected AccountIdentification33Choice accountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification33Choice
	 * AccountIdentification33Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General information about the safekeeping account and the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNarrativeV04, Optional<AccountIdentification33Choice>> mmAccountDetails = new MMMessageBuildingBlock<CorporateActionNarrativeV04, Optional<AccountIdentification33Choice>>() {
		{
			xmlTag = "AcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDetails";
			definition = "General information about the safekeeping account and the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentification33Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification33Choice> getValue(CorporateActionNarrativeV04 obj) {
			return obj.getAccountDetails();
		}

		@Override
		public void setValue(CorporateActionNarrativeV04 obj, Optional<AccountIdentification33Choice> value) {
			obj.setAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygScty")
	protected SecurityIdentification19 underlyingSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygScty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the securitised right for entitlement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNarrativeV04, Optional<SecurityIdentification19>> mmUnderlyingSecurity = new MMMessageBuildingBlock<CorporateActionNarrativeV04, Optional<SecurityIdentification19>>() {
		{
			xmlTag = "UndrlygScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurity";
			definition = "Provides information about the securitised right for entitlement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public Optional<SecurityIdentification19> getValue(CorporateActionNarrativeV04 obj) {
			return obj.getUnderlyingSecurity();
		}

		@Override
		public void setValue(CorporateActionNarrativeV04 obj, Optional<SecurityIdentification19> value) {
			obj.setUnderlyingSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionGeneralInformation92 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionGeneralInformation92
	 * CorporateActionGeneralInformation92}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNarrativeV04, CorporateActionGeneralInformation92> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<CorporateActionNarrativeV04, CorporateActionGeneralInformation92>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionGeneralInformation92.mmObject();
		}

		@Override
		public CorporateActionGeneralInformation92 getValue(CorporateActionNarrativeV04 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(CorporateActionNarrativeV04 obj, CorporateActionGeneralInformation92 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "AddtlInf", required = true)
	protected UpdatedAdditionalInformation8 additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
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
	 * definition} = "Provides additional information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CorporateActionNarrativeV04, UpdatedAdditionalInformation8> mmAdditionalInformation = new MMMessageBuildingBlock<CorporateActionNarrativeV04, UpdatedAdditionalInformation8>() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UpdatedAdditionalInformation8.mmObject();
		}

		@Override
		public UpdatedAdditionalInformation8 getValue(CorporateActionNarrativeV04 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CorporateActionNarrativeV04 obj, UpdatedAdditionalInformation8 value) {
			obj.setAdditionalInformation(value);
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
	public static final MMMessageBuildingBlock<CorporateActionNarrativeV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CorporateActionNarrativeV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CorporateActionNarrativeV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CorporateActionNarrativeV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNarrativeV04";
				definition = "Scope\r\nThe CorporateActionNarrative message is sent between an account servicer and an account owner or its designated agent to cater for tax reclaims, restrictions, documentation requirements. This message is bi-directional.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent (the sub-function of the message is Duplicate),\r\n- provide a third party with a copy of a message for information (the sub-function of the message is Copy),\r\n- re-send to a third party a copy of a message for information (the sub-function of the message is Copy Duplicate),\r\nusing the relevant elements in the business application header (BAH).";
				rootElement = "Document";
				xmlTag = "CorpActnNrrtv";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.CorporateActionNarrativeV04.mmAccountDetails, com.tools20022.repository.area.seev.CorporateActionNarrativeV04.mmUnderlyingSecurity,
						com.tools20022.repository.area.seev.CorporateActionNarrativeV04.mmCorporateActionGeneralInformation, com.tools20022.repository.area.seev.CorporateActionNarrativeV04.mmAdditionalInformation,
						com.tools20022.repository.area.seev.CorporateActionNarrativeV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "038";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionNarrativeV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AccountIdentification33Choice> getAccountDetails() {
		return accountDetails == null ? Optional.empty() : Optional.of(accountDetails);
	}

	public CorporateActionNarrativeV04 setAccountDetails(AccountIdentification33Choice accountDetails) {
		this.accountDetails = accountDetails;
		return this;
	}

	public Optional<SecurityIdentification19> getUnderlyingSecurity() {
		return underlyingSecurity == null ? Optional.empty() : Optional.of(underlyingSecurity);
	}

	public CorporateActionNarrativeV04 setUnderlyingSecurity(SecurityIdentification19 underlyingSecurity) {
		this.underlyingSecurity = underlyingSecurity;
		return this;
	}

	public CorporateActionGeneralInformation92 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public CorporateActionNarrativeV04 setCorporateActionGeneralInformation(CorporateActionGeneralInformation92 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public UpdatedAdditionalInformation8 getAdditionalInformation() {
		return additionalInformation;
	}

	public CorporateActionNarrativeV04 setAdditionalInformation(UpdatedAdditionalInformation8 additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CorporateActionNarrativeV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.038.001.04")
	static public class Document {
		@XmlElement(name = "CorpActnNrrtv", required = true)
		public CorporateActionNarrativeV04 messageBody;
	}
}