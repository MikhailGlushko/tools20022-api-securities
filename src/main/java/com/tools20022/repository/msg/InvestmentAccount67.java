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
import com.tools20022.repository.area.sese.TransferInConfirmationV08;
import com.tools20022.repository.area.sese.TransferInInstructionV08;
import com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice;
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.codeset.IncomePreference2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Intermediary41;
import com.tools20022.repository.msg.PartyIdentification113;
import com.tools20022.repository.msg.ReceivingPartiesAndAccount18;
import com.tools20022.repository.msg.SubAccount5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmOwnerIdentification
 * InvestmentAccount67.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmAccountIdentification
 * InvestmentAccount67.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmAccountName
 * InvestmentAccount67.mmAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmAccountDesignation
 * InvestmentAccount67.mmAccountDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmIntermediaryInformation
 * InvestmentAccount67.mmIntermediaryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSecuritiesForm
 * InvestmentAccount67.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmDematerialisedIndicator
 * InvestmentAccount67.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmIncomePreference
 * InvestmentAccount67.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmBeneficiaryCertificationCompletion
 * InvestmentAccount67.mmBeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSafekeepingPlace
 * InvestmentAccount67.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmAccountServicer
 * InvestmentAccount67.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSubAccountDetails
 * InvestmentAccount67.mmSubAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67#mmSettlementPartiesDetails
 * InvestmentAccount67.mmSettlementPartiesDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmAccountDetails
 * TransferInConfirmationV08.mmAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmAccountDetails
 * TransferInInstructionV08.mmAccountDetails}</li>
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
 * "InvestmentAccount67"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount67", propOrder = {"ownerIdentification", "accountIdentification", "accountName", "accountDesignation", "intermediaryInformation", "securitiesForm", "dematerialisedIndicator", "incomePreference",
		"beneficiaryCertificationCompletion", "safekeepingPlace", "accountServicer", "subAccountDetails", "settlementPartiesDetails"})
