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
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.codeset.BeneficiaryCertificationCompletion1Code;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.codeset.IncomePreference2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmOwnerIdentification
 * InvestmentAccount55.mmOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountIdentification
 * InvestmentAccount55.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountName
 * InvestmentAccount55.mmAccountName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountDesignation
 * InvestmentAccount55.mmAccountDesignation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmSecuritiesForm
 * InvestmentAccount55.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmDematerialisedIndicator
 * InvestmentAccount55.mmDematerialisedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmIncomePreference
 * InvestmentAccount55.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmBeneficiaryCertificationCompletion
 * InvestmentAccount55.mmBeneficiaryCertificationCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmAccountServicer
 * InvestmentAccount55.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55#mmSubAccountDetails
 * InvestmentAccount55.mmSubAccountDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
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
 * "InvestmentAccount55"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount57
 * InvestmentAccount57}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentAccount55", propOrder = {"ownerIdentification", "accountIdentification", "accountName", "accountDesignation", "securitiesForm", "dematerialisedIndicator", "incomePreference", "beneficiaryCertificationCompletion",
		"accountServicer", "subAccountDetails"})
public class InvestmentAccount55 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<PartyIdentification70Choice> ownerIdentification;
	/**
	 * Party that legally owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmOwnerIdentification
	 * InvestmentAccount57.mmOwnerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "OwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnerIdentification";
			definition = "Party that legally owns the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmOwnerIdentification);
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected Max35Text accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountIdentification
	 * InvestmentAccount57.mmAccountIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmAccountIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accountName;
	/**
	 * Name of the account. It provides an additional means of identification,
	 * and is designated by the account servicer in agreement with the account
	 * owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountName
	 * InvestmentAccount57.mmAccountName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "AcctNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountName";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmAccountName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text accountDesignation;
	/**
	 * Supplementary registration information applying to a specific block of
	 * units for dealing and reporting purposes. The supplementary registration
	 * information may be used when all the units are registered, for example,
	 * to a funds supermarket, but holdings for each investor have to reconciled
	 * individually.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountDesignation
	 * InvestmentAccount57.mmAccountDesignation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "AcctDsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountDesignation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmAccountDesignation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * Form, that is, ownership, of the security, that is, registered or bearer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmSecuritiesForm
	 * InvestmentAccount57.mmSecuritiesForm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form, that is, ownership, of the security, that is, registered or bearer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmSecuritiesForm);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	protected YesNoIndicator dematerialisedIndicator;
	/**
	 * Indicates whether a security exists only as an electronic record, that
	 * is, there is no physical document representing the security.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmDematerialisedIndicator
	 * InvestmentAccount57.mmDematerialisedIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDematerialisedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmDematerialisedIndicator;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "DmtrlsdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DematerialisedIndicator";
			definition = "Indicates whether a security exists only as an electronic record, that is, there is no physical document representing the security.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmDematerialisedIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected IncomePreference2Code incomePreference;
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmIncomePreference
	 * InvestmentAccount57.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmIncomePreference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}
	};
	protected BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion;
	/**
	 * Beneficial owner or its designated agent certifies that it complies with
	 * any holding or investment restrictions or requirements of the fund.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmBeneficiaryCertificationCompletion
	 * InvestmentAccount57.mmBeneficiaryCertificationCompletion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBeneficiaryCertificationCompletion = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmBeneficiaryCertificationCompletion;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "BnfcryCertfctnCmpltn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryCertificationCompletion";
			definition = "Beneficial owner or its designated agent certifies that it complies with any holding or investment restrictions or requirements of the fund.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmBeneficiaryCertificationCompletion);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BeneficiaryCertificationCompletion1Code.mmObject();
		}
	};
	protected PartyIdentification70Choice accountServicer;
	/**
	 * Institution that maintains the records where the account is held.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmAccountServicer
	 * InvestmentAccount57.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Institution that maintains the records where the account is held.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected SubAccount5 subAccountDetails;
	/**
	 * Sub-accounts that are grouped in a master or omnibus account.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount55
	 * InvestmentAccount55}</li>
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
	 * definition} =
	 * "Sub-accounts that are grouped in a master or omnibus account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmSubAccountDetails
	 * InvestmentAccount57.mmSubAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmSubAccount;
			componentContext_lazy = () -> InvestmentAccount55.mmObject();
			isDerived = false;
			xmlTag = "SubAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubAccountDetails";
			definition = "Sub-accounts that are grouped in a master or omnibus account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmSubAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SubAccount5.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentAccount55.mmOwnerIdentification, InvestmentAccount55.mmAccountIdentification, InvestmentAccount55.mmAccountName, InvestmentAccount55.mmAccountDesignation,
						InvestmentAccount55.mmSecuritiesForm, InvestmentAccount55.mmDematerialisedIndicator, InvestmentAccount55.mmIncomePreference, InvestmentAccount55.mmBeneficiaryCertificationCompletion,
						InvestmentAccount55.mmAccountServicer, InvestmentAccount55.mmSubAccountDetails);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount55";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccount57.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OwnrId")
	public List<PartyIdentification70Choice> getOwnerIdentification() {
		return ownerIdentification;
	}

	public void setOwnerIdentification(List<PartyIdentification70Choice> ownerIdentification) {
		this.ownerIdentification = ownerIdentification;
	}

	@XmlElement(name = "AcctId")
	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "AcctNm")
	public Max35Text getAccountName() {
		return accountName;
	}

	public void setAccountName(Max35Text accountName) {
		this.accountName = accountName;
	}

	@XmlElement(name = "AcctDsgnt")
	public Max35Text getAccountDesignation() {
		return accountDesignation;
	}

	public void setAccountDesignation(Max35Text accountDesignation) {
		this.accountDesignation = accountDesignation;
	}

	@XmlElement(name = "SctiesForm")
	public FormOfSecurity1Code getSecuritiesForm() {
		return securitiesForm;
	}

	public void setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
	}

	@XmlElement(name = "DmtrlsdInd")
	public YesNoIndicator getDematerialisedIndicator() {
		return dematerialisedIndicator;
	}

	public void setDematerialisedIndicator(YesNoIndicator dematerialisedIndicator) {
		this.dematerialisedIndicator = dematerialisedIndicator;
	}

	@XmlElement(name = "IncmPref")
	public IncomePreference2Code getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
	}

	@XmlElement(name = "BnfcryCertfctnCmpltn")
	public BeneficiaryCertificationCompletion1Code getBeneficiaryCertificationCompletion() {
		return beneficiaryCertificationCompletion;
	}

	public void setBeneficiaryCertificationCompletion(BeneficiaryCertificationCompletion1Code beneficiaryCertificationCompletion) {
		this.beneficiaryCertificationCompletion = beneficiaryCertificationCompletion;
	}

	@XmlElement(name = "AcctSvcr")
	public PartyIdentification70Choice getAccountServicer() {
		return accountServicer;
	}

	public void setAccountServicer(PartyIdentification70Choice accountServicer) {
		this.accountServicer = accountServicer;
	}

	@XmlElement(name = "SubAcctDtls")
	public SubAccount5 getSubAccountDetails() {
		return subAccountDetails;
	}

	public void setSubAccountDetails(com.tools20022.repository.msg.SubAccount5 subAccountDetails) {
		this.subAccountDetails = subAccountDetails;
	}
}