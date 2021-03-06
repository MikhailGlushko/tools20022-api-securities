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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.DisputeManagement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the dispute details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Dispute1#mmMarginCallRequestIdentification
 * Dispute1.mmMarginCallRequestIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Dispute1#mmDisputedAmount
 * Dispute1.mmDisputedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Dispute1#mmDisputeDate
 * Dispute1.mmDisputeDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DisputeManagement
 * DisputeManagement}</li>
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
 * "Dispute1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the dispute details."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Dispute1", propOrder = {"marginCallRequestIdentification", "disputedAmount", "disputeDate"})
public class Dispute1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MrgnCallReqId", required = true)
	protected Max35Text marginCallRequestIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Dispute1
	 * Dispute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnCallReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginCallRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification for the margin call request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Dispute1, Max35Text> mmMarginCallRequestIdentification = new MMMessageAttribute<Dispute1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Dispute1.mmObject();
			isDerived = false;
			xmlTag = "MrgnCallReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginCallRequestIdentification";
			definition = "Unique identification for the margin call request.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Dispute1 obj) {
			return obj.getMarginCallRequestIdentification();
		}

		@Override
		public void setValue(Dispute1 obj, Max35Text value) {
			obj.setMarginCallRequestIdentification(value);
		}
	};
	@XmlElement(name = "DsptdAmt", required = true)
	protected ActiveCurrencyAndAmount disputedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmDisputedAmount
	 * DisputeManagement.mmDisputedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Dispute1
	 * Dispute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disputed amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Dispute1, ActiveCurrencyAndAmount> mmDisputedAmount = new MMMessageAttribute<Dispute1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> DisputeManagement.mmDisputedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Dispute1.mmObject();
			isDerived = false;
			xmlTag = "DsptdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedAmount";
			definition = "Disputed amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Dispute1 obj) {
			return obj.getDisputedAmount();
		}

		@Override
		public void setValue(Dispute1 obj, ActiveCurrencyAndAmount value) {
			obj.setDisputedAmount(value);
		}
	};
	@XmlElement(name = "DsptDt", required = true)
	protected ISODate disputeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmDisputeDate
	 * DisputeManagement.mmDisputeDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Dispute1
	 * Dispute1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DsptDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of dispute."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Dispute1, ISODate> mmDisputeDate = new MMMessageAttribute<Dispute1, ISODate>() {
		{
			businessElementTrace_lazy = () -> DisputeManagement.mmDisputeDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Dispute1.mmObject();
			isDerived = false;
			xmlTag = "DsptDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeDate";
			definition = "Date of dispute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(Dispute1 obj) {
			return obj.getDisputeDate();
		}

		@Override
		public void setValue(Dispute1 obj, ISODate value) {
			obj.setDisputeDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Dispute1.mmMarginCallRequestIdentification, com.tools20022.repository.msg.Dispute1.mmDisputedAmount,
						com.tools20022.repository.msg.Dispute1.mmDisputeDate);
				trace_lazy = () -> DisputeManagement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Dispute1";
				definition = "Provides the dispute details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getMarginCallRequestIdentification() {
		return marginCallRequestIdentification;
	}

	public Dispute1 setMarginCallRequestIdentification(Max35Text marginCallRequestIdentification) {
		this.marginCallRequestIdentification = Objects.requireNonNull(marginCallRequestIdentification);
		return this;
	}

	public ActiveCurrencyAndAmount getDisputedAmount() {
		return disputedAmount;
	}

	public Dispute1 setDisputedAmount(ActiveCurrencyAndAmount disputedAmount) {
		this.disputedAmount = Objects.requireNonNull(disputedAmount);
		return this;
	}

	public ISODate getDisputeDate() {
		return disputeDate;
	}

	public Dispute1 setDisputeDate(ISODate disputeDate) {
		this.disputeDate = Objects.requireNonNull(disputeDate);
		return this;
	}
}