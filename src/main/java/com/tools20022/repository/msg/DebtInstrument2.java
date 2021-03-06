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
import com.tools20022.repository.choice.InterestRate6Choice;
import com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Asset;
import com.tools20022.repository.entity.AssetHolding;
import com.tools20022.repository.entity.Debt;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the debit instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmTotalIssuedNominalAmount
 * DebtInstrument2.mmTotalIssuedNominalAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument2#mmMaturityDate
 * DebtInstrument2.mmMaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmNominalValuePerUnit
 * DebtInstrument2.mmNominalValuePerUnit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument2#mmInterestRate
 * DebtInstrument2.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DebtInstrument2#mmDebtSeniority
 * DebtInstrument2.mmDebtSeniority}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Debt Debt}</li>
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
 * "DebtInstrument2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the debit instrument."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DebtInstrument4
 * DebtInstrument4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DebtInstrument2", propOrder = {"totalIssuedNominalAmount", "maturityDate", "nominalValuePerUnit", "interestRate", "debtSeniority"})
public class DebtInstrument2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TtlIssdNmnlAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount totalIssuedNominalAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2
	 * DebtInstrument2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlIssdNmnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalIssuedNominalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total issued nominal amount in monetary value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebtInstrument2, ActiveOrHistoricCurrencyAndAmount> mmTotalIssuedNominalAmount = new MMMessageAttribute<DebtInstrument2, ActiveOrHistoricCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DebtInstrument2.mmObject();
			isDerived = false;
			xmlTag = "TtlIssdNmnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalIssuedNominalAmount";
			definition = "Total issued nominal amount in monetary value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(DebtInstrument2 obj) {
			return obj.getTotalIssuedNominalAmount();
		}

		@Override
		public void setValue(DebtInstrument2 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setTotalIssuedNominalAmount(value);
		}
	};
	@XmlElement(name = "MtrtyDt")
	protected ISODate maturityDate;
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
	 * {@linkplain com.tools20022.repository.entity.Asset#mmMaturityDate
	 * Asset.mmMaturityDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2
	 * DebtInstrument2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maturity date of the financial instrument."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument4#mmMaturityDate
	 * DebtInstrument4.mmMaturityDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebtInstrument2, Optional<ISODate>> mmMaturityDate = new MMMessageAttribute<DebtInstrument2, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Asset.mmMaturityDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebtInstrument2.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			definition = "Maturity date of the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(DebtInstrument4.mmMaturityDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(DebtInstrument2 obj) {
			return obj.getMaturityDate();
		}

		@Override
		public void setValue(DebtInstrument2 obj, Optional<ISODate> value) {
			obj.setMaturityDate(value.orElse(null));
		}
	};
	@XmlElement(name = "NmnlValPerUnit", required = true)
	protected ActiveOrHistoricCurrencyAndAmount nominalValuePerUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmHoldingValue
	 * AssetHolding.mmHoldingValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2
	 * DebtInstrument2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmnlValPerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NominalValuePerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Nominal value of each instrument. If not available, the minimum traded value should be populated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebtInstrument2, ActiveOrHistoricCurrencyAndAmount> mmNominalValuePerUnit = new MMMessageAttribute<DebtInstrument2, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmHoldingValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebtInstrument2.mmObject();
			isDerived = false;
			xmlTag = "NmnlValPerUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NominalValuePerUnit";
			definition = "Nominal value of each instrument. If not available, the minimum traded value should be populated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(DebtInstrument2 obj) {
			return obj.getNominalValuePerUnit();
		}

		@Override
		public void setValue(DebtInstrument2 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setNominalValuePerUnit(value);
		}
	};
	@XmlElement(name = "IntrstRate", required = true)
	protected InterestRate6Choice interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.InterestRate6Choice
	 * InterestRate6Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2
	 * DebtInstrument2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest rate of the debt instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DebtInstrument2, InterestRate6Choice> mmInterestRate = new MMMessageAssociationEnd<DebtInstrument2, InterestRate6Choice>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.DebtInstrument2.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Interest rate of the debt instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InterestRate6Choice.mmObject();
		}

		@Override
		public InterestRate6Choice getValue(DebtInstrument2 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(DebtInstrument2 obj, InterestRate6Choice value) {
			obj.setInterestRate(value);
		}
	};
	@XmlElement(name = "DebtSnrty")
	protected DebtInstrumentSeniorityType1Code debtSeniority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebtInstrumentSeniorityType1Code
	 * DebtInstrumentSeniorityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DebtInstrument2
	 * DebtInstrument2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DebtSnrty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtSeniority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Seniority for a specific debt instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DebtInstrument2, Optional<DebtInstrumentSeniorityType1Code>> mmDebtSeniority = new MMMessageAttribute<DebtInstrument2, Optional<DebtInstrumentSeniorityType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DebtInstrument2.mmObject();
			isDerived = false;
			xmlTag = "DebtSnrty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtSeniority";
			definition = "Seniority for a specific debt instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DebtInstrumentSeniorityType1Code.mmObject();
		}

		@Override
		public Optional<DebtInstrumentSeniorityType1Code> getValue(DebtInstrument2 obj) {
			return obj.getDebtSeniority();
		}

		@Override
		public void setValue(DebtInstrument2 obj, Optional<DebtInstrumentSeniorityType1Code> value) {
			obj.setDebtSeniority(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DebtInstrument2.mmTotalIssuedNominalAmount, com.tools20022.repository.msg.DebtInstrument2.mmMaturityDate,
						com.tools20022.repository.msg.DebtInstrument2.mmNominalValuePerUnit, com.tools20022.repository.msg.DebtInstrument2.mmInterestRate, com.tools20022.repository.msg.DebtInstrument2.mmDebtSeniority);
				trace_lazy = () -> Debt.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DebtInstrument2";
				definition = "Specifies the debit instrument.";
				nextVersions_lazy = () -> Arrays.asList(DebtInstrument4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getTotalIssuedNominalAmount() {
		return totalIssuedNominalAmount;
	}

	public DebtInstrument2 setTotalIssuedNominalAmount(ActiveOrHistoricCurrencyAndAmount totalIssuedNominalAmount) {
		this.totalIssuedNominalAmount = Objects.requireNonNull(totalIssuedNominalAmount);
		return this;
	}

	public Optional<ISODate> getMaturityDate() {
		return maturityDate == null ? Optional.empty() : Optional.of(maturityDate);
	}

	public DebtInstrument2 setMaturityDate(ISODate maturityDate) {
		this.maturityDate = maturityDate;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getNominalValuePerUnit() {
		return nominalValuePerUnit;
	}

	public DebtInstrument2 setNominalValuePerUnit(ActiveOrHistoricCurrencyAndAmount nominalValuePerUnit) {
		this.nominalValuePerUnit = Objects.requireNonNull(nominalValuePerUnit);
		return this;
	}

	public InterestRate6Choice getInterestRate() {
		return interestRate;
	}

	public DebtInstrument2 setInterestRate(InterestRate6Choice interestRate) {
		this.interestRate = Objects.requireNonNull(interestRate);
		return this;
	}

	public Optional<DebtInstrumentSeniorityType1Code> getDebtSeniority() {
		return debtSeniority == null ? Optional.empty() : Optional.of(debtSeniority);
	}

	public DebtInstrument2 setDebtSeniority(DebtInstrumentSeniorityType1Code debtSeniority) {
		this.debtSeniority = debtSeniority;
		return this;
	}
}