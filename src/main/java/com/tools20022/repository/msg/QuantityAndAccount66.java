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
import com.tools20022.repository.choice.CashAccountIdentification5Choice;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification98;
import com.tools20022.repository.msg.QuantityBreakdown46;
import com.tools20022.repository.msg.SafeKeepingPlace1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details on the quantity, account and other related information involved in a
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmDenominationChoice
 * QuantityAndAccount66.mmDenominationChoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmAccountOwner
 * QuantityAndAccount66.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmCashAccount
 * QuantityAndAccount66.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmSafekeepingPlace
 * QuantityAndAccount66.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66#mmQuantityBreakdown
 * QuantityAndAccount66.mmQuantityBreakdown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDenominationRule#forQuantityAndAccount66
 * ConstraintDenominationRule.forQuantityAndAccount66}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline#forQuantityAndAccount66
 * ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount66}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "QuantityAndAccount66"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details on the quantity, account and other related information involved in a transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "QuantityAndAccount66", propOrder = {"denominationChoice", "accountOwner", "cashAccount", "safekeepingPlace", "quantityBreakdown"})
public class QuantityAndAccount66 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DnmtnChc")
	protected Max210Text denominationChoice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmDenominationChoice
	 * SecuritiesSettlement.mmDenominationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DnmtnChc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenominationChoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Denomination of the security to be received or delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<QuantityAndAccount66, Optional<Max210Text>> mmDenominationChoice = new MMMessageAttribute<QuantityAndAccount66, Optional<Max210Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmDenominationChoice;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount66.mmObject();
			isDerived = false;
			xmlTag = "DnmtnChc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DenominationChoice";
			definition = "Denomination of the security to be received or delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(QuantityAndAccount66 obj) {
			return obj.getDenominationChoice();
		}

		@Override
		public void setValue(QuantityAndAccount66 obj, Optional<Max210Text> value) {
			obj.setDenominationChoice(value.orElse(null));
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
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
	 * definition} = "Party that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount66, Optional<PartyIdentification98>> mmAccountOwner = new MMMessageAssociationEnd<QuantityAndAccount66, Optional<PartyIdentification98>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount66.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Party that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification98.mmObject();
		}

		@Override
		public Optional<PartyIdentification98> getValue(QuantityAndAccount66 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(QuantityAndAccount66 obj, Optional<PartyIdentification98> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAcct")
	protected CashAccountIdentification5Choice cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CashAccountIdentification5Choice
	 * CashAccountIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account to or from which a cash entry is made."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount66, Optional<CashAccountIdentification5Choice>> mmCashAccount = new MMMessageAssociationEnd<QuantityAndAccount66, Optional<CashAccountIdentification5Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount66.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account to or from which a cash entry is made.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashAccountIdentification5Choice.mmObject();
		}

		@Override
		public Optional<CashAccountIdentification5Choice> getValue(QuantityAndAccount66 obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(QuantityAndAccount66 obj, Optional<CashAccountIdentification5Choice> value) {
			obj.setCashAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "SfkpgPlc")
	protected SafeKeepingPlace1 safekeepingPlace;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SafeKeepingPlace1
	 * SafeKeepingPlace1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
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
	 * definition} =
	 * "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount66, Optional<SafeKeepingPlace1>> mmSafekeepingPlace = new MMMessageAssociationEnd<QuantityAndAccount66, Optional<SafeKeepingPlace1>>() {
		{
			businessComponentTrace_lazy = () -> SafekeepingPlace.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount66.mmObject();
			isDerived = false;
			xmlTag = "SfkpgPlc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingPlace";
			definition = "Place where the securities are safe-kept, physically or notionally. This place can be, for example, a local custodian, a Central Securities Depository (CSD) or an International Central Securities Depository (ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SafeKeepingPlace1.mmObject();
		}

		@Override
		public Optional<SafeKeepingPlace1> getValue(QuantityAndAccount66 obj) {
			return obj.getSafekeepingPlace();
		}

		@Override
		public void setValue(QuantityAndAccount66 obj, Optional<SafeKeepingPlace1> value) {
			obj.setSafekeepingPlace(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyBrkdwn")
	protected List<QuantityBreakdown46> quantityBreakdown;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityBreakdown46
	 * QuantityBreakdown46}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmLotBreakdown
	 * SecuritiesQuantity.mmLotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount66
	 * QuantityAndAccount66}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyBrkdwn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Breakdown of a quantity into lots such as tax lots, instrument series."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<QuantityAndAccount66, List<QuantityBreakdown46>> mmQuantityBreakdown = new MMMessageAssociationEnd<QuantityAndAccount66, List<QuantityBreakdown46>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmLotBreakdown;
			componentContext_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount66.mmObject();
			isDerived = false;
			xmlTag = "QtyBrkdwn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityBreakdown";
			definition = "Breakdown of a quantity into lots such as tax lots, instrument series.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> QuantityBreakdown46.mmObject();
		}

		@Override
		public List<QuantityBreakdown46> getValue(QuantityAndAccount66 obj) {
			return obj.getQuantityBreakdown();
		}

		@Override
		public void setValue(QuantityAndAccount66 obj, List<QuantityBreakdown46> value) {
			obj.setQuantityBreakdown(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.QuantityAndAccount66.mmDenominationChoice, com.tools20022.repository.msg.QuantityAndAccount66.mmAccountOwner,
						com.tools20022.repository.msg.QuantityAndAccount66.mmCashAccount, com.tools20022.repository.msg.QuantityAndAccount66.mmSafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount66.mmQuantityBreakdown);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDenominationRule.forQuantityAndAccount66,
						com.tools20022.repository.constraints.ConstraintSafekeepingPlaceGuideline.forQuantityAndAccount66);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "QuantityAndAccount66";
				definition = "Details on the quantity, account and other related information involved in a transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max210Text> getDenominationChoice() {
		return denominationChoice == null ? Optional.empty() : Optional.of(denominationChoice);
	}

	public QuantityAndAccount66 setDenominationChoice(Max210Text denominationChoice) {
		this.denominationChoice = denominationChoice;
		return this;
	}

	public Optional<PartyIdentification98> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public QuantityAndAccount66 setAccountOwner(PartyIdentification98 accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public Optional<CashAccountIdentification5Choice> getCashAccount() {
		return cashAccount == null ? Optional.empty() : Optional.of(cashAccount);
	}

	public QuantityAndAccount66 setCashAccount(CashAccountIdentification5Choice cashAccount) {
		this.cashAccount = cashAccount;
		return this;
	}

	public Optional<SafeKeepingPlace1> getSafekeepingPlace() {
		return safekeepingPlace == null ? Optional.empty() : Optional.of(safekeepingPlace);
	}

	public QuantityAndAccount66 setSafekeepingPlace(SafeKeepingPlace1 safekeepingPlace) {
		this.safekeepingPlace = safekeepingPlace;
		return this;
	}

	public List<QuantityBreakdown46> getQuantityBreakdown() {
		return quantityBreakdown == null ? quantityBreakdown = new ArrayList<>() : quantityBreakdown;
	}

	public QuantityAndAccount66 setQuantityBreakdown(List<QuantityBreakdown46> quantityBreakdown) {
		this.quantityBreakdown = Objects.requireNonNull(quantityBreakdown);
		return this;
	}
}