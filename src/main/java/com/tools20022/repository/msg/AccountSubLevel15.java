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
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account and holding of the next sub-level (Level 5).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountIdentification
 * AccountSubLevel15.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountOwner
 * AccountSubLevel15.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountServicer
 * AccountSubLevel15.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmBeneficialOwner
 * AccountSubLevel15.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmBalanceDetails
 * AccountSubLevel15.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountSubLevel6
 * AccountSubLevel15.mmAccountSubLevel6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmAccountSubLevel6Difference
 * AccountSubLevel15.mmAccountSubLevel6Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15#mmSupplementaryData
 * AccountSubLevel15.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
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
 * "AccountSubLevel15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account and holding of the next sub-level (Level 5)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSubLevel15", propOrder = {"accountIdentification", "accountOwner", "accountServicer", "beneficialOwner", "balanceDetails", "accountSubLevel6", "accountSubLevel6Difference", "supplementaryData"})
public class AccountSubLevel15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId", required = true)
	protected SecuritiesAccount19 accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount19
	 * SecuritiesAccount19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
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
	 * "Unique and unambiguous identification for the sub-account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel15, SecuritiesAccount19> mmAccountIdentification = new MMMessageAssociationEnd<AccountSubLevel15, SecuritiesAccount19>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the sub-account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount19.mmObject();
		}

		@Override
		public SecuritiesAccount19 getValue(AccountSubLevel15 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, SecuritiesAccount19 value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctOwnr", required = true)
	protected PartyIdentification100 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the sub-account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSubLevel15, PartyIdentification100> mmAccountOwner = new MMMessageAttribute<AccountSubLevel15, PartyIdentification100>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the sub-account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public PartyIdentification100 getValue(AccountSubLevel15 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, PartyIdentification100 value) {
			obj.setAccountOwner(value);
		}
	};
	@XmlElement(name = "AcctSvcr", required = true)
	protected PartyIdentification100 accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
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
	 * "Party that manages the sub-level account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountSubLevel15, PartyIdentification100> mmAccountServicer = new MMMessageAttribute<AccountSubLevel15, PartyIdentification100>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the sub-level account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public PartyIdentification100 getValue(AccountSubLevel15 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, PartyIdentification100 value) {
			obj.setAccountServicer(value);
		}
	};
	@XmlElement(name = "BnfclOwnr")
	protected List<BeneficialOwner2> beneficialOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BeneficialOwner2
	 * BeneficialOwner2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Individual or entity that is ultimately entitled to the benefit of income and rights in a financial instrument, as opposed to a nominal or legal owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel15, List<BeneficialOwner2>> mmBeneficialOwner = new MMMessageAssociationEnd<AccountSubLevel15, List<BeneficialOwner2>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwner";
			definition = "Individual or entity that is ultimately entitled to the benefit of income and rights in a financial instrument, as opposed to a nominal or legal owner.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> BeneficialOwner2.mmObject();
		}

		@Override
		public List<BeneficialOwner2> getValue(AccountSubLevel15 obj) {
			return obj.getBeneficialOwner();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, List<BeneficialOwner2> value) {
			obj.setBeneficialOwner(value);
		}
	};
	@XmlElement(name = "BalDtls")
	protected List<AggregateHoldingBalance3> balanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance3
	 * AggregateHoldingBalance3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Report on the net position of a financial instrument on the sub-account (sub-account level 5), for a certain date. The agent, for example, a trade intermediary, may also be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel15, List<AggregateHoldingBalance3>> mmBalanceDetails = new MMMessageAssociationEnd<AccountSubLevel15, List<AggregateHoldingBalance3>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "BalDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceDetails";
			definition = "Report on the net position of a financial instrument on the sub-account (sub-account level 5), for a certain date. The agent, for example, a trade intermediary, may also be specified.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateHoldingBalance3.mmObject();
		}

		@Override
		public List<AggregateHoldingBalance3> getValue(AccountSubLevel15 obj) {
			return obj.getBalanceDetails();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, List<AggregateHoldingBalance3> value) {
			obj.setBalanceDetails(value);
		}
	};
	@XmlElement(name = "AcctSubLvl6")
	protected List<AccountSubLevel16> accountSubLevel6;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountSubLevel16
	 * AccountSubLevel16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holdings of level 5."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel15, List<AccountSubLevel16>> mmAccountSubLevel6 = new MMMessageAssociationEnd<AccountSubLevel15, List<AccountSubLevel16>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl6";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel6";
			definition = "Holdings of level 5.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountSubLevel16.mmObject();
		}

		@Override
		public List<AccountSubLevel16> getValue(AccountSubLevel15 obj) {
			return obj.getAccountSubLevel6();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, List<AccountSubLevel16> value) {
			obj.setAccountSubLevel6(value);
		}
	};
	@XmlElement(name = "AcctSubLvl6Diff")
	protected List<AggregateHoldingBalance2> accountSubLevel6Difference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateHoldingBalance2
	 * AggregateHoldingBalance2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl6Diff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel6Difference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference in holdings between the safekeeping account and the sub-accounts of level 6."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel15, List<AggregateHoldingBalance2>> mmAccountSubLevel6Difference = new MMMessageAssociationEnd<AccountSubLevel15, List<AggregateHoldingBalance2>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl6Diff";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel6Difference";
			definition = "Difference in holdings between the safekeeping account and the sub-accounts of level 6.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateHoldingBalance2.mmObject();
		}

		@Override
		public List<AggregateHoldingBalance2> getValue(AccountSubLevel15 obj) {
			return obj.getAccountSubLevel6Difference();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, List<AggregateHoldingBalance2> value) {
			obj.setAccountSubLevel6Difference(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel15
	 * AccountSubLevel15}</li>
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
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel15, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<AccountSubLevel15, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel15.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AccountSubLevel15 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountSubLevel15 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountSubLevel15.mmAccountIdentification, com.tools20022.repository.msg.AccountSubLevel15.mmAccountOwner,
						com.tools20022.repository.msg.AccountSubLevel15.mmAccountServicer, com.tools20022.repository.msg.AccountSubLevel15.mmBeneficialOwner, com.tools20022.repository.msg.AccountSubLevel15.mmBalanceDetails,
						com.tools20022.repository.msg.AccountSubLevel15.mmAccountSubLevel6, com.tools20022.repository.msg.AccountSubLevel15.mmAccountSubLevel6Difference, com.tools20022.repository.msg.AccountSubLevel15.mmSupplementaryData);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountSubLevel15";
				definition = "Account and holding of the next sub-level (Level 5).";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getAccountIdentification() {
		return accountIdentification;
	}

	public AccountSubLevel15 setAccountIdentification(SecuritiesAccount19 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public PartyIdentification100 getAccountOwner() {
		return accountOwner;
	}

	public AccountSubLevel15 setAccountOwner(PartyIdentification100 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public PartyIdentification100 getAccountServicer() {
		return accountServicer;
	}

	public AccountSubLevel15 setAccountServicer(PartyIdentification100 accountServicer) {
		this.accountServicer = Objects.requireNonNull(accountServicer);
		return this;
	}

	public List<BeneficialOwner2> getBeneficialOwner() {
		return beneficialOwner == null ? beneficialOwner = new ArrayList<>() : beneficialOwner;
	}

	public AccountSubLevel15 setBeneficialOwner(List<BeneficialOwner2> beneficialOwner) {
		this.beneficialOwner = Objects.requireNonNull(beneficialOwner);
		return this;
	}

	public List<AggregateHoldingBalance3> getBalanceDetails() {
		return balanceDetails == null ? balanceDetails = new ArrayList<>() : balanceDetails;
	}

	public AccountSubLevel15 setBalanceDetails(List<AggregateHoldingBalance3> balanceDetails) {
		this.balanceDetails = Objects.requireNonNull(balanceDetails);
		return this;
	}

	public List<AccountSubLevel16> getAccountSubLevel6() {
		return accountSubLevel6 == null ? accountSubLevel6 = new ArrayList<>() : accountSubLevel6;
	}

	public AccountSubLevel15 setAccountSubLevel6(List<AccountSubLevel16> accountSubLevel6) {
		this.accountSubLevel6 = Objects.requireNonNull(accountSubLevel6);
		return this;
	}

	public List<AggregateHoldingBalance2> getAccountSubLevel6Difference() {
		return accountSubLevel6Difference == null ? accountSubLevel6Difference = new ArrayList<>() : accountSubLevel6Difference;
	}

	public AccountSubLevel15 setAccountSubLevel6Difference(List<AggregateHoldingBalance2> accountSubLevel6Difference) {
		this.accountSubLevel6Difference = Objects.requireNonNull(accountSubLevel6Difference);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountSubLevel15 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}