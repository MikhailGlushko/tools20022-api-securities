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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AggregateBalanceInformation31;
import com.tools20022.repository.msg.PartyIdentification98;
import com.tools20022.repository.msg.SecuritiesAccount25;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account to or from which a securities entry is made.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmAccountOwner
 * SubAccountIdentification43.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmSafekeepingAccount
 * SubAccountIdentification43.mmSafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmActivityIndicator
 * SubAccountIdentification43.mmActivityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43#mmBalanceForSubAccount
 * SubAccountIdentification43.mmBalanceForSubAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
 * SecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#mmSubAccountDetails
 * SecuritiesBalanceAccountingReportV09.mmSubAccountDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule#forSubAccountIdentification43
 * ConstraintSubSafekeepingReportingRule.forSubAccountIdentification43}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintActivityAndBalanceForSubAccount1Rule#forSubAccountIdentification43
 * ConstraintActivityAndBalanceForSubAccount1Rule.forSubAccountIdentification43}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintActivityAndBalanceForSubAccount2Rule#forSubAccountIdentification43
 * ConstraintActivityAndBalanceForSubAccount2Rule.forSubAccountIdentification43}
 * </li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubAccountIdentification43"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Account to or from which a securities entry is made."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubAccountIdentification43", propOrder = {"accountOwner", "safekeepingAccount", "activityIndicator", "balanceForSubAccount"})
public class SubAccountIdentification43 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctOwnr")
	protected PartyIdentification98 accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification98
	 * PartyIdentification98}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43
	 * SubAccountIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::ACOW</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubAccountIdentification43, Optional<PartyIdentification98>> mmAccountOwner = new MMMessageAssociationEnd<SubAccountIdentification43, Optional<PartyIdentification98>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubAccountIdentification43.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::ACOW"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification98.mmObject();
		}

		@Override
		public Optional<PartyIdentification98> getValue(SubAccountIdentification43 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(SubAccountIdentification43 obj, Optional<PartyIdentification98> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgAcct", required = true)
	protected SecuritiesAccount25 safekeepingAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesAccount25
	 * SecuritiesAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43
	 * SubAccountIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SfkpgAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :97a::SAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a securities entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubAccountIdentification43, SecuritiesAccount25> mmSafekeepingAccount = new MMMessageAssociationEnd<SubAccountIdentification43, SecuritiesAccount25>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubAccountIdentification43.mmObject();
			isDerived = false;
			xmlTag = "SfkpgAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":97a::SAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			definition = "Account to or from which a securities entry is made.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesAccount25.mmObject();
		}

		@Override
		public SecuritiesAccount25 getValue(SubAccountIdentification43 obj) {
			return obj.getSafekeepingAccount();
		}

		@Override
		public void setValue(SubAccountIdentification43 obj, SecuritiesAccount25 value) {
			obj.setSafekeepingAccount(value);
		}
	};
	@XmlElement(name = "ActvtyInd", required = true)
	protected YesNoIndicator activityIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43
	 * SubAccountIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActvtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :17B::ACTI</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActivityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether there is activity or information update reported in the statement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubAccountIdentification43, YesNoIndicator> mmActivityIndicator = new MMMessageAttribute<SubAccountIdentification43, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubAccountIdentification43.mmObject();
			isDerived = false;
			xmlTag = "ActvtyInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":17B::ACTI"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActivityIndicator";
			definition = "Indicates whether there is activity or information update reported in the statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SubAccountIdentification43 obj) {
			return obj.getActivityIndicator();
		}

		@Override
		public void setValue(SubAccountIdentification43 obj, YesNoIndicator value) {
			obj.setActivityIndicator(value);
		}
	};
	@XmlElement(name = "BalForSubAcct")
	protected List<AggregateBalanceInformation31> balanceForSubAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31
	 * AggregateBalanceInformation31}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesBalance
	 * SecuritiesAccount.mmSecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubAccountIdentification43
	 * SubAccountIdentification43}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalForSubAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SUBSAFE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceForSubAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net position of a segregated holding, in a single security, within the overall position held in a securities subaccount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubAccountIdentification43, List<AggregateBalanceInformation31>> mmBalanceForSubAccount = new MMMessageAssociationEnd<SubAccountIdentification43, List<AggregateBalanceInformation31>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesAccount.mmSecuritiesBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubAccountIdentification43.mmObject();
			isDerived = false;
			xmlTag = "BalForSubAcct";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SUBSAFE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceForSubAccount";
			definition = "Net position of a segregated holding, in a single security, within the overall position held in a securities subaccount.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AggregateBalanceInformation31.mmObject();
		}

		@Override
		public List<AggregateBalanceInformation31> getValue(SubAccountIdentification43 obj) {
			return obj.getBalanceForSubAccount();
		}

		@Override
		public void setValue(SubAccountIdentification43 obj, List<AggregateBalanceInformation31> value) {
			obj.setBalanceForSubAccount(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubAccountIdentification43.mmAccountOwner, com.tools20022.repository.msg.SubAccountIdentification43.mmSafekeepingAccount,
						com.tools20022.repository.msg.SubAccountIdentification43.mmActivityIndicator, com.tools20022.repository.msg.SubAccountIdentification43.mmBalanceForSubAccount);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesBalanceAccountingReportV09.mmSubAccountDetails);
				trace_lazy = () -> SecuritiesAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubSafekeepingReportingRule.forSubAccountIdentification43,
						com.tools20022.repository.constraints.ConstraintActivityAndBalanceForSubAccount1Rule.forSubAccountIdentification43,
						com.tools20022.repository.constraints.ConstraintActivityAndBalanceForSubAccount2Rule.forSubAccountIdentification43);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubAccountIdentification43";
				definition = "Account to or from which a securities entry is made.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public SubAccountIdentification43 setAccountOwner(PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SecuritiesAccount25 getSafekeepingAccount() {
		return safekeepingAccount;
	}

	public SubAccountIdentification43 setSafekeepingAccount(SecuritiesAccount25 safekeepingAccount) {
		this.safekeepingAccount = Objects.requireNonNull(safekeepingAccount);
		return this;
	}

	public YesNoIndicator getActivityIndicator() {
		return activityIndicator;
	}

	public SubAccountIdentification43 setActivityIndicator(YesNoIndicator activityIndicator) {
		this.activityIndicator = Objects.requireNonNull(activityIndicator);
		return this;
	}

	public List<AggregateBalanceInformation31> getBalanceForSubAccount() {
		return balanceForSubAccount == null ? balanceForSubAccount = new ArrayList<>() : balanceForSubAccount;
	}

	public SubAccountIdentification43 setBalanceForSubAccount(List<AggregateBalanceInformation31> balanceForSubAccount) {
		this.balanceForSubAccount = Objects.requireNonNull(balanceForSubAccount);
		return this;
	}
}