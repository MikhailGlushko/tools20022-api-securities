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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.Commission;
import com.tools20022.repository.entity.TradePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Party that identifies a broker when required (for example, authorised broker,
 * prime broker, etc).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Broker" src="doc-files/Broker.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.TradePartyRole
 * TradePartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Broker#mmRemunerationAmount
 * Broker.mmRemunerationAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Broker#mmCommission
 * Broker.mmCommission}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Commission#mmBroker
 * Commission.mmBroker}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties4#mmBrokerOfCredit
 * ConfirmationParties4.mmBrokerOfCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConfirmationParties2#mmBrokerOfCredit
 * ConfirmationParties2.mmBrokerOfCredit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg8#mmBroker
 * TradeLeg8.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg10#mmBroker
 * TradeLeg10.mmBroker}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TradeLeg9#mmBroker
 * TradeLeg9.mmBroker}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.StepInBroker StepInBroker}</li>
 * <li>{@linkplain com.tools20022.repository.entity.StepOutBroker StepOutBroker}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingBroker
 * ClearingBroker}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ExecutingBrokerRole
 * ExecutingBrokerRole}</li>
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
 * "Broker"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that identifies a broker when required (for example, authorised broker, prime broker, etc)."
 * </li>
 * </ul>
 */
public class Broker extends TradePartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyAndAmount remunerationAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmRemunerationAmount
	 * OtherAmounts16.mmRemunerationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Broker
	 * Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemunerationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of any remuneration other than commission received or to be received by the broker in connection with a trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Broker, ActiveCurrencyAndAmount> mmRemunerationAmount = new MMBusinessAttribute<Broker, ActiveCurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmRemunerationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Broker.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RemunerationAmount";
			definition = "Amount of any remuneration other than commission received or to be received by the broker in connection with a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Broker obj) {
			return obj.getRemunerationAmount();
		}

		@Override
		public void setValue(Broker obj, ActiveCurrencyAndAmount value) {
			obj.setRemunerationAmount(value);
		}
	};
	protected List<com.tools20022.repository.entity.Commission> commission;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Commission#mmBroker
	 * Commission.mmBroker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Commission
	 * Commission}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails27#mmLocalBrokerCommission
	 * SecuritiesFinancingTransactionDetails27.mmLocalBrokerCommission}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.Broker
	 * Broker}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commission"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money paid to a broker as a commission."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Broker, List<Commission>> mmCommission = new MMBusinessAssociationEnd<Broker, List<Commission>>() {
		{
			derivation_lazy = () -> Arrays.asList(SecuritiesFinancingTransactionDetails27.mmLocalBrokerCommission);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Broker.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Commission";
			definition = "Amount of money paid to a broker as a commission.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Commission.mmBroker;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Commission.mmObject();
		}

		@Override
		public List<Commission> getValue(Broker obj) {
			return obj.getCommission();
		}

		@Override
		public void setValue(Broker obj, List<Commission> value) {
			obj.setCommission(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Broker";
				definition = "Party that identifies a broker when required (for example, authorised broker, prime broker, etc).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Commission.mmBroker);
				derivationElement_lazy = () -> Arrays.asList(ConfirmationParties4.mmBrokerOfCredit, ConfirmationParties2.mmBrokerOfCredit, TradeLeg8.mmBroker, TradeLeg10.mmBroker, TradeLeg9.mmBroker);
				subType_lazy = () -> Arrays.asList(StepInBroker.mmObject(), StepOutBroker.mmObject(), ClearingBroker.mmObject(), ExecutingBrokerRole.mmObject());
				superType_lazy = () -> TradePartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Broker.mmRemunerationAmount, com.tools20022.repository.entity.Broker.mmCommission);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Broker.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyAndAmount getRemunerationAmount() {
		return remunerationAmount;
	}

	public Broker setRemunerationAmount(ActiveCurrencyAndAmount remunerationAmount) {
		this.remunerationAmount = Objects.requireNonNull(remunerationAmount);
		return this;
	}

	public List<Commission> getCommission() {
		return commission == null ? commission = new ArrayList<>() : commission;
	}

	public Broker setCommission(List<com.tools20022.repository.entity.Commission> commission) {
		this.commission = Objects.requireNonNull(commission);
		return this;
	}
}