public class InvestmentAccount67 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OwnrId")
	protected List<PartyIdentification113> ownerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, List<PartyIdentification113>> mmOwnerIdentification = new MMMessageAttribute<InvestmentAccount67, List<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "OwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerIdentification";
			definition = "Party that legally owns the account.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public List<PartyIdentification113> getValue(InvestmentAccount67 obj) {
			return obj.getOwnerIdentification();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, List<PartyIdentification113> value) {
			obj.setOwnerIdentification(value);
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected Max35Text accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Max35Text> mmAccountIdentification = new MMMessageAttribute<InvestmentAccount67, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(InvestmentAccount67 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Max35Text value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctNm")
	protected Max35Text accountName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<Max35Text>> mmAccountName = new MMMessageAttribute<InvestmentAccount67, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount67 obj) {
			return obj.getAccountName();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<Max35Text> value) {
			obj.setAccountName(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctDsgnt")
	protected Max35Text accountDesignation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
	 * InvestmentAccount.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctDsgnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountDesignation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<Max35Text>> mmAccountDesignation = new MMMessageAttribute<InvestmentAccount67, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "AcctDsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDesignation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccount67 obj) {
			return obj.getAccountDesignation();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<Max35Text> value) {
			obj.setAccountDesignation(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyInf")
	protected List<Intermediary41> intermediaryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary41
	 * Intermediary41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders for the investment fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount67, List<Intermediary41>> mmIntermediaryInformation = new MMMessageAssociationEnd<InvestmentAccount67, List<Intermediary41>>() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "IntrmyInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryInformation";
			definition = "Party that provides services relating to financial products to investors, for example, advice on products and placement of orders for the investment fund.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary41.mmObject();
		}

		@Override
		public List<Intermediary41> getValue(InvestmentAccount67 obj) {
			return obj.getIntermediaryInformation();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, List<Intermediary41> value) {
			obj.setIntermediaryInformation(value);
		}
	};
	@XmlElement(name = "SctiesForm")
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form, that is, ownership, of the security, that is, registered or bearer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<FormOfSecurity1Code>> mmSecuritiesForm = new MMMessageAttribute<InvestmentAccount67, Optional<FormOfSecurity1Code>>() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form, that is, ownership, of the security, that is, registered or bearer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}

		@Override
		public Optional<FormOfSecurity1Code> getValue(InvestmentAccount67 obj) {
			return obj.getSecuritiesForm();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<FormOfSecurity1Code> value) {
			obj.setSecuritiesForm(value.orElse(null));
		}
	};
	@XmlElement(name = "DmtrlsdInd")
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmDematerialisedIndicator
	 * Security.mmDematerialisedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmtrlsdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DematerialisedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a security exists only as an electronic record, that is, there is no physical document representing the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<YesNoIndicator>> mmDematerialisedIndicator = new MMMessageAttribute<InvestmentAccount67, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Security.mmDematerialisedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, that is, there is no physical document representing the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccount67 obj) {
			return obj.getDematerialisedIndicator();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<YesNoIndicator> value) {
			obj.setDematerialisedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference2Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference2Code
	 * IncomePreference2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<IncomePreference2Code>> mmIncomePreference = new MMMessageAttribute<InvestmentAccount67, Optional<IncomePreference2Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}

		@Override
		public Optional<IncomePreference2Code> getValue(InvestmentAccount67 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<IncomePreference2Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "BnfcryCertfctnCmpltn")
	protected BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code
	 * BeneficiaryCertificationCompletion1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmBeneficiaryCertificationCompletion
	 * InvestmentAccountService.mmBeneficiaryCertificationCompletion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryCertfctnCmpltn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryCertificationCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<BeneficiaryCertificationCompletion1Code>> mmBeneficiaryCertificationCompletion = new MMMessageAttribute<InvestmentAccount67, Optional<BeneficiaryCertificationCompletion1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmBeneficiaryCertificationCompletion;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCertfctnCmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BeneficiaryCertificationCompletion1Code.mmObject();
		}

		@Override
		public Optional<BeneficiaryCertificationCompletion1Code> getValue(InvestmentAccount67 obj) {
			return obj.getBeneficiaryCertificationCompletion();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<BeneficiaryCertificationCompletion1Code> value) {
			obj.setBeneficiaryCertificationCompletion(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafekeepingPlaceFormat8Choice safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice
	 * SafekeepingPlaceFormat8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgPlc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlace"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place requested as the place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<SafekeepingPlaceFormat8Choice>> mmSafekeepingPlace = new MMMessageAttribute<InvestmentAccount67, Optional<SafekeepingPlaceFormat8Choice>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place requested as the place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SafekeepingPlaceFormat8Choice.mmObject();
		}

		@Override
		public Optional<SafekeepingPlaceFormat8Choice> getValue(InvestmentAccount67 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<SafekeepingPlaceFormat8Choice> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification113 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Institution that maintains the records where the account is held."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccount67, Optional<PartyIdentification113>> mmAccountServicer = new MMMessageAttribute<InvestmentAccount67, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Institution that maintains the records where the account is held.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(InvestmentAccount67 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<PartyIdentification113> value) {
			obj.setAccountServicer(value.orElse(null));
		}
	};
	@XmlElement(name = "SubAcctDtls")
	protected SubAccount5 subAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SubAccount5
	 * SubAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSubAccount
	 * Account.mmSubAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sub-account of the master or omnibus account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount67, Optional<SubAccount5>> mmSubAccountDetails = new MMMessageAssociationEnd<InvestmentAccount67, Optional<SubAccount5>>() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-account of the master or omnibus account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SubAccount5.mmObject();
		}

		@Override
		public Optional<SubAccount5> getValue(InvestmentAccount67 obj) {
			return obj.getSubAccountDetails();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<SubAccount5> value) {
			obj.setSubAccountDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPtiesDtls")
	protected ReceivingPartiesAndAccount18 settlementPartiesDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount18
	 * ReceivingPartiesAndAccount18}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount67
	 * InvestmentAccount67}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPtiesDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementPartiesDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccount67, Optional<ReceivingPartiesAndAccount18>> mmSettlementPartiesDetails = new MMMessageAssociationEnd<InvestmentAccount67, Optional<ReceivingPartiesAndAccount18>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount67.mmObject();
			isDerived = false;
			xmlTag = "SttlmPtiesDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementPartiesDetails";
			definition = "Chain of parties involved in the settlement of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReceivingPartiesAndAccount18.mmObject();
		}

		@Override
		public Optional<ReceivingPartiesAndAccount18> getValue(InvestmentAccount67 obj) {
			return obj.getSettlementPartiesDetails();
		}

		@Override
		public void setValue(InvestmentAccount67 obj, Optional<ReceivingPartiesAndAccount18> value) {
			obj.setSettlementPartiesDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount67.mmOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount67.mmAccountIdentification,
						com.tools20022.repository.msg.InvestmentAccount67.mmAccountName, com.tools20022.repository.msg.InvestmentAccount67.mmAccountDesignation, com.tools20022.repository.msg.InvestmentAccount67.mmIntermediaryInformation,
						com.tools20022.repository.msg.InvestmentAccount67.mmSecuritiesForm, com.tools20022.repository.msg.InvestmentAccount67.mmDematerialisedIndicator, com.tools20022.repository.msg.InvestmentAccount67.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentAccount67.mmBeneficiaryCertificationCompletion, com.tools20022.repository.msg.InvestmentAccount67.mmSafekeepingPlace,
						com.tools20022.repository.msg.InvestmentAccount67.mmAccountServicer, com.tools20022.repository.msg.InvestmentAccount67.mmSubAccountDetails,
						com.tools20022.repository.msg.InvestmentAccount67.mmSettlementPartiesDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInConfirmationV08.mmAccountDetails, TransferInInstructionV08.mmAccountDetails);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount67";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<PartyIdentification113> getOwnerIdentification() {
		return ownerIdentification == null ? ownerIdentification = new ArrayList<>() : ownerIdentification;
	}

	public InvestmentAccount67 setOwnerIdentification(List<PartyIdentification113> ownerIdentification) {
		this.ownerIdentification = Objects.requireNonNull(ownerIdentification);
		return this;
	}

	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public InvestmentAccount67 setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountName() {
		return accountName == null ? Optional.empty() : Optional.of(accountName);
	}

	public InvestmentAccount67 setAccountName(Max35Text accountName) {
		this.accountName = accountName;
		return this;
	}

	public Optional<Max35Text> getAccountDesignation() {
		return accountDesignation == null ? Optional.empty() : Optional.of(accountDesignation);
	}

	public InvestmentAccount67 setAccountDesignation(Max35Text accountDesignation) {
		this.accountDesignation = accountDesignation;
		return this;
	}

	public List<Intermediary41> getIntermediaryInformation() {
		return intermediaryInformation == null ? intermediaryInformation = new ArrayList<>() : intermediaryInformation;
	}

	public InvestmentAccount67 setIntermediaryInformation(List<Intermediary41> intermediaryInformation) {
		this.intermediaryInformation = Objects.requireNonNull(intermediaryInformation);
		return this;
	}

	public Optional<FormOfSecurity1Code> getSecuritiesForm() {
		return securitiesForm == null ? Optional.empty() : Optional.of(securitiesForm);
	}

	public InvestmentAccount67 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
		return this;
	}

	public Optional<YesNoIndicator> getDematerialisedIndicator() {
		return dematerialisedIndicator == null ? Optional.empty() : Optional.of(dematerialisedIndicator);
	}

	public InvestmentAccount67 setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = dematerialisedIndicator;
		return this;
	}

	public Optional<IncomePreference2Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentAccount67 setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<BeneficiaryCertificationCompletion1Code> getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion == null ? Optional.empty() : Optional.of(beneficiaryCertificationCompletion);
	}

	public InvestmentAccount67 setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = beneficiaryCertificationCompletion;
		return this;
	}

	public Optional<SafekeepingPlaceFormat8Choice> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public InvestmentAccount67 setSafekeepingPlace(SafekeepingPlaceFormat8Choice safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public Optional<PartyIdentification113> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount67 setAccountServicer(PartyIdentification113 accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public Optional<SubAccount5> getSubAccountDetails() {
		return subAccountDetails == null ? Optional.empty() : Optional.of(subAccountDetails);
	}

	public InvestmentAccount67 setSubAccountDetails(SubAccount5 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
		return this;
	}

	public Optional<ReceivingPartiesAndAccount18> getSettlementPartiesDetails() {
		return settlementPartiesDetails == null ? Optional.empty() : Optional.of(settlementPartiesDetails);
	}

	public InvestmentAccount67 setSettlementPartiesDetails(ReceivingPartiesAndAccount18 settlementPartiesDetails) {
		this.settlementPartiesDetails = settlementPartiesDetails;
		return this;
	}
}