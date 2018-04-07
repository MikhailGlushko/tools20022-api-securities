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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NameAndAddress5;
import com.tools20022.repository.msg.SimpleIdentificationInformation4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between formats for the identification of the financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmNameAndAddress
 * FinancialInstitutionIdentification7Choice.mmNameAndAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmBICFI
 * FinancialInstitutionIdentification7Choice.mmBICFI}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmClearingSystemMemberIdentification
 * FinancialInstitutionIdentification7Choice.
 * mmClearingSystemMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice#mmProprietaryIdentification
 * FinancialInstitutionIdentification7Choice.mmProprietaryIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
 * OrganisationIdentification}</li>
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
 * "FinancialInstitutionIdentification7Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between formats for the identification of the financial institution."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice
 * FinancialInstitutionIdentification8Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstitutionIdentification7Choice", propOrder = {"nameAndAddress", "bICFI", "clearingSystemMemberIdentification", "proprietaryIdentification"})
public class FinancialInstitutionIdentification7Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmAndAdr", required = true)
	protected NameAndAddress5 nameAndAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NameAndAddress5
	 * NameAndAddress5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification
	 * OrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmAndAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameAndAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the name and (long) postal address of a financial institution."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmNameAndAddress
	 * FinancialInstitutionIdentification8Choice.mmNameAndAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification7Choice, NameAndAddress5> mmNameAndAddress = new MMMessageAttribute<FinancialInstitutionIdentification7Choice, NameAndAddress5>() {
		{
			businessComponentTrace_lazy = () -> OrganisationIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmObject();
			isDerived = false;
			xmlTag = "NmAndAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameAndAddress";
			definition = "Identifies the name and (long) postal address of a financial institution.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8Choice.mmNameAndAddress);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NameAndAddress5.mmObject();
		}

		@Override
		public NameAndAddress5 getValue(FinancialInstitutionIdentification7Choice obj) {
			return obj.getNameAndAddress();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification7Choice obj, NameAndAddress5 value) {
			obj.setNameAndAddress(value);
		}
	};
	@XmlElement(name = "BICFI", required = true)
	protected BICFIIdentifier bICFI;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BICFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the financial institution expressed as a BIC."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmBICFI
	 * FinancialInstitutionIdentification8Choice.mmBICFI}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification7Choice, BICFIIdentifier> mmBICFI = new MMMessageAttribute<FinancialInstitutionIdentification7Choice, BICFIIdentifier>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmObject();
			isDerived = false;
			xmlTag = "BICFI";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BICFI";
			definition = "Identification of the financial institution expressed as a BIC.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8Choice.mmBICFI);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		@Override
		public BICFIIdentifier getValue(FinancialInstitutionIdentification7Choice obj) {
			return obj.getBICFI();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification7Choice obj, BICFIIdentifier value) {
			obj.setBICFI(value);
		}
	};
	@XmlElement(name = "ClrSysMmbId", required = true)
	protected ClearingSystemMemberIdentificationChoice clearingSystemMemberIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ClearingSystemMemberIdentificationChoice
	 * ClearingSystemMemberIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmClearingSystemMemberIdentificationType
	 * OrganisationIdentification.mmClearingSystemMemberIdentificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSysMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Choice of identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmClearingSystemMemberIdentification
	 * FinancialInstitutionIdentification8Choice.
	 * mmClearingSystemMemberIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification7Choice, ClearingSystemMemberIdentificationChoice> mmClearingSystemMemberIdentification = new MMMessageAttribute<FinancialInstitutionIdentification7Choice, ClearingSystemMemberIdentificationChoice>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmClearingSystemMemberIdentificationType;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmObject();
			isDerived = false;
			xmlTag = "ClrSysMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSystemMemberIdentification";
			definition = "Choice of identifier for a clearing system member, as assigned by the clearing system. In some clearing systems, the accounts of the clearing system members are also assigned an identifier.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8Choice.mmClearingSystemMemberIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ClearingSystemMemberIdentificationChoice.mmObject();
		}

		@Override
		public ClearingSystemMemberIdentificationChoice getValue(FinancialInstitutionIdentification7Choice obj) {
			return obj.getClearingSystemMemberIdentification();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification7Choice obj, ClearingSystemMemberIdentificationChoice value) {
			obj.setClearingSystemMemberIdentification(value);
		}
	};
	@XmlElement(name = "PrtryId", required = true)
	protected SimpleIdentificationInformation4 proprietaryIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation4
	 * SimpleIdentificationInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice
	 * FinancialInstitutionIdentification7Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.FinancialInstitutionIdentification8Choice#mmProprietaryIdentification
	 * FinancialInstitutionIdentification8Choice.mmProprietaryIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FinancialInstitutionIdentification7Choice, SimpleIdentificationInformation4> mmProprietaryIdentification = new MMMessageAttribute<FinancialInstitutionIdentification7Choice, SimpleIdentificationInformation4>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryIdentification";
			definition = "Unique and unambiguous identifier, as assigned to a financial institution using a proprietary identification scheme.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8Choice.mmProprietaryIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation4.mmObject();
		}

		@Override
		public SimpleIdentificationInformation4 getValue(FinancialInstitutionIdentification7Choice obj) {
			return obj.getProprietaryIdentification();
		}

		@Override
		public void setValue(FinancialInstitutionIdentification7Choice obj, SimpleIdentificationInformation4 value) {
			obj.setProprietaryIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmNameAndAddress, com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmBICFI,
								com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmClearingSystemMemberIdentification,
								com.tools20022.repository.choice.FinancialInstitutionIdentification7Choice.mmProprietaryIdentification);
				trace_lazy = () -> OrganisationIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstitutionIdentification7Choice";
				definition = "Choice between formats for the identification of the financial institution.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstitutionIdentification8Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public NameAndAddress5 getNameAndAddress() {
		return nameAndAddress;
	}

	public FinancialInstitutionIdentification7Choice setNameAndAddress(NameAndAddress5 nameAndAddress) {
		this.nameAndAddress = Objects.requireNonNull(nameAndAddress);
		return this;
	}

	public BICFIIdentifier getBICFI() {
		return bICFI;
	}

	public FinancialInstitutionIdentification7Choice setBICFI(BICFIIdentifier bICFI) {
		this.bICFI = Objects.requireNonNull(bICFI);
		return this;
	}

	public ClearingSystemMemberIdentificationChoice getClearingSystemMemberIdentification() {
		return clearingSystemMemberIdentification;
	}

	public FinancialInstitutionIdentification7Choice setClearingSystemMemberIdentification(ClearingSystemMemberIdentificationChoice clearingSystemMemberIdentification) {
		this.clearingSystemMemberIdentification = Objects.requireNonNull(clearingSystemMemberIdentification);
		return this;
	}

	public SimpleIdentificationInformation4 getProprietaryIdentification() {
		return proprietaryIdentification;
	}

	public FinancialInstitutionIdentification7Choice setProprietaryIdentification(SimpleIdentificationInformation4 proprietaryIdentification) {
		this.proprietaryIdentification = Objects.requireNonNull(proprietaryIdentification);
		return this;
	}
}