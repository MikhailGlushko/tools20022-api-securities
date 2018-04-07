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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CashInOrOut7Choice;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Payment processes required to transfer cash from the debtor to the creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentTransaction71#mmCashInOrOut
 * PaymentTransaction71.mmCashInOrOut}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
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
 * "PaymentTransaction71"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Payment processes required to transfer cash from the debtor to the creditor."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentTransaction71", propOrder = "cashInOrOut")
public class PaymentTransaction71 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshInOrOut", required = true)
	protected CashInOrOut7Choice cashInOrOut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CashInOrOut7Choice
	 * CashInOrOut7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentTransaction71
	 * PaymentTransaction71}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInOrOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInOrOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Choice between cash-in or cash-out."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PaymentTransaction71, CashInOrOut7Choice> mmCashInOrOut = new MMMessageAssociationEnd<PaymentTransaction71, CashInOrOut7Choice>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentTransaction71.mmObject();
			isDerived = false;
			xmlTag = "CshInOrOut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInOrOut";
			definition = "Choice between cash-in or cash-out.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashInOrOut7Choice.mmObject();
		}

		@Override
		public CashInOrOut7Choice getValue(PaymentTransaction71 obj) {
			return obj.getCashInOrOut();
		}

		@Override
		public void setValue(PaymentTransaction71 obj, CashInOrOut7Choice value) {
			obj.setCashInOrOut(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentTransaction71.mmCashInOrOut);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTransaction71";
				definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashInOrOut7Choice getCashInOrOut() {
		return cashInOrOut;
	}

	public PaymentTransaction71 setCashInOrOut(CashInOrOut7Choice cashInOrOut) {
		this.cashInOrOut = Objects.requireNonNull(cashInOrOut);
		return this;
	}
}