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
 * Account and holding of the next sub-level (Level 3).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountIdentification
 * AccountSubLevel13.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountOwner
 * AccountSubLevel13.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountServicer
 * AccountSubLevel13.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmBeneficialOwner
 * AccountSubLevel13.mmBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmBalanceDetails
 * AccountSubLevel13.mmBalanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountSubLevel4
 * AccountSubLevel13.mmAccountSubLevel4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmAccountSubLevel4Difference
 * AccountSubLevel13.mmAccountSubLevel4Difference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13#mmSupplementaryData
 * AccountSubLevel13.mmSupplementaryData}</li>
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
 * "AccountSubLevel13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account and holding of the next sub-level (Level 3)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountSubLevel13", propOrder = {"accountIdentification", "accountOwner", "accountServicer", "beneficialOwner", "balanceDetails", "accountSubLevel4", "accountSubLevel4Difference", "supplementaryData"})
public class AccountSubLevel13 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
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
	public static final MMMessageAssociationEnd<AccountSubLevel13, SecuritiesAccount19> mmAccountIdentification = new MMMessageAssociationEnd<AccountSubLevel13, SecuritiesAccount19>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
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
		public SecuritiesAccount19 getValue(AccountSubLevel13 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, SecuritiesAccount19 value) {
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
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
	public static final MMMessageAttribute<AccountSubLevel13, PartyIdentification100> mmAccountOwner = new MMMessageAttribute<AccountSubLevel13, PartyIdentification100>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
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
		public PartyIdentification100 getValue(AccountSubLevel13 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, PartyIdentification100 value) {
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
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
	public static final MMMessageAttribute<AccountSubLevel13, PartyIdentification100> mmAccountServicer = new MMMessageAttribute<AccountSubLevel13, PartyIdentification100>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
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
		public PartyIdentification100 getValue(AccountSubLevel13 obj) {
			return obj.getAccountServicer();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, PartyIdentification100 value) {
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
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
	public static final MMMessageAssociationEnd<AccountSubLevel13, List<BeneficialOwner2>> mmBeneficialOwner = new MMMessageAssociationEnd<AccountSubLevel13, List<BeneficialOwner2>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
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
		public List<BeneficialOwner2> getValue(AccountSubLevel13 obj) {
			return obj.getBeneficialOwner();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, List<BeneficialOwner2> value) {
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
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
	 * "Report on the net position of a financial instrument on the sub-account (sub-account level 3), for a certain date. The agent, for example, a trade intermediary, may also be specified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel13, List<AggregateHoldingBalance3>> mmBalanceDetails = new MMMessageAssociationEnd<AccountSubLevel13, List<AggregateHoldingBalance3>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
			isDerived = false;
			xmlTag = "BalDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceDetails";
			definition = "Report on the net position of a financial instrument on the sub-account (sub-account level 3), for a certain date. The agent, for example, a trade intermediary, may also be specified.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateHoldingBalance3.mmObject();
		}

		@Override
		public List<AggregateHoldingBalance3> getValue(AccountSubLevel13 obj) {
			return obj.getBalanceDetails();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, List<AggregateHoldingBalance3> value) {
			obj.setBalanceDetails(value);
		}
	};
	@XmlElement(name = "AcctSubLvl4")
	protected List<AccountSubLevel14> accountSubLevel4;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountSubLevel14
	 * AccountSubLevel14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Holdings of level 4."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel13, List<AccountSubLevel14>> mmAccountSubLevel4 = new MMMessageAssociationEnd<AccountSubLevel13, List<AccountSubLevel14>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl4";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel4";
			definition = "Holdings of level 4.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountSubLevel14.mmObject();
		}

		@Override
		public List<AccountSubLevel14> getValue(AccountSubLevel13 obj) {
			return obj.getAccountSubLevel4();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, List<AccountSubLevel14> value) {
			obj.setAccountSubLevel4(value);
		}
	};
	@XmlElement(name = "AcctSubLvl4Diff")
	protected List<AggregateHoldingBalance2> accountSubLevel4Difference;
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSubLvl4Diff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSubLevel4Difference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Difference in holdings between the sub-account at level 3 and the sub-accounts of level 4."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountSubLevel13, List<AggregateHoldingBalance2>> mmAccountSubLevel4Difference = new MMMessageAssociationEnd<AccountSubLevel13, List<AggregateHoldingBalance2>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
			isDerived = false;
			xmlTag = "AcctSubLvl4Diff";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSubLevel4Difference";
			definition = "Difference in holdings between the sub-account at level 3 and the sub-accounts of level 4.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateHoldingBalance2.mmObject();
		}

		@Override
		public List<AggregateHoldingBalance2> getValue(AccountSubLevel13 obj) {
			return obj.getAccountSubLevel4Difference();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, List<AggregateHoldingBalance2> value) {
			obj.setAccountSubLevel4Difference(value);
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
	 * {@linkplain com.tools20022.repository.msg.AccountSubLevel13
	 * AccountSubLevel13}</li>
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
	public static final MMMessageAssociationEnd<AccountSubLevel13, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<AccountSubLevel13, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountSubLevel13.mmObject();
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
		public List<SupplementaryData1> getValue(AccountSubLevel13 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountSubLevel13 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountSubLevel13.mmAccountIdentification, com.tools20022.repository.msg.AccountSubLevel13.mmAccountOwner,
						com.tools20022.repository.msg.AccountSubLevel13.mmAccountServicer, com.tools20022.repository.msg.AccountSubLevel13.mmBeneficialOwner, com.tools20022.repository.msg.AccountSubLevel13.mmBalanceDetails,
						com.tools20022.repository.msg.AccountSubLevel13.mmAccountSubLevel4, com.tools20022.repository.msg.AccountSubLevel13.mmAccountSubLevel4Difference, com.tools20022.repository.msg.AccountSubLevel13.mmSupplementaryData);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountSubLevel13";
				definition = "Account and holding of the next sub-level (Level 3).";
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesAccount19 getAccountIdentification() {
		return accountIdentification;
	}

	public AccountSubLevel13 setAccountIdentification(SecuritiesAccount19 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public PartyIdentification100 getAccountOwner() {
		return accountOwner;
	}

	public AccountSubLevel13 setAccountOwner(PartyIdentification100 accountOwner) {
		this.accountOwner = Objects.requireNonNull(accountOwner);
		return this;
	}

	public PartyIdentification100 getAccountServicer() {
		return accountServicer;
	}

	public AccountSubLevel13 setAccountServicer(PartyIdentification100 accountServicer) {
		this.accountServicer = Objects.requireNonNull(accountServicer);
		return this;
	}

	public List<BeneficialOwner2> getBeneficialOwner() {
		return beneficialOwner == null ? beneficialOwner = new ArrayList<>() : beneficialOwner;
	}

	public AccountSubLevel13 setBeneficialOwner(List<BeneficialOwner2> beneficialOwner) {
		this.beneficialOwner = Objects.requireNonNull(beneficialOwner);
		return this;
	}

	public List<AggregateHoldingBalance3> getBalanceDetails() {
		return balanceDetails == null ? balanceDetails = new ArrayList<>() : balanceDetails;
	}

	public AccountSubLevel13 setBalanceDetails(List<AggregateHoldingBalance3> balanceDetails) {
		this.balanceDetails = Objects.requireNonNull(balanceDetails);
		return this;
	}

	public List<AccountSubLevel14> getAccountSubLevel4() {
		return accountSubLevel4 == null ? accountSubLevel4 = new ArrayList<>() : accountSubLevel4;
	}

	public AccountSubLevel13 setAccountSubLevel4(List<AccountSubLevel14> accountSubLevel4) {
		this.accountSubLevel4 = Objects.requireNonNull(accountSubLevel4);
		return this;
	}

	public List<AggregateHoldingBalance2> getAccountSubLevel4Difference() {
		return accountSubLevel4Difference == null ? accountSubLevel4Difference = new ArrayList<>() : accountSubLevel4Difference;
	}

	public AccountSubLevel13 setAccountSubLevel4Difference(List<AggregateHoldingBalance2> accountSubLevel4Difference) {
		this.accountSubLevel4Difference = Objects.requireNonNull(accountSubLevel4Difference);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountSubLevel13 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}