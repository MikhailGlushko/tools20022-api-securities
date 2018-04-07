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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AccountIdentificationAndName5;
import com.tools20022.repository.msg.FinancialInstitutionIdentification10;
import com.tools20022.repository.msg.PartyIdentification113;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment instrument between a debtor and a creditor, which flows through one
 * or more financial institutions or systems.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmReference
 * CreditTransfer8.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtor
 * CreditTransfer8.mmDebtor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAccount
 * CreditTransfer8.mmDebtorAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAgent
 * CreditTransfer8.mmDebtorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmDebtorAgentAccount
 * CreditTransfer8.mmDebtorAgentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent1
 * CreditTransfer8.mmIntermediaryAgent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent1Account
 * CreditTransfer8.mmIntermediaryAgent1Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent2
 * CreditTransfer8.mmIntermediaryAgent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmIntermediaryAgent2Account
 * CreditTransfer8.mmIntermediaryAgent2Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAgent
 * CreditTransfer8.mmCreditorAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAgentAccount
 * CreditTransfer8.mmCreditorAgentAccount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditor
 * CreditTransfer8.mmCreditor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CreditTransfer8#mmCreditorAccount
 * CreditTransfer8.mmCreditorAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CreditTransfer
 * CreditTransfer}</li>
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
 * "CreditTransfer8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreditTransfer8", propOrder = {"reference", "debtor", "debtorAccount", "debtorAgent", "debtorAgentAccount", "intermediaryAgent1", "intermediaryAgent1Account", "intermediaryAgent2", "intermediaryAgent2Account",
		"creditorAgent", "creditorAgentAccount", "creditor", "creditorAccount"})
