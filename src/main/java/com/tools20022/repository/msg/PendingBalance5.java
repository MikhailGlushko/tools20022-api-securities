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
import com.tools20022.repository.entity.SecuritiesBalance;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementTypeAndIdentification25;
import com.tools20022.repository.msg.SignedQuantityFormat6;
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
 * Provides information about pending balance and pending transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PendingBalance5#mmBalance
 * PendingBalance5.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PendingBalance5#mmPendingTransactions
 * PendingBalance5.mmPendingTransactions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
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
 * "PendingBalance5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about pending balance and pending transactions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PendingBalance5", propOrder = {"balance", "pendingTransactions"})
public class PendingBalance5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Bal", required = true)
	protected SignedQuantityFormat6 balance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SignedQuantityFormat6
	 * SignedQuantityFormat6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesSubBalance
	 * SecuritiesBalance.mmSecuritiesSubBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingBalance5
	 * PendingBalance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signed quantity of balance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PendingBalance5, SignedQuantityFormat6> mmBalance = new MMMessageAttribute<PendingBalance5, SignedQuantityFormat6>() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesSubBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.PendingBalance5.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Signed quantity of balance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SignedQuantityFormat6.mmObject();
		}

		@Override
		public SignedQuantityFormat6 getValue(PendingBalance5 obj) {
			return obj.getBalance();
		}

		@Override
		public void setValue(PendingBalance5 obj, SignedQuantityFormat6 value) {
			obj.setBalance(value);
		}
	};
	@XmlElement(name = "PdgTxs")
	protected List<SettlementTypeAndIdentification25> pendingTransactions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification25
	 * SettlementTypeAndIdentification25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PendingBalance5
	 * PendingBalance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Overall process covering the trade and settlement transactions of financial instruments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PendingBalance5, List<SettlementTypeAndIdentification25>> mmPendingTransactions = new MMMessageAssociationEnd<PendingBalance5, List<SettlementTypeAndIdentification25>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PendingBalance5.mmObject();
			isDerived = false;
			xmlTag = "PdgTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingTransactions";
			definition = "Overall process covering the trade and settlement transactions of financial instruments.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification25.mmObject();
		}

		@Override
		public List<SettlementTypeAndIdentification25> getValue(PendingBalance5 obj) {
			return obj.getPendingTransactions();
		}

		@Override
		public void setValue(PendingBalance5 obj, List<SettlementTypeAndIdentification25> value) {
			obj.setPendingTransactions(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PendingBalance5.mmBalance, com.tools20022.repository.msg.PendingBalance5.mmPendingTransactions);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingBalance5";
				definition = "Provides information about pending balance and pending transactions.";
			}
		});
		return mmObject_lazy.get();
	}

	public SignedQuantityFormat6 getBalance() {
		return balance;
	}

	public PendingBalance5 setBalance(SignedQuantityFormat6 balance) {
		this.balance = Objects.requireNonNull(balance);
		return this;
	}

	public List<SettlementTypeAndIdentification25> getPendingTransactions() {
		return pendingTransactions == null ? pendingTransactions = new ArrayList<>() : pendingTransactions;
	}

	public PendingBalance5 setPendingTransactions(List<SettlementTypeAndIdentification25> pendingTransactions) {
		this.pendingTransactions = Objects.requireNonNull(pendingTransactions);
		return this;
	}
}