public class CreditTransfer8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref")
	protected Max35Text reference;
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmCreditorReference
	 * PaymentIdentification.mmCreditorReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<Max35Text>> mmReference = new MMMessageAttribute<CreditTransfer8, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmCreditorReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Information supplied to enable the matching of an entry with the items that the transfer is intended to settle, such as commercial invoices in an accounts' receivable system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CreditTransfer8 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<Max35Text> value) {
			obj.setReference(value.orElse(null));
		}
	};
	@XmlElement(name = "Dbtr")
	protected PartyIdentification113 debtor;
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dbtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Debtor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that owes an amount of money to the (ultimate) creditor. In the context of the payment model, the debtor is also the debit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<PartyIdentification113>> mmDebtor = new MMMessageAttribute<CreditTransfer8, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "Dbtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Debtor";
			definition = "Party that owes an amount of money to the (ultimate) creditor. In the context of the payment model, the debtor is also the debit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(CreditTransfer8 obj) {
			return obj.getDebtor();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<PartyIdentification113> value) {
			obj.setDebtor(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAcct")
	protected AccountIdentificationAndName5 debtorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>> mmDebtorAccount = new MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "DbtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAccount";
			definition = "Unambiguous identification of the account of the debtor to which a debit entry will be made as a result of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public Optional<AccountIdentificationAndName5> getValue(CreditTransfer8 obj) {
			return obj.getDebtorAccount();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<AccountIdentificationAndName5> value) {
			obj.setDebtorAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgt")
	protected FinancialInstitutionIdentification10 debtorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the debtor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<FinancialInstitutionIdentification10>> mmDebtorAgent = new MMMessageAttribute<CreditTransfer8, Optional<FinancialInstitutionIdentification10>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgent";
			definition = "Financial institution servicing an account for the debtor.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification10.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification10> getValue(CreditTransfer8 obj) {
			return obj.getDebtorAgent();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<FinancialInstitutionIdentification10> value) {
			obj.setDebtorAgent(value.orElse(null));
		}
	};
	@XmlElement(name = "DbtrAgtAcct")
	protected AccountIdentificationAndName5 debtorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the account of the debtor's agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>> mmDebtorAgentAccount = new MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "DbtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorAgentAccount";
			definition = "Identifies the account of the debtor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public Optional<AccountIdentificationAndName5> getValue(CreditTransfer8 obj) {
			return obj.getDebtorAgentAccount();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<AccountIdentificationAndName5> value) {
			obj.setDebtorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt1")
	protected FinancialInstitutionIdentification10 intermediaryAgent1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<FinancialInstitutionIdentification10>> mmIntermediaryAgent1 = new MMMessageAttribute<CreditTransfer8, Optional<FinancialInstitutionIdentification10>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1";
			definition = "Agent between the debtor's agent and the creditor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification10.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification10> getValue(CreditTransfer8 obj) {
			return obj.getIntermediaryAgent1();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<FinancialInstitutionIdentification10> value) {
			obj.setIntermediaryAgent1(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt1Acct")
	protected AccountIdentificationAndName5 intermediaryAgent1Account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt1Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent1Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>> mmIntermediaryAgent1Account = new MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt1Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent1Account";
			definition = "Unambiguous identification of the account of the intermediary agent 1 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public Optional<AccountIdentificationAndName5> getValue(CreditTransfer8 obj) {
			return obj.getIntermediaryAgent1Account();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<AccountIdentificationAndName5> value) {
			obj.setIntermediaryAgent1Account(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt2")
	protected FinancialInstitutionIdentification10 intermediaryAgent2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent between the debtor's agent and the creditor's agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<FinancialInstitutionIdentification10>> mmIntermediaryAgent2 = new MMMessageAttribute<CreditTransfer8, Optional<FinancialInstitutionIdentification10>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2";
			definition = "Agent between the debtor's agent and the creditor's agent.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstitutionIdentification10.mmObject();
		}

		@Override
		public Optional<FinancialInstitutionIdentification10> getValue(CreditTransfer8 obj) {
			return obj.getIntermediaryAgent2();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<FinancialInstitutionIdentification10> value) {
			obj.setIntermediaryAgent2(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmyAgt2Acct")
	protected AccountIdentificationAndName5 intermediaryAgent2Account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmyAgt2Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediaryAgent2Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>> mmIntermediaryAgent2Account = new MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "IntrmyAgt2Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediaryAgent2Account";
			definition = "Unambiguous identification of the account of the intermediary agent 2 at its servicing agent in the payment chain.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public Optional<AccountIdentificationAndName5> getValue(CreditTransfer8 obj) {
			return obj.getIntermediaryAgent2Account();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<AccountIdentificationAndName5> value) {
			obj.setIntermediaryAgent2Account(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAgt", required = true)
	protected FinancialInstitutionIdentification10 creditorAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstitutionIdentification10
	 * FinancialInstitutionIdentification10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution servicing an account for the creditor."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, FinancialInstitutionIdentification10> mmCreditorAgent = new MMMessageAttribute<CreditTransfer8, FinancialInstitutionIdentification10>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgent";
			definition = "Financial institution servicing an account for the creditor.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstitutionIdentification10.mmObject();
		}

		@Override
		public FinancialInstitutionIdentification10 getValue(CreditTransfer8 obj) {
			return obj.getCreditorAgent();
		}

		@Override
		public void setValue(CreditTransfer8 obj, FinancialInstitutionIdentification10 value) {
			obj.setCreditorAgent(value);
		}
	};
	@XmlElement(name = "CdtrAgtAcct")
	protected AccountIdentificationAndName5 creditorAgentAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAgtAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAgentAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>> mmCreditorAgentAccount = new MMMessageAttribute<CreditTransfer8, Optional<AccountIdentificationAndName5>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "CdtrAgtAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAgentAccount";
			definition = "Unambiguous identification of the account of the creditor agent at its servicing agent to which a credit entry will be made as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public Optional<AccountIdentificationAndName5> getValue(CreditTransfer8 obj) {
			return obj.getCreditorAgentAccount();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<AccountIdentificationAndName5> value) {
			obj.setCreditorAgentAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "Cdtr")
	protected PartyIdentification113 creditor;
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
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cdtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Creditor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, Optional<PartyIdentification113>> mmCreditor = new MMMessageAttribute<CreditTransfer8, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "Cdtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Creditor";
			definition = "Party that receives an amount of money from the debtor. In the context of the payment model, the creditor is also the credit account owner.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(CreditTransfer8 obj) {
			return obj.getCreditor();
		}

		@Override
		public void setValue(CreditTransfer8 obj, Optional<PartyIdentification113> value) {
			obj.setCreditor(value.orElse(null));
		}
	};
	@XmlElement(name = "CdtrAcct", required = true)
	protected AccountIdentificationAndName5 creditorAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountIdentificationAndName5
	 * AccountIdentificationAndName5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentPartyRole#mmCashAccount
	 * PaymentPartyRole.mmCashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CreditTransfer8
	 * CreditTransfer8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtrAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditorAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CreditTransfer8, AccountIdentificationAndName5> mmCreditorAccount = new MMMessageAttribute<CreditTransfer8, AccountIdentificationAndName5>() {
		{
			businessElementTrace_lazy = () -> PaymentPartyRole.mmCashAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CreditTransfer8.mmObject();
			isDerived = false;
			xmlTag = "CdtrAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditorAccount";
			definition = "Unambiguous identification of the account of the creditor to which a credit entry will be posted as a result of the payment transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountIdentificationAndName5.mmObject();
		}

		@Override
		public AccountIdentificationAndName5 getValue(CreditTransfer8 obj) {
			return obj.getCreditorAccount();
		}

		@Override
		public void setValue(CreditTransfer8 obj, AccountIdentificationAndName5 value) {
			obj.setCreditorAccount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransfer8.mmReference, com.tools20022.repository.msg.CreditTransfer8.mmDebtor, com.tools20022.repository.msg.CreditTransfer8.mmDebtorAccount,
						com.tools20022.repository.msg.CreditTransfer8.mmDebtorAgent, com.tools20022.repository.msg.CreditTransfer8.mmDebtorAgentAccount, com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent1,
						com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent1Account, com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent2,
						com.tools20022.repository.msg.CreditTransfer8.mmIntermediaryAgent2Account, com.tools20022.repository.msg.CreditTransfer8.mmCreditorAgent, com.tools20022.repository.msg.CreditTransfer8.mmCreditorAgentAccount,
						com.tools20022.repository.msg.CreditTransfer8.mmCreditor, com.tools20022.repository.msg.CreditTransfer8.mmCreditorAccount);
				trace_lazy = () -> CreditTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreditTransfer8";
				definition = "Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public CreditTransfer8 setReference(Max35Text reference) {
		this.reference = reference;
		return this;
	}

	public Optional<PartyIdentification113> getDebtor() {
		return debtor == null ? Optional.empty() : Optional.of(debtor);
	}

	public CreditTransfer8 setDebtor(PartyIdentification113 debtor) {
		this.debtor = debtor;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getDebtorAccount() {
		return debtorAccount == null ? Optional.empty() : Optional.of(debtorAccount);
	}

	public CreditTransfer8 setDebtorAccount(AccountIdentificationAndName5 debtorAccount) {
		this.debtorAccount = debtorAccount;
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getDebtorAgent() {
		return debtorAgent == null ? Optional.empty() : Optional.of(debtorAgent);
	}

	public CreditTransfer8 setDebtorAgent(FinancialInstitutionIdentification10 debtorAgent) {
		this.debtorAgent = debtorAgent;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getDebtorAgentAccount() {
		return debtorAgentAccount == null ? Optional.empty() : Optional.of(debtorAgentAccount);
	}

	public CreditTransfer8 setDebtorAgentAccount(AccountIdentificationAndName5 debtorAgentAccount) {
		this.debtorAgentAccount = debtorAgentAccount;
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getIntermediaryAgent1() {
		return intermediaryAgent1 == null ? Optional.empty() : Optional.of(intermediaryAgent1);
	}

	public CreditTransfer8 setIntermediaryAgent1(FinancialInstitutionIdentification10 intermediaryAgent1) {
		this.intermediaryAgent1 = intermediaryAgent1;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getIntermediaryAgent1Account() {
		return intermediaryAgent1Account == null ? Optional.empty() : Optional.of(intermediaryAgent1Account);
	}

	public CreditTransfer8 setIntermediaryAgent1Account(AccountIdentificationAndName5 intermediaryAgent1Account) {
		this.intermediaryAgent1Account = intermediaryAgent1Account;
		return this;
	}

	public Optional<FinancialInstitutionIdentification10> getIntermediaryAgent2() {
		return intermediaryAgent2 == null ? Optional.empty() : Optional.of(intermediaryAgent2);
	}

	public CreditTransfer8 setIntermediaryAgent2(FinancialInstitutionIdentification10 intermediaryAgent2) {
		this.intermediaryAgent2 = intermediaryAgent2;
		return this;
	}

	public Optional<AccountIdentificationAndName5> getIntermediaryAgent2Account() {
		return intermediaryAgent2Account == null ? Optional.empty() : Optional.of(intermediaryAgent2Account);
	}

	public CreditTransfer8 setIntermediaryAgent2Account(AccountIdentificationAndName5 intermediaryAgent2Account) {
		this.intermediaryAgent2Account = intermediaryAgent2Account;
		return this;
	}

	public FinancialInstitutionIdentification10 getCreditorAgent() {
		return creditorAgent;
	}

	public CreditTransfer8 setCreditorAgent(FinancialInstitutionIdentification10 creditorAgent) {
		this.creditorAgent = Objects.requireNonNull(creditorAgent);
		return this;
	}

	public Optional<AccountIdentificationAndName5> getCreditorAgentAccount() {
		return creditorAgentAccount == null ? Optional.empty() : Optional.of(creditorAgentAccount);
	}

	public CreditTransfer8 setCreditorAgentAccount(AccountIdentificationAndName5 creditorAgentAccount) {
		this.creditorAgentAccount = creditorAgentAccount;
		return this;
	}

	public Optional<PartyIdentification113> getCreditor() {
		return creditor == null ? Optional.empty() : Optional.of(creditor);
	}

	public CreditTransfer8 setCreditor(PartyIdentification113 creditor) {
		this.creditor = creditor;
		return this;
	}

	public AccountIdentificationAndName5 getCreditorAccount() {
		return creditorAccount;
	}

	public CreditTransfer8 setCreditorAccount(AccountIdentificationAndName5 creditorAccount) {
		this.creditorAccount = Objects.requireNonNull(creditorAccount);
		return this;
	}
}